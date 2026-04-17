package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetSpiritPowerProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.maxmana = DoubleArgumentType.getDouble(arguments, "spiritualpower");
			_vars.syncPlayerVariables(entity);
		}
	}
}