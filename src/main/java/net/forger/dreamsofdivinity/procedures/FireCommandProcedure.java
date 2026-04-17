package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

public class FireCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("fire", true);
	}
}