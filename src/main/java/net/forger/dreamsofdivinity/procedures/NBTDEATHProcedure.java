package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class NBTDEATHProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("bodyenhance", 0);
		entity.getPersistentData().putDouble("weaponenahance", 0);
		entity.getPersistentData().putDouble("movementenhance", 0);
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ARMOR))
			_livingEntity3.getAttribute(Attributes.ARMOR).setBaseValue(0);
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.movementenhance = 0;
			_vars.syncPlayerVariables(entity);
		}
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED))
			_livingEntity4.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT))
			_livingEntity5.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN))
			_livingEntity6.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE))
			_livingEntity7.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
			_livingEntity8.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
			_livingEntity9.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
		if (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
			_livingEntity10.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(1);
		entity.getPersistentData().putDouble("enableparticles", 0);
		entity.getPersistentData().putDouble("attacksize", 0);
		entity.getPersistentData().putDouble("empower", 0);
		entity.getPersistentData().putDouble("movementforward", 0);
		entity.getPersistentData().putDouble("movementright", 0);
		entity.getPersistentData().putDouble("movementleft", 0);
		entity.getPersistentData().putDouble("movementbackward", 0);
		entity.getPersistentData().putDouble("movementup", 0);
	}
}