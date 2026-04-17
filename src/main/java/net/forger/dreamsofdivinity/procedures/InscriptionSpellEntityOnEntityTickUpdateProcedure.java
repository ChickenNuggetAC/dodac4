package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

import java.util.Comparator;

public class InscriptionSpellEntityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, y, z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
		}
		if (entity.getPersistentData().getDouble("trigger") == 0) {
			if (entity.getPersistentData().getDouble("magicstyle") == 3) {
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
				entity.getPersistentData().putDouble("trigger", 1);
			} else {
				if (entity.getPersistentData().getDouble("magicstyle") == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if ((entityiterator instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
									? _livingEntity9.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
									: 0) != (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
											? _livingEntity10.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
											: 0)) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/summonmagic");
									}
								}
								DreamsOfDivinityMod.queueServerWork((int) entity.getPersistentData().getDouble("overheat"), () -> {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/castmagic");
										}
									}
								});
								entity.getPersistentData().putDouble("trigger", 1);
								DreamsOfDivinityMod.queueServerWork(1000, () -> {
									if (!entity.level().isClientSide())
										entity.discard();
								});
							}
						}
					}
				} else {
					if (entity.getPersistentData().getDouble("magicstyle") == 5) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
								if ((entityiterator instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
										? _livingEntity20.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
										: 0) != (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
												? _livingEntity21.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
												: 0)) {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/summonmagic");
										}
									}
									DreamsOfDivinityMod.queueServerWork((int) entity.getPersistentData().getDouble("overheat"), () -> {
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/castmagic");
											}
										}
									});
									DreamsOfDivinityMod.queueServerWork(1000, () -> {
										if (!entity.level().isClientSide())
											entity.discard();
									});
									entity.getPersistentData().putDouble("trigger", 1);
								}
							}
						}
					}
				}
			}
		}
	}
}