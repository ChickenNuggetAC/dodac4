package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.world.inventory.PartySettingsMenu;
import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import javax.annotation.Nullable;

import java.util.ArrayList;

@EventBusSubscriber
public class PartyNameProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String PartiedEntity = "";
		if (!world.isClientSide()) {
			if ((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
					? _livingEntity1.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
					: 0) > 3.5) {
				if (entity instanceof Player _plr2 && _plr2.containerMenu instanceof PartySettingsMenu && entity.getPersistentData().getDouble("saveloadparty") == 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
						_menu.sendMenuStateUpdate(_player, 0, "partyname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).partyname, true);
					entity.getPersistentData().putDouble("saveloadparty", 1);
				} else if (!(entity instanceof Player _plr6 && _plr6.containerMenu instanceof PartySettingsMenu) && entity.getPersistentData().getDouble("saveloadparty") == 1) {
					entity.getPersistentData().putDouble("saveloadparty", 0);
				}
				if (entity.getPersistentData().getDouble("saveloadparty") == 1) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.partyname = (entity instanceof Player _entity10 && _entity10.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(0, "partyname", "") : "";
						_vars.syncPlayerVariables(entity);
					}
				}
			}
			if ((entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
					? _livingEntity11.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
					: 0) < 3.5) {
				if (entity instanceof Player _plr12 && _plr12.containerMenu instanceof PartySettingsMenu && entity.getPersistentData().getDouble("saveloadparty") == 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu)
						_menu.sendMenuStateUpdate(_player, 0, "partyname", entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).partyname, true);
					entity.getPersistentData().putDouble("saveloadparty", 1);
				} else if (!(entity instanceof Player _plr16 && _plr16.containerMenu instanceof PartySettingsMenu) && entity.getPersistentData().getDouble("saveloadparty") == 1) {
					entity.getPersistentData().putDouble("saveloadparty", 0);
				}
				if (entity.getPersistentData().getDouble("saveloadparty") == 1) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if ((entityiterator instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
								? _livingEntity20.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
								: 0) == (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
										? _livingEntity21.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
										: 0)) {
							if ((entityiterator instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
									? _livingEntity22.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
									: 0) > (entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.PARTY_RANK)
											? _livingEntity23.getAttribute(DreamsOfDivinityModAttributes.PARTY_RANK).getBaseValue()
											: 0)) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.partyname = entityiterator.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).partyname;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
	}
}