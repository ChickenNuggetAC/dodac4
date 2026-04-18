package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

public class MagicStatsBottomDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "Power: 0 | Speed: 0 | Size: 0";
		return "Power: " + MagicPowerDisplayProcedure.execute(entity) + " | Speed: " + MagicSpeedDisplayProcedure.execute(entity) + " | Size: " + MagicSizeDisplayProcedure.execute(entity);
	}
}
