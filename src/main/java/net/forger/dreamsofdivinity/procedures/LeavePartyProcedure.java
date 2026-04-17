package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

public class LeavePartyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY))
				_livingEntity2.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).setBaseValue((Mth.nextInt(RandomSource.create(), 1, 100000000)));
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK))
				_livingEntity3.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).setBaseValue(0);
		}
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.partyrank = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.party = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}