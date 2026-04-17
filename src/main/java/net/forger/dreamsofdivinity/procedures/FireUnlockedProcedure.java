package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class FireUnlockedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).firemagic == true) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire1 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire2 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire3 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire4 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire5 == true) {
					return true;
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire6 == true) {
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