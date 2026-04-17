package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

public class StaminaDisplay8Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE)
				? _livingEntity0.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).getBaseValue()
				: 0) > 0.5 || (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4)
				&& (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
						? _livingEntity9.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
						: 0) > (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT)
								? _livingEntity10.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).getBaseValue()
								: 0) * 0.8) {
			return true;
		}
		return false;
	}
}