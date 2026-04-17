/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.forger.dreamsofdivinity.block.entity.SpiritForgeBlockEntity;
import net.forger.dreamsofdivinity.block.entity.InscriptionblockBlockEntity;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DreamsOfDivinityModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DreamsOfDivinityMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<InscriptionblockBlockEntity>> INSCRIPTIONBLOCK = register("inscriptionblock", DreamsOfDivinityModBlocks.INSCRIPTIONBLOCK, InscriptionblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SpiritForgeBlockEntity>> SPIRIT_FORGE = register("spirit_forge", DreamsOfDivinityModBlocks.SPIRIT_FORGE, SpiritForgeBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, INSCRIPTIONBLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SPIRIT_FORGE.get(), SidedInvWrapper::new);
	}
}