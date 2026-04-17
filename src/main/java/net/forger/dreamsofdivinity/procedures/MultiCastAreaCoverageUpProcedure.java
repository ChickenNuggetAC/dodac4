package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MultiCastAreaCoverageUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.areacoverage1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.areacoverage2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage2 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.areacoverage3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage3 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.areacoverage4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage4 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.areacoverage5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage5 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.areacoverage6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage6 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}