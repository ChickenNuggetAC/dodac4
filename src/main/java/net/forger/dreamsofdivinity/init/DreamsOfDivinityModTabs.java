/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DreamsOfDivinityModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DreamsOfDivinityMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DreamsOfDivinityModItems.MAGICSWORD.get());
			tabData.accept(DreamsOfDivinityModItems.MAGIC_CIRCLE_FIRE.get());
			tabData.accept(DreamsOfDivinityModItems.ARMOR_FIRE.get());
			tabData.accept(DreamsOfDivinityModItems.MAGIC_SPHERE.get());
			tabData.accept(DreamsOfDivinityModItems.ARROW.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DreamsOfDivinityModItems.BLOCK_INSCRIBING_WAND.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(DreamsOfDivinityModItems.BLOCK_INSCRIBING_WAND.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DreamsOfDivinityModItems.INSCRIPTION_SPELL_ENTITY_SPAWN_EGG.get());
		}
	}
}