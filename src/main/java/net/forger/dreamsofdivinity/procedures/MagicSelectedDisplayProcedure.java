package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicSelectedDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)

			return "None";
		boolean fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire;
		boolean water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water;
=======

			return "None";
		double selectedSpell = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell;
		boolean fire = false;
		boolean water = false;
		if (selectedSpell == 1) {
			fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire1;
			water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water1;
		} else if (selectedSpell == 2) {
			fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire2;
			water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water2;
		} else if (selectedSpell == 3) {
			fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire3;
			water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water3;
		} else if (selectedSpell == 4) {
			fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire4;
			water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water4;
		} else if (selectedSpell == 5) {
			fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire5;
			water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water5;
		} else if (selectedSpell == 6) {
			fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire6;
			water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water6;
		}

		if (fire && water) {
			return "Steam Magic";
		}
		if (fire) {
			return "Fire Magic";
		}
		if (water) {

=======

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
=======

}
=======
}


