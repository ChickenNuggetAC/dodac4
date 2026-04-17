package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class FireClickedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).firemagic == true) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire1 == false) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire1 = true;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire1 = false;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire2 == false) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire2 = true;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire2 = false;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire3 == false) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire3 = true;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire3 = false;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire4 == false) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire4 = true;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire4 = false;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire5 == false) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire5 = true;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire5 = false;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire6 == false) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire6 = true;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire6 = false;
						_vars.syncPlayerVariables(entity);
					}
				}
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
					_vars.firemagic = true;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		return false;
	}
}