package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class SpiritAmountDisplay8Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana > entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).maxmana * 0.8) {
			return true;
		}
		return false;
	}
}