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

import net.forger.dreamsofdivinity.procedures.WaterClickedProcedure;
import net.forger.dreamsofdivinity.procedures.Magic1ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.KeybindSelectButtonProcedure;
import net.forger.dreamsofdivinity.procedures.FireClickedProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record MagicSelection1ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<MagicSelection1ButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "magic_selection_1_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, MagicSelection1ButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, MagicSelection1ButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new MagicSelection1ButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<MagicSelection1ButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final MagicSelection1ButtonMessage message, final IPayloadContext context) {
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

			WaterClickedProcedure.execute(entity);
		}
		if (buttonID == 1) {

			FireClickedProcedure.execute(entity);
		}
		if (buttonID == 2) {

			Magic1ButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			KeybindSelectButtonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(MagicSelection1ButtonMessage.TYPE, MagicSelection1ButtonMessage.STREAM_CODEC, MagicSelection1ButtonMessage::handleData);
	}
}
