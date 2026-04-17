package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicSelectedDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire == true) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water == true) {
				return "Steam Magic";
			}
			return "Fire Magic";
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water == true) {
			return "Water Magic";
		}
		return "None";
	}
}