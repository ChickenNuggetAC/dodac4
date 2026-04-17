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

import net.forger.dreamsofdivinity.world.inventory.Projectile3Menu;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.SelectionMultiplierNumberDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicTrackingDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.MagicDurationDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCostDisplayProcedure;
import net.forger.dreamsofdivinity.network.Projectile3ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class Projectile3Screen extends AbstractContainerScreen<Projectile3Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_reset;
	ImageButton imagebutton_arrow2;
	ImageButton imagebutton_arrow1;
	ImageButton imagebutton_arrow21;
	ImageButton imagebutton_arrow11;
	ImageButton imagebutton_arrow12;
	ImageButton imagebutton_arrow22;
	ImageButton imagebutton_arrow13;
	ImageButton imagebutton_arrow23;
	ImageButton imagebutton_arrow24;
	ImageButton imagebutton_arrow14;

	public Projectile3Screen(Projectile3Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/projectile_3.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 61 && mouseX < leftPos + 85 && mouseY > topPos + 53 && mouseY < topPos + 77) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.projectile_3.tooltip_locks_onto_nearest_enemies_withi"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 57 && mouseX < leftPos + 81 && mouseY > topPos + -16 && mouseY < topPos + 8) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.projectile_3.tooltip_how_long_the_skill_lasts"), mouseX, mouseY);
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
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_spell_type"), -22, 61, -10092544, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_spell_speed"), -59, -78, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_spell_power"), -37, -11, -16711732, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_selection_multiplier"), -207, -116, -6750004, false);
		guiGraphics.drawString(this.font, SelectionMultiplierNumberDisplayProcedure.execute(entity), -164, -95, -6750004, false);
		guiGraphics.drawString(this.font, MagicDurationDisplayProcedure.execute(entity), -3, 10, -16711732, false);
		guiGraphics.drawString(this.font, MagicTrackingDisplayProcedure.execute(entity), -3, 75, -10092544, false);
		if (MagicFollowOrientationDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_none"), -7, -58, -65536, false);
		if (MagicFollowOrientationDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_follow_player"), -48, -59, -65536, false);
		if (MagicFollowOrientationDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_player_follows_magic"), -48, -59, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_empty"), 64, 56, -6710887, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_empty1"), 61, -13, -6710887, false);
		guiGraphics.drawString(this.font, MagicCostDisplayProcedure.execute(entity), 117, -112, -16776961, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_3.label_skill_cost"), 59, -112, -16776961, false);
	}

	@Override
	public void init() {
		super.init();
		button_reset = new PlainTextButton(this.leftPos + -169, this.topPos + -75, 56, 20, Component.translatable("gui.dreams_of_divinity.projectile_3.button_reset"), e -> {
			int x = Projectile3Screen.this.x;
			int y = Projectile3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new Projectile3ButtonMessage(0, x, y, z));
				Projectile3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_reset);
		imagebutton_arrow2 = new ImageButton(this.leftPos + 33, this.topPos + 64, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(1, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow2);
		imagebutton_arrow1 = new ImageButton(this.leftPos + -67, this.topPos + 63, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(2, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow1);
		imagebutton_arrow21 = new ImageButton(this.leftPos + 173, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(3, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow21);
		imagebutton_arrow11 = new ImageButton(this.leftPos + -207, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(4, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow11);
		imagebutton_arrow12 = new ImageButton(this.leftPos + -93, this.topPos + -68, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (SpellTypeDisplay1Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(5, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow12);
		imagebutton_arrow22 = new ImageButton(this.leftPos + 67, this.topPos + -68, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (SpellTypeDisplay1Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(6, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow22);
		imagebutton_arrow13 = new ImageButton(this.leftPos + -67, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(7, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow13);
		imagebutton_arrow23 = new ImageButton(this.leftPos + 33, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(8, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow23);
		imagebutton_arrow24 = new ImageButton(this.leftPos + -130, this.topPos + -105, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(9, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 9, x, y, z);
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
					int x = Projectile3Screen.this.x;
					int y = Projectile3Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile3ButtonMessage(10, x, y, z));
						Projectile3ButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow14);
	}
}