/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class DreamsOfDivinityModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, DreamsOfDivinityMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> FIRESUMMON = REGISTRY.register("firesummon", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("dreams_of_divinity", "firesummon")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FIREEXPLODE = REGISTRY.register("fireexplode", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("dreams_of_divinity", "fireexplode")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FIRECRACKLE = REGISTRY.register("firecrackle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("dreams_of_divinity", "firecrackle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MAGICCIRCLE = REGISTRY.register("magiccircle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("dreams_of_divinity", "magiccircle")));
}