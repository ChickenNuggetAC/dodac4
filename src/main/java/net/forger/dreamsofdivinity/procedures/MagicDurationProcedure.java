package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class MagicDurationProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "magicDuration") == 0) {
			entity.getPersistentData().putDouble("magicduration", (DoubleArgumentType.getDouble(arguments, "magicDuration")));
		} else {
			entity.getPersistentData().putDouble("magicduration", 1);
		}
	}
}