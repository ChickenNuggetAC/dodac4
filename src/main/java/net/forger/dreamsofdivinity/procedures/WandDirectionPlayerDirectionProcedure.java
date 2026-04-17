package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModItems;

public class WandDirectionPlayerDirectionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DreamsOfDivinityModItems.BLOCK_INSCRIBING_WAND.get()) {
			{
				final String _tagName = "wanddirection";
				final double _tagValue = 2;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
	}
}