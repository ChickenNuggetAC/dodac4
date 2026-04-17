package net.forger.dreamsofdivinity.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.forger.dreamsofdivinity.procedures.InscribeWandKeybind6Procedure;
import net.forger.dreamsofdivinity.procedures.InscribeWandKeybind5Procedure;
import net.forger.dreamsofdivinity.procedures.InscribeWandKeybind4Procedure;
import net.forger.dreamsofdivinity.procedures.InscribeWandKeybind3Procedure;
import net.forger.dreamsofdivinity.procedures.InscribeWandKeybind2Procedure;
import net.forger.dreamsofdivinity.procedures.InscribeWandKeybind1Procedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record SpiritStoneGuiButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<SpiritStoneGuiButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "spirit_stone_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SpiritStoneGuiButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SpiritStoneGuiButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SpiritStoneGuiButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<SpiritStoneGuiButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SpiritStoneGuiButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			InscribeWandKeybind1Procedure.execute(world, entity);
		}
		if (buttonID == 1) {

			InscribeWandKeybind2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			InscribeWandKeybind3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			InscribeWandKeybind4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			InscribeWandKeybind5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			InscribeWandKeybind6Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(SpiritStoneGuiButtonMessage.TYPE, SpiritStoneGuiButtonMessage.STREAM_CODEC, SpiritStoneGuiButtonMessage::handleData);
	}
}