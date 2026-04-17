package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class CastingOffsetUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.castingoffset1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.castingoffset2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset2 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.castingoffset3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset3 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.castingoffset4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset4 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.castingoffset5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset5 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.castingoffset6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset6 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}