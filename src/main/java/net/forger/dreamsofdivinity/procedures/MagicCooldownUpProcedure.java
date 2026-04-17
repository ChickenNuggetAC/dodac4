package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicCooldownUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < 40) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat1 > 40) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.overheat1 = 40;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat1 = 40;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < 40) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat2 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat2 > 40) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.overheat2 = 40;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat2 = 40;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat2;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < 40) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat3 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat3 > 40) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.overheat3 = 40;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat3 = 40;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat3;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < 40) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat4 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat4 > 40) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.overheat4 = 40;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat4 = 40;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat4;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < 40) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat5 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat5 > 40) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.overheat5 = 40;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat5 = 40;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat5;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier < 40) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat6 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat6 > 40) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.overheat6 = 40;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat6 = 40;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat6;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}