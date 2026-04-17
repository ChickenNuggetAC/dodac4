package net.forger.dreamsofdivinity;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.util.Tuple;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.FriendlyByteBuf;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModTabs;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModSounds;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModParticleTypes;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMobEffects;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMenus;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModItems;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModEntities;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModBlocks;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModBlockEntities;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;

@Mod("dreams_of_divinity")
public class DreamsOfDivinityMod {
	public static final Logger LOGGER = LogManager.getLogger(DreamsOfDivinityMod.class);
	public static final String MODID = "dreams_of_divinity";

	public DreamsOfDivinityMod(IEventBus modEventBus) {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		NeoForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::registerNetworking);
		DreamsOfDivinityModSounds.REGISTRY.register(modEventBus);
		DreamsOfDivinityModBlocks.REGISTRY.register(modEventBus);
		DreamsOfDivinityModBlockEntities.REGISTRY.register(modEventBus);
		DreamsOfDivinityModItems.REGISTRY.register(modEventBus);
		DreamsOfDivinityModEntities.REGISTRY.register(modEventBus);
		DreamsOfDivinityModTabs.REGISTRY.register(modEventBus);
		DreamsOfDivinityModVariables.ATTACHMENT_TYPES.register(modEventBus);

		DreamsOfDivinityModMobEffects.REGISTRY.register(modEventBus);
		DreamsOfDivinityModMenus.REGISTRY.register(modEventBus);
		DreamsOfDivinityModParticleTypes.REGISTRY.register(modEventBus);

		DreamsOfDivinityModAttributes.REGISTRY.register(modEventBus);
		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static boolean networkingRegistered = false;
	private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap<>();

	private record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
	}

	public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
		if (networkingRegistered)
			throw new IllegalStateException("Cannot register new network messages after networking has been registered");
		MESSAGES.put(id, new NetworkMessage<>(reader, handler));
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private void registerNetworking(final RegisterPayloadHandlersEvent event) {
		final PayloadRegistrar registrar = event.registrar(MODID);
		MESSAGES.forEach((id, networkMessage) -> registrar.playBidirectional(id, ((NetworkMessage) networkMessage).reader(), ((NetworkMessage) networkMessage).handler()));
		networkingRegistered = true;
	}

	private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new Tuple<>(action, tick));
	}

	@SubscribeEvent
	public void tick(ServerTickEvent.Post event) {
		List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
		workQueue.forEach(work -> {
			work.setB(work.getB() - 1);
			if (work.getB() == 0)
				actions.add(work);
		});
		actions.forEach(e -> e.getA().run());
		workQueue.removeAll(actions);
	}
}