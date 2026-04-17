package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class CastingOffsetProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("castingoffset", (DoubleArgumentType.getDouble(arguments, "castingOffset")));
	}
}