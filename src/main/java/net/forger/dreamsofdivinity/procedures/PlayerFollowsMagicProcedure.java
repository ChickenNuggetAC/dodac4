package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

public class PlayerFollowsMagicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("tracking", 3);
	}
}