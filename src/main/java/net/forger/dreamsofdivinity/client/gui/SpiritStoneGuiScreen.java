package net.forger.dreamsofdivinity.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.forger.dreamsofdivinity.world.inventory.SpiritStoneGuiMenu;
import net.forger.dreamsofdivinity.network.SpiritStoneGuiButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpiritStoneGuiScreen extends AbstractContainerScreen<SpiritStoneGuiMenu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_keybind_1;
	Button button_keybind_2;
	Button button_keybind_3;
	Button button_keybind_4;
	Button button_keybind_5;
	Button button_keybind_6;

	public SpiritStoneGuiScreen(SpiritStoneGuiMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/spirit_stone_gui.png");

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
		guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/spiritstonefusescree.png"), this.leftPos + -136, this.topPos + -137, 0, 0, 272, 272, 272, 272);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spirit_stone_gui.label_fuse_to_spirit_stone"), -55, -103, -16449281, false);
	}

	@Override
	public void init() {
		super.init();
		button_keybind_1 = Button.builder(Component.translatable("gui.dreams_of_divinity.spirit_stone_gui.button_keybind_1"), e -> {
			int x = SpiritStoneGuiScreen.this.x;
			int y = SpiritStoneGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SpiritStoneGuiButtonMessage(0, x, y, z));
				SpiritStoneGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -100, this.topPos + -85, 72, 20).build();
		this.addRenderableWidget(button_keybind_1);
		button_keybind_2 = Button.builder(Component.translatable("gui.dreams_of_divinity.spirit_stone_gui.button_keybind_2"), e -> {
			int x = SpiritStoneGuiScreen.this.x;
			int y = SpiritStoneGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SpiritStoneGuiButtonMessage(1, x, y, z));
				SpiritStoneGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 26, this.topPos + -85, 72, 20).build();
		this.addRenderableWidget(button_keybind_2);
		button_keybind_3 = Button.builder(Component.translatable("gui.dreams_of_divinity.spirit_stone_gui.button_keybind_3"), e -> {
			int x = SpiritStoneGuiScreen.this.x;
			int y = SpiritStoneGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SpiritStoneGuiButtonMessage(2, x, y, z));
				SpiritStoneGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -109, this.topPos + -13, 72, 20).build();
		this.addRenderableWidget(button_keybind_3);
		button_keybind_4 = Button.builder(Component.translatable("gui.dreams_of_divinity.spirit_stone_gui.button_keybind_4"), e -> {
			int x = SpiritStoneGuiScreen.this.x;
			int y = SpiritStoneGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SpiritStoneGuiButtonMessage(3, x, y, z));
				SpiritStoneGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 35, this.topPos + -13, 72, 20).build();
		this.addRenderableWidget(button_keybind_4);
		button_keybind_5 = Button.builder(Component.translatable("gui.dreams_of_divinity.spirit_stone_gui.button_keybind_5"), e -> {
			int x = SpiritStoneGuiScreen.this.x;
			int y = SpiritStoneGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SpiritStoneGuiButtonMessage(4, x, y, z));
				SpiritStoneGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -100, this.topPos + 59, 72, 20).build();
		this.addRenderableWidget(button_keybind_5);
		button_keybind_6 = Button.builder(Component.translatable("gui.dreams_of_divinity.spirit_stone_gui.button_keybind_6"), e -> {
			int x = SpiritStoneGuiScreen.this.x;
			int y = SpiritStoneGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SpiritStoneGuiButtonMessage(5, x, y, z));
				SpiritStoneGuiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 26, this.topPos + 59, 72, 20).build();
		this.addRenderableWidget(button_keybind_6);
	}
}