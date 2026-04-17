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

import net.forger.dreamsofdivinity.procedures.SkillKey6OnKeyPressedProcedure;
import net.forger.dreamsofdivinity.procedures.SkillKey1OnKeyReleasedProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record SkillKey6Message(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<SkillKey6Message> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "key_skill_key_6"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SkillKey6Message> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SkillKey6Message message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new SkillKey6Message(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<SkillKey6Message> type() {
		return TYPE;
	}

	public static void handleData(final SkillKey6Message message, final IPayloadContext context) {
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

			SkillKey6OnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
		if (type == 1) {

			SkillKey1OnKeyReleasedProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(SkillKey6Message.TYPE, SkillKey6Message.STREAM_CODEC, SkillKey6Message::handleData);
	}
}