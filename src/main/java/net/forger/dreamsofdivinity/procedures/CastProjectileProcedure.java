package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

public class CastProjectileProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP))
			_livingEntity0.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).setBaseValue(0);
	}
}