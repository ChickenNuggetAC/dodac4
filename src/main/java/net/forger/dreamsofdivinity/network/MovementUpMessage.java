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

import net.forger.dreamsofdivinity.procedures.MovementUpOnKeyPressedProcedure;
import net.forger.dreamsofdivinity.procedures.MovementForwardOnKeyReleasedProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record MovementUpMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<MovementUpMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "key_movement_up"));
	public static final StreamCodec<RegistryFriendlyByteBuf, MovementUpMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, MovementUpMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new MovementUpMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<MovementUpMessage> type() {
		return TYPE;
	}

	public static void handleData(final MovementUpMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			MovementUpOnKeyPressedProcedure.execute(entity);
		}
		if (type == 1) {

			MovementForwardOnKeyReleasedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(MovementUpMessage.TYPE, MovementUpMessage.STREAM_CODEC, MovementUpMessage::handleData);
	}
}