package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class MagicStylesSkillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (!world.isClientSide()) {
			if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 2) {
				{
					Entity _ent = immediatesourceentity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 2), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 2), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
				}
				if ((entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP)
						? _livingEntity6.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue()
						: 0) == 0) {
					entity.getPersistentData().putDouble("weaponenhance", (immediatesourceentity.getPersistentData().getDouble("keypressed")));
					if (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
						_livingEntity10.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((immediatesourceentity.getPersistentData().getDouble("magicpower")));
					entity.getPersistentData().putDouble("attacksize", (immediatesourceentity.getPersistentData().getDouble("magicsize")));
					entity.getPersistentData().putDouble("attackreach", (immediatesourceentity.getPersistentData().getDouble("magicspeed")));
					entity.getPersistentData().putDouble("attackspeed", (immediatesourceentity.getPersistentData().getDouble("overheat")));
					if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
						entity.getPersistentData().putBoolean("fireattack", true);
						if (world instanceof ServerLevel _level) {
							int X = (int) x;
							int Y = (int) y;
							int Z = (int) z;
							String command = "photon fx photon:" + "fireactivate" + " block " + X + " " + Y + " " + Z + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " "
									+ (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " " + (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " " + (int) 0 + " " + true + " " + true;
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									command);
						}
					}
					immediatesourceentity.getPersistentData().putDouble("explodenoise", (immediatesourceentity.getPersistentData().getDouble("explodenoise") + 1));
				}
				if ((entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP)
						? _livingEntity25.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue()
						: 0) == 0) {
					DreamsOfDivinityMod.queueServerWork(10, () -> {
						if (!immediatesourceentity.level().isClientSide())
							immediatesourceentity.discard();
					});
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 3) {
				{
					Entity _ent = immediatesourceentity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 2), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 2), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
				}
				if ((entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP)
						? _livingEntity33.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue()
						: 0) == 0) {
					entity.getPersistentData().putDouble("bodyenhance", (immediatesourceentity.getPersistentData().getDouble("keypressed")));
					entity.getPersistentData().putDouble("empower", (immediatesourceentity.getPersistentData().getDouble("magicspeed")));
					entity.getPersistentData().putDouble("armorpower", (immediatesourceentity.getPersistentData().getDouble("magicpower")));
					entity.getPersistentData().putDouble("bendingoutput", (immediatesourceentity.getPersistentData().getDouble("magicsize")));
					entity.getPersistentData().putDouble("bendingspeed", (immediatesourceentity.getPersistentData().getDouble("overheat")));
					if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
						entity.getPersistentData().putBoolean("firearmor", true);
						if (world instanceof ServerLevel _level) {
							int X = (int) x;
							int Y = (int) y;
							int Z = (int) z;
							String command = "photon fx photon:" + "fireactivate" + " block " + X + " " + Y + " " + Z + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " "
									+ (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " " + (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " " + (int) 0 + " " + true + " " + true;
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									command);
						}
					}
					immediatesourceentity.getPersistentData().putDouble("explodenoise", (immediatesourceentity.getPersistentData().getDouble("explodenoise") + 1));
				}
				if ((entity instanceof LivingEntity _livingEntity52 && _livingEntity52.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP)
						? _livingEntity52.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue()
						: 0) == 0) {
					DreamsOfDivinityMod.queueServerWork(10, () -> {
						if (!immediatesourceentity.level().isClientSide())
							immediatesourceentity.discard();
					});
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 4) {
				{
					Entity _ent = immediatesourceentity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 2), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 2), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
				}
				if ((entity instanceof LivingEntity _livingEntity60 && _livingEntity60.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP)
						? _livingEntity60.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue()
						: 0) == 0) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.movementenhance = immediatesourceentity.getPersistentData().getDouble("keypressed");
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof LivingEntity _livingEntity62 && _livingEntity62.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE))
						_livingEntity62.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).setBaseValue(1);
					if (entity instanceof LivingEntity _livingEntity64 && _livingEntity64.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE))
						_livingEntity64.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).setBaseValue((immediatesourceentity.getPersistentData().getDouble("keypressed")));
					if (entity instanceof LivingEntity _livingEntity66 && _livingEntity66.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED))
						_livingEntity66.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).setBaseValue((immediatesourceentity.getPersistentData().getDouble("magicspeed")));
					entity.getPersistentData().putDouble("boostamount", (immediatesourceentity.getPersistentData().getDouble("magicpower")));
					entity.getPersistentData().putDouble("boostregen", (40 / immediatesourceentity.getPersistentData().getDouble("overheat")));
					entity.getPersistentData().putDouble("boostspeed", (immediatesourceentity.getPersistentData().getDouble("magicspeed")));
					if (entity instanceof LivingEntity _livingEntity74 && _livingEntity74.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT))
						_livingEntity74.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).setBaseValue((immediatesourceentity.getPersistentData().getDouble("magicpower")));
					if (entity instanceof LivingEntity _livingEntity76 && _livingEntity76.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN))
						_livingEntity76.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).setBaseValue((40 / immediatesourceentity.getPersistentData().getDouble("overheat")));
					if (entity instanceof LivingEntity _livingEntity78 && _livingEntity78.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
						_livingEntity78.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).setBaseValue((immediatesourceentity.getPersistentData().getDouble("magicpower")));
					if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
						entity.getPersistentData().putBoolean("firemovement", true);
						if (world instanceof ServerLevel _level) {
							int X = (int) x;
							int Y = (int) y;
							int Z = (int) z;
							String command = "photon fx photon:" + "fireactivate" + " block " + X + " " + Y + " " + Z + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " "
									+ (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " " + (immediatesourceentity.getPersistentData().getDouble("magicpower") * 0.5) + " " + (int) 0 + " " + true + " " + true;
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									command);
						}
					}
					immediatesourceentity.getPersistentData().putDouble("explodenoise", (immediatesourceentity.getPersistentData().getDouble("explodenoise") + 1));
				}
				if ((entity instanceof LivingEntity _livingEntity87 && _livingEntity87.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP)
						? _livingEntity87.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue()
						: 0) == 0) {
					DreamsOfDivinityMod.queueServerWork(10, () -> {
						if (!immediatesourceentity.level().isClientSide())
							immediatesourceentity.discard();
					});
				}
			}
		}
	}
}