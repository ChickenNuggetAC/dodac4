package net.forger.dreamsofdivinity.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.forger.dreamsofdivinity.procedures.StaminabardisplayProcedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay9Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay8Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay7Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay6Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay4Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.StaminaDisplay10Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritualPowerDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay9Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay8Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay7Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay6Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay4Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.SpiritAmountDisplay10Procedure;
import net.forger.dreamsofdivinity.procedures.NotEnoughManaDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicStatsBottomDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSelectedDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.AutoSprintDisplayProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class OverlaysOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manabarempty.png"), 7, h - 27, 0, 0, 80, 8, 80, 8);

			if (SpiritAmountDisplay1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenleft.png"), 7, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 15, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 23, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 31, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 39, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 47, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 55, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 63, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenmiddle.png"), 71, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (SpiritAmountDisplay10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/manaregenright.png"), 79, h - 27, 0, 0, 8, 8, 8, 8);
			}
			if (StaminabardisplayProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarempty.png"), 12, h - 60, 0, 0, 80, 8, 80, 8);
			}
			if (StaminaDisplay1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarleft.png"), 12, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 20, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 28, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 36, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 44, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 52, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 60, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 68, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarmiddle.png"), 76, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (StaminaDisplay10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/staminabarright.png"), 84, h - 60, 0, 0, 8, 8, 8, 8);
			}
			if (NotEnoughManaDisplayProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/notenough.png"), 7, h - 27, 0, 0, 80, 8, 80, 8);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dreams_of_divinity.overlays.label_spiritual_power"), 15, h - 36, -16711681, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SpiritualPowerDisplayProcedure.execute(entity), 8, h - 18, -16711681, false);
			if (StaminabardisplayProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dreams_of_divinity.overlays.label_stamina"), 19, h - 69, -10092340, false);
			if (StaminabardisplayProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						StaminaDisplayProcedure.execute(entity), 12, h - 52, -10092340, false);
			if (AutoSprintDisplayProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dreams_of_divinity.overlays.label_auto_sprint_on"), 2, 2, -205, false);
			if (NotEnoughManaDisplayProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dreams_of_divinity.overlays.label_not_enough_power"), 89, h - 47, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dreams_of_divinity.overlays.label_magic_selected"), 8, h - 90, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MagicSelectedDisplayProcedure.execute(entity), 78, h - 90, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MagicStatsBottomDisplayProcedure.execute(entity), 8, h - 80, -3355444, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
