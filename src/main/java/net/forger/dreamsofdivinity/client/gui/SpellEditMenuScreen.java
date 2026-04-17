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
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.forger.dreamsofdivinity.world.inventory.SpellEditMenuMenu;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay4Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay1and5Procedure;
import net.forger.dreamsofdivinity.procedures.SpellTypeDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.MagicSpeedDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSizeDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay6Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay5Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay4Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay3Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay2Procedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.MagicPowerDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicPiercingDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayRightProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayRandomProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayLeftProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplayBackwardProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDisplay1Procedure;
import net.forger.dreamsofdivinity.procedures.MagicCostDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCooldownDisplayProcedure;
import net.forger.dreamsofdivinity.procedures.CastingOffsetDisplayProcedure;
import net.forger.dreamsofdivinity.network.SpellEditMenuButtonMessage;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpellEditMenuScreen extends AbstractContainerScreen<SpellEditMenuMenu> implements DreamsOfDivinityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox SelectionMultiplier;
	EditBox spellname;
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
	ImageButton imagebutton_asmallleftarrow5;
	ImageButton imagebutton_asmallrightarrow5;
	ImageButton imagebutton_asmallleftarrow6;
	ImageButton imagebutton_asmallrightarrow6;
	ImageButton imagebutton_asmallleftarrow7;
	ImageButton imagebutton_asmallrightarrow7;
	ImageButton imagebutton_rightarrow;

	public SpellEditMenuScreen(SpellEditMenuMenu container, Inventory inventory, Component text) {
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
			else if (name.equals("spellname"))
				spellname.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dreams_of_divinity:textures/screens/spell_edit_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		SelectionMultiplier.render(guiGraphics, mouseX, mouseY, partialTicks);
		spellname.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -82 && mouseX < leftPos + -58 && mouseY > topPos + -77 && mouseY < topPos + -53) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_chooses_the_direction_the_magic"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_fast_the_spell_flies"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay2Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_fast_you_can_attack"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay3Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_your_defensive_field_damage_and"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 0 && mouseY < topPos + 24) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_magic_damage"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay3Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 0 && mouseY < topPos + 24) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_much_defense_your_magic_prov"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay2Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 0 && mouseY < topPos + 24) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_much_damage_your_enhanced_at"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 42 && mouseY < topPos + 66) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_cooldown_time_before_casting_ano"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (MagicShapeDisplay2Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 42 && mouseY < topPos + 66) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_cooldown_time_before_casting_ano1"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay3Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 42 && mouseY < topPos + 66) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_magic_bending_cooldown_and_spell"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay5Procedure.execute(entity))
			if (mouseX > leftPos + 93 && mouseX < leftPos + 117 && mouseY > topPos + -77 && mouseY < topPos + -53) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_decides_how_far_out_your_placed"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 96 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_changes_the_aoe_and_size_of_your"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay3Procedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 96 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_changes_your_magic_bending_size"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay2Procedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 96 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_changes_your_weapon_attack_reach"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (MagicShapeDisplay1Procedure.execute(entity))
			if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 14 && mouseY < topPos + 38) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_no_stat_changes"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 96 && mouseY > topPos + 0 && mouseY < topPos + 24) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_changes_magic_shape"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (MagicShapeDisplay2Procedure.execute(entity))
			if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 14 && mouseY < topPos + 38) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_size_40_damage_10_spee"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (MagicShapeDisplay3Procedure.execute(entity))
			if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 14 && mouseY < topPos + 38) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_speed_30_damage_10_size"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (MagicShapeDisplay4Procedure.execute(entity))
			if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 14 && mouseY < topPos + 38) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_speed_60_size_40"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (MagicShapeDisplay5Procedure.execute(entity))
			if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 14 && mouseY < topPos + 38) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_speed_25_size_25_damage"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (MagicShapeDisplay6Procedure.execute(entity))
			if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 14 && mouseY < topPos + 38) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_damage_40_piercing_1_spe"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 96 && mouseY > topPos + 42 && mouseY < topPos + 66) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_many_times_magic_can_pierce"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay4Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + -42 && mouseY < topPos + -18) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_powerful_your_boost_is"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay4Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 0 && mouseY < topPos + 24) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_much_stamina_your_boost_bar"), mouseX, mouseY);
				customTooltipShown = true;
			}
		if (SpellTypeDisplay4Procedure.execute(entity))
			if (mouseX > leftPos + -96 && mouseX < leftPos + -72 && mouseY > topPos + 42 && mouseY < topPos + 66) {
				guiGraphics.renderTooltip(font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.tooltip_how_fast_boost_regenerates_lowe"), mouseX, mouseY);
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
		if (spellname.isFocused())
			return spellname.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String SelectionMultiplierValue = SelectionMultiplier.getValue();
		String spellnameValue = spellname.getValue();
		super.resize(minecraft, width, height);
		SelectionMultiplier.setValue(SelectionMultiplierValue);
		spellname.setValue(spellnameValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_selection_multiplier"), -208, -112, -13434778, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_magicdirection"), -187, -77, -16751104, false);
		if (MagicDirectionDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_forward"), -173, -63, -16751104, false);
		if (MagicDirectionDisplayBackwardProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_backward"), -173, -63, -16751104, false);
		if (MagicDirectionDisplayLeftProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_left"), -166, -63, -16751104, false);
		if (MagicDirectionDisplayRightProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_right"), -166, -63, -16751104, false);
		if (MagicDirectionDisplayDownProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_up"), -159, -63, -16751104, false);
		if (MagicDirectionDisplayUpProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_down"), -166, -63, -16751104, false);
		if (MagicDirectionDisplayRandomProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_random"), -173, -63, -16751104, false);
		if (SpellTypeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_spell_speed"), -180, -42, -3407872, false);
		guiGraphics.drawString(this.font, MagicSpeedDisplayProcedure.execute(entity), -173, -28, -65536, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_attack_speed"), -187, -42, -3407872, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empower"), -173, -42, -65536, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_magic_movement"), -194, -42, -65536, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_magic_power"), -180, 0, -39424, false);
		guiGraphics.drawString(this.font, MagicPowerDisplayProcedure.execute(entity), -173, 14, -39424, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_defense"), -173, 0, -39424, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_spell_cooldown"), -194, 42, -16711681, false);
		guiGraphics.drawString(this.font, MagicCooldownDisplayProcedure.execute(entity), -173, 56, -16711681, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_weapon_power"), -180, 0, -39424, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_skill_cost"), -54, -112, -13434625, false);
		guiGraphics.drawString(this.font, MagicCostDisplayProcedure.execute(entity), 9, -112, -16776961, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_casting_offset"), -26, -77, -16711834, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, CastingOffsetDisplayProcedure.execute(entity), 9, -63, -10027162, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_magic_size"), -12, -42, -256, false);
		if (SpellTypeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_bending_output"), -26, -42, -256, false);
		if (SpellTypeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_attack_size"), -12, -42, -256, false);
		guiGraphics.drawString(this.font, MagicSizeDisplayProcedure.execute(entity), 2, -28, -256, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_magic_shape"), -12, 0, -6749953, false);
		if (MagicShapeDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_shapeless"), -12, 14, -6749953, false);
		if (MagicShapeDisplay2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_sphere"), -5, 14, -6749953, false);
		if (MagicShapeDisplay3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_arrow"), -5, 14, -6749953, false);
		if (MagicShapeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_beam"), 2, 14, -6749953, false);
		if (MagicShapeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_helix"), 2, 14, -6749953, false);
		if (MagicShapeDisplay6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_sword"), -5, 14, -6749953, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty1"), 79, 0, -1, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty"), 44, 14, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty2"), 79, -42, -1, false);
		if (SpellTypeDisplay5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty3"), 100, -77, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty4"), -89, 42, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty5"), -89, 0, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty6"), -89, -42, -1, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty7"), -75, -77, -1, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_piercing"), -5, 42, -16711732, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, MagicPiercingDisplayProcedure.execute(entity), 9, 56, -16724839, false);
		if (SpellTypeDisplay1and5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_empty8"), 79, 42, -1, false);
		if (SpellTypeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_boost_speed"), -187, -42, -65536, false);
		if (SpellTypeDisplay4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_boost_amount"), -180, 0, -39424, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.label_spell_name"), -26, 81, -6750004, false);
	}

	@Override
	public void init() {
		super.init();
		SelectionMultiplier = new EditBox(this.font, this.leftPos + -207, this.topPos + -102, 118, 18, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.SelectionMultiplier"));
		SelectionMultiplier.setMaxLength(8192);
		SelectionMultiplier.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "SelectionMultiplier", content, false);
		});
		this.addWidget(this.SelectionMultiplier);
		spellname = new EditBox(this.font, this.leftPos + -59, this.topPos + 94, 118, 18, Component.translatable("gui.dreams_of_divinity.spell_edit_menu.spellname"));
		spellname.setMaxLength(8192);
		spellname.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "spellname", content, false);
		});
		spellname.setHint(Component.translatable("gui.dreams_of_divinity.spell_edit_menu.spellname"));
		this.addWidget(this.spellname);
		imagebutton_arrow11 = new ImageButton(this.leftPos + -194, this.topPos + 77, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrowselect.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/leftarrow.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(0, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
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
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(1, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow);
		imagebutton_asmallrightarrow = new ImageButton(this.leftPos + -103, this.topPos + -77, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(2, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
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
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(3, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow1);
		imagebutton_asmallrightarrow1 = new ImageButton(this.leftPos + -117, this.topPos + -42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(4, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
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
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(5, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
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
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(6, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 6, x, y, z);
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
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(7, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 7, x, y, z);
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
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(8, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 8, x, y, z);
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
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(9, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow4);
		imagebutton_asmallrightarrow4 = new ImageButton(this.leftPos + 72, this.topPos + -77, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(10, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow4);
		imagebutton_asmallleftarrow5 = new ImageButton(this.leftPos + -40, this.topPos + -42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(11, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 11, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow5);
		imagebutton_asmallrightarrow5 = new ImageButton(this.leftPos + 51, this.topPos + -42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(12, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 12, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow5);
		imagebutton_asmallleftarrow6 = new ImageButton(this.leftPos + -40, this.topPos + 0, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(13, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 13, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow6);
		imagebutton_asmallrightarrow6 = new ImageButton(this.leftPos + 51, this.topPos + 0, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(14, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 14, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow6);
		imagebutton_asmallleftarrow7 = new ImageButton(this.leftPos + -40, this.topPos + 42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallleftarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(15, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 15, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallleftarrow7);
		imagebutton_asmallrightarrow7 = new ImageButton(this.leftPos + 51, this.topPos + 42, 16, 16,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/asmallrightarrowselected.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (SpellTypeDisplay1and5Procedure.execute(entity)) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(16, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 16, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpellTypeDisplay1and5Procedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_asmallrightarrow7);
		imagebutton_rightarrow = new ImageButton(this.leftPos + 163, this.topPos + 77, 32, 32,
				new WidgetSprites(ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrow.png"), ResourceLocation.parse("dreams_of_divinity:textures/screens/rightarrowselect.png")), e -> {
					int x = SpellEditMenuScreen.this.x;
					int y = SpellEditMenuScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new SpellEditMenuButtonMessage(17, x, y, z));
						SpellEditMenuButtonMessage.handleButtonAction(entity, 17, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_rightarrow);
	}
}