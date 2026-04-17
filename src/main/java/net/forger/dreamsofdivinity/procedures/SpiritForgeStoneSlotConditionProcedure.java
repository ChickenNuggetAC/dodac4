package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.item.ItemStack;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModItems;

public class SpiritForgeStoneSlotConditionProcedure {
	public static boolean execute(ItemStack itemstack) {
		return !(itemstack.getItem() == DreamsOfDivinityModItems.SPIRIT_FUSION_STONE.get());
	}
}