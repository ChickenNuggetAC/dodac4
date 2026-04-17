package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicSpeedUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed2 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed2;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed3 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed3;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed4 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed4;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed5 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed5;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed6 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed6;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}