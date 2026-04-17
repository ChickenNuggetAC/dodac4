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
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.forger.dreamsofdivinity.world.inventory.SpellEditMenu2Menu;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay1and5Procedure;
import net.forger.dreamsofdivinity.procedures.MultiCastDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastAreaCoverageDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicTrackingDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.MagicDurationDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCostDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOnDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOffDisplayProcedure;
import net.forger.dreamsofdivinity.network.SpellEditMenu2ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpellEditMenu2Screen extends AbstractContainerScreen<SpellEditMenu2Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox SelectionMultiplier;
	Button button_on;
	Button button_off;
	ImageButton imagebutton_arrow11;
	ImageButton imagebutton_asmallleftarrow;
	ImageButton imagebutton_asmallrightarrow;
	ImageButton imagebutton_asmallleftarrow1;
	ImageButton imagebutton_asmallrightarrow1;
	ImageButton imagebutton_asmallleftarrow2;
	ImageButton imagebutton_asmallrightarrow2;
	ImageButton imagebutton_asmallleftarrow3;
	ImageButton imagebutton_asmallrightarrow3;
	ImageButton imagebutton_asmallleftarrow4;
	ImageButton imagebutton_asmallrightarrow4;

	public SpellEditMenu2Screen(SpellEditMenu2Menu container, Inventory inventory, Component text) {
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
			if (name.equals("SelectionMultiplier"))
				SelectionMultiplier.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/spell_edit_menu_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		SelectionMultiplier.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -82 && mouseX < leftPos + -58 && mouseY > topPos + -77 && mouseY < topPos + -53) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.tooltip_chooses_the_direction_the_magic"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -89 && mouseX < leftPos + -65 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.tooltip_how_fast_the_spell_flies"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -89 && mouseX < leftPos + -65 && mouseY > topPos + 0 && mouseY < topPos + 24) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.tooltip_how_much_damage_your_enhanced_at"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -89 && mouseX < leftPos + -65 && mouseY > topPos + 42 && mouseY < topPos + 66) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.tooltip_cooldown_time_before_casting_ano1"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + 128 && mouseX < leftPos + 152 && mouseY > topPos + -77 && mouseY < topPos + -53) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.tooltip_decides_how_far_out_your_placed"), mouseX, mouseY);
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
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (SelectionMultiplier.isFocused())
			return SelectionMultiplier.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String SelectionMultiplierValue = SelectionMultiplier.getValue();
		super.resize(minecraft, width, height);
		SelectionMultiplier.setValue(SelectionMultiplierValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_selection_multiplier"), -208, -112, -13434778, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_magicdirection"), -187, -77, -16751104, false);
		if (MagicFollowOrientationDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_forward"), -173, -63, -16751104, false);
		if (MagicFollowOrientationDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_backward"), -194, -63, -16751104, false);
		if (MagicFollowOrientationDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_left"), -194, -63, -16751104, false);
		guiGraphics.drawString(this.font, MagicDurationDisplayProcedure.execute(entity), -159, -28, -65536, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_magic_movement"), -187, -42, -65536, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_magic_power"), -180, 0, -6750208, false);
		guiGraphics.drawString(this.font, MagicTrackingDisplayProcedure.execute(entity), -159, 14, -6750208, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_spell_cooldown"), -173, 42, -16711681, false);
		guiGraphics.drawString(this.font, MultiCastDisplayProcedure.execute(entity), -159, 56, -16711681, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_skill_cost"), -54, -112, -13434625, false);
		guiGraphics.drawString(this.font, MagicCostDisplayProcedure.execute(entity), 9, -112, -16776961, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_casting_offset"), -19, -77, -16711834, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, MultiCastAreaCoverageDisplayProcedure.execute(entity), 23, -63, -10027162, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_empty3"), 135, -77, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_empty4"), -82, 42, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_empty5"), -82, 0, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_empty6"), -82, -42, -1, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_empty7"), -75, -77, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.label_guided_magic"), 16, -35, -16711936, false);
	}

	@Override
	public void init() {
		super.init();
		SelectionMultiplier = new EditBox(this.font, this.leftPos + -207, this.topPos + -102, 118, 18, Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.SelectionMultiplier"));
		SelectionMultiplier.setMaxLength(8192);
		SelectionMultiplier.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "SelectionMultiplier", content, false);
		});
		this.addWidget(this.SelectionMultiplier);
		button_on = Button.builder(Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.button_on"), e -> {
			int x = SpellEditMenu2Screen.this.x;
			int y = SpellEditMenu2Screen.this.y;
			if (GuidedMagicOnDisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(0, x, y, z));
				SpellEditMenu2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 30, this.topPos + -21, 35, 20).build();
		this.addRenderableWidget(button_on);
		button_off = Button.builder(Component.translatable("gui.dreams_of_divinity.spell_edit_menu_2.button_off"), e -> {
			int x = SpellEditMenu2Screen.this.x;
			int y = SpellEditMenu2Screen.this.y;
			if (GuidedMagicOffDisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(1, x, y, z));
				SpellEditMenu2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 30, this.topPos + -21, 40, 20).build();
		this.addRenderableWidget(button_off);
		imagebutton_arrow11 = new ImageButton(this.leftPos + -207, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrowselect.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrow.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(2, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow11);
		imagebutton_asmallleftarrow = new ImageButton(this.leftPos + -208, this.topPos + -77, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(3, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow);
		imagebutton_asmallrightarrow = new ImageButton(this.leftPos + -96, this.topPos + -77, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(4, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow);
		imagebutton_asmallleftarrow1 = new ImageButton(this.leftPos + -208, this.topPos + -42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(5, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow1);
		imagebutton_asmallrightarrow1 = new ImageButton(this.leftPos + -110, this.topPos + -42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(6, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow1);
		imagebutton_asmallleftarrow2 = new ImageButton(this.leftPos + -208, this.topPos + 0, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(7, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow2);
		imagebutton_asmallrightarrow2 = new ImageButton(this.leftPos + -110, this.topPos + 0, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(8, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow2);
		imagebutton_asmallleftarrow3 = new ImageButton(this.leftPos + -208, this.topPos + 42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(9, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow3);
		imagebutton_asmallrightarrow3 = new ImageButton(this.leftPos + -110, this.topPos + 42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(10, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow3);
		imagebutton_asmallleftarrow4 = new ImageButton(this.leftPos + -40, this.topPos + -77, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(11, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 11, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow4);
		imagebutton_asmallrightarrow4 = new ImageButton(this.leftPos + 114, this.topPos + -77, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenu2Screen.this.x;
					int y = SpellEditMenu2Screen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenu2ButtonMessage(12, x, y, z));
						SpellEditMenu2ButtonMessage.handleButtonAction(entity, 12, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow4);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		this.button_on.visible = GuidedMagicOnDisplayProcedure.execute(entity);
		this.button_off.visible = GuidedMagicOffDisplayProcedure.execute(entity);
	}
}