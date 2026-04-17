package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMobEffects;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.entity.Skill1Entity;
import net.forger.dreamsofdivinity.entity.InscriptionSpellEntityEntity;
import net.forger.dreamsofdivinity.entity.BendingEntity;
import net.forger.dreamsofdivinity.entity.AttackEntity;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@EventBusSubscriber
public class MagicArmorProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double lightY = 0;
		double lightX = 0;
		double lightZ = 0;
		double lightA = 0;
		if (!world.isClientSide()) {
			if (entity.getPersistentData().getDouble("weaponenhance") < 0.5) {
				if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
					_livingEntity3.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(3);
				entity.getPersistentData().putDouble("attacksize", 1);
			}
			if (entity.getPersistentData().getDouble("bodyenhance") > 0.5 || entity.getPersistentData().getDouble("armorbodyenhance") > 1) {
				if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")) == true) {
					entity.getPersistentData().putBoolean("firearmor2", true);
				} else {
					entity.getPersistentData().putBoolean("firearmor2", false);
				}
				if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")) == true) {
					entity.getPersistentData().putBoolean("waterarmor2", true);
				} else {
					entity.getPersistentData().putBoolean("waterarmor2", false);
				}
				entity.getPersistentData().putDouble("bendingoutputfinal", (entity.getPersistentData().getDouble("bendingoutput") + entity.getPersistentData().getDouble("outputbodyenhance")));
				entity.getPersistentData().putDouble("empowerfinal", (entity.getPersistentData().getDouble("empower") + entity.getPersistentData().getDouble("empowerbodyenhance")));
				if (entity instanceof Player) {
					if (entity
							.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana > ((entity instanceof LivingEntity _livingEntity34 && _livingEntity34.getAttributes().hasAttribute(Attributes.ARMOR)
									? _livingEntity34.getAttribute(Attributes.ARMOR).getBaseValue()
									: 0) + entity.getPersistentData().getDouble("empower") + entity.getPersistentData().getDouble("empowerbodyenhance") * 0.2) * entity.getPersistentData().getDouble("bendingoutputfinal")
							&& entity.getPersistentData().getDouble("armormanadepleted") == 0) {
						if (entity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(Attributes.ARMOR))
							_livingEntity41.getAttribute(Attributes.ARMOR).setBaseValue((entity.getPersistentData().getDouble("armorpower") + entity.getPersistentData().getDouble("armorbodyenhance")));
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana
									- ((entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.ARMOR) ? _livingEntity42.getAttribute(Attributes.ARMOR).getBaseValue() : 0)
											+ entity.getPersistentData().getDouble("empower") + entity.getPersistentData().getDouble("empowerbodyenhance") * 0.2) * entity.getPersistentData().getDouble("bendingoutputfinal");
							_vars.syncPlayerVariables(entity);
						}
						{
							Entity _entity = entity;
							String command = "photon fx photon:" + "head" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + 0 + " " + 0 + " " + 0.5 + " " + 0.5 + " " + 0.5 + " " + (int) 0 + " " + true + " " + true;
							if (!_entity.level().isClientSide() && _entity.getServer() != null) {
								_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
										_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
							}
						}
						if (entity.getPersistentData().getBoolean("firearmor") == true || entity.getPersistentData().getBoolean("firearmor2") == true) {
							entity.getPersistentData().putDouble("xrot", Math.sin(Math.toRadians(entity.getYRot() + 180)));
							entity.getPersistentData().putDouble("zrot", Math.cos(Math.toRadians(entity.getYRot())));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 1, true, false));
							{
								Entity _entity = entity;
								String command = "photon fx photon:" + "firearmor" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + (entity.getYRot() * (-1)) + " " + 0 + " " + 0.5 + " " + 0.5 + " " + 0.5 + " " + (int) 0 + " " + true
										+ " " + true;
								if (!_entity.level().isClientSide() && _entity.getServer() != null) {
									_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
											_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
								}
							}
							{
								Entity _entity = entity;
								String command = "photon fx photon:" + "firefield" + " entity " + _entity.getScoreboardName() + " " + 0 + " " + (-1.5) + " " + 0 + " " + 0 + " " + 0 + " " + 0 + " "
										+ (entity.getPersistentData().getDouble("bendingoutputfinal") * 0.7) + " " + (entity.getPersistentData().getDouble("bendingoutputfinal") * 0.7) + " "
										+ (entity.getPersistentData().getDouble("bendingoutputfinal") * 0.7) + " " + (int) 0 + " " + true + " " + true;
								if (!_entity.level().isClientSide() && _entity.getServer() != null) {
									_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
											_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
								}
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world.getEntitiesOfClass(Entity.class,
									new AABB(_center, _center).inflate((0.5 + (entity.getPersistentData().getDouble("bendingoutputfinal") + entity.getPersistentData().getDouble("bendingoutputfinal")) * 1.3) / 2d), e -> true).stream()
									.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
								if ((entityiterator instanceof LivingEntity _livingEntity62 && _livingEntity62.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
										? _livingEntity62.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
										: 0) != (entity instanceof LivingEntity _livingEntity63 && _livingEntity63.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
												? _livingEntity63.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
												: 0)) {
									if (entityiterator.getPersistentData().getDouble("shielded") == 0) {
										if (entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity) {
											entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) entity.getPersistentData().getDouble("empowerfinal"));
										} else {
											if (entity.getPersistentData().getBoolean("firearmor") == true || entity.getPersistentData().getBoolean("firearmor2") == true) {
												if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) entity.getPersistentData().getDouble("empowerfinal"), false, false));
											}
										}
									}
								}
							}
						}
						entity.getPersistentData().putDouble("armormanadepleted", 0);
					} else {
						if (entity instanceof LivingEntity _livingEntity77 && _livingEntity77.getAttributes().hasAttribute(Attributes.ARMOR))
							_livingEntity77.getAttribute(Attributes.ARMOR).setBaseValue(0);
						entity.getPersistentData().putDouble("armormanadepleted", 1);
						DreamsOfDivinityMod.queueServerWork(200, () -> {
							entity.getPersistentData().putDouble("armormanadepleted", 0);
						});
					}
				} else {
					if (entity instanceof InscriptionSpellEntityEntity) {
						if (entity instanceof LivingEntity _livingEntity91 && _livingEntity91.getAttributes().hasAttribute(Attributes.ARMOR))
							_livingEntity91.getAttribute(Attributes.ARMOR).setBaseValue((entity.getPersistentData().getDouble("armorpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
						if (entity.getPersistentData().getBoolean("firearmor") == true) {
							entity.getPersistentData().putDouble("xrot", Math.sin(Math.toRadians(entity.getYRot() + 180)));
							entity.getPersistentData().putDouble("zrot", Math.cos(Math.toRadians(entity.getYRot())));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 1, true, false));
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world
									.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((0.5 + (entity.getPersistentData().getDouble("bendingoutput") + entity.getPersistentData().getDouble("bendingoutput")) * 1.3) / 2d), e -> true)
									.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
								if ((entityiterator instanceof LivingEntity _livingEntity100 && _livingEntity100.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
										? _livingEntity100.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
										: 0) != (entity instanceof LivingEntity _livingEntity101 && _livingEntity101.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
												? _livingEntity101.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
												: 0)) {
									if (!(entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb)) {
										if (entityiterator.getPersistentData().getDouble("shielded") == 0) {
											if (entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity) {
												entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) entity.getPersistentData().getDouble("empower"));
											} else {
												if (entity.getPersistentData().getBoolean("firearmor") == true) {
													if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
														_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) entity.getPersistentData().getDouble("empower"), false, false));
												}
											}
										}
										{
											Entity _entity = entity;
											String command = "photon fx photon:" + "firefield" + " entity " + _entity.getScoreboardName() + " " + 0 + " " + (-1.5) + " " + 0 + " " + 0 + " " + 0 + " " + 0 + " "
													+ (entity.getPersistentData().getDouble("bendingoutput") * 0.7) + " " + (entity.getPersistentData().getDouble("bendingoutput") * 0.7) + " "
													+ (entity.getPersistentData().getDouble("bendingoutput") * 0.7) + " " + (int) 0 + " " + true + " " + false;
											if (!_entity.level().isClientSide() && _entity.getServer() != null) {
												_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
														_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
											}
										}
									}
								} else {
									{
										Entity _entity = entityiterator;
										String command = "photon fx photon:" + "head" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + 0 + " " + 0 + " " + 0.5 + " " + 0.5 + " " + 0.5 + " " + (int) 0 + " " + true + " " + true;
										if (!_entity.level().isClientSide() && _entity.getServer() != null) {
											_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
													_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
										}
									}
								}
							}
						}
					} else {
						if (entity.getPersistentData().getBoolean("firearmor") == true) {
							entity.getPersistentData().putDouble("xrot", Math.sin(Math.toRadians(entity.getYRot() + 180)));
							entity.getPersistentData().putDouble("zrot", Math.cos(Math.toRadians(entity.getYRot())));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 1, true, false));
							{
								Entity _entity = entity;
								String command = "photon fx photon:" + "firefield" + " entity " + _entity.getScoreboardName() + " " + 0 + " " + (-1.5) + " " + 0 + " " + 0 + " " + 0 + " " + 0 + " "
										+ (entity.getPersistentData().getDouble("bendingoutput") * 0.7) + " " + (entity.getPersistentData().getDouble("bendingoutput") * 0.7) + " " + (entity.getPersistentData().getDouble("bendingoutput") * 0.7) + " "
										+ (int) 0 + " " + true + " " + true;
								if (!_entity.level().isClientSide() && _entity.getServer() != null) {
									_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
											_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
								}
							}
						}
						if (entity instanceof LivingEntity _livingEntity139 && _livingEntity139.getAttributes().hasAttribute(Attributes.ARMOR))
							_livingEntity139.getAttribute(Attributes.ARMOR).setBaseValue((entity.getPersistentData().getDouble("armorpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
									+ (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world
									.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((0.5 + (entity.getPersistentData().getDouble("bendingoutput") + entity.getPersistentData().getDouble("bendingoutput")) * 1.3) / 2d), e -> true)
									.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
								if ((entityiterator instanceof LivingEntity _livingEntity142 && _livingEntity142.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
										? _livingEntity142.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
										: 0) != (entity instanceof LivingEntity _livingEntity143 && _livingEntity143.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
												? _livingEntity143.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
												: 0)) {
									if (entityiterator.getPersistentData().getDouble("shielded") == 0) {
										if (entityiterator instanceof Skill1Entity || entityiterator instanceof AttackEntity || entityiterator instanceof BendingEntity) {
											entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) entity.getPersistentData().getDouble("empower"));
										} else {
											if (entity.getPersistentData().getBoolean("firearmor") == true) {
												if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) entity.getPersistentData().getDouble("empower"), false, false));
											}
										}
									}
								} else {
									{
										Entity _entity = entityiterator;
										String command = "photon fx photon:" + "head" + " entity " + _entity.getScoreboardName() + " 0 0 0 " + 0 + " " + 0 + " " + 0 + " " + 0.5 + " " + 0.5 + " " + 0.5 + " " + (int) 0 + " " + true + " " + true;
										if (!_entity.level().isClientSide() && _entity.getServer() != null) {
											_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
													_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
										}
									}
								}
							}
						}
						entity.getPersistentData().putDouble("armormanadepleted", 0);
					}
					entity.getPersistentData().putDouble("armormanadepleted", 0);
				}
			} else {
				if (entity instanceof LivingEntity _livingEntity158 && _livingEntity158.getAttributes().hasAttribute(Attributes.ARMOR))
					_livingEntity158.getAttribute(Attributes.ARMOR).setBaseValue(0);
				entity.getPersistentData().putDouble("empower", 0);
			}
			if ((entity instanceof LivingEntity _livingEntity160 && _livingEntity160.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE)
					? _livingEntity160.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).getBaseValue()
					: 0) > 0.5 || (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4) {
				if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")) == true) {
					entity.getPersistentData().putBoolean("firemovement2", true);
				} else {
					entity.getPersistentData().putBoolean("firemovement2", false);
				}
				if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")) == true) {
					entity.getPersistentData().putBoolean("watermovement2", true);
				} else {
					entity.getPersistentData().putBoolean("watermovement2", false);
				}
				if (entity instanceof LivingEntity _livingEntity191 && _livingEntity191.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT))
					_livingEntity191.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).setBaseValue((entity.getPersistentData().getDouble("boostamount") + entity.getPersistentData().getDouble("armoramount")));
				if (entity instanceof LivingEntity _livingEntity194 && _livingEntity194.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN))
					_livingEntity194.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).setBaseValue((entity.getPersistentData().getDouble("boostregen") + entity.getPersistentData().getDouble("armorregen")));
				if (entity instanceof LivingEntity _livingEntity197 && _livingEntity197.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED))
					_livingEntity197.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).setBaseValue((entity.getPersistentData().getDouble("boostspeed") + entity.getPersistentData().getDouble("armorspeed")));
				if ((entity instanceof LivingEntity _livingEntity198 && _livingEntity198.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
						? _livingEntity198.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
						: 0) < -0.1) {
					if (entity instanceof LivingEntity _livingEntity199 && _livingEntity199.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
						_livingEntity199.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).setBaseValue(0);
				}
				if (entity.getPersistentData().getDouble("enableparticles") == 0) {
					if ((entity instanceof LivingEntity _livingEntity201 && _livingEntity201.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
							? _livingEntity201.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
							: 0) > (entity instanceof LivingEntity _livingEntity202 && _livingEntity202.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT)
									? _livingEntity202.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).getBaseValue()
									: 0)) {
						if (entity instanceof LivingEntity _livingEntity204 && _livingEntity204.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
							_livingEntity204.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
									.setBaseValue((entity instanceof LivingEntity _livingEntity203 && _livingEntity203.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT)
											? _livingEntity203.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).getBaseValue()
											: 0));
					} else if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana > (entity instanceof LivingEntity _livingEntity205 && _livingEntity205.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN)
							? _livingEntity205.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).getBaseValue()
							: 0)
							&& (entity instanceof LivingEntity _livingEntity206 && _livingEntity206.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
									? _livingEntity206.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
									: 0) < (entity instanceof LivingEntity _livingEntity207 && _livingEntity207.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT)
											? _livingEntity207.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).getBaseValue()
											: 0)) {
						if (entity instanceof LivingEntity _livingEntity210 && _livingEntity210.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
							_livingEntity210.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity208 && _livingEntity208.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
											? _livingEntity208.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
											: 0)
											+ 40 / (entity instanceof LivingEntity _livingEntity209 && _livingEntity209.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN)
													? _livingEntity209.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).getBaseValue()
													: 0)));
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana - (entity instanceof LivingEntity _livingEntity211 && _livingEntity211.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN)
									? _livingEntity211.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).getBaseValue()
									: 0);
							_vars.syncPlayerVariables(entity);
						}
					}
				}
				entity.getPersistentData().putDouble("movementforward", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementforward);
				entity.getPersistentData().putDouble("movementbackward", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementbackward);
				entity.getPersistentData().putDouble("movementright", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementright);
				entity.getPersistentData().putDouble("movementleft", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementleft);
				entity.getPersistentData().putDouble("movementup", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementup);
				if (entity.getPersistentData().getBoolean("firemovement") == true || entity.getPersistentData().getBoolean("firemovement2") == true) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 1, true, false));
					entity.fallDistance = 0;
					{
						Entity _entity = entity;
						String command = "photon fx photon:" + "fireparticle" + " entity " + _entity.getScoreboardName() + " " + 0 + " " + (-1.7) + " " + 0 + " " + 0 + " " + 0 + " " + 0 + " " + 0.2 + " " + 0.2 + " " + 0.2 + " " + (int) 0 + " " + true
								+ " " + true;
						if (!_entity.level().isClientSide() && _entity.getServer() != null) {
							_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
									_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
						}
					}
				}
				if (entity.getPersistentData().getDouble("enableparticles") == 1) {
					if ((entity instanceof LivingEntity _livingEntity223 && _livingEntity223.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
							? _livingEntity223.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
							: 0) > (entity instanceof LivingEntity _livingEntity224 && _livingEntity224.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
									? _livingEntity224.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
									: 0)) {
						if (entity instanceof LivingEntity _livingEntity227 && _livingEntity227.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
							_livingEntity227.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity225 && _livingEntity225.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
											? _livingEntity225.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
											: 0)
											- (entity instanceof LivingEntity _livingEntity226 && _livingEntity226.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
													? _livingEntity226.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
													: 0)));
						if (entity.getPersistentData().getBoolean("firemovement") == true || entity.getPersistentData().getBoolean("firemovement2") == true) {
							{
								Entity _entity = entity;
								String command = "photon fx photon:" + "fireparticle" + " entity " + _entity.getScoreboardName() + " " + 0 + " " + (-1.7) + " " + 0 + " " + 0 + " " + 0 + " " + 0 + " " + 1 + " " + 1 + " " + 1 + " " + (int) 0 + " "
										+ true + " " + true;
								if (!_entity.level().isClientSide() && _entity.getServer() != null) {
									_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
											_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
								}
							}
							entity.getPersistentData().putDouble("maxtime", 5);
							if (entity.getPersistentData().getDouble("timer") < entity.getPersistentData().getDouble("maxtime")) {
								entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firesummon")), SoundSource.PLAYERS,
												(float) (0.1 + (entity instanceof LivingEntity _livingEntity236 && _livingEntity236.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
														? _livingEntity236.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
														: 0) * 0.1),
												1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firesummon")), SoundSource.PLAYERS,
												(float) (0.1 + (entity instanceof LivingEntity _livingEntity236 && _livingEntity236.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
														? _livingEntity236.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
														: 0) * 0.1),
												1, false);
									}
								}
								entity.getPersistentData().putDouble("timer", 0);
							}
						}
					}
				}
			} else {
				if (entity instanceof LivingEntity _livingEntity239 && _livingEntity239.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity239.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).basespeed);
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.movementenhance = 0;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _livingEntity240 && _livingEntity240.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED))
					_livingEntity240.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity241 && _livingEntity241.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT))
					_livingEntity241.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity242 && _livingEntity242.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN))
					_livingEntity242.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity243 && _livingEntity243.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE))
					_livingEntity243.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity244 && _livingEntity244.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
					_livingEntity244.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).setBaseValue(0);
				entity.getPersistentData().putDouble("enableparticles", 0);
			}
		}
		if ((entity instanceof LivingEntity _livingEntity246 && _livingEntity246.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE)
				? _livingEntity246.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).getBaseValue()
				: 0) > 0.5 || (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4) {
			entity.getPersistentData().putDouble("movementforward", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementforward);
			entity.getPersistentData().putDouble("movementbackward", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementbackward);
			entity.getPersistentData().putDouble("movementright", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementright);
			entity.getPersistentData().putDouble("movementleft", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementleft);
			entity.getPersistentData().putDouble("movementup", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementup);
			if ((entity instanceof LivingEntity _livingEntity260 && _livingEntity260.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
					? _livingEntity260.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
					: 0) > 0
					&& (entity instanceof LivingEntity _livingEntity261 && _livingEntity261.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST)
							? _livingEntity261.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue()
							: 0) > (entity instanceof LivingEntity _livingEntity262 && _livingEntity262.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
									? _livingEntity262.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
									: 0)) {
				if (entity.getPersistentData().getDouble("movementup") > 0.5) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()),
							((entity instanceof LivingEntity _livingEntity265 && _livingEntity265.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
									? _livingEntity265.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
									: 0) * 0.2),
							(entity.getDeltaMovement().z())));
				}
				if (!entity.onGround()) {
					if (entity.getPersistentData().getDouble("movementforward") > 0.5) {
						if (entity.getPersistentData().getDouble("movementright") > 0.5) {
							entity.setDeltaMovement(new Vec3(
									(Math.sin(Math.toRadians(entity.getYRot() + 225)) * (entity instanceof LivingEntity _livingEntity272 && _livingEntity272.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
											? _livingEntity272.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
											: 0) * 0.35),
									(entity.getDeltaMovement().y()),
									(Math.cos(entity.getYRot() + 45) * (entity instanceof LivingEntity _livingEntity275 && _livingEntity275.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
											? _livingEntity275.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
											: 0) * 0.35)));
						} else {
							if (entity.getPersistentData().getDouble("movementleft") > 0.5) {
								entity.setDeltaMovement(new Vec3(
										(Math.sin(Math.toRadians(entity.getYRot() + 135)) * (entity instanceof LivingEntity _livingEntity279 && _livingEntity279.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity279.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35),
										(entity.getDeltaMovement().y()),
										(Math.cos(Math.toRadians(entity.getYRot() - 45)) * (entity instanceof LivingEntity _livingEntity282 && _livingEntity282.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity282.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35)));
							} else {
								entity.setDeltaMovement(new Vec3(
										(Math.sin(Math.toRadians(entity.getYRot() + 180)) * (entity instanceof LivingEntity _livingEntity285 && _livingEntity285.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity285.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35),
										(entity.getDeltaMovement().y()),
										(Math.cos(Math.toRadians(entity.getYRot())) * (entity instanceof LivingEntity _livingEntity288 && _livingEntity288.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity288.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35)));
							}
						}
					} else {
						if (entity.getPersistentData().getDouble("movementbackward") > 0.5) {
							if (entity.getPersistentData().getDouble("movementleft") > 0.5) {
								entity.setDeltaMovement(new Vec3(
										(Math.sin(Math.toRadians(entity.getYRot() + 45)) * (entity instanceof LivingEntity _livingEntity293 && _livingEntity293.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity293.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35),
										(entity.getDeltaMovement().y()),
										(Math.cos(Math.toRadians(entity.getYRot() - 45)) * (entity instanceof LivingEntity _livingEntity296 && _livingEntity296.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity296.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35)));
							} else {
								if (entity.getPersistentData().getDouble("movementright") > 0.5) {
									entity.setDeltaMovement(new Vec3(
											(Math.sin(Math.toRadians(entity.getYRot() + 315)) * (entity instanceof LivingEntity _livingEntity300 && _livingEntity300.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
													? _livingEntity300.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
													: 0) * 0.35),
											(entity.getDeltaMovement().y()),
											(Math.cos(Math.toRadians(entity.getYRot() + 135)) * (entity instanceof LivingEntity _livingEntity303 && _livingEntity303.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
													? _livingEntity303.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
													: 0) * 0.35)));
								} else {
									entity.setDeltaMovement(new Vec3(
											(Math.sin(Math.toRadians(entity.getYRot() + 360)) * (entity instanceof LivingEntity _livingEntity306 && _livingEntity306.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
													? _livingEntity306.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
													: 0) * 0.35),
											(entity.getDeltaMovement().y()),
											(Math.cos(Math.toRadians(entity.getYRot() + 180)) * (entity instanceof LivingEntity _livingEntity309 && _livingEntity309.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
													? _livingEntity309.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
													: 0) * 0.35)));
								}
							}
						} else {
							if (entity.getPersistentData().getDouble("movementright") > 0.5) {
								entity.setDeltaMovement(new Vec3(
										(Math.sin(Math.toRadians(entity.getYRot() + 270)) * (entity instanceof LivingEntity _livingEntity313 && _livingEntity313.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity313.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35),
										(entity.getDeltaMovement().y()),
										(Math.cos(Math.toRadians(entity.getYRot() + 90)) * (entity instanceof LivingEntity _livingEntity316 && _livingEntity316.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity316.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35)));
							}
							if (entity.getPersistentData().getDouble("movementleft") > 0.5) {
								entity.setDeltaMovement(new Vec3(
										(Math.sin(Math.toRadians(entity.getYRot() + 90)) * (entity instanceof LivingEntity _livingEntity320 && _livingEntity320.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity320.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35),
										(entity.getDeltaMovement().y()),
										(Math.cos(Math.toRadians(entity.getYRot() - 90)) * (entity instanceof LivingEntity _livingEntity323 && _livingEntity323.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED)
												? _livingEntity323.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).getBaseValue()
												: 0) * 0.35)));
							}
						}
					}
				}
			}
		}
	}
}