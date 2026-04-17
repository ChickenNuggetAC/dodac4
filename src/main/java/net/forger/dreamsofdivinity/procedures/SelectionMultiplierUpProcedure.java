package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class SelectionMultiplierUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.SelectionMultiplier = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier + 0.25;
			_vars.syncPlayerVariables(entity);
		}
	}
}