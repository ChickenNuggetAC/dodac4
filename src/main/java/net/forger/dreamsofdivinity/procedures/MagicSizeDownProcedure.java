package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicSizeDownProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize1 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize1 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize2 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize2 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize2;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize3 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize3 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize3;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize4 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize4 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize4;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize5 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize5 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize5;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize6 - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize6 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize6;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}