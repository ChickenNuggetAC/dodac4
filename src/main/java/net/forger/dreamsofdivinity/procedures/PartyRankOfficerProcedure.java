package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import javax.annotation.Nullable;

import java.util.ArrayList;

@EventBusSubscriber
public class PartyRankOfficerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static String execute(LevelAccessor world, Entity entity) {
		return execute(null, world, entity);
	}

	private static String execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		double currentImmunity = 0;
		String PartiedEntity = "";
		PartiedEntity = "";
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
					? _livingEntity0.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
					: 0) == (entityiterator instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
							? _livingEntity1.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
							: 0)) {
				if ((entityiterator instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
						? _livingEntity2.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
						: 0) == 2) {
					PartiedEntity = PartiedEntity + "" + entityiterator.getDisplayName().getString() + ". ";
				}
			}
		}
		return PartiedEntity;
	}
}