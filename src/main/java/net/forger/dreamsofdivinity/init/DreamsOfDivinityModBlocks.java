/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.forger.dreamsofdivinity.block.SpiritForgeBlock;
import net.forger.dreamsofdivinity.block.InscriptionblockBlock;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

public class DreamsOfDivinityModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DreamsOfDivinityMod.MODID);
	public static final DeferredBlock<Block> INSCRIPTIONBLOCK = REGISTRY.register("inscriptionblock", InscriptionblockBlock::new);
	public static final DeferredBlock<Block> SPIRIT_FORGE = REGISTRY.register("spirit_forge", SpiritForgeBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}