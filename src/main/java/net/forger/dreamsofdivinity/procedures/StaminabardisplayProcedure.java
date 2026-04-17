package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

public class StaminabardisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE)
				? _livingEntity0.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).getBaseValue()
				: 0) > 0.5) {
			return true;
		}
		return false;
	}
}