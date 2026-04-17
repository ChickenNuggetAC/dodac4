package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

public class SpiritForgeApplyFusedSPellToResultProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final String _tagName = "dod_has_fused_spell";
			final boolean _tagValue = true;
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putBoolean(_tagName, _tagValue));
		}
		{
			final String _tagName = "dod_fused_trigger";
			final String _tagValue = "auto";
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putString(_tagName, _tagValue));
		}
		{
			final String _tagName = "dod_fused_spell_category";
			final String _tagValue = "starter";
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putString(_tagName, _tagValue));
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}