package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModParticleTypes;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModEntities;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.entity.Skill1Entity;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

import java.util.Comparator;

public class SkillKey5OnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		MutableComponent spellcolor = Component.empty();
		if (!world.isClientSide()) {
			if (entity.getPersistentData().getDouble("overheat") == 0) {
				entity.getPersistentData().putBoolean("fire", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire5);
				entity.getPersistentData().putBoolean("water", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water5);
				entity.getPersistentData().putDouble("keypressed", 1);
				entity.getPersistentData().putDouble("magicpower", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower5);
				entity.getPersistentData().putDouble("magicspeed", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed5);
				entity.getPersistentData().putDouble("magicsize", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize5);
				entity.getPersistentData().putDouble("overheat", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat5);
				entity.getPersistentData().putDouble("magicstyle", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle5);
				entity.getPersistentData().putDouble("piercing", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing5);
				entity.getPersistentData().putDouble("tracking", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking5);
				entity.getPersistentData().putDouble("magicshape", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape5);
				entity.getPersistentData().putDouble("magicfollow", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting5);
				entity.getPersistentData().putDouble("magicduration", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration5);
				entity.getPersistentData().putDouble("multicast", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast5);
				entity.getPersistentData().putDouble("magicdirection", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection5);
				entity.getPersistentData().putDouble("castingoffset", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset5);
				entity.getPersistentData().putDouble("guidedmagic", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic5);
				entity.getPersistentData().putDouble("gravity", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).gravity5);
				entity.getPersistentData().putDouble("areacoverage", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage5);
				entity.getPersistentData().putString("spellname", (entity.getDisplayName().getString() + "" + (": \"" + "" + (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname5 + "" + "\""))));
				if ((entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP)
						? _livingEntity23.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue()
						: 0) == 0) {
					entity.getPersistentData().putDouble("multicastt", 0);
				}
				if (entity.getPersistentData().getDouble("magicstyle") == 1) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.MagicCost = (entity.getPersistentData().getDouble("magicpower") + entity.getPersistentData().getDouble("magicduration") + 1 + entity.getPersistentData().getDouble("magicspeed")
								+ entity.getPersistentData().getDouble("piercing") + entity.getPersistentData().getDouble("tracking") * 0.5 + 1) * (entity.getPersistentData().getDouble("magicsize") * 0.5 + 1)
								* (entity.getPersistentData().getDouble("multicast") * 0.7 + 1) * ((40 / entity.getPersistentData().getDouble("overheat")) * 0.6 + 1);
						_vars.syncPlayerVariables(entity);
					}
				}
				if (entity.getPersistentData().getDouble("magicstyle") == 2) {
					if (entity.getPersistentData().getDouble("weaponenhance") < 0.5) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = (entity.getPersistentData().getDouble("magicpower") + 1 + entity.getPersistentData().getDouble("magicspeed") + 1) * (entity.getPersistentData().getDouble("magicsize") * 0.5 + 1)
									* ((40 / entity.getPersistentData().getDouble("overheat")) * 0.6 + 1);
							_vars.syncPlayerVariables(entity);
						}
					} else {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = 0;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
				if (entity.getPersistentData().getDouble("magicstyle") == 3) {
					if (entity.getPersistentData().getDouble("bodyenhance") < 0.5) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = (entity.getPersistentData().getDouble("magicpower") + 1 + entity.getPersistentData().getDouble("magicspeed") + 1) * (entity.getPersistentData().getDouble("magicsize") * 0.5 + 1)
									* ((40 / entity.getPersistentData().getDouble("overheat")) * 0.6 + 1);
							_vars.syncPlayerVariables(entity);
						}
					} else {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = 0;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
				if (entity.getPersistentData().getDouble("magicstyle") == 4) {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementenhance < 0.5) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = (entity.getPersistentData().getDouble("magicpower") + 1 + entity.getPersistentData().getDouble("magicspeed") + 1) * ((40 / entity.getPersistentData().getDouble("overheat")) * 0.6 + 1);
							_vars.syncPlayerVariables(entity);
						}
					} else {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = 0;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
				if (entity.getPersistentData().getDouble("magicstyle") == 5) {
					if (entity.getPersistentData().getDouble("magicspeed") < 0) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = (entity.getPersistentData().getDouble("magicpower") + entity.getPersistentData().getDouble("magicduration") + 1 + entity.getPersistentData().getDouble("magicspeed") * (-1)
									+ entity.getPersistentData().getDouble("piercing") + entity.getPersistentData().getDouble("tracking") * 0.5 + 1) * (entity.getPersistentData().getDouble("magicsize") * 0.5 + 1)
									* (entity.getPersistentData().getDouble("multicast") * 0.7 + 1) * ((40 / entity.getPersistentData().getDouble("overheat")) * 0.6 + 1);
							_vars.syncPlayerVariables(entity);
						}
					} else {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicCost = (entity.getPersistentData().getDouble("magicpower") + entity.getPersistentData().getDouble("magicduration") + 1 + entity.getPersistentData().getDouble("magicspeed")
									+ entity.getPersistentData().getDouble("piercing") + entity.getPersistentData().getDouble("tracking") * 0.5 + 1 + entity.getPersistentData().getDouble("magicsize") * 0.5 + 1)
									* (entity.getPersistentData().getDouble("magicsize") * 0.7 + 1) * ((40 / entity.getPersistentData().getDouble("overheat")) * 0.6 + 1);
							_vars.syncPlayerVariables(entity);
						}
					}
				}
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost < entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							spellcolor = Component.literal((entity.getPersistentData().getString("spellname"))).withColor((255 << 24 | 255 << 16 | 0 << 8 | 0));
							if (entityiterator instanceof Player _player && !_player.level().isClientSide()) {
								_player.displayClientMessage(spellcolor, false);
							}
						}
					}
					entity.getPersistentData().putDouble("overheatcool", 1);
					if (entity instanceof LivingEntity _livingEntity75 && _livingEntity75.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP))
						_livingEntity75.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).setBaseValue(1);
					entity.getPersistentData().putBoolean("chargeup", true);
					if (entity.getPersistentData().getDouble("magicstyle") == 1) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost;
							_vars.syncPlayerVariables(entity);
						}
						if (entity.getPersistentData().getDouble("multicast") > 1.5) {
							for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("multicast") - 1); index0++) {
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0,
												true, false, false, AbstractArrow.Pickup.DISALLOWED);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
								entity.getPersistentData().putDouble("multicastt", (entity.getPersistentData().getDouble("multicastt") + 1));
							}
						} else {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true,
											false, false, AbstractArrow.Pickup.DISALLOWED);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
					if (entity.getPersistentData().getDouble("magicstyle") == 5) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost;
							_vars.syncPlayerVariables(entity);
						}
						if (entity.getPersistentData().getDouble("multicast") > 1.5) {
							for (int index1 = 0; index1 < (int) entity.getPersistentData().getDouble("multicast"); index1++) {
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0,
												true, false, false, AbstractArrow.Pickup.DISALLOWED);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
								entity.getPersistentData().putDouble("multicastt", (entity.getPersistentData().getDouble("multicastt") + 1));
							}
						} else {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true,
											false, false, AbstractArrow.Pickup.DISALLOWED);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
					if (entity.getPersistentData().getDouble("magicstyle") == 2) {
						if (entity.getPersistentData().getDouble("weaponenhance") < 0.5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost;
								_vars.syncPlayerVariables(entity);
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true,
											false, false, AbstractArrow.Pickup.DISALLOWED);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						} else {
							entity.getPersistentData().putDouble("weaponenhance", 0);
							if (entity instanceof LivingEntity _livingEntity100 && _livingEntity100.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
								_livingEntity100.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
							if (entity instanceof LivingEntity _livingEntity101 && _livingEntity101.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
								_livingEntity101.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(1);
							entity.getPersistentData().putDouble("attacksize", 1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (DreamsOfDivinityModParticleTypes.SMOKE.get()), x, y, z, 40, 2, 2, 2, 1);
						}
					}
					if (entity.getPersistentData().getDouble("magicstyle") == 3) {
						if (entity.getPersistentData().getDouble("bodyenhance") < 0.5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost;
								_vars.syncPlayerVariables(entity);
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true,
											false, false, AbstractArrow.Pickup.DISALLOWED);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						} else {
							entity.getPersistentData().putDouble("bodyenhance", 0);
							if (entity instanceof LivingEntity _livingEntity109 && _livingEntity109.getAttributes().hasAttribute(Attributes.ARMOR))
								_livingEntity109.getAttribute(Attributes.ARMOR).setBaseValue(1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (DreamsOfDivinityModParticleTypes.SMOKE.get()), x, y, z, 40, 2, 2, 2, 1);
						}
					}
					if (entity.getPersistentData().getDouble("magicstyle") == 4) {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementenhance < 0.5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost;
								_vars.syncPlayerVariables(entity);
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true,
											false, false, AbstractArrow.Pickup.DISALLOWED);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						} else {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.movementenhance = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof LivingEntity _livingEntity114 && _livingEntity114.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED))
								_livingEntity114.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).setBaseValue(0);
							if (entity instanceof LivingEntity _livingEntity115 && _livingEntity115.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT))
								_livingEntity115.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).setBaseValue(0);
							if (entity instanceof LivingEntity _livingEntity116 && _livingEntity116.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN))
								_livingEntity116.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).setBaseValue(0);
							if (entity instanceof LivingEntity _livingEntity117 && _livingEntity117.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE))
								_livingEntity117.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).setBaseValue(0);
							if (entity instanceof LivingEntity _livingEntity118 && _livingEntity118.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
								_livingEntity118.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).setBaseValue(0);
							entity.getPersistentData().putDouble("enableparticles", 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (DreamsOfDivinityModParticleTypes.SMOKE.get()), x, y, z, 40, 2, 2, 2, 1);
						}
					}
				} else {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.notenoughmana = 1;
						_vars.syncPlayerVariables(entity);
					}
					DreamsOfDivinityMod.queueServerWork(20, () -> {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.notenoughmana = 0;
							_vars.syncPlayerVariables(entity);
						}
						entity.getPersistentData().putDouble("overheat", 0);
					});
				}
			}
		}
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}

	private static ItemStack createArrowWeaponItemStack(Level level, int knockback, byte piercing) {
		ItemStack weapon = new ItemStack(Items.ARROW);
		if (knockback > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.KNOCKBACK), knockback);
		if (piercing > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), piercing);
		return weapon;
	}
}