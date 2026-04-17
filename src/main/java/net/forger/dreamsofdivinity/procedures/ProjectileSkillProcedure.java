package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMobEffects;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.entity.Skill1Entity;
import net.forger.dreamsofdivinity.entity.ItemskillEntity;
import net.forger.dreamsofdivinity.entity.BendingEntity;
import net.forger.dreamsofdivinity.entity.AttackEntity;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

import java.util.Comparator;

public class ProjectileSkillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP) ? _livingEntity0.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue() : 0) == 0) {
			if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
				if (immediatesourceentity.getPersistentData().getDouble("magicshape") < 1.5) {
					if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
						if (world instanceof ServerLevel _level) {
							int X = (int) x;
							int Y = (int) y;
							int Z = (int) z;
							String command = "photon fx photon:" + "fire2" + " block " + X + " " + Y + " " + Z + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
									+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + true;
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									command);
						}
					}
				} else {
					if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 2) {
						{
							Entity _entity = immediatesourceentity;
							String command = "photon fx photon:" + "fireparticle" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
									+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " "
									+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (int) 0 + " " + true + " " + true;
							if (!_entity.level().isClientSide() && _entity.getServer() != null) {
								_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
										_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
							}
						}
						{
							Entity _entity = immediatesourceentity;
							String command = "photon fx photon:" + "firesphere" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
									+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
									+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + true;
							if (!_entity.level().isClientSide() && _entity.getServer() != null) {
								_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
										_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
							}
						}
					} else {
						if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 3) {
							{
								Entity _entity = immediatesourceentity;
								String command = "photon fx photon:" + "fireparticle" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
										+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " "
										+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (int) 0 + " " + true + " " + true;
								if (!_entity.level().isClientSide() && _entity.getServer() != null) {
									_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
											_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
								}
							}
							{
								Entity _entity = immediatesourceentity;
								String command = "photon fx photon:" + "firearrow" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
										+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
										+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + true;
								if (!_entity.level().isClientSide() && _entity.getServer() != null) {
									_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
											_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
								}
							}
						} else {
							if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 4) {
								{
									Entity _entity = immediatesourceentity;
									String command = "photon fx photon:" + "firesphere" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
											+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " "
											+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (int) 0 + " " + true + " " + true;
									if (!_entity.level().isClientSide() && _entity.getServer() != null) {
										_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
												_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
									}
								}
								{
									Entity _entity = immediatesourceentity;
									String command = "photon fx photon:" + "firebeam" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
											+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
											+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + true;
									if (!_entity.level().isClientSide() && _entity.getServer() != null) {
										_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
												_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
									}
								}
							} else {
								if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 5) {
									{
										Entity _entity = immediatesourceentity;
										String command = "photon fx photon:" + "firehelix" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
												+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
												+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + false;
										if (!_entity.level().isClientSide() && _entity.getServer() != null) {
											_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
													_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
										}
									}
								} else {
									if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 6) {
										{
											Entity _entity = immediatesourceentity;
											String command = "photon fx photon:" + "fireparticle" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
													+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " "
													+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (int) 0 + " " + true + " " + true;
											if (!_entity.level().isClientSide() && _entity.getServer() != null) {
												_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
														_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
											}
										}
										{
											Entity _entity = immediatesourceentity;
											String command = "photon fx photon:" + "firesword" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
													+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
													+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + true;
											if (!_entity.level().isClientSide() && _entity.getServer() != null) {
												_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
														_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			DreamsOfDivinityMod.queueServerWork((int) (40 * immediatesourceentity.getPersistentData().getDouble("magicduration")), () -> {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
			});
			immediatesourceentity.getPersistentData().putDouble("chargedone", 1);
			if (world.getBlockState(BlockPos.containing(x, y + 0.5, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude() || world.getBlockState(BlockPos.containing(x - 0.5, y, z)).canOcclude()
					|| world.getBlockState(BlockPos.containing(x + 0.5, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z + 0.5)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z - 0.5)).canOcclude()) {
				immediatesourceentity.getPersistentData().putDouble("explode", 1);
			}
			if (immediatesourceentity.getPersistentData().getDouble("guidedmagic") == 1) {
				immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
				immediatesourceentity.getPersistentData().putDouble("yaw2", (entity.getYRot()));
				immediatesourceentity.getPersistentData().putDouble("pitch", (entity.getXRot()));
				immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
			}
			if (immediatesourceentity.getPersistentData().getDouble("explode") == 0) {
				if (immediatesourceentity.getPersistentData().getDouble("1stblood") == 0) {
					if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 5) {
						if (immediatesourceentity.getPersistentData().getDouble("guidedmagic") == 1) {
							if (immediatesourceentity.getPersistentData().getDouble("gravity") == 0) {
								immediatesourceentity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
										(entity.getXRot() * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
										(Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
							} else {
								immediatesourceentity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), (entity.getDeltaMovement().y()),
										(Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
							}
						} else {
							if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 5) {
								if (immediatesourceentity.getPersistentData().getDouble("gravity") == 0) {
									immediatesourceentity.setDeltaMovement(new Vec3(0, (immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), 0));
								} else {
									immediatesourceentity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
								}
							} else {
								if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 6) {
									if (immediatesourceentity.getPersistentData().getDouble("gravity") == 0) {
										immediatesourceentity.setDeltaMovement(new Vec3(0, (immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), 0));
									} else {
										immediatesourceentity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
									}
								} else {
									immediatesourceentity
											.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
													(immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
													(Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
								}
							}
						}
					} else {
						if (immediatesourceentity.getPersistentData().getDouble("magicfollow") == 1) {
							if (immediatesourceentity.getPersistentData().getDouble("guidedmagic") == 1) {
								if (immediatesourceentity.getPersistentData().getDouble("gravity") == 0) {
									immediatesourceentity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
											(entity.getXRot() * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
											(Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
								} else {
									immediatesourceentity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), (entity.getDeltaMovement().y()),
											(Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
								}
							} else {
								if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 5) {
									if (immediatesourceentity.getPersistentData().getDouble("gravity") == 0) {
										immediatesourceentity.setDeltaMovement(new Vec3(0, (immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), 0));
									} else {
										immediatesourceentity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
									}
								} else {
									if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 6) {
										if (immediatesourceentity.getPersistentData().getDouble("gravity") == 0) {
											immediatesourceentity.setDeltaMovement(new Vec3(0, (immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), 0));
										} else {
											immediatesourceentity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
										}
									} else {
										if (immediatesourceentity.getPersistentData().getDouble("gravity") == 0) {
											immediatesourceentity
													.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
															(immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
															(Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
										} else {
											immediatesourceentity.setDeltaMovement(new Vec3(
													(Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
													(entity.getDeltaMovement().y()), (Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
										}
									}
								}
							}
						} else {
							if (immediatesourceentity.getPersistentData().getDouble("magicfollow") == 2) {
								immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
								immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
								immediatesourceentity.getPersistentData().putDouble("pitch", (entity.getXRot()));
								{
									Entity _ent = immediatesourceentity;
									_ent.teleportTo((entity.getX() + Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2),
											(entity.getY() + immediatesourceentity.getPersistentData().getDouble("magicspeed") * entity.getXRot() * (-0.08)),
											(entity.getZ() + Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX() + Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2),
												(entity.getY() + immediatesourceentity.getPersistentData().getDouble("magicspeed") * entity.getXRot() * (-0.08)),
												(entity.getZ() + Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2), _ent.getYRot(), _ent.getXRot());
								}
							} else {
								if (immediatesourceentity.getPersistentData().getDouble("magicfollow") == 3) {
									if (immediatesourceentity.getPersistentData().getDouble("guidedmagic") == 1) {
										immediatesourceentity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
												(entity.getXRot() * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
												(Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
									} else {
										if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 5) {
											immediatesourceentity.setDeltaMovement(new Vec3(0, (immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), 0));
										} else {
											if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 6) {
												immediatesourceentity
														.setDeltaMovement(new Vec3(0, (immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3), 0));
											} else {
												immediatesourceentity
														.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
																(immediatesourceentity.getPersistentData().getDouble("pitch2") * (-0.025) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3),
																(Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 0.3)));
											}
										}
									}
									{
										Entity _ent = entity;
										_ent.teleportTo((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.6), (immediatesourceentity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.6), (immediatesourceentity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				}
				if (immediatesourceentity.getPersistentData().getDouble("tracking") > 0.5) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((4 + 1.5 * immediatesourceentity.getPersistentData().getDouble("tracking")) / 2d), e -> true).stream()
								.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (immediatesourceentity.getPersistentData().getDouble("1stblood") == 0) {
								if (entityiterator instanceof LivingEntity || entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity || entityiterator instanceof ItemskillEntity) {
									if (entityiterator.getPersistentData().getDouble("immunity") != immediatesourceentity.getPersistentData().getDouble("immunity")) {
										if (entityiterator.getPersistentData().getDouble("pierced") == 0) {
											if (entityiterator.getPersistentData().getDouble("locked") == 0) {
												entityiterator.getPersistentData().putDouble("locked", 1);
												immediatesourceentity.getPersistentData().putDouble("locked2", 1);
											}
										}
										if (immediatesourceentity.getPersistentData().getDouble("locked2") == 1) {
											if (entityiterator.getPersistentData().getDouble("locked") == 1) {
												immediatesourceentity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ())));
												immediatesourceentity.getPersistentData().putDouble("yaw", (immediatesourceentity.getYRot()));
												immediatesourceentity.getPersistentData().putDouble("pitch2", (immediatesourceentity.getXRot()));
											}
										}
									}
								}
							}
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((4 + 1.5 * immediatesourceentity.getPersistentData().getDouble("tracking")) / 2d), e -> true).stream()
								.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (immediatesourceentity.getPersistentData().getDouble("1stblood") == 1) {
								if (entityiterator instanceof LivingEntity || entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity || entityiterator instanceof ItemskillEntity) {
									if (entityiterator.getPersistentData().getDouble("immunity") != immediatesourceentity.getPersistentData().getDouble("immunity")) {
										if (entityiterator.getPersistentData().getDouble("locked") == 0) {
											entityiterator.getPersistentData().putDouble("locked", 1);
											immediatesourceentity.getPersistentData().putDouble("locked2", 1);
										}
										if (entityiterator.getPersistentData().getDouble("pierced") == 0) {
											if (immediatesourceentity.getPersistentData().getDouble("locked2") == 1) {
												if (entityiterator.getPersistentData().getDouble("locked") == 1) {
													{
														Entity _ent = immediatesourceentity;
														_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 1.5), (entityiterator.getZ()));
														if (_ent instanceof ServerPlayer _serverPlayer)
															_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 1.5), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
													}
													immediatesourceentity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY() + 1.5), (entityiterator.getZ())));
													immediatesourceentity.getPersistentData().putDouble("yaw", (immediatesourceentity.getYRot()));
													immediatesourceentity.getPersistentData().putDouble("pitch2", (immediatesourceentity.getXRot()));
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("locked2") == 0) {
				if (immediatesourceentity.getPersistentData().getDouble("magicfollow") == 2) {
					immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
					immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
					immediatesourceentity.getPersistentData().putDouble("pitch", (entity.getXRot()));
					{
						Entity _ent = immediatesourceentity;
						_ent.teleportTo((entity.getX() + Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2),
								(entity.getY() + immediatesourceentity.getPersistentData().getDouble("magicspeed") * entity.getXRot() * (-0.125)),
								(entity.getZ() + Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX() + Math.sin(Math.toRadians(entity.getYRot() + 180)) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2),
									(entity.getY() + immediatesourceentity.getPersistentData().getDouble("magicspeed") * entity.getXRot() * (-0.125)),
									(entity.getZ() + Math.cos(Math.toRadians(entity.getYRot())) * immediatesourceentity.getPersistentData().getDouble("magicspeed") * 2), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("explode") == 0) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((2.5 + 0.5 * immediatesourceentity.getPersistentData().getDouble("magicsize")) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator.getPersistentData().getDouble("shielded") == 0) {
							if (entityiterator.getPersistentData().getDouble("pierced") == 0) {
								if (entityiterator instanceof LivingEntity) {
									if (entityiterator.getPersistentData().getDouble("immunity") != immediatesourceentity.getPersistentData().getDouble("immunity")) {
										if (immediatesourceentity.getPersistentData().getDouble("piercing") > 0.5) {
											immediatesourceentity.getPersistentData().putDouble("piercing", (immediatesourceentity.getPersistentData().getDouble("piercing") - 1));
											entityiterator.getPersistentData().putDouble("locked", 0);
											immediatesourceentity.getPersistentData().putDouble("locked2", 0);
											entityiterator.getPersistentData().putDouble("pierced", 1);
											if (immediatesourceentity.getPersistentData().getDouble("1stblood") == 0) {
												immediatesourceentity.getPersistentData().putDouble("1stblood", 1);
											}
											if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
												if (world instanceof ServerLevel _level) {
													int X = (int) x;
													int Y = (int) y;
													int Z = (int) z;
													String command = "photon fx photon:" + "fireexplode" + " block " + X + " " + Y + " " + Z + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " "
															+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " " + (int) 0 + " " + true + " "
															+ true;
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
												}
											}
											entityiterator.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("dreams_of_divinity:magic"))), entity, immediatesourceentity),
													(float) (immediatesourceentity.getPersistentData().getDouble("magicpower")
															- (entityiterator instanceof LivingEntity _livingEntity307 && _livingEntity307.getAttributes().hasAttribute(Attributes.ARMOR)
																	? _livingEntity307.getAttribute(Attributes.ARMOR).getValue()
																	: 0) / (immediatesourceentity.getPersistentData().getDouble("piercing") + 1)));
											immediatesourceentity.getPersistentData().putDouble("explodenoise", (immediatesourceentity.getPersistentData().getDouble("explodenoise") + 1));
											DreamsOfDivinityMod.queueServerWork(40, () -> {
												entityiterator.getPersistentData().putDouble("pierced", 0);
											});
										} else {
											immediatesourceentity.getPersistentData().putDouble("explode", 1);
										}
										if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
											if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.2), true, false));
										}
									}
								}
							}
						}
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((2.5 + 0.5 * immediatesourceentity.getPersistentData().getDouble("magicsize")) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator.getPersistentData().getDouble("pierced") == 0) {
							if (entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity || entityiterator instanceof ItemskillEntity) {
								if (entityiterator.getPersistentData().getDouble("immunity") != immediatesourceentity.getPersistentData().getDouble("immunity")) {
									if (entityiterator.getPersistentData().getDouble("magicpower") > 0) {
										if (immediatesourceentity.getPersistentData().getDouble("piercing") > 0.5) {
											immediatesourceentity.getPersistentData().putDouble("piercing", (immediatesourceentity.getPersistentData().getDouble("piercing") - 1));
											entityiterator.getPersistentData().putDouble("locked", 0);
											immediatesourceentity.getPersistentData().putDouble("locked2", 0);
											entityiterator.getPersistentData().putDouble("pierced", 1);
											if (immediatesourceentity.getPersistentData().getDouble("1stblood") == 0) {
												immediatesourceentity.getPersistentData().putDouble("1stblood", 1);
											}
											if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
												if (world instanceof ServerLevel _level) {
													int X = (int) x;
													int Y = (int) y;
													int Z = (int) z;
													String command = "photon fx photon:" + "fireexplode" + " block " + X + " " + Y + " " + Z + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " "
															+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " " + (int) 0 + " " + true + " "
															+ true;
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
												}
											}
											immediatesourceentity.getPersistentData().putDouble("explodenoise", (immediatesourceentity.getPersistentData().getDouble("explodenoise") + 1));
											DreamsOfDivinityMod.queueServerWork(40, () -> {
												entityiterator.getPersistentData().putDouble("pierced", 0);
											});
										} else {
											immediatesourceentity.getPersistentData().putDouble("explode", 1);
										}
										entityiterator.getPersistentData().putDouble("magicpower", (entityiterator.getPersistentData().getDouble("magicpower") - immediatesourceentity.getPersistentData().getDouble("magicpower")));
									}
									if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.2), true, false));
									}
								}
							}
						}
					}
				}
			} else {
				if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
					if (world instanceof ServerLevel _level) {
						int X = (int) x;
						int Y = (int) y;
						int Z = (int) z;
						String command = "photon fx photon:" + "fireexplode" + " block " + X + " " + Y + " " + Z + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " "
								+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.5) + " " + (int) 0 + " " + true + " " + true;
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
					}
				}
				immediatesourceentity.getPersistentData().putDouble("explodenoise", 1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(((0.7 + 1 * immediatesourceentity.getPersistentData().getDouble("magicsize")) * 1.5) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof LivingEntity || entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity || entityiterator instanceof ItemskillEntity) {
							if (entityiterator.getPersistentData().getDouble("shielded") == 0) {
								if (entityiterator.getPersistentData().getDouble("immunity") != immediatesourceentity.getPersistentData().getDouble("immunity")) {
									entityiterator.getPersistentData().putDouble("locked", 0);
									if (immediatesourceentity.getPersistentData().getDouble("piercing") > 0.5) {
										immediatesourceentity.getPersistentData().putDouble("piercing", (immediatesourceentity.getPersistentData().getDouble("piercing") - 1));
									} else {
										immediatesourceentity.getPersistentData().putDouble("explode", 1);
									}
									entityiterator.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("dreams_of_divinity:magic"))), entity, entity),
											(float) (immediatesourceentity.getPersistentData().getDouble("magicpower")
													- (entityiterator instanceof LivingEntity _livingEntity375 && _livingEntity375.getAttributes().hasAttribute(Attributes.ARMOR) ? _livingEntity375.getAttribute(Attributes.ARMOR).getValue() : 0)
															/ (immediatesourceentity.getPersistentData().getDouble("piercing") + 1)));
									if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.2), true, false));
									}
									entityiterator.getPersistentData().putDouble("pierced", 1);
									DreamsOfDivinityMod.queueServerWork(40, () -> {
										entityiterator.getPersistentData().putDouble("pierced", 0);
									});
								}
							}
						}
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(((0.7 + 1 * immediatesourceentity.getPersistentData().getDouble("magicsize")) * 1.5) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity || entityiterator instanceof ItemskillEntity) {
							if (entityiterator.getPersistentData().getDouble("immunity") != immediatesourceentity.getPersistentData().getDouble("immunity")) {
								if (entityiterator.getPersistentData().getDouble("magicpower") > 0) {
									entityiterator.getPersistentData().putDouble("locked", 0);
									if (immediatesourceentity.getPersistentData().getDouble("piercing") > 0.5) {
										immediatesourceentity.getPersistentData().putDouble("piercing", (immediatesourceentity.getPersistentData().getDouble("piercing") - 1));
									} else {
										immediatesourceentity.getPersistentData().putDouble("explode", 1);
									}
									if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.2), true, false));
									}
									entityiterator.getPersistentData().putDouble("pierced", 1);
									DreamsOfDivinityMod.queueServerWork(40, () -> {
										entityiterator.getPersistentData().putDouble("pierced", 0);
									});
									entityiterator.getPersistentData().putDouble("magicpower", (entityiterator.getPersistentData().getDouble("magicpower") - immediatesourceentity.getPersistentData().getDouble("magicpower")));
								}
							}
						}
					}
				}
				if (immediatesourceentity.getPersistentData().getDouble("explodenoise2") == immediatesourceentity.getPersistentData().getDouble("explodenoise")) {
					if (!immediatesourceentity.level().isClientSide())
						immediatesourceentity.discard();
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("magicpower") < 0) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
			}
		}
	}
}