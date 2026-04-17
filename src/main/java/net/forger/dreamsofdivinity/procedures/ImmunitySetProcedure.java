package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ImmunitySetProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunitytrue == false) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.immunity = Mth.nextInt(RandomSource.create(), 1, 100000000);
				_vars.syncPlayerVariables(entity);
			}
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.immunitytrue = true;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (!world.isClientSide()) {
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY))
				_livingEntity2.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).setBaseValue(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunity);
			entity.getPersistentData().putDouble("immunity", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunity);
		}
		entity.getPersistentData().putDouble("immunity", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunity);
		if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY))
			_livingEntity5.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).setBaseValue(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunity);
	}
}