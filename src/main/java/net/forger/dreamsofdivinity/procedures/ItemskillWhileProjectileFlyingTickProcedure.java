package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class ItemskillWhileProjectileFlyingTickProcedure {
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
				immediatesourceentity.getPersistentData().putBoolean("fire",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")));
				immediatesourceentity.getPersistentData().putBoolean("water",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")));
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
				immediatesourceentity.getPersistentData().putDouble("magicshape",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicshape")));
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
				immediatesourceentity.getPersistentData().putDouble("keypressed", 1);
				immediatesourceentity.getPersistentData().putDouble("magicpower",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
								* immediatesourceentity.getPersistentData().getDouble("powerstat")));
				immediatesourceentity.getPersistentData().putDouble("magicspeed",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")
								* immediatesourceentity.getPersistentData().getDouble("speedstat")));
				immediatesourceentity.getPersistentData().putDouble("magicsize",
						(((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize") + 0.2)
								* immediatesourceentity.getPersistentData().getDouble("sizestat")));
				magicsize = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize");
				immediatesourceentity.getPersistentData().putDouble("overheat",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat")));
				immediatesourceentity.getPersistentData().putDouble("keypressed",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("keypressed")));
				immediatesourceentity.getPersistentData().putDouble("magicstyle",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle")));
				immediatesourceentity.getPersistentData().putDouble("piercing",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("piercing")
								* immediatesourceentity.getPersistentData().getDouble("piercestat") + immediatesourceentity.getPersistentData().getDouble("piercestat2")));
				immediatesourceentity.getPersistentData().putDouble("tracking",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("tracking")));
				immediatesourceentity.getPersistentData().putDouble("magicfollow",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicfollow")));
				immediatesourceentity.getPersistentData().putDouble("magicduration",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicduration")));
				immediatesourceentity.getPersistentData().putDouble("multicast",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("multicast")));
				immediatesourceentity.getPersistentData().putDouble("magicdirection",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicdirection")));
				immediatesourceentity.getPersistentData().putDouble("areacoverage",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("areacoverage")));
				immediatesourceentity.getPersistentData().putDouble("guidedmagic",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("guidedmagic")));
				immediatesourceentity.getPersistentData().putDouble("gravity",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("gravity")));
				immediatesourceentity.getPersistentData().putDouble("castingoffset",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("castingoffset")));
				immediatesourceentity.getPersistentData().putDouble("multicastt",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("multicastt")));
				immediatesourceentity.getPersistentData().putDouble("inrange", (entity.getPersistentData().getDouble("immunity")));
				entity.getPersistentData().putDouble("inrangerange", ((0.7 + 0.3 * immediatesourceentity.getPersistentData().getDouble("magicsize")) * 2));
				if (immediatesourceentity.getPersistentData().getDouble("spellid") == 0) {
					immediatesourceentity.getPersistentData().putDouble("spellid",
							(10000 * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1) * (Math.random() + 1)));
				}
				if (immediatesourceentity instanceof LivingEntity _entity)
					_entity.setHealth(immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				immediatesourceentity.getPersistentData().putDouble("cast", 1);
			}
		}
		if ((entity instanceof LivingEntity _livingEntity169 && _livingEntity169.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP) ? _livingEntity169.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue() : 0) == 1) {
			ChargeupSkillProcedure.execute(world, entity, immediatesourceentity);
			DreamsOfDivinityMod.queueServerWork((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat")), () -> {
				if (entity instanceof LivingEntity _livingEntity172 && _livingEntity172.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP))
					_livingEntity172.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).setBaseValue(0);
			});
		}
		if (immediatesourceentity.getPersistentData().getDouble("magicstyle") == 5 || immediatesourceentity.getPersistentData().getDouble("magicstyle") == 1) {
			ProjectileSkillProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		}
		SoundsSkillProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		MagicStylesSkillProcedure.execute(world, x, y, z, entity, immediatesourceentity);
	}
}