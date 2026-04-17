package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class CastedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("overheat") == 0) {
			entity.getPersistentData().putBoolean("fire", false);
			entity.getPersistentData().putBoolean("water", false);
			entity.getPersistentData().putDouble("keypressed", 1);
			entity.getPersistentData().putDouble("magicpower", 0);
			entity.getPersistentData().putDouble("magicspeed", 0);
			entity.getPersistentData().putDouble("magicsize", 0);
			entity.getPersistentData().putDouble("overheat", 0);
			entity.getPersistentData().putDouble("magicstyle", 1);
			entity.getPersistentData().putDouble("piercing", 0);
			entity.getPersistentData().putDouble("tracking", 0);
			entity.getPersistentData().putDouble("magicshape", 1);
			entity.getPersistentData().putDouble("magicfollow", 1);
			entity.getPersistentData().putDouble("magicduration", 1);
			entity.getPersistentData().putDouble("multicast", 1);
			entity.getPersistentData().putDouble("areacoverage", 1);
			entity.getPersistentData().putDouble("magicdirection", 1);
			entity.getPersistentData().putDouble("castingoffset", 1);
			entity.getPersistentData().putDouble("guidedmagic", 0);
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/summonmagic");
			}
		}
		DreamsOfDivinityMod.queueServerWork((int) entity.getPersistentData().getDouble("overheat"), () -> {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/castmagic");
				}
			}
		});
	}
}