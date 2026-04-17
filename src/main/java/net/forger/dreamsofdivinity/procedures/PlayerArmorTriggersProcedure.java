package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerArmorTriggersProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 3) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhanceboots",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("empowerbodyenhanceboots",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
				entity.getPersistentData().putDouble("outputbodyenhanceboots",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhanceboots", 0);
				entity.getPersistentData().putDouble("empowerbodyenhanceboots", 0);
				entity.getPersistentData().putDouble("outputbodyenhanceboots", 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 3) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhancelegs",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("empowerbodyenhancelegs",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
				entity.getPersistentData().putDouble("outputbodyenhancelegs",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhancelegs", 0);
				entity.getPersistentData().putDouble("empowerbodyenhancelegs", 0);
				entity.getPersistentData().putDouble("outputbodyenhancelegs", 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 3) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhancechest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("empowerbodyenhancechest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
				entity.getPersistentData().putDouble("outputbodyenhancechest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhancechest", 0);
				entity.getPersistentData().putDouble("empowerbodyenhancechest", 0);
				entity.getPersistentData().putDouble("outputbodyenhancechest", 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 3) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhancehelmet",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("empowerbodyenhancehelmet",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
				entity.getPersistentData().putDouble("outputbodyenhancehelmet",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("armorbodyenhancehelmet", 0);
				entity.getPersistentData().putDouble("empowerbodyenhancehelmet", 0);
				entity.getPersistentData().putDouble("outputbodyenhancehelmet", 0);
			}
		}
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("armorbodyenhance", (entity.getPersistentData().getDouble("armorbodyenhancehelmet") + entity.getPersistentData().getDouble("armorbodyenhancechest")
					+ entity.getPersistentData().getDouble("armorbodyenhancelegs") + entity.getPersistentData().getDouble("armorbodyenhanceboots")));
			entity.getPersistentData().putDouble("empowerbodyenhance", (entity.getPersistentData().getDouble("empowerbodyenhancehelmet") + entity.getPersistentData().getDouble("empowerbodyenhancechest")
					+ entity.getPersistentData().getDouble("empowerbodyenhancelegs") + entity.getPersistentData().getDouble("empowerbodyenhanceboots")));
			entity.getPersistentData().putDouble("outputbodyenhance", (entity.getPersistentData().getDouble("outputbodyenhancehelmet") + entity.getPersistentData().getDouble("outputbodyenhancechest")
					+ entity.getPersistentData().getDouble("outputbodyenhancelegs") + entity.getPersistentData().getDouble("outputbodyenhanceboots")));
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amountboots",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("regenboots",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat")));
				entity.getPersistentData().putDouble("speedboots",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amountboots", 0);
				entity.getPersistentData().putDouble("regenboots", 0);
				entity.getPersistentData().putDouble("speedboots", 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amountlegs",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("regenlegs",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat")));
				entity.getPersistentData().putDouble("speedlegs",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amountlegs", 0);
				entity.getPersistentData().putDouble("regenlegs", 0);
				entity.getPersistentData().putDouble("speedlegs", 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amountchest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("regenchest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat")));
				entity.getPersistentData().putDouble("speedchest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amountchest", 0);
				entity.getPersistentData().putDouble("regenchest", 0);
				entity.getPersistentData().putDouble("speedchest", 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle") == 4) {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amounthelmet",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
				entity.getPersistentData().putDouble("regenchest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat")));
				entity.getPersistentData().putDouble("speedchest",
						((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed")));
			}
		} else {
			if (!world.isClientSide()) {
				entity.getPersistentData().putDouble("amounthelmet", 0);
				entity.getPersistentData().putDouble("regenchest", 0);
				entity.getPersistentData().putDouble("speedchest", 0);
			}
		}
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("armoramount",
					(entity.getPersistentData().getDouble("amounthelmet") + entity.getPersistentData().getDouble("amountchest") + entity.getPersistentData().getDouble("amountlegs") + entity.getPersistentData().getDouble("amountboots")));
			entity.getPersistentData().putDouble("armorregen",
					(entity.getPersistentData().getDouble("regenhelmet") + entity.getPersistentData().getDouble("regenchest") + entity.getPersistentData().getDouble("regenlegs") + entity.getPersistentData().getDouble("regenboots")));
			entity.getPersistentData().putDouble("armorspeed",
					(entity.getPersistentData().getDouble("speedhelmet") + entity.getPersistentData().getDouble("speedchest") + entity.getPersistentData().getDouble("speedlegs") + entity.getPersistentData().getDouble("speedboots")));
		}
	}
}