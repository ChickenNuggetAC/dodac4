package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicDirectionUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection1 < 6.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection1 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection1 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection2 < 6.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection2 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection2 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection2;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection3 < 6.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection3 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection3 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection3;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection4 < 6.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection4 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection4 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection4;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection5 < 6.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection5 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection5 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection5;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection6 < 6.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection6 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection6 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection6;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}