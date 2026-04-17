package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

public class MovementForwardOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("enableparticles", 0);
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementforward > 0.5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.movementforward = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementbackward > 0.5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.movementbackward = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementleft > 0.5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.movementleft = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementright > 0.5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.movementright = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementup > 0.5) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.movementup = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}