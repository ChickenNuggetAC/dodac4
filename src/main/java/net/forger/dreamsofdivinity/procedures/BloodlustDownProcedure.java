package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class BloodlustDownProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking1 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking1 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking2 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking2 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking3 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking3 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking4 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking4 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking5 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking5 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking6 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking6 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}