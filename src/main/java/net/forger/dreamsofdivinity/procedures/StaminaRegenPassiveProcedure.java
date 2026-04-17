package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StaminaRegenPassiveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Stamina < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MaxStamina) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.Stamina = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Stamina + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MaxStamina * 0.003;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Stamina > entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MaxStamina) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.Stamina = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MaxStamina;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}