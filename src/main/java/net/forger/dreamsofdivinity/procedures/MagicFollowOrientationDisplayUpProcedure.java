package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MagicFollowOrientationDisplayUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting1 < 2.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting1 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting1 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting1 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting2 < 2.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting2 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting2 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting2 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting2;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting3 < 2.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting3 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting3 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting3 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting3;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting4 < 2.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting4 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting4 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting4 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting4;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting5 < 2.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting5 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting5 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting5 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting5;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting6 < 2.5) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting6 = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting6 + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting6 = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting6;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}