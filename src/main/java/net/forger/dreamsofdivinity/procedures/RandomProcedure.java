package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

public class RandomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("magicdirection", 7);
	}
}