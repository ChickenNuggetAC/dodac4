/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.core.registries.BuiltInRegistries;

import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DreamsOfDivinityModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, DreamsOfDivinityMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> HEALTH = REGISTRY.register("health", () -> new RangedAttribute("attribute.dreams_of_divinity.health", 0, 0, 1000000000).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> MAX_HEALTH = REGISTRY.register("max_health", () -> new RangedAttribute("attribute.dreams_of_divinity.max_health", 0, 0, 1000000000).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> BOOST_SPEED = REGISTRY.register("boost_speed",
			() -> new RangedAttribute("attribute.dreams_of_divinity.boost_speed", 0, 0, 100000000).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));
	public static final DeferredHolder<Attribute, Attribute> BOOST_AMOUNT = REGISTRY.register("boost_amount",
			() -> new RangedAttribute("attribute.dreams_of_divinity.boost_amount", 0, 0, 100000000).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));
	public static final DeferredHolder<Attribute, Attribute> MOVEMENT_ENHANCE = REGISTRY.register("movement_enhance",
			() -> new RangedAttribute("attribute.dreams_of_divinity.movement_enhance", 0, 0, 100000000).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));
	public static final DeferredHolder<Attribute, Attribute> BOOST_REGEN = REGISTRY.register("boost_regen",
			() -> new RangedAttribute("attribute.dreams_of_divinity.boost_regen", 0, 0, 100000000).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));
	public static final DeferredHolder<Attribute, Attribute> CURRENT_BOOST = REGISTRY.register("current_boost",
			() -> new RangedAttribute("attribute.dreams_of_divinity.current_boost", 0, 0, 100000000).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));
	public static final DeferredHolder<Attribute, Attribute> CHARGEUP = REGISTRY.register("chargeup", () -> new RangedAttribute("attribute.dreams_of_divinity.chargeup", 0, 0, 100000000).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> IMMUNITY = REGISTRY.register("immunity", () -> new RangedAttribute("attribute.dreams_of_divinity.immunity", 0, 0, 100000000).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> PARTY_INVITE = REGISTRY.register("party_invite", () -> new RangedAttribute("attribute.dreams_of_divinity.party_invite", 0, 0, 10).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> PARTY_RANK = REGISTRY.register("party_rank", () -> new RangedAttribute("attribute.dreams_of_divinity.party_rank", 0, 0, 4).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.getTypes().forEach(entity -> event.add(entity, HEALTH));
		event.getTypes().forEach(entity -> event.add(entity, MAX_HEALTH));
		event.getTypes().forEach(entity -> event.add(entity, BOOST_SPEED));
		event.getTypes().forEach(entity -> event.add(entity, BOOST_AMOUNT));
		event.getTypes().forEach(entity -> event.add(entity, MOVEMENT_ENHANCE));
		event.getTypes().forEach(entity -> event.add(entity, BOOST_REGEN));
		event.getTypes().forEach(entity -> event.add(entity, CURRENT_BOOST));
		event.getTypes().forEach(entity -> event.add(entity, CHARGEUP));
		event.getTypes().forEach(entity -> event.add(entity, IMMUNITY));
		event.getTypes().forEach(entity -> event.add(entity, PARTY_INVITE));
		event.getTypes().forEach(entity -> event.add(entity, PARTY_RANK));
	}
}