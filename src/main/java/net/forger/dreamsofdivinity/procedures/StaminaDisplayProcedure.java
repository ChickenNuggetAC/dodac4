package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

public class StaminaDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (new java.text.DecimalFormat("##.##").format(
				entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST) ? _livingEntity0.getAttribute(DreamsOfDivinityModAttributes.CURRENT_BOOST).getBaseValue() : 0))
				+ ""
				+ ("/" + (new java.text.DecimalFormat("##.##").format(entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT)
						? _livingEntity1.getAttribute(DreamsOfDivinityModAttributes.BOOST_AMOUNT).getBaseValue()
						: 0)));
	}
}