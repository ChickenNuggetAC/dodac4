/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.forger.dreamsofdivinity.entity.Skill1Entity;
import net.forger.dreamsofdivinity.entity.ItemskillEntity;
import net.forger.dreamsofdivinity.entity.InscriptionSpellEntityEntity;
import net.forger.dreamsofdivinity.entity.BendingEntity;
import net.forger.dreamsofdivinity.entity.AttackEntity;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DreamsOfDivinityModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, DreamsOfDivinityMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<Skill1Entity>> SKILL_1 = register("skill_1",
			EntityType.Builder.<Skill1Entity>of(Skill1Entity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<AttackEntity>> ATTACK = register("attack",
			EntityType.Builder.<AttackEntity>of(AttackEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BendingEntity>> BENDING = register("bending",
			EntityType.Builder.<BendingEntity>of(BendingEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemskillEntity>> ITEMSKILL = register("itemskill",
			EntityType.Builder.<ItemskillEntity>of(ItemskillEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<InscriptionSpellEntityEntity>> INSCRIPTION_SPELL_ENTITY = register("inscription_spell_entity",
			EntityType.Builder.<InscriptionSpellEntityEntity>of(InscriptionSpellEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.3f, 0.7f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		InscriptionSpellEntityEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(INSCRIPTION_SPELL_ENTITY.get(), InscriptionSpellEntityEntity.createAttributes().build());
	}
}