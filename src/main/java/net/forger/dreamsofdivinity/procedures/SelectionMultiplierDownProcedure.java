package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class SelectionMultiplierDownProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier > 0.3) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.SelectionMultiplier = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier - 0.25;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.SelectionMultiplier = 0.25;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}