package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

public class PlacedMagicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("magicstyle", 5);
	}
}