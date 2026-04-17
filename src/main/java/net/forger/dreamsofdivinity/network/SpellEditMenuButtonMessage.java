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

import net.forger.dreamsofdivinity.procedures.Projectile2ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSpeedUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSpeedDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSizeUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicSizeDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicShapeDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicPowerUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicPowerDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicPiercingUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicPiercingDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicDirectionDownProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCooldownUpProcedure;
import net.forger.dreamsofdivinity.procedures.MagicCooldownDownProcedure;
import net.forger.dreamsofdivinity.procedures.Magic1ButtonProcedure;
import net.forger.dreamsofdivinity.procedures.CastingOffsetUpProcedure;
import net.forger.dreamsofdivinity.procedures.CastingOffsetDownProcedure;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record SpellEditMenuButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<SpellEditMenuButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(DreamsOfDivinityMod.MODID, "spell_edit_menu_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SpellEditMenuButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SpellEditMenuButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SpellEditMenuButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<SpellEditMenuButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SpellEditMenuButtonMessage message, final IPayloadContext context) {
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

			Magic1ButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MagicDirectionDownProcedure.execute(entity);
		}
		if (buttonID == 2) {

			MagicDirectionUpProcedure.execute(entity);
		}
		if (buttonID == 3) {

			MagicSpeedDownProcedure.execute(entity);
		}
		if (buttonID == 4) {

			MagicSpeedUpProcedure.execute(entity);
		}
		if (buttonID == 5) {

			MagicPowerDownProcedure.execute(entity);
		}
		if (buttonID == 6) {

			MagicPowerUpProcedure.execute(entity);
		}
		if (buttonID == 7) {

			MagicCooldownDownProcedure.execute(entity);
		}
		if (buttonID == 8) {

			MagicCooldownUpProcedure.execute(entity);
		}
		if (buttonID == 9) {

			CastingOffsetDownProcedure.execute(entity);
		}
		if (buttonID == 10) {

			CastingOffsetUpProcedure.execute(entity);
		}
		if (buttonID == 11) {

			MagicSizeDownProcedure.execute(entity);
		}
		if (buttonID == 12) {

			MagicSizeUpProcedure.execute(entity);
		}
		if (buttonID == 13) {

			MagicShapeDownProcedure.execute(entity);
		}
		if (buttonID == 14) {

			MagicShapeUpProcedure.execute(entity);
		}
		if (buttonID == 15) {

			MagicPiercingDownProcedure.execute(entity);
		}
		if (buttonID == 16) {

			MagicPiercingUpProcedure.execute(entity);
		}
		if (buttonID == 17) {

			Projectile2ButtonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DreamsOfDivinityMod.addNetworkMessage(SpellEditMenuButtonMessage.TYPE, SpellEditMenuButtonMessage.STREAM_CODEC, SpellEditMenuButtonMessage::handleData);
	}
}