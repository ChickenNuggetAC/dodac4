package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.world.inventory.SpellEditMenuMenu;
import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MagicNameSetProcedure {
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
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof SpellEditMenuMenu && entity.getPersistentData().getDouble("saveloadname1") == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
					_menu.sendMenuStateUpdate(_player, 0, "spellname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname1, true);
				entity.getPersistentData().putDouble("saveloadname1", 1);
			} else if (!(entity instanceof Player _plr4 && _plr4.containerMenu instanceof SpellEditMenuMenu) && entity.getPersistentData().getDouble("saveloadname1") == 1) {
				entity.getPersistentData().putDouble("saveloadname1", 0);
			}
			if (entity.getPersistentData().getDouble("saveloadname1") == 1) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicname1 = (entity instanceof Player _entity8 && _entity8.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu8) ? _menu8.getMenuState(0, "spellname", "") : "";
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
			if (entity instanceof Player _plr9 && _plr9.containerMenu instanceof SpellEditMenuMenu && entity.getPersistentData().getDouble("saveloadname2") == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
					_menu.sendMenuStateUpdate(_player, 0, "spellname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname2, true);
				entity.getPersistentData().putDouble("saveloadname2", 1);
			} else if (!(entity instanceof Player _plr13 && _plr13.containerMenu instanceof SpellEditMenuMenu) && entity.getPersistentData().getDouble("saveloadname2") == 1) {
				entity.getPersistentData().putDouble("saveloadname2", 0);
			}
			if (entity.getPersistentData().getDouble("saveloadname2") == 1) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicname2 = (entity instanceof Player _entity17 && _entity17.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu17) ? _menu17.getMenuState(0, "spellname", "") : "";
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
			if (entity instanceof Player _plr18 && _plr18.containerMenu instanceof SpellEditMenuMenu && entity.getPersistentData().getDouble("saveloadname3") == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
					_menu.sendMenuStateUpdate(_player, 0, "spellname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname3, true);
				entity.getPersistentData().putDouble("saveloadname3", 1);
			} else if (!(entity instanceof Player _plr22 && _plr22.containerMenu instanceof SpellEditMenuMenu) && entity.getPersistentData().getDouble("saveloadname3") == 1) {
				if (entity.getPersistentData().getDouble("saveloadname3") == 1) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.magicname3 = (entity instanceof Player _entity25 && _entity25.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu25) ? _menu25.getMenuState(0, "spellname", "") : "";
						_vars.syncPlayerVariables(entity);
					}
				}
				entity.getPersistentData().putDouble("saveloadname3", 0);
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
			if (entity instanceof Player _plr27 && _plr27.containerMenu instanceof SpellEditMenuMenu && entity.getPersistentData().getDouble("saveloadname4") == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
					_menu.sendMenuStateUpdate(_player, 0, "spellname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname4, true);
				entity.getPersistentData().putDouble("saveloadname4", 1);
			} else if (!(entity instanceof Player _plr31 && _plr31.containerMenu instanceof SpellEditMenuMenu) && entity.getPersistentData().getDouble("saveloadname4") == 1) {
				entity.getPersistentData().putDouble("saveloadname4", 0);
			}
			if (entity.getPersistentData().getDouble("saveloadname4") == 1) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicname4 = (entity instanceof Player _entity35 && _entity35.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu35) ? _menu35.getMenuState(0, "spellname", "") : "";
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
			if (entity instanceof Player _plr36 && _plr36.containerMenu instanceof SpellEditMenuMenu && entity.getPersistentData().getDouble("saveloadname5") == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
					_menu.sendMenuStateUpdate(_player, 0, "spellname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname5, true);
				entity.getPersistentData().putDouble("saveloadname5", 1);
			} else if (!(entity instanceof Player _plr40 && _plr40.containerMenu instanceof SpellEditMenuMenu) && entity.getPersistentData().getDouble("saveloadname5") == 1) {
				entity.getPersistentData().putDouble("saveloadname5", 0);
			}
			if (entity.getPersistentData().getDouble("saveloadname5") == 1) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicname5 = (entity instanceof Player _entity44 && _entity44.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu44) ? _menu44.getMenuState(0, "spellname", "") : "";
					_vars.syncPlayerVariables(entity);
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
			if (entity instanceof Player _plr45 && _plr45.containerMenu instanceof SpellEditMenuMenu && entity.getPersistentData().getDouble("saveloadname6") == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
					_menu.sendMenuStateUpdate(_player, 0, "spellname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname6, true);
				entity.getPersistentData().putDouble("saveloadname6", 1);
			} else if (!(entity instanceof Player _plr49 && _plr49.containerMenu instanceof SpellEditMenuMenu) && entity.getPersistentData().getDouble("saveloadname6") == 1) {
				entity.getPersistentData().putDouble("saveloadname6", 0);
			}
			if (entity.getPersistentData().getDouble("saveloadname6") == 1) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicname6 = (entity instanceof Player _entity53 && _entity53.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu53) ? _menu53.getMenuState(0, "spellname", "") : "";
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}