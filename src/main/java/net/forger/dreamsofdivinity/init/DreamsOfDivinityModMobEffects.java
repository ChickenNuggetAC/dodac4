/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.forger.dreamsofdivinity.potion.FireMobEffect;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class DreamsOfDivinityModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, DreamsOfDivinityMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> FIRE = REGISTRY.register("fire", () -> new FireMobEffect());
}