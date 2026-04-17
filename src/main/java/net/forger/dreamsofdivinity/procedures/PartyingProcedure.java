package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PartyingProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).party == false) {
			if (sourceentity.isShiftKeyDown()) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.partyinvite = true;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Player " + (sourceentity.getDisplayName().getString() + " invited you to party! open skill menu to accept"))), false);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("invited player " + (entity.getDisplayName().getString() + " to party!!!"))), false);
				if (!world.isClientSide()) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.immunityinvite = sourceentity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
								? _livingEntity6.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
								: 0;
						_vars.syncPlayerVariables(entity);
					}
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = sourceentity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.immunityinvited = sourceentity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
								? _livingEntity7.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
								: 0;
						_vars.syncPlayerVariables(sourceentity);
					}
				}
			}
		}
		if (sourceentity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).party == false) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = sourceentity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.party = true;
				_vars.syncPlayerVariables(sourceentity);
			}
			if (sourceentity.isShiftKeyDown()) {
				if (sourceentity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK))
					_livingEntity9.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).setBaseValue(4);
			}
		}
	}
}