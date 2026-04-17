package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;

public class SpiritForgeGetStoreSpellCostProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY)
				.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
				+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed") * 0.35
				+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize") * 0.35
				+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("piercing") * 0.25
				+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("tracking") * 0.25
				+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("multicast") * 0.25
				+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("areacoverage") * 0.25
				+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("guidedmagic") * 0.2)
				* 1.3333;
	}
}