package net.forger.dreamsofdivinity.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.forger.dreamsofdivinity.world.inventory.MagicSelection1Menu;
import net.forger.dreamsofdivinity.procedures.WaterUnlockedProcedure;
import net.forger.dreamsofdivinity.procedures.WaterSelectedProcedure;
import net.forger.dreamsofdivinity.procedures.MagicStatsBottomDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSelectedDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.FireUnlockedProcedure;
import net.forger.dreamsofdivinity.procedures.FireSelectedProcedure;
import net.forger.dreamsofdivinity.procedures.EntityproviderplayerProcedure;
import net.forger.dreamsofdivinity.network.MagicSelection1ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class MagicSelection1Screen extends AbstractContainerScreen<MagicSelection1Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	ImageButton imagebutton_water;
	ImageButton imagebutton_flame;
	ImageButton imagebutton_arrow2;
	ImageButton imagebutton_arrow1;

	public MagicSelection1Screen(MagicSelection1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/magic_selection_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (EntityproviderplayerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			DreamsOfDivinityModScreens.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -1, this.topPos + 66, 60, 0f + (float) Math.atan((this.leftPos + -1 - mouseX) / 40.0), (float) Math.atan((this.topPos + 17 - mouseY) / 40.0),
					livingEntity);
		}
		boolean customTooltipShown = false;
		if (mouseX > leftPos + -199 && mouseX < leftPos + -175 && mouseY > topPos + -112 && mouseY < topPos + -88) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.magic_selection_1.tooltip_empty"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/flamelocked.png"), this.leftPos + -190, this.topPos + -112, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/waterlocked.png"), this.leftPos + -190, this.topPos + -85, 0, 0, 16, 16, 16, 16);
		if (WaterSelectedProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/checkmark.png"), this.leftPos + -109, this.topPos + -76, 0, 0, 8, 8, 8, 8);
		}
		if (FireSelectedProcedure.execute(entity)) {
			guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/checkmark.png"), this.leftPos + -118, this.topPos + -103, 0, 0, 8, 8, 8, 8);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_selection_1.label_fire_magic"), -172, -103, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_selection_1.label_water_magic"), -172, -76, -16777012, false);
		guiGraphics.drawString(this.font, "Selected Magic: " + MagicSelectedDisplayProcedure.execute(entity), -200, -58, -1, false);
		guiGraphics.drawString(this.font, MagicStatsBottomDisplayProcedure.execute(entity), -200, -46, -3355444, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_water = new ImageButton(this.leftPos + -190, this.topPos + -85, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/water.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/waterselect.png")), e -> {
					int x = MagicSelection1Screen.this.x;
					int y = MagicSelection1Screen.this.y;
					if (WaterUnlockedProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new MagicSelection1ButtonMessage(0, x, y, z));
						MagicSelection1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (WaterUnlockedProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_water);
		imagebutton_flame = new ImageButton(this.leftPos + -190, this.topPos + -112, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/flame.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/fireselect.png")), e -> {
					int x = MagicSelection1Screen.this.x;
					int y = MagicSelection1Screen.this.y;
					if (FireUnlockedProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new MagicSelection1ButtonMessage(1, x, y, z));
						MagicSelection1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (FireUnlockedProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_flame);
		imagebutton_arrow2 = new ImageButton(this.leftPos + 166, this.topPos + 73, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrowselect.png")), e -> {
					int x = MagicSelection1Screen.this.x;
					int y = MagicSelection1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new MagicSelection1ButtonMessage(2, x, y, z));
						MagicSelection1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow2);
		imagebutton_arrow1 = new ImageButton(this.leftPos + -200, this.topPos + 73, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrowselect.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrow.png")), e -> {
					int x = MagicSelection1Screen.this.x;
					int y = MagicSelection1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new MagicSelection1ButtonMessage(3, x, y, z));
						MagicSelection1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow1);
	}
}
