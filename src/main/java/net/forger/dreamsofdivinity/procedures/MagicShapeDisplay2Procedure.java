package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicShapeDisplay2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape == 2
				&& (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle == 1 || entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle == 5)) {
			return true;
		}
		return false;
	}
}