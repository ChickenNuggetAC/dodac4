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

import net.forger.dreamsofdivinity.world.inventory.BlockInscriptionWandGUIMenu;
import net.forger.dreamsofdivinity.network.BlockInscriptionWandGUIButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlockInscriptionWandGUIScreen extends AbstractContainerScreen<BlockInscriptionWandGUIMenu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_block_stepped_on;
	Button button_block_tick_update;

	public BlockInscriptionWandGUIScreen(BlockInscriptionWandGUIMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/block_inscription_wand_gui.png");

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
		guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/inscriptionui.png"), this.leftPos + -136, this.topPos + -130, 0, 0, 256, 256, 256, 256);
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
	}

	@Override
	public void init() {
		super.init();
		button_block_stepped_on = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui.button_block_stepped_on"), e -> {
			int x = BlockInscriptionWandGUIScreen.this.x;
			int y = BlockInscriptionWandGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUIButtonMessage(0, x, y, z));
				BlockInscriptionWandGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -64, this.topPos + -31, 108, 20).build();
		this.addRenderableWidget(button_block_stepped_on);
		button_block_tick_update = Button.builder(Component.translatable("gui.dreams_of_divinity.block_inscription_wand_gui.button_block_tick_update"), e -> {
			int x = BlockInscriptionWandGUIScreen.this.x;
			int y = BlockInscriptionWandGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new BlockInscriptionWandGUIButtonMessage(1, x, y, z));
				BlockInscriptionWandGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -64, this.topPos + 5, 113, 20).build();
		this.addRenderableWidget(button_block_tick_update);
	}
}