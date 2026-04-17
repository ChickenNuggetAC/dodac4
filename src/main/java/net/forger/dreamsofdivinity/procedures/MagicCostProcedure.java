package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MagicCostProcedure {
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
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicCost2 = (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower + 1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration + 1
						+ entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed + 1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing
						+ entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking * 0.5 + 1) * (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize * 0.5 + 1)
						* (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast * 0.7 + 1) * ((40 / entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat) * 0.6 + 1);
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle == 2) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicCost2 = (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower + 1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed + 1)
						* (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize * 0.5 + 1) * ((40 / entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat) * 0.6 + 1);
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle == 3) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicCost2 = (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower + 1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed + 1)
						* (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize * 0.5 + 1) * ((40 / entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat) * 0.6 + 1);
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle == 4) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicCost2 = (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower + 1 + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed + 1)
						* ((40 / entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat) * 0.6 + 1);
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle == 5) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed < 0) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicCost2 = (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration + 1
							+ entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed * (-1) + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing
							+ entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking * 0.5 + 1) * (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize * 0.5 + 1)
							* (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast * 0.7 + 1) * ((40 / entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat) * 0.6 + 1);
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicCost2 = (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration + 1
							+ entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing
							+ entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking * 0.5 + 1) * (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize * 0.5 + 1)
							* (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast * 0.7 + 1) * ((40 / entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat) * 0.6 + 1);
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}