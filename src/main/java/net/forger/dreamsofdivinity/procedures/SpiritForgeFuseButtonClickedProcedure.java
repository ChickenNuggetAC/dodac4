package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class SpiritForgeFuseButtonClickedProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		MutableComponent spellcoloritem = Component.empty();
		{
			DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
			_vars.MagicCost = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY)
					.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")
					+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed") * 0.35
					+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize") * 0.35
					+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("piercing") * 0.25
					+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("tracking") * 0.25
					+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("multicast") * 0.25
					+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("areacoverage") * 0.25
					+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("guidedmagic") * 0.2)
					* 1.3333;
			_vars.syncPlayerVariables(entity);
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana >= entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost) {
			if (getAmountInGUISlot(entity, 2) == 0) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.mana = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).mana - entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicCost;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu) {
					ItemStack _setstack = (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				SpiritForgeApplyFusedSPellToResultProcedure.execute(world, x, y, z);
				{
					final String _tagName = "magicpower";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower") * 0.25);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "magicspeed";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicspeed") * 0.6667);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "magicsize";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize") * 0.6667);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "piercing";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("piercing") * 0.6667);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu33 ? _menu33.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "tracking";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu35 ? _menu35.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("tracking") * 0.6667);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu37 ? _menu37.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "multicast";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu39 ? _menu39.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("multicast") * 0.6667);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu41 ? _menu41.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "areacoverage";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu43 ? _menu43.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("areacoverage") * 0.6667);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu45 ? _menu45.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "guidedmagic";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu47 ? _menu47.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("guidedmagic") * 0.6667);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu49 ? _menu49.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "magicstyle";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu51 ? _menu51.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicstyle"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu53 ? _menu53.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "immunity";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu55 ? _menu55.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("immunity"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu57 ? _menu57.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "overheat";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu59 ? _menu59.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("overheat"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu61 ? _menu61.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "magicshape";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu63 ? _menu63.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicshape"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu65 ? _menu65.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "keypressed";
					final double _tagValue = 1;
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu67 ? _menu67.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "magicfollow";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu69 ? _menu69.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicfollow"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu71 ? _menu71.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "magicduration";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu73 ? _menu73.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicduration"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu75 ? _menu75.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "magicdirection";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu77 ? _menu77.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicdirection"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu79 ? _menu79.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "castingoffset";
					final double _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu81 ? _menu81.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("castingoffset"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu83 ? _menu83.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "spellname";
					final String _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu85 ? _menu85.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("spellname"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu87 ? _menu87.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putString(_tagName, _tagValue));
				}
				{
					final String _tagName = "fire";
					final boolean _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu89 ? _menu89.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu91 ? _menu91.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putBoolean(_tagName, _tagValue));
				}
				{
					final String _tagName = "water";
					final boolean _tagValue = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu93 ? _menu93.getSlots().get(1).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water"));
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu95 ? _menu95.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putBoolean(_tagName, _tagValue));
				}
				{
					final String _tagName = "dod_has_fused_spell";
					final boolean _tagValue = true;
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu97 ? _menu97.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putBoolean(_tagName, _tagValue));
				}
				spellcoloritem = Component.literal(((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu99 ? _menu99.getSlots().get(2).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("spellname"))).withColor((255 << 24 | 255 << 16 | 0 << 8 | 0));
				{
					final String _tagName = "dod_fused_spell_name";
					final String _tagValue = spellcoloritem.getString();
					CustomData.update(DataComponents.CUSTOM_DATA,
							(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu105 ? _menu105.getSlots().get(2).getItem() : ItemStack.EMPTY),
							tag -> tag.putString(_tagName, _tagValue));
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				int horizontalRadiusSquare = (int) 10 - 1;
				int verticalRadiusSquare = (int) 10 - 1;
				int yIterationsSquare = verticalRadiusSquare;
				for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
					for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
						for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
							// Execute the desired statements within the square/cube
							if (getBlockNBTNumber(world, BlockPos.containing(x + xi, y + i, z + zi), "blockopened") == entity.getPersistentData().getDouble("blockopened")) {
								{
									int _value = 1;
									BlockPos _pos = BlockPos.containing(x + xi, y + i, z + zi);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("animations") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
										world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
								}
								if (world instanceof ServerLevel _level) {
									int X = (int) x + xi;
									int Y = (int) y + i;
									int Z = (int) z + zi;
									String command = "photon fx photon:" + "spiritforgeparticle" + " block " + X + " " + Y + " " + Z + " " + 0 + " " + 0.5 + " " + 0 + " 0 0 0 1 1 1 " + (int) 0 + " " + false + " " + false;
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X, Y, Z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
								}
							}
						}
					}
				}
				DreamsOfDivinityMod.queueServerWork(80, () -> {
					CallItemSpiritForgeProcedure.execute(world, x, y, z, entity);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Spell fused successfully."), false);
				});
			} else {
				return true;
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Not enough spiritual power to fuse this spell."), false);
		}
		return false;
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof DreamsOfDivinityModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDouble(tag);
		return -1;
	}
}