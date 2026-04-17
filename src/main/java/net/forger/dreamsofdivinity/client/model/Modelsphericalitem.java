package net.forger.dreamsofdivinity.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsphericalitem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("dreams_of_divinity", "modelsphericalitem"), "main");
	public final ModelPart hexadecagon;
	public final ModelPart hexadecagon2;
	public final ModelPart hexadecagon3;
	public final ModelPart hexadecagon4;
	public final ModelPart hexadecagon5;
	public final ModelPart hexadecagon6;
	public final ModelPart hexadecagon7;
	public final ModelPart hexadecagon8;

	public Modelsphericalitem(ModelPart root) {
		this.hexadecagon = root.getChild("hexadecagon");
		this.hexadecagon2 = root.getChild("hexadecagon2");
		this.hexadecagon3 = root.getChild("hexadecagon3");
		this.hexadecagon4 = root.getChild("hexadecagon4");
		this.hexadecagon5 = root.getChild("hexadecagon5");
		this.hexadecagon6 = root.getChild("hexadecagon6");
		this.hexadecagon7 = root.getChild("hexadecagon7");
		this.hexadecagon8 = root.getChild("hexadecagon8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hexadecagon = partdefinition
				.addOrReplaceChild(
						"hexadecagon", CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F))
								.texOffs(0, 1).addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon2 = partdefinition.addOrReplaceChild("hexadecagon2",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r5 = hexadecagon2.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = hexadecagon2.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = hexadecagon2.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = hexadecagon2.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon3 = partdefinition.addOrReplaceChild("hexadecagon3",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition hexadecagon_r9 = hexadecagon3.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r10 = hexadecagon3.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r11 = hexadecagon3.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r12 = hexadecagon3.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon4 = partdefinition.addOrReplaceChild("hexadecagon4",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 1.1781F, 0.0F));
		PartDefinition hexadecagon_r13 = hexadecagon4.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r14 = hexadecagon4.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r15 = hexadecagon4.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r16 = hexadecagon4.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon5 = partdefinition.addOrReplaceChild("hexadecagon5",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hexadecagon_r17 = hexadecagon5.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r18 = hexadecagon5.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r19 = hexadecagon5.addOrReplaceChild("hexadecagon_r19",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r20 = hexadecagon5.addOrReplaceChild("hexadecagon_r20",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon6 = partdefinition.addOrReplaceChild("hexadecagon6",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 1.9635F, 0.0F));
		PartDefinition hexadecagon_r21 = hexadecagon6.addOrReplaceChild("hexadecagon_r21",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r22 = hexadecagon6.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r23 = hexadecagon6.addOrReplaceChild("hexadecagon_r23",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r24 = hexadecagon6.addOrReplaceChild("hexadecagon_r24",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon7 = partdefinition.addOrReplaceChild("hexadecagon7",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition hexadecagon_r25 = hexadecagon7.addOrReplaceChild("hexadecagon_r25",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r26 = hexadecagon7.addOrReplaceChild("hexadecagon_r26",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r27 = hexadecagon7.addOrReplaceChild("hexadecagon_r27",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r28 = hexadecagon7.addOrReplaceChild("hexadecagon_r28",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon8 = partdefinition.addOrReplaceChild("hexadecagon8",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, 6.0109F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 6.0109F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 8.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -2.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 2.7489F, 0.0F));
		PartDefinition hexadecagon_r29 = hexadecagon8.addOrReplaceChild("hexadecagon_r29",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r30 = hexadecagon8.addOrReplaceChild("hexadecagon_r30",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -10.0F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, 0.2F, -1.9891F, 4.0F, 9.8F, 3.9782F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r31 = hexadecagon8.addOrReplaceChild("hexadecagon_r31",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r32 = hexadecagon8.addOrReplaceChild("hexadecagon_r32",
				CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.9891F, 0.2F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-2.0F, -1.9891F, -10.0F, 4.0F, 3.9782F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hexadecagon2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hexadecagon3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hexadecagon4.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hexadecagon5.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hexadecagon6.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hexadecagon7.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hexadecagon8.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}