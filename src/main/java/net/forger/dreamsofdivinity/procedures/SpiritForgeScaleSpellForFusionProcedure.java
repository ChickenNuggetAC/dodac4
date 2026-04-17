package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

public class SpiritForgeScaleSpellForFusionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final String _tagName = "magicpower";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower") * 0.25);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicspeed";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed") * 0.6667);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicsize";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize") * 0.6667);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "piercing";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("piercing") * 0.6667);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "tracking";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("tracking") * 0.6667);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "multicast";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("multicast") * 0.6667);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "areacoverage";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("areacoverage") * 0.6667);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "guidedmagic";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("guidedmagic") * 0.6667);
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicstyle";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "immunity";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("immunity"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "overheat";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicshape";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicshape"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "keypressed";
			final double _tagValue = 1;
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicfollow";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicfollow"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicduration";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicduration"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicdirection";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicdirection"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "castingoffset";
			final double _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("castingoffset"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "spellname";
			final String _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("spellname"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putString(_tagName, _tagValue));
		}
		{
			final String _tagName = "fire";
			final boolean _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putBoolean(_tagName, _tagValue));
		}
		{
			final String _tagName = "water";
			final boolean _tagValue = ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water"));
			CustomData.update(DataComponents.CUSTOM_DATA, (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()), tag -> tag.putBoolean(_tagName, _tagValue));
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