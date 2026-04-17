package net.forger.dreamsofdivinity.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.forger.dreamsofdivinity.world.inventory.Magic1Menu;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay4Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay1Procedure;
import net.forger.dreamsofdivinity.network.Magic1ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class Magic1Screen extends AbstractContainerScreen<Magic1Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	ImageButton imagebutton_arrow2;
	ImageButton imagebutton_arrow1;
	ImageButton imagebutton_arrow21;
	ImageButton imagebutton_arrow11;

	public Magic1Screen(Magic1Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/magic_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_1.label_spell_type"), -29, -26, -16776961, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_1.label_ranged"), -16, -6, -65536, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_1.label_weapon"), -36, -6, -39424, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_1.label_body_enhance"), -30, -6, -13312, false);
		if (SpellTypeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_1.label_movement_enhance"), -44, -7, -13369600, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.magic_1.label_placed_magic"), -33, -6, -16776961, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow2 = new ImageButton(this.leftPos + 36, this.topPos + -16, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrowselect.png")), e -> {
					int x = Magic1Screen.this.x;
					int y = Magic1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Magic1ButtonMessage(0, x, y, z));
						Magic1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow2);
		imagebutton_arrow1 = new ImageButton(this.leftPos + -73, this.topPos + -16, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrowselect.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrow.png")), e -> {
					int x = Magic1Screen.this.x;
					int y = Magic1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Magic1ButtonMessage(1, x, y, z));
						Magic1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow1);
		imagebutton_arrow21 = new ImageButton(this.leftPos + 173, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrowselect.png")), e -> {
					int x = Magic1Screen.this.x;
					int y = Magic1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Magic1ButtonMessage(2, x, y, z));
						Magic1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow21);
		imagebutton_arrow11 = new ImageButton(this.leftPos + -207, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrowselect.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrow.png")), e -> {
					int x = Magic1Screen.this.x;
					int y = Magic1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Magic1ButtonMessage(3, x, y, z));
						Magic1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow11);
	}
}