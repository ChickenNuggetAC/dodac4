/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.forger.dreamsofdivinity.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.forger.dreamsofdivinity.network.SkillKey6Message;
import net.forger.dreamsofdivinity.network.SkillKey5Message;
import net.forger.dreamsofdivinity.network.SkillKey4Message;
import net.forger.dreamsofdivinity.network.SkillKey3Message;
import net.forger.dreamsofdivinity.network.SkillKey2Message;
import net.forger.dreamsofdivinity.network.SkillKey1Message;
import net.forger.dreamsofdivinity.network.OpenSkillMenuMessage;
import net.forger.dreamsofdivinity.network.MovementUpMessage;
import net.forger.dreamsofdivinity.network.MovementRightMessage;
import net.forger.dreamsofdivinity.network.MovementLeftMessage;
import net.forger.dreamsofdivinity.network.MovementForwardMessage;
import net.forger.dreamsofdivinity.network.MovementBackwardMessage;
import net.forger.dreamsofdivinity.network.AutoSprintMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DreamsOfDivinityModKeyMappings {
	public static final KeyMapping OPEN_SKILL_MENU = new KeyMapping("key.dreams_of_divinity.open_skill_menu", GLFW.GLFW_KEY_U, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new OpenSkillMenuMessage(0, 0));
				OpenSkillMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping AUTO_SPRINT = new KeyMapping("key.dreams_of_divinity.auto_sprint", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				AUTO_SPRINT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - AUTO_SPRINT_LASTPRESS);
				PacketDistributor.sendToServer(new AutoSprintMessage(1, dt));
				AutoSprintMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKILL_KEY_1 = new KeyMapping("key.dreams_of_divinity.skill_key_1", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SkillKey1Message(0, 0));
				SkillKey1Message.pressAction(Minecraft.getInstance().player, 0, 0);
				SKILL_KEY_1_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SKILL_KEY_1_LASTPRESS);
				PacketDistributor.sendToServer(new SkillKey1Message(1, dt));
				SkillKey1Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKILL_KEY_2 = new KeyMapping("key.dreams_of_divinity.skill_key_2", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SkillKey2Message(0, 0));
				SkillKey2Message.pressAction(Minecraft.getInstance().player, 0, 0);
				SKILL_KEY_2_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SKILL_KEY_2_LASTPRESS);
				PacketDistributor.sendToServer(new SkillKey2Message(1, dt));
				SkillKey2Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKILL_KEY_3 = new KeyMapping("key.dreams_of_divinity.skill_key_3", GLFW.GLFW_KEY_B, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SkillKey3Message(0, 0));
				SkillKey3Message.pressAction(Minecraft.getInstance().player, 0, 0);
				SKILL_KEY_3_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SKILL_KEY_3_LASTPRESS);
				PacketDistributor.sendToServer(new SkillKey3Message(1, dt));
				SkillKey3Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKILL_KEY_4 = new KeyMapping("key.dreams_of_divinity.skill_key_4", GLFW.GLFW_KEY_H, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SkillKey4Message(0, 0));
				SkillKey4Message.pressAction(Minecraft.getInstance().player, 0, 0);
				SKILL_KEY_4_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SKILL_KEY_4_LASTPRESS);
				PacketDistributor.sendToServer(new SkillKey4Message(1, dt));
				SkillKey4Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKILL_KEY_5 = new KeyMapping("key.dreams_of_divinity.skill_key_5", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SkillKey5Message(0, 0));
				SkillKey5Message.pressAction(Minecraft.getInstance().player, 0, 0);
				SKILL_KEY_5_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SKILL_KEY_5_LASTPRESS);
				PacketDistributor.sendToServer(new SkillKey5Message(1, dt));
				SkillKey5Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKILL_KEY_6 = new KeyMapping("key.dreams_of_divinity.skill_key_6", GLFW.GLFW_KEY_Q, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SkillKey6Message(0, 0));
				SkillKey6Message.pressAction(Minecraft.getInstance().player, 0, 0);
				SKILL_KEY_6_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SKILL_KEY_6_LASTPRESS);
				PacketDistributor.sendToServer(new SkillKey6Message(1, dt));
				SkillKey6Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MOVEMENT_FORWARD = new KeyMapping("key.dreams_of_divinity.movement_forward", GLFW.GLFW_KEY_W, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new MovementForwardMessage(0, 0));
				MovementForwardMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MOVEMENT_FORWARD_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MOVEMENT_FORWARD_LASTPRESS);
				PacketDistributor.sendToServer(new MovementForwardMessage(1, dt));
				MovementForwardMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MOVEMENT_LEFT = new KeyMapping("key.dreams_of_divinity.movement_left", GLFW.GLFW_KEY_A, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new MovementLeftMessage(0, 0));
				MovementLeftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MOVEMENT_LEFT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MOVEMENT_LEFT_LASTPRESS);
				PacketDistributor.sendToServer(new MovementLeftMessage(1, dt));
				MovementLeftMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MOVEMENT_RIGHT = new KeyMapping("key.dreams_of_divinity.movement_right", GLFW.GLFW_KEY_D, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new MovementRightMessage(0, 0));
				MovementRightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MOVEMENT_RIGHT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MOVEMENT_RIGHT_LASTPRESS);
				PacketDistributor.sendToServer(new MovementRightMessage(1, dt));
				MovementRightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MOVEMENT_BACKWARD = new KeyMapping("key.dreams_of_divinity.movement_backward", GLFW.GLFW_KEY_S, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new MovementBackwardMessage(0, 0));
				MovementBackwardMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MOVEMENT_BACKWARD_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MOVEMENT_BACKWARD_LASTPRESS);
				PacketDistributor.sendToServer(new MovementBackwardMessage(1, dt));
				MovementBackwardMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MOVEMENT_UP = new KeyMapping("key.dreams_of_divinity.movement_up", GLFW.GLFW_KEY_SPACE, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new MovementUpMessage(0, 0));
				MovementUpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MOVEMENT_UP_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MOVEMENT_UP_LASTPRESS);
				PacketDistributor.sendToServer(new MovementUpMessage(1, dt));
				MovementUpMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long AUTO_SPRINT_LASTPRESS = 0;
	private static long SKILL_KEY_1_LASTPRESS = 0;
	private static long SKILL_KEY_2_LASTPRESS = 0;
	private static long SKILL_KEY_3_LASTPRESS = 0;
	private static long SKILL_KEY_4_LASTPRESS = 0;
	private static long SKILL_KEY_5_LASTPRESS = 0;
	private static long SKILL_KEY_6_LASTPRESS = 0;
	private static long MOVEMENT_FORWARD_LASTPRESS = 0;
	private static long MOVEMENT_LEFT_LASTPRESS = 0;
	private static long MOVEMENT_RIGHT_LASTPRESS = 0;
	private static long MOVEMENT_BACKWARD_LASTPRESS = 0;
	private static long MOVEMENT_UP_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPEN_SKILL_MENU);
		event.register(AUTO_SPRINT);
		event.register(SKILL_KEY_1);
		event.register(SKILL_KEY_2);
		event.register(SKILL_KEY_3);
		event.register(SKILL_KEY_4);
		event.register(SKILL_KEY_5);
		event.register(SKILL_KEY_6);
		event.register(MOVEMENT_FORWARD);
		event.register(MOVEMENT_LEFT);
		event.register(MOVEMENT_RIGHT);
		event.register(MOVEMENT_BACKWARD);
		event.register(MOVEMENT_UP);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				OPEN_SKILL_MENU.consumeClick();
				AUTO_SPRINT.consumeClick();
				SKILL_KEY_1.consumeClick();
				SKILL_KEY_2.consumeClick();
				SKILL_KEY_3.consumeClick();
				SKILL_KEY_4.consumeClick();
				SKILL_KEY_5.consumeClick();
				SKILL_KEY_6.consumeClick();
				MOVEMENT_FORWARD.consumeClick();
				MOVEMENT_LEFT.consumeClick();
				MOVEMENT_RIGHT.consumeClick();
				MOVEMENT_BACKWARD.consumeClick();
				MOVEMENT_UP.consumeClick();
			}
		}
	}
}