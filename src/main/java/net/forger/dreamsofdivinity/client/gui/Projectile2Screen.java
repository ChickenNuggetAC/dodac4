package net.forger.dreamsofdivinity.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.forger.dreamsofdivinity.world.inventory.Projectile2Menu;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.SelectionMultiplierNumberDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSizeDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay6Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay4Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.MagicPiercingDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCostDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.Display4OffProcedure;
import net.forger.dreamsofdivinity.procedures.CastingOffsetDisplayProcedure;
import net.forger.dreamsofdivinity.network.Projectile2ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class Projectile2Screen extends AbstractContainerScreen<Projectile2Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_reset;
	ImageButton imagebutton_arrow27;
	ImageButton imagebutton_arrow16;
	ImageButton imagebutton_arrow26;
	ImageButton imagebutton_arrow25;
	ImageButton imagebutton_arrow15;
	ImageButton imagebutton_arrow21;
	ImageButton imagebutton_arrow11;
	ImageButton imagebutton_arrow12;
	ImageButton imagebutton_arrow22;
	ImageButton imagebutton_arrow13;
	ImageButton imagebutton_arrow23;
	ImageButton imagebutton_arrow24;
	ImageButton imagebutton_arrow14;
	ImageButton imagebutton_arrow2;
	ImageButton imagebutton_arrow1;
	ImageButton imagebutton_arrow28;
	ImageButton imagebutton_arrow17;

	public Projectile2Screen(Projectile2Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/projectile_2.png");

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
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_spell_speed"), -24, -70, -65536, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_spell_power"), -29, -6, -39424, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_selection_multiplier"), -207, -116, -6750004, false);
		guiGraphics.drawString(this.font, SelectionMultiplierNumberDisplayProcedure.execute(entity), -164, -95, -6750004, false);
		if (Display4OffProcedure.execute(entity))
			guiGraphics.drawString(this.font, MagicSizeDisplayProcedure.execute(entity), -3, -51, -65536, false);
		if (MagicShapeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_shapeless"), -24, 7, -6710887, false);
		if (MagicShapeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_sphere"), -17, 7, -6710887, false);
		if (MagicShapeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_arrow"), -14, 6, -6710887, false);
		if (MagicShapeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_beam"), -12, 7, -6710887, false);
		if (MagicShapeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_helix"), -14, 7, -6710887, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_piercing"), -21, 58, -10092544, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, MagicPiercingDisplayProcedure.execute(entity), -3, 73, -10092544, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_attack_size"), -30, -70, -65536, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_bending_output"), -37, -70, -65536, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_magic_size"), -25, -70, -65536, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_magic_shape"), -29, -6, -39424, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_piercing1"), -21, 58, -10092544, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, MagicPiercingDisplayProcedure.execute(entity), -3, 73, -10092544, false);
		guiGraphics.drawString(this.font, MagicCostDisplayProcedure.execute(entity), 117, -112, -16776961, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_skill_cost"), 59, -112, -16776961, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_placed_casting_offset"), -187, -45, -39424, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, CastingOffsetDisplayProcedure.execute(entity), -142, -27, -3381760, false);
		if (MagicShapeDisplay6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_2.label_sword"), -16, 7, -6710887, false);
	}

	@Override
	public void init() {
		super.init();
		button_reset = new PlainTextButton(this.leftPos + -171, this.topPos + -75, 56, 20, Component.translatable("gui.dreams_of_divinity.projectile_2.button_reset"), e -> {
			int x = Projectile2Screen.this.x;
			int y = Projectile2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new Projectile2ButtonMessage(0, x, y, z));
				Projectile2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_reset);
		imagebutton_arrow27 = new ImageButton(this.leftPos + 145, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(1, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow27);
		imagebutton_arrow16 = new ImageButton(this.leftPos + -95, this.topPos + 63, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(2, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow16);
		imagebutton_arrow26 = new ImageButton(this.leftPos + 62, this.topPos + 64, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(3, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow26);
		imagebutton_arrow25 = new ImageButton(this.leftPos + 61, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(4, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow25);
		imagebutton_arrow15 = new ImageButton(this.leftPos + -95, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(5, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow15);
		imagebutton_arrow21 = new ImageButton(this.leftPos + 173, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay1Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(6, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow21);
		imagebutton_arrow11 = new ImageButton(this.leftPos + -207, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(7, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow11);
		imagebutton_arrow12 = new ImageButton(this.leftPos + -67, this.topPos + -69, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (Display4OffProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(8, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (Display4OffProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow12);
		imagebutton_arrow22 = new ImageButton(this.leftPos + 33, this.topPos + -68, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (Display4OffProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(9, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (Display4OffProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow22);
		imagebutton_arrow13 = new ImageButton(this.leftPos + -67, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay1Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(10, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow13);
		imagebutton_arrow23 = new ImageButton(this.leftPos + 33, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay1Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(11, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 11, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow23);
		imagebutton_arrow24 = new ImageButton(this.leftPos + -130, this.topPos + -105, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(12, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 12, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow24);
		imagebutton_arrow14 = new ImageButton(this.leftPos + -214, this.topPos + -105, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(13, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 13, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow14);
		imagebutton_arrow2 = new ImageButton(this.leftPos + 33, this.topPos + 64, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay1Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(14, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 14, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow2);
		imagebutton_arrow1 = new ImageButton(this.leftPos + -67, this.topPos + 63, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay1Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(15, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 15, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow1);
		imagebutton_arrow28 = new ImageButton(this.leftPos + -94, this.topPos + -37, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(16, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 16, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow28);
		imagebutton_arrow17 = new ImageButton(this.leftPos + -207, this.topPos + -37, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile2Screen.this.x;
					int y = Projectile2Screen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile2ButtonMessage(17, x, y, z));
						Projectile2ButtonMessage.handleButtonAction(entity, 17, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow17);
	}
}