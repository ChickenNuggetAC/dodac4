package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class SpiritualPowerDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana) + ""
				+ ("/" + new java.text.DecimalFormat("##.##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).maxmana));
	}
}