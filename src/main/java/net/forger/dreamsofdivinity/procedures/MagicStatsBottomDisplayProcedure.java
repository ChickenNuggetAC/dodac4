package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicStatsBottomDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Power: " + new java.text.DecimalFormat("##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower) + " | Speed: "
				+ new java.text.DecimalFormat("##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed) + " | Size: "
				+ new java.text.DecimalFormat("##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize);
	}
}