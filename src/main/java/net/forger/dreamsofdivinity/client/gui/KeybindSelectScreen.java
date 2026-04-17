package net.forger.dreamsofdivinity.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.forger.dreamsofdivinity.world.inventory.KeybindSelectMenu;
import net.forger.dreamsofdivinity.procedures.PartyinvitedisplayProcedure;
import net.forger.dreamsofdivinity.procedures.PartyLeaveDisplayProcedure;
import net.forger.dreamsofdivinity.network.KeybindSelectButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class KeybindSelectScreen extends AbstractContainerScreen<KeybindSelectMenu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_spell_1;
	Button button_spell_2;
	Button button_spell_3;
	Button button_spell_4;
	Button button_spell_5;
	Button button_spell_6;
	Button button_accept_party_invite;
	Button button_decline_party_invite;
	Button button_leave_party;
	Button button_party_settings;

	public KeybindSelectScreen(KeybindSelectMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/keybind_select.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_spell_1 = Button.builder(Component.translatable("gui.dreams_of_divinity.keybind_select.button_spell_1"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(0, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -137, this.topPos + -78, 61, 20).build();
		this.addRenderableWidget(button_spell_1);
		button_spell_2 = Button.builder(Component.translatable("gui.dreams_of_divinity.keybind_select.button_spell_2"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(1, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -30, this.topPos + -78, 61, 20).build();
		this.addRenderableWidget(button_spell_2);
		button_spell_3 = Button.builder(Component.translatable("gui.dreams_of_divinity.keybind_select.button_spell_3"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(2, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 76, this.topPos + -78, 61, 20).build();
		this.addRenderableWidget(button_spell_3);
		button_spell_4 = Button.builder(Component.translatable("gui.dreams_of_divinity.keybind_select.button_spell_4"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(3, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -137, this.topPos + -10, 61, 20).build();
		this.addRenderableWidget(button_spell_4);
		button_spell_5 = Button.builder(Component.translatable("gui.dreams_of_divinity.keybind_select.button_spell_5"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(4, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -30, this.topPos + -10, 61, 20).build();
		this.addRenderableWidget(button_spell_5);
		button_spell_6 = Button.builder(Component.translatable("gui.dreams_of_divinity.keybind_select.button_spell_6"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(5, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 76, this.topPos + -10, 61, 20).build();
		this.addRenderableWidget(button_spell_6);
		button_accept_party_invite = new PlainTextButton(this.leftPos + -209, this.topPos + 56, 134, 20, Component.translatable("gui.dreams_of_divinity.keybind_select.button_accept_party_invite"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (PartyinvitedisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(6, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_accept_party_invite);
		button_decline_party_invite = new PlainTextButton(this.leftPos + -208, this.topPos + 84, 140, 20, Component.translatable("gui.dreams_of_divinity.keybind_select.button_decline_party_invite"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (PartyinvitedisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(7, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_decline_party_invite);
		button_leave_party = new PlainTextButton(this.leftPos + 123, this.topPos + 83, 98, 20, Component.translatable("gui.dreams_of_divinity.keybind_select.button_leave_party"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (PartyLeaveDisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(8, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_leave_party);
		button_party_settings = Button.builder(Component.translatable("gui.dreams_of_divinity.keybind_select.button_party_settings"), e -> {
			int x = KeybindSelectScreen.this.x;
			int y = KeybindSelectScreen.this.y;
			if (PartyLeaveDisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new KeybindSelectButtonMessage(9, x, y, z));
				KeybindSelectButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + -49, this.topPos + 73, 98, 20).build();
		this.addRenderableWidget(button_party_settings);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		this.button_accept_party_invite.visible = PartyinvitedisplayProcedure.execute(entity);
		this.button_decline_party_invite.visible = PartyinvitedisplayProcedure.execute(entity);
		this.button_leave_party.visible = PartyLeaveDisplayProcedure.execute(entity);
		this.button_party_settings.visible = PartyLeaveDisplayProcedure.execute(entity);
	}
}