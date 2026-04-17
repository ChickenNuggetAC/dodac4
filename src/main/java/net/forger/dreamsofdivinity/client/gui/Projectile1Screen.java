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

import net.forger.dreamsofdivinity.world.inventory.Projectile1Menu;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay4Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.SelectionMultiplierNumberDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSpeedDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicPowerDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayRightProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayRandomProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayLeftProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayBackwardProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.MagicCostDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCooldownDisplayProcedure;
import net.forger.dreamsofdivinity.network.Projectile1ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class Projectile1Screen extends AbstractContainerScreen<Projectile1Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
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
	ImageButton imagebutton_arrow25;
	ImageButton imagebutton_arrow15;

	public Projectile1Screen(Projectile1Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/projectile_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (SpellTypeDisplay5Procedure.execute(entity))
			if (mouseX > leftPos + 48 && mouseX < leftPos + 72 && mouseY > topPos + -76 && mouseY < topPos + -52) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.projectile_1.tooltip_can_move_up_or_down_depending_on"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay4Procedure.execute(entity))
			if (mouseX > leftPos + 46 && mouseX < leftPos + 70 && mouseY > topPos + -76 && mouseY < topPos + -52) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.projectile_1.tooltip_has_different_effects_depnding_o"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay3Procedure.execute(entity))
			if (mouseX > leftPos + 60 && mouseX < leftPos + 84 && mouseY > topPos + 56 && mouseY < topPos + 80) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.projectile_1.tooltip_allows_you_to_bend_the_magic_out"), mouseX, mouseY);
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
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_spell_type"), -21, 61, -16711732, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_spell_speed"), -26, -70, -65536, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_spell_power"), -27, -6, -39424, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_selection_multiplier"), -207, -116, -6750004, false);
		guiGraphics.drawString(this.font, SelectionMultiplierNumberDisplayProcedure.execute(entity), -164, -95, -6750004, false);
		guiGraphics.drawString(this.font, MagicPowerDisplayProcedure.execute(entity), -3, 10, -39424, false);
		guiGraphics.drawString(this.font, MagicSpeedDisplayProcedure.execute(entity), -3, -51, -65536, false);
		guiGraphics.drawString(this.font, MagicCooldownDisplayProcedure.execute(entity), -3, 75, -16711732, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_attack_speed"), -29, -70, -65536, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_weapon_power"), -31, -6, -39424, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_attack_cooldown_speed"), -54, 55, -16711732, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_defense"), -16, -70, -65536, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_empower"), -18, -6, -39424, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_magic_bending_cooldown"), -57, 55, -16711732, false);
		if (SpellTypeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_movement_speed"), -36, -70, -65536, false);
		if (SpellTypeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_movement_force"), -37, -6, -39424, false);
		if (SpellTypeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_movement_cooldown"), -44, 55, -16711732, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_magic_movement"), -37, -71, -65536, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_magic_power"), -29, -6, -39424, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_cooldown"), -21, 61, -16711732, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_empty"), 63, 58, -6710887, false);
		if (SpellTypeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_empty1"), 48, -73, -6710887, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_empty2"), 47, -75, -6710887, false);
		guiGraphics.drawString(this.font, MagicCostDisplayProcedure.execute(entity), 117, -112, -16776961, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_skill_cost"), 59, -112, -16776961, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_magic_direction"), -178, -37, -16724992, false);
		if (MagicDirectionDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_forward"), -156, -18, -13395712, false);
		if (MagicDirectionDisplayBackwardProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_backward"), -159, -18, -16738048, false);
		if (MagicDirectionDisplayLeftProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_left"), -147, -18, -16738048, false);
		if (MagicDirectionDisplayRightProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_right"), -152, -19, -16738048, false);
		if (MagicDirectionDisplayUpProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_up"), -141, -19, -16738048, false);
		if (MagicDirectionDisplayDownProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_down"), -149, -19, -16738048, false);
		if (MagicDirectionDisplayRandomProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_1.label_random"), -153, -18, -16738048, false);
	}

	@Override
	public void init() {
		super.init();
		button_reset = new PlainTextButton(this.leftPos + -168, this.topPos + -75, 56, 20, Component.translatable("gui.dreams_of_divinity.projectile_1.button_reset"), e -> {
			int x = Projectile1Screen.this.x;
			int y = Projectile1Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new Projectile1ButtonMessage(0, x, y, z));
				Projectile1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_reset);
		imagebutton_arrow2 = new ImageButton(this.leftPos + 33, this.topPos + 64, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(1, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
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
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(2, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
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
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(3, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
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
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(4, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
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
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(5, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow12);
		imagebutton_arrow22 = new ImageButton(this.leftPos + 33, this.topPos + -68, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(6, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow22);
		imagebutton_arrow13 = new ImageButton(this.leftPos + -67, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(7, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
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
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(8, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 8, x, y, z);
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
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(9, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow24);
		imagebutton_arrow14 = new ImageButton(this.leftPos + -217, this.topPos + -106, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(10, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow14);
		imagebutton_arrow25 = new ImageButton(this.leftPos + -114, this.topPos + -28, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(11, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 11, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow25);
		imagebutton_arrow15 = new ImageButton(this.leftPos + -195, this.topPos + -28, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile1Screen.this.x;
					int y = Projectile1Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile1ButtonMessage(12, x, y, z));
						Projectile1ButtonMessage.handleButtonAction(entity, 12, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow15);
	}
}