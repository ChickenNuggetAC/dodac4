package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class SkillKey1OnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double timer = 0;
		double maxtime = 0;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP))
			_livingEntity0.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).setBaseValue(0);
		if (entity.getPersistentData().getDouble("overheatcool") == 1) {
			DreamsOfDivinityMod.queueServerWork((int) entity.getPersistentData().getDouble("overheat"), () -> {
				entity.getPersistentData().putDouble("overheat", 0);
				entity.getPersistentData().putDouble("overheatcool", 0);
			});
		}
	}
}