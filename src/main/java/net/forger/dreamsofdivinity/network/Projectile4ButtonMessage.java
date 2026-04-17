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

import net.forger.dreamsofdivinity.procedures.SelectionMultiplierUpProcedure;
import net.forger.dreamsofdivinity.procedures.SelectionMultiplierResetProcedure;
import net.forger.dreamsofdivinity.procedures.SelectionMultiplierDownProcedure;
import net.forger.dreamsofdivinity.procedures.Projectile3ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.Projectile2ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastUpProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastDownProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastAreaCoverageUpProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastAreaCoverageDownProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOnProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOffProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record Projectile4ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<Projectile4ButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "projectile_4_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, Projectile4ButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Projectile4ButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new Projectile4ButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<Projectile4ButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final Projectile4ButtonMessage message, final IPayloadContext context) {
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

			SelectionMultiplierResetProcedure.execute(entity);
		}
		if (buttonID == 1) {

			GuidedMagicOffProcedure.execute(entity);
		}
		if (buttonID == 2) {

			GuidedMagicOnProcedure.execute(entity);
		}
		if (buttonID == 3) {

			Projectile2ButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Projectile3ButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			MultiCastDownProcedure.execute(entity);
		}
		if (buttonID == 6) {

			MultiCastUpProcedure.execute(entity);
		}
		if (buttonID == 7) {

			SelectionMultiplierUpProcedure.execute(entity);
		}
		if (buttonID == 8) {

			SelectionMultiplierDownProcedure.execute(entity);
		}
		if (buttonID == 9) {

			MultiCastAreaCoverageUpProcedure.execute(entity);
		}
		if (buttonID == 10) {

			MultiCastAreaCoverageDownProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(Projectile4ButtonMessage.TYPE, Projectile4ButtonMessage.STREAM_CODEC, Projectile4ButtonMessage::handleData);
	}
}