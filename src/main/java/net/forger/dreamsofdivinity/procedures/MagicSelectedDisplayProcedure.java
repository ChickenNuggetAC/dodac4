package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicSelectedDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "None";
		boolean fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire;
		boolean water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water;
		if (fire && water) {
			return "Steam Magic";
		}
		if (fire) {
			return "Fire Magic";
		}
		if (water) {
			return "Water Magic";
		}
		return "None";
	}
}
