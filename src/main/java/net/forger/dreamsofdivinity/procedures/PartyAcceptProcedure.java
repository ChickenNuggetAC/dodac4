package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import java.util.Comparator;

public class PartyAcceptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY))
				_livingEntity1.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).setBaseValue(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunityinvite);
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK))
				_livingEntity2.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).setBaseValue(1);
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100000 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunityinvited == entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunityinvite) {
						if (entityiterator instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Player " + (entity.getDisplayName().getString() + " has joined your party!"))), false);
					}
				}
			}
		}
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.partyinvite = false;
			_vars.syncPlayerVariables(entity);
		}
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.party = true;
			_vars.syncPlayerVariables(entity);
		}
	}
}