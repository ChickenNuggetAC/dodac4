package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicStatsBottomDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "Power: 0 | Speed: 0 | Size: 0";
		return "Power: " + (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower + " | Speed: " + (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed + " | Size: "
				+ (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize;
	}
}
