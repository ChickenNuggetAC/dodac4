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

import java.util.Comparator;

public class FireprojectileProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		MutableComponent spellcolor = Component.empty();
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP))
			_livingEntity0.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).setBaseValue(1);
		entity.getPersistentData().putString("spellname", (entity.getDisplayName().getString() + "" + (": \"" + "" + (entity.getPersistentData().getString("spellname") + "" + "\""))));
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				spellcolor = Component.literal((entity.getPersistentData().getString("spellname"))).withColor((255 << 24 | 255 << 16 | 0 << 8 | 0));
				if (entityiterator instanceof Player _player && !_player.level().isClientSide()) {
					_player.displayClientMessage(spellcolor, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("magicstyle") == 1) {
			if (entity.getPersistentData().getDouble("multicast") > 1.5) {
				for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("multicast") - 1); index0++) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true, false,
									false, AbstractArrow.Pickup.DISALLOWED);
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
						Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true, false,
								false, AbstractArrow.Pickup.DISALLOWED);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("magicstyle") == 5) {
			if (entity.getPersistentData().getDouble("multicast") > 1.5) {
				for (int index1 = 0; index1 < (int) entity.getPersistentData().getDouble("multicast"); index1++) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true, false,
									false, AbstractArrow.Pickup.DISALLOWED);
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
						Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true, false,
								false, AbstractArrow.Pickup.DISALLOWED);
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
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true, false,
								false, AbstractArrow.Pickup.DISALLOWED);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			} else {
				entity.getPersistentData().putDouble("weaponenhance", 0);
				if (entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity33.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
				if (entity instanceof LivingEntity _livingEntity34 && _livingEntity34.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
					_livingEntity34.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(1);
				entity.getPersistentData().putDouble("attacksize", 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (DreamsOfDivinityModParticleTypes.SMOKE.get()), x, y, z, 40, 2, 2, 2, 1);
			}
		}
		if (entity.getPersistentData().getDouble("magicstyle") == 3) {
			if (entity.getPersistentData().getDouble("bodyenhance") < 0.5) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true, false,
								false, AbstractArrow.Pickup.DISALLOWED);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			} else {
				entity.getPersistentData().putDouble("bodyenhance", 0);
				if (entity.getPersistentData().getDouble("weaponenhance") < 0.5) {
					if (entity instanceof LivingEntity _livingEntity43 && _livingEntity43.getAttributes().hasAttribute(Attributes.ARMOR))
						_livingEntity43.getAttribute(Attributes.ARMOR).setBaseValue(1);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (DreamsOfDivinityModParticleTypes.SMOKE.get()), x, y, z, 40, 2, 2, 2, 1);
			}
		}
		if (entity.getPersistentData().getDouble("magicstyle") == 4) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).movementenhance < 0.5) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = initArrowProjectile(new Skill1Entity(DreamsOfDivinityModEntities.SKILL_1.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 0, (byte) 400000)), entity, 0, true, false,
								false, AbstractArrow.Pickup.DISALLOWED);
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
				if (entity instanceof LivingEntity _livingEntity48 && _livingEntity48.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED))
					_livingEntity48.getAttribute(DreamsOfDivinityModAttributes.BOOST_SPEED).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT))
					_livingEntity49.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN))
					_livingEntity50.getAttribute(DreamsOfDivinityModAttributes.BOOST_REGEN).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity51 && _livingEntity51.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE))
					_livingEntity51.getAttribute(DreamsOfDivinityModAttributes.MOVEMENT_ENHANCE).setBaseValue(0);
				if (entity instanceof LivingEntity _livingEntity52 && _livingEntity52.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST))
					_livingEntity52.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).setBaseValue(0);
				entity.getPersistentData().putDouble("enableparticles", 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (DreamsOfDivinityModParticleTypes.SMOKE.get()), x, y, z, 40, 2, 2, 2, 1);
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