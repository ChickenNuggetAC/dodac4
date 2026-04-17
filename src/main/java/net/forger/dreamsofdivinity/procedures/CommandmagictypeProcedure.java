package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class CommandmagictypeProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("magicpower", (DoubleArgumentType.getDouble(arguments, "magicPower")));
		entity.getPersistentData().putDouble("magicspeed", (DoubleArgumentType.getDouble(arguments, "magicSpeed")));
		entity.getPersistentData().putDouble("magicsize", (DoubleArgumentType.getDouble(arguments, "magicSize")));
		entity.getPersistentData().putDouble("piercing", (DoubleArgumentType.getDouble(arguments, "magicPiercing")));
		entity.getPersistentData().putDouble("tracking", (DoubleArgumentType.getDouble(arguments, "magicBloodlust")));
		entity.getPersistentData().putDouble("multicast", (DoubleArgumentType.getDouble(arguments, "multiCast")));
		entity.getPersistentData().putDouble("areacoverage", (DoubleArgumentType.getDouble(arguments, "multiCastArea")));
		entity.getPersistentData().putDouble("areacoverage", (DoubleArgumentType.getDouble(arguments, "multiCastArea")));
		entity.getPersistentData().putDouble("overheat", (DoubleArgumentType.getDouble(arguments, "magicDelay")));
		entity.getPersistentData().putDouble("castingoffset", (DoubleArgumentType.getDouble(arguments, "castingOffset")));
	}
}