package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class ChargeupSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (!world.isClientSide()) {
			if (immediatesourceentity.getPersistentData().getDouble("chargedone") == 0) {
				immediatesourceentity.getPersistentData().putDouble("pitch", (entity.getXRot()));
				if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 1) {
					immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
					immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
				} else {
					if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 2) {
						immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot() + 180));
						immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
					} else {
						if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 3) {
							immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot() - 90));
							immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
						} else {
							if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 4) {
								immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot() + 90));
								immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
							} else {
								if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 5) {
									immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
									immediatesourceentity.getPersistentData().putDouble("pitch2", 90);
								} else {
									if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 6) {
										immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
										immediatesourceentity.getPersistentData().putDouble("pitch2", (-90));
									} else {
										if (immediatesourceentity.getPersistentData().getDouble("magicdirection") == 7) {
											if (Math.random() < 0.2) {
												immediatesourceentity.getPersistentData().putDouble("pitch", (entity.getXRot()));
												immediatesourceentity.getPersistentData().putDouble("yaw2", (entity.getYRot()));
											} else {
												if (Math.random() < 0.2) {
													immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot() + 180));
													immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
												} else {
													if (Math.random() < 0.2) {
														immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot() - 90));
														immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
													} else {
														if (Math.random() < 0.2) {
															immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot() + 90));
															immediatesourceentity.getPersistentData().putDouble("pitch2", (entity.getXRot()));
														} else {
															if (Math.random() < 0.2) {
																immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
																immediatesourceentity.getPersistentData().putDouble("pitch2", 90);
															} else {
																immediatesourceentity.getPersistentData().putDouble("yaw", (entity.getYRot()));
																immediatesourceentity.getPersistentData().putDouble("pitch2", (-90));
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
					}
				}
				if (immediatesourceentity.getPersistentData().getBoolean("fire") == true && immediatesourceentity.getPersistentData().getBoolean("water") == true) {
					{
						Entity _entity = immediatesourceentity;
						String command = "photon fx photon:" + "smoke2" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
								+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
								+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + true;
						if (!_entity.level().isClientSide() && _entity.getServer() != null) {
							_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
									_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
						}
					}
				}
				if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
					{
						Entity _entity = immediatesourceentity;
						String command = "photon fx photon:" + "firemagiccircle" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
								+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " "
								+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.2) + " " + (int) 0 + " " + true + " " + true;
						if (!_entity.level().isClientSide() && _entity.getServer() != null) {
							_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
									_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
						}
					}
					if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 1 || immediatesourceentity.getPersistentData().getDouble("magicstyle") == 5) {
						if (immediatesourceentity.getPersistentData().getDouble("magicshape") < 1.5) {
							if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
								{
									Entity _entity = immediatesourceentity;
									String command = "photon fx photon:" + "fire2" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + 0 + " " + 0 + " " + 0.1 + " " + 0.1 + " " + 0.1 + " " + (int) 0 + " " + true + " " + true;
									if (!_entity.level().isClientSide() && _entity.getServer() != null) {
										_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
												_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
									}
								}
							}
						} else {
							if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 2) {
								if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
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
								}
							} else {
								if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 3) {
									if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
										{
											Entity _entity = immediatesourceentity;
											String command = "photon fx photon:" + "firearrow" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
													+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " "
													+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (int) 0 + " " + true + " " + true;
											if (!_entity.level().isClientSide() && _entity.getServer() != null) {
												_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
														_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
											}
										}
									}
								} else {
									if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 4) {
										if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
											{
												Entity _entity = immediatesourceentity;
												String command = "photon fx photon:" + "fire2" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + 0 + " " + 0 + " " + 0.1 + " " + 0.1 + " " + 0.1 + " " + (int) 0 + " " + true + " "
														+ true;
												if (!_entity.level().isClientSide() && _entity.getServer() != null) {
													_entity.getServer().getCommands()
															.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
																	_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity),
																	command);
												}
											}
										}
									} else {
										if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 5) {
											if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
												{
													Entity _entity = immediatesourceentity;
													String command = "photon fx photon:" + "firehelix" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
															+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " "
															+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (int) 0 + " " + true + " "
															+ false;
													if (!_entity.level().isClientSide() && _entity.getServer() != null) {
														_entity.getServer().getCommands()
																.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
																		_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity),
																		command);
													}
												}
											}
										} else {
											if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 6) {
												{
													Entity _entity = immediatesourceentity;
													String command = "photon fx photon:" + "firesword" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + ((immediatesourceentity.getPersistentData().getDouble("yaw") + 90) * (-1)) + " "
															+ ((immediatesourceentity.getPersistentData().getDouble("pitch2") + 90) * (-1)) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " "
															+ (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) + " " + (int) 0 + " " + true + " "
															+ true;
													if (!_entity.level().isClientSide() && _entity.getServer() != null) {
														_entity.getServer().getCommands()
																.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
																		_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity),
																		command);
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
				if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 5) {
					if (immediatesourceentity.getPersistentData().getDouble("pitch") > 0) {
						if (immediatesourceentity.getPersistentData().getDouble("multicast") > 1) {
							{
								Entity _ent = immediatesourceentity;
								_ent.teleportTo(
										(entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180))
												* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3
														+ Mth.nextInt(RandomSource.create(), (int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3),
																(int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))),
										(entity.getY() + 1),
										(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw")))
												* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3 + Mth.nextInt(RandomSource.create(),
														(int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3), (int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(
											(entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180))
													* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3
															+ Mth.nextInt(RandomSource.create(), (int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3),
																	(int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))),
											(entity.getY() + 1),
											(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw")))
													* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3 + Mth.nextInt(RandomSource.create(),
															(int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3), (int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))),
											_ent.getYRot(), _ent.getXRot());
							}
							immediatesourceentity.setDeltaMovement(new Vec3(0, 0, 0));
						} else {
							{
								Entity _ent = immediatesourceentity;
								_ent.teleportTo(
										(entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180))
												* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3)),
										(entity.getY() + 1), (entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw")))
												* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3)));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(
											(entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180))
													* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3)),
											(entity.getY() + 1), (entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw")))
													* ((4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2) - immediatesourceentity.getPersistentData().getDouble("pitch") * 0.3)),
											_ent.getYRot(), _ent.getXRot());
							}
							immediatesourceentity.setDeltaMovement(new Vec3(0, 0, 0));
						}
					} else {
						if (immediatesourceentity.getPersistentData().getDouble("multicast") > 1) {
							{
								Entity _ent = immediatesourceentity;
								_ent.teleportTo(
										(entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 1.5
												+ Mth.nextInt(RandomSource.create(), (int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3),
														(int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))),
										(entity.getY() + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 1.5 * immediatesourceentity.getPersistentData().getDouble("pitch") * (-0.125)
												+ Mth.nextInt(RandomSource.create(), 4, (int) (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset")))),
										(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw")))
												* (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 1.5 + Mth.nextInt(RandomSource.create(),
														(int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3), (int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection
											.teleport(
													(entity.getX()
															+ Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180))
																	* (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 1.5
																			+ Mth.nextInt(RandomSource.create(), (int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3),
																					(int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))),
													(entity.getY() + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 1.5 * immediatesourceentity.getPersistentData().getDouble("pitch") * (-0.125)
															+ Mth.nextInt(RandomSource.create(), 4, (int) (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset")))),
													(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw")))
															* (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 1.5 + Mth.nextInt(RandomSource.create(),
																	(int) ((-5) - immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3), (int) (5 + immediatesourceentity.getPersistentData().getDouble("areacoverage") * 0.3)))),
													_ent.getYRot(), _ent.getXRot());
							}
							immediatesourceentity.setDeltaMovement(new Vec3(0, 0, 0));
						} else {
							{
								Entity _ent = immediatesourceentity;
								_ent.teleportTo((entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2)),
										(entity.getY() + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 1.5 * immediatesourceentity.getPersistentData().getDouble("pitch") * (-0.125)),
										(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2)));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(
											(entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2)),
											(entity.getY() + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 1.5 * immediatesourceentity.getPersistentData().getDouble("pitch") * (-0.125)),
											(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * (4 + immediatesourceentity.getPersistentData().getDouble("castingoffset") * 2)), _ent.getYRot(),
											_ent.getXRot());
							}
							immediatesourceentity.setDeltaMovement(new Vec3(0, 0, 0));
						}
					}
				} else {
					if (immediatesourceentity.getPersistentData().getDouble("multicast") > 1) {
						if (immediatesourceentity.getPersistentData().getDouble("x") == 0) {
							immediatesourceentity.getPersistentData().putDouble("x",
									(Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180))
											* Mth.nextInt(RandomSource.create(), (int) ((-2) - (immediatesourceentity.getPersistentData().getDouble("areacoverage") + immediatesourceentity.getPersistentData().getDouble("magicsize")) * 0.2),
													(int) (2 + (immediatesourceentity.getPersistentData().getDouble("areacoverage") + immediatesourceentity.getPersistentData().getDouble("magicsize")) * 0.2))));
							immediatesourceentity.getPersistentData().putDouble("y", (Mth.nextInt(RandomSource.create(), 3, (int) (2 + immediatesourceentity.getPersistentData().getDouble("areacoverage")))));
							immediatesourceentity.getPersistentData().putDouble("z",
									(Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw")))
											* Mth.nextInt(RandomSource.create(), (int) ((-2) * (immediatesourceentity.getPersistentData().getDouble("areacoverage") + immediatesourceentity.getPersistentData().getDouble("magicsize")) * 0.2),
													(int) (2 + (immediatesourceentity.getPersistentData().getDouble("areacoverage") + immediatesourceentity.getPersistentData().getDouble("magicsize")) * 0.2))));
						}
						{
							Entity _ent = immediatesourceentity;
							_ent.teleportTo((entity.getX() + immediatesourceentity.getPersistentData().getDouble("x")), (entity.getY() + immediatesourceentity.getPersistentData().getDouble("y")),
									(entity.getZ() + immediatesourceentity.getPersistentData().getDouble("z")));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX() + immediatesourceentity.getPersistentData().getDouble("x")), (entity.getY() + immediatesourceentity.getPersistentData().getDouble("y")),
										(entity.getZ() + immediatesourceentity.getPersistentData().getDouble("z")), _ent.getYRot(), _ent.getXRot());
						}
						immediatesourceentity.setDeltaMovement(new Vec3(0, 0, 0));
					} else {
						{
							Entity _ent = immediatesourceentity;
							_ent.teleportTo((entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * 2), (entity.getY() + 1.62),
									(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * 2));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX() + Math.sin(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw") + 180)) * 2), (entity.getY() + 1.62),
										(entity.getZ() + Math.cos(Math.toRadians(immediatesourceentity.getPersistentData().getDouble("yaw"))) * 2), _ent.getYRot(), _ent.getXRot());
						}
						immediatesourceentity.setDeltaMovement(new Vec3(0, 0, 0));
					}
				}
			}
		}
	}
}