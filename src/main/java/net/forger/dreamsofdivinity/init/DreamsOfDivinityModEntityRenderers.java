/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.forger.dreamsofdivinity.client.renderer.InscriptionSpellEntityRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DreamsOfDivinityModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DreamsOfDivinityModEntities.SKILL_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DreamsOfDivinityModEntities.ATTACK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DreamsOfDivinityModEntities.BENDING.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DreamsOfDivinityModEntities.ITEMSKILL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DreamsOfDivinityModEntities.INSCRIPTION_SPELL_ENTITY.get(), InscriptionSpellEntityRenderer::new);
	}
}