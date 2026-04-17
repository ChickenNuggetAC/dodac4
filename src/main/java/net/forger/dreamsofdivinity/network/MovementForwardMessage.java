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

import net.forger.dreamsofdivinity.procedures.MovementForwardOnKeyReleasedProcedure;
import net.forger.dreamsofdivinity.procedures.MovementForwardOnKeyPressedProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record MovementForwardMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<MovementForwardMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "key_movement_forward"));
	public static final StreamCodec<RegistryFriendlyByteBuf, MovementForwardMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, MovementForwardMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new MovementForwardMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<MovementForwardMessage> type() {
		return TYPE;
	}

	public static void handleData(final MovementForwardMessage message, final IPayloadContext context) {
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

			MovementForwardOnKeyPressedProcedure.execute(entity);
		}
		if (type == 1) {

			MovementForwardOnKeyReleasedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(MovementForwardMessage.TYPE, MovementForwardMessage.STREAM_CODEC, MovementForwardMessage::handleData);
	}
}