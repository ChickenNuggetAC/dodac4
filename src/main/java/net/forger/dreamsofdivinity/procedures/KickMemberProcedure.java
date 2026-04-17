package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import java.util.ArrayList;

public class KickMemberProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double currentImmunity = 0;
		String PartiedEntity = "";
		String entityinparty = "";
		String promotable = "";
		if (!world.isClientSide()) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
						? _livingEntity1.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
						: 0) == (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
								? _livingEntity2.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
								: 0)) {
					if ((entityiterator instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
							? _livingEntity3.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
							: 0) < (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
									? _livingEntity4.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
									: 0)) {
						if (((entity instanceof Player _entity5 && _entity5.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu5) ? _menu5.getMenuState(0, "kickmember", "") : "").equals(entityiterator.getDisplayName().getString())) {
							if (entityiterator instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK))
								_livingEntity7.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).setBaseValue(0);
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entityiterator.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.party = false;
								_vars.syncPlayerVariables(entityiterator);
							}
							if (entityiterator instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY))
								_livingEntity9.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).setBaseValue((Mth.nextInt(RandomSource.create(), 1, 100000000)));
							if (entityiterator instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("You've been kicked from your party " + entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).partyname)), false);
						}
					}
				}
			}
		}
	}
}