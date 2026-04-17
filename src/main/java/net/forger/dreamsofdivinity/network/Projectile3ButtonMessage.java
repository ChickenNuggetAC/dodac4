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
import net.forger.dreamsofdivinity.procedures.Projectile4ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.Projectile2ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplayUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplayDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDurationUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDurationDownProcedure;
import net.forger.dreamsofdivinity.procedures.BloodlustUpProcedure;
import net.forger.dreamsofdivinity.procedures.BloodlustDownProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record Projectile3ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<Projectile3ButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "projectile_3_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, Projectile3ButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Projectile3ButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new Projectile3ButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<Projectile3ButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final Projectile3ButtonMessage message, final IPayloadContext context) {
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

			BloodlustUpProcedure.execute(entity);
		}
		if (buttonID == 2) {

			BloodlustDownProcedure.execute(entity);
		}
		if (buttonID == 3) {

			Projectile4ButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Projectile2ButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			MagicFollowOrientationDisplayDownProcedure.execute(entity);
		}
		if (buttonID == 6) {

			MagicFollowOrientationDisplayUpProcedure.execute(entity);
		}
		if (buttonID == 7) {

			MagicDurationDownProcedure.execute(entity);
		}
		if (buttonID == 8) {

			MagicDurationUpProcedure.execute(entity);
		}
		if (buttonID == 9) {

			SelectionMultiplierUpProcedure.execute(entity);
		}
		if (buttonID == 10) {

			SelectionMultiplierDownProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(Projectile3ButtonMessage.TYPE, Projectile3ButtonMessage.STREAM_CODEC, Projectile3ButtonMessage::handleData);
	}
}