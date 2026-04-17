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

import net.forger.dreamsofdivinity.procedures.Next1ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastUpProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastDownProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastAreaCoverageUpProcedure;
import net.forger.dreamsofdivinity.procedures.MultiCastAreaCoverageDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplayUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicFollowOrientationDisplayDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDurationUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDurationDownProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOnProcedure;
import net.forger.dreamsofdivinity.procedures.GuidedMagicOffProcedure;
import net.forger.dreamsofdivinity.procedures.BloodlustUpProcedure;
import net.forger.dreamsofdivinity.procedures.BloodlustDownProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record SpellEditMenu2ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<SpellEditMenu2ButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "spell_edit_menu_2_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SpellEditMenu2ButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SpellEditMenu2ButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SpellEditMenu2ButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<SpellEditMenu2ButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SpellEditMenu2ButtonMessage message, final IPayloadContext context) {
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

			GuidedMagicOnProcedure.execute(entity);
		}
		if (buttonID == 1) {

			GuidedMagicOffProcedure.execute(entity);
		}
		if (buttonID == 2) {

			Next1ButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			MagicFollowOrientationDisplayDownProcedure.execute(entity);
		}
		if (buttonID == 4) {

			MagicFollowOrientationDisplayUpProcedure.execute(entity);
		}
		if (buttonID == 5) {

			MagicDurationDownProcedure.execute(entity);
		}
		if (buttonID == 6) {

			MagicDurationUpProcedure.execute(entity);
		}
		if (buttonID == 7) {

			BloodlustDownProcedure.execute(entity);
		}
		if (buttonID == 8) {

			BloodlustUpProcedure.execute(entity);
		}
		if (buttonID == 9) {

			MultiCastDownProcedure.execute(entity);
		}
		if (buttonID == 10) {

			MultiCastUpProcedure.execute(entity);
		}
		if (buttonID == 11) {

			MultiCastAreaCoverageDownProcedure.execute(entity);
		}
		if (buttonID == 12) {

			MultiCastAreaCoverageUpProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(SpellEditMenu2ButtonMessage.TYPE, SpellEditMenu2ButtonMessage.STREAM_CODEC, SpellEditMenu2ButtonMessage::handleData);
	}
}