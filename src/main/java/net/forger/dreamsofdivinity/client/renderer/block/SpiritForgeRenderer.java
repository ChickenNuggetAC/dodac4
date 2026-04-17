package net.forger.dreamsofdivinity.client.renderer.block;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.forger.dreamsofdivinity.procedures.SpiritForgeIdlePlaybackConditionProcedure;
import net.forger.dreamsofdivinity.procedures.SpiritForgeActivatedPlaybackConditionProcedure;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModBlockEntities;
import net.forger.dreamsofdivinity.client.model.animations.spiritforgeAnimation;
import net.forger.dreamsofdivinity.client.model.Modelspiritforge;
import net.forger.dreamsofdivinity.block.entity.SpiritForgeBlockEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SpiritForgeRenderer implements BlockEntityRenderer<SpiritForgeBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;

	SpiritForgeRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelspiritforge.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("dreams_of_divinity:textures/block/spiritforge.png");
	}

	private void updateRenderState(SpiritForgeBlockEntity blockEntity) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		blockEntity.animationState0.animateWhen(SpiritForgeIdlePlaybackConditionProcedure.execute(blockEntity.getBlockState()), tickCount);
		blockEntity.animationState1.animateWhen(SpiritForgeActivatedPlaybackConditionProcedure.execute(blockEntity.getBlockState()), tickCount);
	}

	@Override
	public void render(SpiritForgeBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight) {
		updateRenderState(blockEntity);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		poseStack.translate(0, -1, 0);
		VertexConsumer builder = renderer.getBuffer(RenderType.entityCutout(texture));
		model.setupBlockEntityAnim(blockEntity, blockEntity.getLevel().getGameTime() + partialTick);
		model.renderToBuffer(poseStack, builder, light, overlayLight);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(DreamsOfDivinityModBlockEntities.SPIRIT_FORGE.get(), SpiritForgeRenderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelspiritforge {
		private final ModelPart root;
		private final BlockEntityHierarchicalModel animator = new BlockEntityHierarchicalModel();

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		public void setupBlockEntityAnim(SpiritForgeBlockEntity blockEntity, float ageInTicks) {
			animator.setupBlockEntityAnim(blockEntity, ageInTicks);
			super.setupAnim(null, 0, 0, ageInTicks, 0, 0);
		}

		public ModelPart getRoot() {
			return root;
		}

		private class BlockEntityHierarchicalModel extends HierarchicalModel<Entity> {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			}

			public void setupBlockEntityAnim(SpiritForgeBlockEntity blockEntity, float ageInTicks) {
				animator.root().getAllParts().forEach(ModelPart::resetPose);
				animator.animate(blockEntity.animationState0, spiritforgeAnimation.idle, ageInTicks, 1f);
				animator.animate(blockEntity.animationState1, spiritforgeAnimation.activated, ageInTicks, 1f);
			}
		}
	}
}