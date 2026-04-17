package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

public class Skill1WhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double magicsize = 0;
		immediatesourceentity.setNoGravity(true);
		immediatesourceentity.getPersistentData().putDouble("immunity", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).immunity);
		if ((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP) ? _livingEntity2.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue() : 0) == 1) {
			if (immediatesourceentity.getPersistentData().getDouble("cast") == 0) {
				immediatesourceentity.getPersistentData().putString("spellname", (entity.getPersistentData().getString("spellname")));
				immediatesourceentity.setCustomName(Component.literal((entity.getPersistentData().getString("spellname"))));
				immediatesourceentity.getPersistentData().putDouble("speedstat", 1);
				immediatesourceentity.getPersistentData().putDouble("powerstat", 1);
				immediatesourceentity.getPersistentData().putDouble("sizestat", 1);
				immediatesourceentity.getPersistentData().putDouble("piercestat", 1);
				immediatesourceentity.getPersistentData().putBoolean("fire", (entity.getPersistentData().getBoolean("fire")));
				immediatesourceentity.getPersistentData().putBoolean("water", (entity.getPersistentData().getBoolean("water")));
				if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
					immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 1.2));
					immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 1.5));
					immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 1.3));
					immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1));
				}
				if (immediatesourceentity.getPersistentData().getBoolean("water") == true) {
					immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 1));
					immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 1.5));
					immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 1.4));
					immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1.1));
				}
				immediatesourceentity.getPersistentData().putDouble("magicshape", (entity.getPersistentData().getDouble("magicshape")));
				if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 1) {
					immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 1));
					immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 1));
					immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 1));
					immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1));
				} else {
					if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 2) {
						immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 0.9));
						immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 0.9));
						immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 1.4));
						immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1));
					} else {
						if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 3) {
							immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 1.3));
							immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 1.1));
							immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 0.75));
							immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1));
							immediatesourceentity.getPersistentData().putDouble("piercestat2", (immediatesourceentity.getPersistentData().getDouble("piercestat2") + 1));
						} else {
							if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 4) {
								immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 1.6));
								immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 1));
								immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 0.6));
								immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1));
								immediatesourceentity.getPersistentData().putDouble("piercestat2", (immediatesourceentity.getPersistentData().getDouble("piercestat2") + 0));
							} else {
								if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 5) {
									immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 1.25));
									immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 0.85));
									immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 1.25));
									immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1));
									immediatesourceentity.getPersistentData().putDouble("piercestat2", (immediatesourceentity.getPersistentData().getDouble("piercestat2") + 0));
								} else {
									if (immediatesourceentity.getPersistentData().getDouble("magicshape") == 5) {
										immediatesourceentity.getPersistentData().putDouble("speedstat", (immediatesourceentity.getPersistentData().getDouble("speedstat") * 1.1));
										immediatesourceentity.getPersistentData().putDouble("powerstat", (immediatesourceentity.getPersistentData().getDouble("powerstat") * 1.4));
										immediatesourceentity.getPersistentData().putDouble("sizestat", (immediatesourceentity.getPersistentData().getDouble("sizestat") * 0.75));
										immediatesourceentity.getPersistentData().putDouble("piercestat", (immediatesourceentity.getPersistentData().getDouble("piercestat") * 1));
										immediatesourceentity.getPersistentData().putDouble("piercestat2", (immediatesourceentity.getPersistentData().getDouble("piercestat2") + 1));
									}
								}
							}
						}
					}
				}
				immediatesourceentity.getPersistentData().putDouble("keypressed", (entity.getPersistentData().getDouble("keypressed")));
				immediatesourceentity.getPersistentData().putDouble("magicpower", (entity.getPersistentData().getDouble("magicpower") * immediatesourceentity.getPersistentData().getDouble("powerstat")));
				immediatesourceentity.getPersistentData().putDouble("magicspeed", (entity.getPersistentData().getDouble("magicspeed") * immediatesourceentity.getPersistentData().getDouble("speedstat")));
				immediatesourceentity.getPersistentData().putDouble("magicsize", ((entity.getPersistentData().getDouble("magicsize") + 0.2) * immediatesourceentity.getPersistentData().getDouble("sizestat")));
				magicsize = entity.getPersistentData().getDouble("magicsize");
				immediatesourceentity.getPersistentData().putDouble("overheat", (entity.getPersistentData().getDouble("overheat")));
				immediatesourceentity.getPersistentData().putDouble("keypressed", (entity.getPersistentData().getDouble("keypressed")));
				immediatesourceentity.getPersistentData().putDouble("magicstyle", (entity.getPersistentData().getDouble("magicstyle")));
				immediatesourceentity.getPersistentData().putDouble("piercing",
						(entity.getPersistentData().getDouble("piercing") * immediatesourceentity.getPersistentData().getDouble("piercestat") + immediatesourceentity.getPersistentData().getDouble("piercestat2")));
				immediatesourceentity.getPersistentData().putDouble("tracking", (entity.getPersistentData().getDouble("tracking")));
				immediatesourceentity.getPersistentData().putDouble("magicfollow", (entity.getPersistentData().getDouble("magicfollow")));
				immediatesourceentity.getPersistentData().putDouble("magicduration", (entity.getPersistentData().getDouble("magicduration")));
				immediatesourceentity.getPersistentData().putDouble("multicast", (entity.getPersistentData().getDouble("multicast")));
				immediatesourceentity.getPersistentData().putDouble("magicdirection", (entity.getPersistentData().getDouble("magicdirection")));
				immediatesourceentity.getPersistentData().putDouble("areacoverage", (entity.getPersistentData().getDouble("areacoverage")));
				immediatesourceentity.getPersistentData().putDouble("guidedmagic", (entity.getPersistentData().getDouble("guidedmagic")));
				immediatesourceentity.getPersistentData().putDouble("gravity", (entity.getPersistentData().getDouble("gravity")));
				immediatesourceentity.getPersistentData().putDouble("castingoffset", (entity.getPersistentData().getDouble("castingoffset")));
				immediatesourceentity.getPersistentData().putDouble("multicastt", (entity.getPersistentData().getDouble("multicastt")));
				immediatesourceentity.getPersistentData().putDouble("inrange", (entity.getPersistentData().getDouble("immunity")));
				entity.getPersistentData().putDouble("inrangerange", ((0.7 + 0.3 * immediatesourceentity.getPersistentData().getDouble("magicsize")) * 2));
				if (immediatesourceentity.getPersistentData().getDouble("spellid") == 0) {
					immediatesourceentity.getPersistentData().putDouble("spellid",
							(10000 * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1)));
				}
				if (immediatesourceentity instanceof LivingEntity _livingEntity147 && _livingEntity147.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.MAX_HEALTH))
					_livingEntity147.getAttribute(DreamsOfDivinityModAttributes.MAX_HEALTH).setBaseValue((immediatesourceentity.getPersistentData().getDouble("magicpower")));
				if (immediatesourceentity instanceof LivingEntity _livingEntity149 && _livingEntity149.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.HEALTH))
					_livingEntity149.getAttribute(DreamsOfDivinityModAttributes.HEALTH).setBaseValue((immediatesourceentity.getPersistentData().getDouble("magicpower")));
				if (immediatesourceentity instanceof LivingEntity _entity)
					_entity.setHealth(immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				immediatesourceentity.getPersistentData().putDouble("cast", 1);
			}
		}
		if ((entity instanceof LivingEntity _livingEntity153 && _livingEntity153.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP) ? _livingEntity153.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue() : 0) == 1) {
			ChargeupSkillProcedure.execute(world, entity, immediatesourceentity);
		}
		if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 5 || immediatesourceentity.getPersistentData().getDouble("magicstyle") == 1) {
			ProjectileSkillProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		}
		SoundsSkillProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		MagicStylesSkillProcedure.execute(world, x, y, z, entity, immediatesourceentity);
	}
}