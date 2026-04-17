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

import net.forger.dreamsofdivinity.world.inventory.Projectile4Menu;
import net.forger.dreamsofdivinity.procedures.SelectionMultiplierNumberDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastAreaCoverageDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCostDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOnDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOffDisplayProcedure;
import net.forger.dreamsofdivinity.network.Projectile4ButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class Projectile4Screen extends AbstractContainerScreen<Projectile4Menu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_reset;
	Button button_on;
	Button button_off;
	ImageButton imagebutton_arrow21;
	ImageButton imagebutton_arrow11;
	ImageButton imagebutton_arrow13;
	ImageButton imagebutton_arrow23;
	ImageButton imagebutton_arrow24;
	ImageButton imagebutton_arrow14;
	ImageButton imagebutton_arrow2;
	ImageButton imagebutton_arrow1;

	public Projectile4Screen(Projectile4Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/projectile_4.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_4.label_spell_power"), -26, -11, -10092289, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_4.label_selection_multiplier"), -207, -116, -6750004, false);
		guiGraphics.drawString(this.font, SelectionMultiplierNumberDisplayProcedure.execute(entity), -164, -95, -6750004, false);
		guiGraphics.drawString(this.font, MultiCastDisplayProcedure.execute(entity), -3, 10, -10092289, false);
		guiGraphics.drawString(this.font, MagicCostDisplayProcedure.execute(entity), 117, -112, -16776961, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_4.label_skill_cost"), 59, -112, -16776961, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_4.label_guided_magic"), -32, -67, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.projectile_4.label_multicast_area_coverage"), -59, 44, -65536, false);
		guiGraphics.drawString(this.font, MultiCastAreaCoverageDisplayProcedure.execute(entity), -8, 71, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		button_reset = new PlainTextButton(this.leftPos + -169, this.topPos + -75, 56, 20, Component.translatable("gui.dreams_of_divinity.projectile_4.button_reset"), e -> {
			int x = Projectile4Screen.this.x;
			int y = Projectile4Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new Projectile4ButtonMessage(0, x, y, z));
				Projectile4ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_reset);
		button_on = Button.builder(Component.translatable("gui.dreams_of_divinity.projectile_4.button_on"), e -> {
			int x = Projectile4Screen.this.x;
			int y = Projectile4Screen.this.y;
			if (GuidedMagicOnDisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new Projectile4ButtonMessage(1, x, y, z));
				Projectile4ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -17, this.topPos + -51, 35, 20).build();
		this.addRenderableWidget(button_on);
		button_off = Button.builder(Component.translatable("gui.dreams_of_divinity.projectile_4.button_off"), e -> {
			int x = Projectile4Screen.this.x;
			int y = Projectile4Screen.this.y;
			if (GuidedMagicOffDisplayProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new Projectile4ButtonMessage(2, x, y, z));
				Projectile4ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -20, this.topPos + -52, 40, 20).build();
		this.addRenderableWidget(button_off);
		imagebutton_arrow21 = new ImageButton(this.leftPos + 173, this.topPos + 80, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(3, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 3, x, y, z);
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
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(4, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow11);
		imagebutton_arrow13 = new ImageButton(this.leftPos + -67, this.topPos + -3, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(5, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 5, x, y, z);
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
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(6, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 6, x, y, z);
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
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(7, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 7, x, y, z);
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
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(8, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow14);
		imagebutton_arrow2 = new ImageButton(this.leftPos + 32, this.topPos + 61, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow2.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow22.png")), e -> {
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(9, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow2);
		imagebutton_arrow1 = new ImageButton(this.leftPos + -67, this.topPos + 60, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow1.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/arrow12.png")), e -> {
					int x = Projectile4Screen.this.x;
					int y = Projectile4Screen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new Projectile4ButtonMessage(10, x, y, z));
						Projectile4ButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrow1);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		this.button_on.visible = GuidedMagicOnDisplayProcedure.execute(entity);
		this.button_off.visible = GuidedMagicOffDisplayProcedure.execute(entity);
	}
}