package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicStatsBottomDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)

			return "Power: 0 | Speed: 0 | Size: 0";
		double selectedSpell = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell;
		int power = 0;
		int speed = 0;
		int size = 0;
		if (selectedSpell == 1) {
			power = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower1;
			speed = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed1;
			size = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize1;
		} else if (selectedSpell == 2) {
			power = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower2;
			speed = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed2;
			size = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize2;
		} else if (selectedSpell == 3) {
			power = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower3;
			speed = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed3;
			size = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize3;
		} else if (selectedSpell == 4) {
			power = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower4;
			speed = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed4;
			size = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize4;
		} else if (selectedSpell == 5) {
			power = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower5;
			speed = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed5;
			size = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize5;
		} else if (selectedSpell == 6) {
			power = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower6;
			speed = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed6;
			size = (int) entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize6;
		}
		return "Power: " + power + " | Speed: " + speed + " | Size: " + size;
	}
}
=======
			return "";
		return "Power: " + new java.text.DecimalFormat("##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower) + " | Speed: "
				+ new java.text.DecimalFormat("##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed) + " | Size: "
				+ new java.text.DecimalFormat("##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize);
	}
}
