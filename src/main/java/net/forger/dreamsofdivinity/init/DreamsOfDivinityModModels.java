/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.forger.dreamsofdivinity.client.model.Modelspiritforge;
import net.forger.dreamsofdivinity.client.model.Modelsphericalitem;
import net.forger.dreamsofdivinity.client.model.Modelmagiccirclefire;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DreamsOfDivinityModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmagiccirclefire.LAYER_LOCATION, Modelmagiccirclefire::createBodyLayer);
		event.registerLayerDefinition(Modelsphericalitem.LAYER_LOCATION, Modelsphericalitem::createBodyLayer);
		event.registerLayerDefinition(Modelspiritforge.LAYER_LOCATION, Modelspiritforge::createBodyLayer);
	}
}