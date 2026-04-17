package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import java.util.ArrayList;

public class PromoteMemberProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double currentImmunity = 0;
		String PartiedEntity = "";
		String entityinparty = "";
		String promotable = "";
		MutableComponent Officer = Component.empty();
		MutableComponent General = Component.empty();
		MutableComponent Leader = Component.empty();
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
						if (((entity instanceof Player _entity5 && _entity5.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu5) ? _menu5.getMenuState(0, "partypromote", "") : "")
								.equals(entityiterator.getDisplayName().getString())) {
							if (entityiterator instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK))
								_livingEntity8.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
										.setBaseValue(((entityiterator instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
												? _livingEntity7.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
												: 0) + 1));
							if ((entityiterator instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
									? _livingEntity9.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
									: 0) == 2) {
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("Your party has promoted you to an " + (Component.literal("Officer").withStyle(ChatFormatting.BLUE).getString() + "!"))), false);
							}
							if ((entityiterator instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
									? _livingEntity14.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
									: 0) == 3) {
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("Your party has promoted you to a " + (Component.literal("General").withStyle(ChatFormatting.RED).getString() + "!"))), false);
							}
							if ((entityiterator instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
									? _livingEntity19.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
									: 0) == 4) {
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("Your party has promoted you to a " + (Component.literal("Leader").withStyle(ChatFormatting.GOLD).getString() + "!"))), false);
							}
						}
					}
				}
			}
		}
	}
}