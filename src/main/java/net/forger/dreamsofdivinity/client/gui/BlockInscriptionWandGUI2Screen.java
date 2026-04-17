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

import net.forger.dreamsofdivinity.world.inventory.BlockInscriptionWandGUI2Menu;
import net.forger.dreamsofdivinity.network.BlockInscriptionWandGUI2ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlockInscriptionWandGUI2Screen extends AbstractContainerScreen<BlockInscriptionWandGUI2Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
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
	Button button_up;
	Button button_player_direction;
	Button button_down;

	public BlockInscriptionWandGUI2Screen(BlockInscriptionWandGUI2Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/block_inscription_wand_gui_2.png");

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
		guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/inscriptionui.png"), this.leftPos + -134, this.topPos + -131, 0, 0, 256, 256, 256, 256);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.label_wand_direction"), -41, -8, -3381760, false);
	}

	@Override
	public void init() {
		super.init();
		button_keybind_1 = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_keybind_1"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(0, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -118, this.topPos + -67, 72, 20).build();
		this.addRenderableWidget(button_keybind_1);
		button_keybind_2 = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_keybind_2"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(1, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -118, this.topPos + -37, 72, 20).build();
		this.addRenderableWidget(button_keybind_2);
		button_keybind_3 = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_keybind_3"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(2, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -41, this.topPos + -67, 72, 20).build();
		this.addRenderableWidget(button_keybind_3);
		button_keybind_4 = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_keybind_4"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(3, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -41, this.topPos + -37, 72, 20).build();
		this.addRenderableWidget(button_keybind_4);
		button_keybind_5 = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_keybind_5"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(4, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 35, this.topPos + -67, 72, 20).build();
		this.addRenderableWidget(button_keybind_5);
		button_keybind_6 = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_keybind_6"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(5, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 35, this.topPos + -37, 72, 20).build();
		this.addRenderableWidget(button_keybind_6);
		button_up = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_up"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(6, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + -101, this.topPos + 8, 35, 20).build();
		this.addRenderableWidget(button_up);
		button_player_direction = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_player_direction"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(7, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + -60, this.topPos + 8, 108, 20).build();
		this.addRenderableWidget(button_player_direction);
		button_down = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui_2.button_down"), e -> {
			int x = BlockInscriptionWandGUI2Screen.this.x;
			int y = BlockInscriptionWandGUI2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUI2ButtonMessage(8, x, y, z));
				BlockInscriptionWandGUI2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 54, this.topPos + 8, 46, 20).build();
		this.addRenderableWidget(button_down);
	}
}