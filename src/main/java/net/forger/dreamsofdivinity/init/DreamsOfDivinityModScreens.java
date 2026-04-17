/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import org.joml.Vector3f;
import org.joml.Quaternionf;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.forger.dreamsofdivinity.client.gui.SpiritStoneGuiScreen;
import net.forger.dreamsofdivinity.client.gui.SpiritForgeGUIScreen;
import net.forger.dreamsofdivinity.client.gui.SpellEditMenuScreen;
import net.forger.dreamsofdivinity.client.gui.SpellEditMenu2Screen;
import net.forger.dreamsofdivinity.client.gui.Projectile4Screen;
import net.forger.dreamsofdivinity.client.gui.Projectile3Screen;
import net.forger.dreamsofdivinity.client.gui.Projectile2Screen;
import net.forger.dreamsofdivinity.client.gui.Projectile1Screen;
import net.forger.dreamsofdivinity.client.gui.PartySettingsScreen;
import net.forger.dreamsofdivinity.client.gui.MagicSelection1Screen;
import net.forger.dreamsofdivinity.client.gui.Magic1Screen;
import net.forger.dreamsofdivinity.client.gui.KeybindSelectScreen;
import net.forger.dreamsofdivinity.client.gui.BlockInscriptionWandGUIScreen;
import net.forger.dreamsofdivinity.client.gui.BlockInscriptionWandGUI2Screen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DreamsOfDivinityModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(DreamsOfDivinityModMenus.MAGIC_SELECTION_1.get(), MagicSelection1Screen::new);
		event.register(DreamsOfDivinityModMenus.KEYBIND_SELECT.get(), KeybindSelectScreen::new);
		event.register(DreamsOfDivinityModMenus.MAGIC_1.get(), Magic1Screen::new);
		event.register(DreamsOfDivinityModMenus.PROJECTILE_1.get(), Projectile1Screen::new);
		event.register(DreamsOfDivinityModMenus.PROJECTILE_2.get(), Projectile2Screen::new);
		event.register(DreamsOfDivinityModMenus.PROJECTILE_3.get(), Projectile3Screen::new);
		event.register(DreamsOfDivinityModMenus.PROJECTILE_4.get(), Projectile4Screen::new);
		event.register(DreamsOfDivinityModMenus.SPELL_EDIT_MENU.get(), SpellEditMenuScreen::new);
		event.register(DreamsOfDivinityModMenus.SPELL_EDIT_MENU_2.get(), SpellEditMenu2Screen::new);
		event.register(DreamsOfDivinityModMenus.PARTY_SETTINGS.get(), PartySettingsScreen::new);
		event.register(DreamsOfDivinityModMenus.BLOCK_INSCRIPTION_WAND_GUI.get(), BlockInscriptionWandGUIScreen::new);
		event.register(DreamsOfDivinityModMenus.BLOCK_INSCRIPTION_WAND_GUI_2.get(), BlockInscriptionWandGUI2Screen::new);
		event.register(DreamsOfDivinityModMenus.SPIRIT_STONE_GUI.get(), SpiritStoneGuiScreen::new);
		event.register(DreamsOfDivinityModMenus.SPIRIT_FORGE_GUI.get(), SpiritForgeGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}

	public static void renderEntityInInventoryFollowsAngle(GuiGraphics guiGraphics, int x, int y, int scale, float angleXComponent, float angleYComponent, LivingEntity entity) {
		Quaternionf pose = new Quaternionf().rotateZ((float) Math.PI);
		Quaternionf cameraOrientation = new Quaternionf().rotateX(angleYComponent * 20 * ((float) Math.PI / 180F));
		pose.mul(cameraOrientation);
		float f2 = entity.yBodyRot;
		float f3 = entity.getYRot();
		float f4 = entity.getXRot();
		float f5 = entity.yHeadRotO;
		float f6 = entity.yHeadRot;
		entity.yBodyRot = 180.0F + angleXComponent * 20.0F;
		entity.setYRot(180.0F + angleXComponent * 40.0F);
		entity.setXRot(-angleYComponent * 20.0F);
		entity.yHeadRot = entity.getYRot();
		entity.yHeadRotO = entity.getYRot();
		InventoryScreen.renderEntityInInventory(guiGraphics, x, y, scale, new Vector3f(0, 0, 0), pose, cameraOrientation, entity);
		entity.yBodyRot = f2;
		entity.setYRot(f3);
		entity.setXRot(f4);
		entity.yHeadRotO = f5;
		entity.yHeadRot = f6;
	}
}