package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class FireMagicCircleOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
		DreamsOfDivinityMod.queueServerWork(20, () -> {
			DreamsOfDivinityMod.queueServerWork(20, () -> {
				if (entity.getPersistentData().getDouble("immunity") == 0) {
					if (!entity.level().isClientSide())
						entity.discard();
				}
			});
		});
		DreamsOfDivinityMod.queueServerWork(300, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}