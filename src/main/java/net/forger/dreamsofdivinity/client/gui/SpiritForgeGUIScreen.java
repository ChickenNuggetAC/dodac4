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

import net.forger.dreamsofdivinity.world.inventory.SpiritForgeGUIMenu;
import net.forger.dreamsofdivinity.network.SpiritForgeGUIButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpiritForgeGUIScreen extends AbstractContainerScreen<SpiritForgeGUIMenu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_fuse;

	public SpiritForgeGUIScreen(SpiritForgeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 228;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/spirit_forge_gui.png");

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
		guiGraphics.blit(ResourceLocation.parse("dreams_of_divinity:textures/screens/spiritstonefusescree.png"), this.leftPos + 15, this.topPos + 2, 0, 0, 136, 136, 136, 136);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spirit_forge_gui.label_empty"), 66, 68, -16777012, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spirit_forge_gui.label_empty1"), 107, 67, -16776961, false);
	}

	@Override
	public void init() {
		super.init();
		button_fuse = Button.builder(Component.translatable("gui.dreams_of_divinity.spirit_forge_gui.button_fuse"), e -> {
			int x = SpiritForgeGUIScreen.this.x;
			int y = SpiritForgeGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SpiritForgeGUIButtonMessage(0, x, y, z));
				SpiritForgeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 124, this.topPos + 122, 46, 20).build();
		this.addRenderableWidget(button_fuse);
	}
}