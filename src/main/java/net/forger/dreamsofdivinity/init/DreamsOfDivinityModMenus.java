/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.forger.dreamsofdivinity.world.inventory.SpiritStoneGuiMenu;
import net.forger.dreamsofdivinity.world.inventory.SpiritForgeGUIMenu;
import net.forger.dreamsofdivinity.world.inventory.SpellEditMenuMenu;
import net.forger.dreamsofdivinity.world.inventory.SpellEditMenu2Menu;
import net.forger.dreamsofdivinity.world.inventory.Projectile4Menu;
import net.forger.dreamsofdivinity.world.inventory.Projectile3Menu;
import net.forger.dreamsofdivinity.world.inventory.Projectile2Menu;
import net.forger.dreamsofdivinity.world.inventory.Projectile1Menu;
import net.forger.dreamsofdivinity.world.inventory.PartySettingsMenu;
import net.forger.dreamsofdivinity.world.inventory.MagicSelection1Menu;
import net.forger.dreamsofdivinity.world.inventory.Magic1Menu;
import net.forger.dreamsofdivinity.world.inventory.KeybindSelectMenu;
import net.forger.dreamsofdivinity.world.inventory.BlockInscriptionWandGUIMenu;
import net.forger.dreamsofdivinity.world.inventory.BlockInscriptionWandGUI2Menu;
import net.forger.dreamsofdivinity.network.MenuStateUpdateMessage;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

import java.util.Map;

public class DreamsOfDivinityModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, DreamsOfDivinityMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MagicSelection1Menu>> MAGIC_SELECTION_1 = REGISTRY.register("magic_selection_1", () -> IMenuTypeExtension.create(MagicSelection1Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KeybindSelectMenu>> KEYBIND_SELECT = REGISTRY.register("keybind_select", () -> IMenuTypeExtension.create(KeybindSelectMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Magic1Menu>> MAGIC_1 = REGISTRY.register("magic_1", () -> IMenuTypeExtension.create(Magic1Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Projectile1Menu>> PROJECTILE_1 = REGISTRY.register("projectile_1", () -> IMenuTypeExtension.create(Projectile1Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Projectile2Menu>> PROJECTILE_2 = REGISTRY.register("projectile_2", () -> IMenuTypeExtension.create(Projectile2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Projectile3Menu>> PROJECTILE_3 = REGISTRY.register("projectile_3", () -> IMenuTypeExtension.create(Projectile3Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Projectile4Menu>> PROJECTILE_4 = REGISTRY.register("projectile_4", () -> IMenuTypeExtension.create(Projectile4Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SpellEditMenuMenu>> SPELL_EDIT_MENU = REGISTRY.register("spell_edit_menu", () -> IMenuTypeExtension.create(SpellEditMenuMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SpellEditMenu2Menu>> SPELL_EDIT_MENU_2 = REGISTRY.register("spell_edit_menu_2", () -> IMenuTypeExtension.create(SpellEditMenu2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PartySettingsMenu>> PARTY_SETTINGS = REGISTRY.register("party_settings", () -> IMenuTypeExtension.create(PartySettingsMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BlockInscriptionWandGUIMenu>> BLOCK_INSCRIPTION_WAND_GUI = REGISTRY.register("block_inscription_wand_gui", () -> IMenuTypeExtension.create(BlockInscriptionWandGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BlockInscriptionWandGUI2Menu>> BLOCK_INSCRIPTION_WAND_GUI_2 = REGISTRY.register("block_inscription_wand_gui_2", () -> IMenuTypeExtension.create(BlockInscriptionWandGUI2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SpiritStoneGuiMenu>> SPIRIT_STONE_GUI = REGISTRY.register("spirit_stone_gui", () -> IMenuTypeExtension.create(SpiritStoneGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SpiritForgeGUIMenu>> SPIRIT_FORGE_GUI = REGISTRY.register("spirit_forge_gui", () -> IMenuTypeExtension.create(SpiritForgeGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof DreamsOfDivinityModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}