/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class DreamsOfDivinityModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, DreamsOfDivinityMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FLAME_2 = REGISTRY.register("flame_2", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FLAME_3 = REGISTRY.register("flame_3", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SMOKE = REGISTRY.register("smoke", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> EMBER = REGISTRY.register("ember", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FLAME_22 = REGISTRY.register("flame_22", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FLAME_32 = REGISTRY.register("flame_32", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SMOKE_2 = REGISTRY.register("smoke_2", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> WATER_MAGIC = REGISTRY.register("water_magic", () -> new SimpleParticleType(false));
}