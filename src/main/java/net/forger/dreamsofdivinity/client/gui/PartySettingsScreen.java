package net.forger.dreamsofdivinity.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.forger.dreamsofdivinity.world.inventory.PartySettingsMenu;
import net.forger.dreamsofdivinity.procedures.PartyRankOfficerProcedure;
import net.forger.dreamsofdivinity.procedures.PartyRankMemberProcedure;
import net.forger.dreamsofdivinity.procedures.PartyRankLeadersDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.PartyRankGeneralProcedure;
import net.forger.dreamsofdivinity.network.PartySettingsButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class PartySettingsScreen extends AbstractContainerScreen<PartySettingsMenu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox partypromote;
	EditBox kickmember;
	EditBox demotemember;
	EditBox partyname;
	Button button_promote_member;
	Button button_kick_member;
	Button button_demote_member;

	public PartySettingsScreen(PartySettingsMenu container, Inventory inventory, Component text) {
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
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("partypromote"))
				partypromote.setValue(stringState);
			else if (name.equals("kickmember"))
				kickmember.setValue(stringState);
			else if (name.equals("demotemember"))
				demotemember.setValue(stringState);
			else if (name.equals("partyname"))
				partyname.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/party_settings.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		partypromote.render(guiGraphics, mouseX, mouseY, partialTicks);
		kickmember.render(guiGraphics, mouseX, mouseY, partialTicks);
		demotemember.render(guiGraphics, mouseX, mouseY, partialTicks);
		partyname.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (partypromote.isFocused())
			return partypromote.keyPressed(key, b, c);
		if (kickmember.isFocused())
			return kickmember.keyPressed(key, b, c);
		if (demotemember.isFocused())
			return demotemember.keyPressed(key, b, c);
		if (partyname.isFocused())
			return partyname.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String partypromoteValue = partypromote.getValue();
		String kickmemberValue = kickmember.getValue();
		String demotememberValue = demotemember.getValue();
		String partynameValue = partyname.getValue();
		super.resize(minecraft, width, height);
		partypromote.setValue(partypromoteValue);
		kickmember.setValue(kickmemberValue);
		demotemember.setValue(demotememberValue);
		partyname.setValue(partynameValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.party_settings.label_party_leader"), -208, -112, -13312, false);
		guiGraphics.drawString(this.font, PartyRankLeadersDisplayProcedure.execute(world, entity), -127, -112, -13312, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.party_settings.label_party_generals"), -208, -85, -65536, false);
		guiGraphics.drawString(this.font, PartyRankGeneralProcedure.execute(world, entity), -118, -85, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.party_settings.label_party_officers"), -208, -58, -16776961, false);
		guiGraphics.drawString(this.font, PartyRankOfficerProcedure.execute(world, entity), -118, -58, -16776961, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.party_settings.label_party_memebers"), -208, -31, -13369600, false);
		guiGraphics.drawString(this.font, PartyRankMemberProcedure.execute(world, entity), -127, -31, -13369600, false);
	}

	@Override
	public void init() {
		super.init();
		partypromote = new EditBox(this.font, this.leftPos + -171, this.topPos + 24, 118, 18, Component.translatable("gui.dreams_of_divinity.party_settings.partypromote"));
		partypromote.setMaxLength(8192);
		partypromote.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "partypromote", content, false);
		});
		this.addWidget(this.partypromote);
		kickmember = new EditBox(this.font, this.leftPos + -171, this.topPos + 78, 118, 18, Component.translatable("gui.dreams_of_divinity.party_settings.kickmember"));
		kickmember.setMaxLength(8192);
		kickmember.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "kickmember", content, false);
		});
		this.addWidget(this.kickmember);
		demotemember = new EditBox(this.font, this.leftPos + -171, this.topPos + 51, 118, 18, Component.translatable("gui.dreams_of_divinity.party_settings.demotemember"));
		demotemember.setMaxLength(8192);
		demotemember.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "demotemember", content, false);
		});
		this.addWidget(this.demotemember);
		partyname = new EditBox(this.font, this.leftPos + 81, this.topPos + -111, 118, 18, Component.translatable("gui.dreams_of_divinity.party_settings.partyname"));
		partyname.setMaxLength(8192);
		partyname.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "partyname", content, false);
		});
		partyname.setHint(Component.translatable("gui.dreams_of_divinity.party_settings.partyname"));
		this.addWidget(this.partyname);
		button_promote_member = Button.builder(Component.translatable("gui.dreams_of_divinity.party_settings.button_promote_member"), e -> {
			int x = PartySettingsScreen.this.x;
			int y = PartySettingsScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new PartySettingsButtonMessage(0, x, y, z));
				PartySettingsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -46, this.topPos + 23, 98, 20).build();
		this.addRenderableWidget(button_promote_member);
		button_kick_member = Button.builder(Component.translatable("gui.dreams_of_divinity.party_settings.button_kick_member"), e -> {
			int x = PartySettingsScreen.this.x;
			int y = PartySettingsScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new PartySettingsButtonMessage(1, x, y, z));
				PartySettingsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -46, this.topPos + 77, 82, 20).build();
		this.addRenderableWidget(button_kick_member);
		button_demote_member = Button.builder(Component.translatable("gui.dreams_of_divinity.party_settings.button_demote_member"), e -> {
			int x = PartySettingsScreen.this.x;
			int y = PartySettingsScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new PartySettingsButtonMessage(2, x, y, z));
				PartySettingsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -46, this.topPos + 50, 93, 20).build();
		this.addRenderableWidget(button_demote_member);
	}
}