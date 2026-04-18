package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class WaterClickedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).watermagic == true) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.water1 = !entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water1;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.water2 = !entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water2;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.water3 = !entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water3;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.water4 = !entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water4;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.water5 = !entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water5;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.water6 = !entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water6;
				_vars.syncPlayerVariables(entity);
			}
			return true;
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).UnlockPoints > 0.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.UnlockPoints = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).UnlockPoints - 1;
					_vars.syncPlayerVariables(entity);
				}
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.watermagic = true;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		return false;
	}
}
