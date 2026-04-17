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

import net.forger.dreamsofdivinity.procedures.PartyDeclineProcedure;
import net.forger.dreamsofdivinity.procedures.PartyAcceptProcedure;
import net.forger.dreamsofdivinity.procedures.OpenPartySettingsProcedure;
import net.forger.dreamsofdivinity.procedures.LeavePartyProcedure;
import net.forger.dreamsofdivinity.procedures.Keybind6Procedure;
import net.forger.dreamsofdivinity.procedures.Keybind5Procedure;
import net.forger.dreamsofdivinity.procedures.Keybind4Procedure;
import net.forger.dreamsofdivinity.procedures.Keybind3Procedure;
import net.forger.dreamsofdivinity.procedures.Keybind2Procedure;
import net.forger.dreamsofdivinity.procedures.Keybind1Procedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record KeybindSelectButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<KeybindSelectButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "keybind_select_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, KeybindSelectButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, KeybindSelectButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new KeybindSelectButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<KeybindSelectButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final KeybindSelectButtonMessage message, final IPayloadContext context) {
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

			Keybind1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Keybind2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Keybind3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Keybind4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Keybind5Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			Keybind6Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			PartyAcceptProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			PartyDeclineProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			LeavePartyProcedure.execute(world, entity);
		}
		if (buttonID == 9) {

			OpenPartySettingsProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(KeybindSelectButtonMessage.TYPE, KeybindSelectButtonMessage.STREAM_CODEC, KeybindSelectButtonMessage::handleData);
	}
}