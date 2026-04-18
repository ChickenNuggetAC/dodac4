/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.forger.dreamsofdivinity.client.particle.WaterMagicParticle;
import net.forger.dreamsofdivinity.client.particle.SmokeParticle;
import net.forger.dreamsofdivinity.client.particle.Smoke2Particle;
import net.forger.dreamsofdivinity.client.particle.Flame3Particle;
import net.forger.dreamsofdivinity.client.particle.Flame32Particle;
import net.forger.dreamsofdivinity.client.particle.Flame2Particle;
import net.forger.dreamsofdivinity.client.particle.Flame22Particle;
import net.forger.dreamsofdivinity.client.particle.EmberParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DreamsOfDivinityModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.FLAME_2.get(), Flame2Particle::provider);
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.FLAME_3.get(), Flame3Particle::provider);
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.SMOKE.get(), SmokeParticle::provider);
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.EMBER.get(), EmberParticle::provider);
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.FLAME_22.get(), Flame22Particle::provider);
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.FLAME_32.get(), Flame32Particle::provider);
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.SMOKE_2.get(), Smoke2Particle::provider);
		event.registerSpriteSet(DreamsOfDivinityModParticleTypes.WATER_MAGIC.get(), WaterMagicParticle::provider);
	}
}