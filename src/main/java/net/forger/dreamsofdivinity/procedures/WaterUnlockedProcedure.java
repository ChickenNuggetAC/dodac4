package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class WaterUnlockedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).watermagic == true) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water1 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water2 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water3 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water4 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water5 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water6 == true) {
					return true;
				}
			}
			return true;
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).UnlockPoints > 0.5) {
				return true;
			}
		}
		return false;
	}
}