package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;

public class SpiritForgeActivatedPlaybackConditionProcedure {
	public static boolean execute(BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("animations") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 1) {
			return true;
		}
		return false;
	}
}