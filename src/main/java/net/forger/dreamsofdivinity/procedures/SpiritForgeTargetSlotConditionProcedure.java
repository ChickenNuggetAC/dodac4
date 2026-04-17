package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;

public class SpiritForgeTargetSlotConditionProcedure {
	public static boolean execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return false;
		if (itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem || itemstack.getItem() == Items.TRIDENT) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(1).getItem() : ItemStack.EMPTY)
					.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 1
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 2
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 5) {
				return false;
			}
		} else {
			if (itemstack.getItem() instanceof ArmorItem) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 3
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 1
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 5
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4) {
					return false;
				}
			} else {
				if (itemstack.getItem() instanceof BowItem) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 2) {
						return false;
					}
				}
			}
		}
		return true;
	}
}