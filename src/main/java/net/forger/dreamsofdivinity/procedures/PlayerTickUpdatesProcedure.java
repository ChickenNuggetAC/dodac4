package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerTickUpdatesProcedure {
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
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE))
			_livingEntity0.getAttribute(Attributes.SAFE_FALL_DISTANCE).setBaseValue(8);
		if (!entity.onGround()) {
			if (entity.getDeltaMovement().y() < 0.01) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).falling > 0.5) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.falling = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).falling - 1;
						_vars.syncPlayerVariables(entity);
					}
					entity.fallDistance = 0;
				}
			}
		}
		if (entity.getPersistentData().getDouble("bendingspeed1") > 0.5) {
			entity.getPersistentData().putDouble("bendingspeed1", (entity.getPersistentData().getDouble("bendingspeed1") - 1));
		}
	}
}