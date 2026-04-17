package net.forger.dreamsofdivinity.procedures;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.world.inventory.SpellEditMenuMenu;
import net.forger.dreamsofdivinity.world.inventory.SpellEditMenu2Menu;
import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SelectionMultiplierProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr0 && _plr0.containerMenu instanceof SpellEditMenuMenu || entity instanceof Player _plr1 && _plr1.containerMenu instanceof SpellEditMenu2Menu) && entity.getPersistentData().getDouble("saveload") == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "SelectionMultiplier", (new java.text.DecimalFormat("##.##").format(entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).SelectionMultiplier)), true);
			entity.getPersistentData().putDouble("saveload", 1);
		} else if (!(entity instanceof Player _plr5 && _plr5.containerMenu instanceof SpellEditMenuMenu || entity instanceof Player _plr6 && _plr6.containerMenu instanceof SpellEditMenu2Menu)
				&& entity.getPersistentData().getDouble("saveload") == 1) {
			entity.getPersistentData().putDouble("saveload", 0);
		}
		if (entity.getPersistentData().getDouble("saveload") == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.SelectionMultiplier = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity10 && _entity10.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(0, "SelectionMultiplier", "") : "");
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}