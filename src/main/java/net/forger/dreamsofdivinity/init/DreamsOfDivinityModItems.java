/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.forger.dreamsofdivinity.item.SpiritFusionStoneItem;
import net.forger.dreamsofdivinity.item.MagicswordItem;
import net.forger.dreamsofdivinity.item.MagicSphereItem;
import net.forger.dreamsofdivinity.item.MagicCircleFireItem;
import net.forger.dreamsofdivinity.item.BlockInscribingWandItem;
import net.forger.dreamsofdivinity.item.ArrowItem;
import net.forger.dreamsofdivinity.item.ArmorFireItem;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class DreamsOfDivinityModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DreamsOfDivinityMod.MODID);
	public static final DeferredItem<Item> MAGICSWORD = REGISTRY.register("magicsword", MagicswordItem::new);
	public static final DeferredItem<Item> MAGIC_CIRCLE_FIRE = REGISTRY.register("magic_circle_fire", MagicCircleFireItem::new);
	public static final DeferredItem<Item> ARMOR_FIRE = REGISTRY.register("armor_fire", ArmorFireItem::new);
	public static final DeferredItem<Item> MAGIC_SPHERE = REGISTRY.register("magic_sphere", MagicSphereItem::new);
	public static final DeferredItem<Item> ARROW = REGISTRY.register("arrow", ArrowItem::new);
	public static final DeferredItem<Item> BLOCK_INSCRIBING_WAND = REGISTRY.register("block_inscribing_wand", BlockInscribingWandItem::new);
	public static final DeferredItem<Item> INSCRIPTIONBLOCK = block(DreamsOfDivinityModBlocks.INSCRIPTIONBLOCK);
	public static final DeferredItem<Item> INSCRIPTION_SPELL_ENTITY_SPAWN_EGG = REGISTRY.register("inscription_spell_entity_spawn_egg",
			() -> new DeferredSpawnEggItem(DreamsOfDivinityModEntities.INSCRIPTION_SPELL_ENTITY, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SPIRIT_FORGE = block(DreamsOfDivinityModBlocks.SPIRIT_FORGE);
	public static final DeferredItem<Item> SPIRIT_FUSION_STONE = REGISTRY.register("spirit_fusion_stone", SpiritFusionStoneItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}