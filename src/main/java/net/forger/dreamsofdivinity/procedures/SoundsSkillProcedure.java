package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

import java.util.Comparator;

public class SoundsSkillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.CHARGEUP) ? _livingEntity0.getAttribute(DreamsOfDivinityModAttributes.CHARGEUP).getBaseValue() : 0) == 1) {
			if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
				if (immediatesourceentity.getPersistentData().getDouble("maxtime1") == 0) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firesummon")), SoundSource.PLAYERS,
									(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firesummon")), SoundSource.PLAYERS,
									(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), 1, false);
						}
					}
				}
			}
			immediatesourceentity.getPersistentData().putDouble("maxtime1", 90);
			if (immediatesourceentity.getPersistentData().getDouble("timer1") < immediatesourceentity.getPersistentData().getDouble("maxtime1")) {
				immediatesourceentity.getPersistentData().putDouble("timer1", (immediatesourceentity.getPersistentData().getDouble("timer1") + 1));
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:magiccircle")), SoundSource.PLAYERS,
								(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:magiccircle")), SoundSource.PLAYERS,
								(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), 1, false);
					}
				}
				immediatesourceentity.getPersistentData().putDouble("timer1", 0);
			}
		}
		if (immediatesourceentity.getPersistentData().getBoolean("fire") == true) {
			if (immediatesourceentity.getPersistentData().getDouble("maxtime2") == 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firecrackle")), SoundSource.PLAYERS,
								(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), (float) (1 - immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firecrackle")), SoundSource.PLAYERS,
								(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), (float) (1 - immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), false);
					}
				}
			}
			immediatesourceentity.getPersistentData().putDouble("maxtime2", 40);
			if (immediatesourceentity.getPersistentData().getDouble("timer2") < immediatesourceentity.getPersistentData().getDouble("maxtime2")) {
				immediatesourceentity.getPersistentData().putDouble("timer2", (immediatesourceentity.getPersistentData().getDouble("timer2") + 1));
			} else {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firecrackle")), SoundSource.PLAYERS,
										(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), (float) (1 - immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1));
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firecrackle")), SoundSource.PLAYERS,
										(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), (float) (1 - immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), false);
							}
						}
					}
				}
				immediatesourceentity.getPersistentData().putDouble("timer2", 0);
			}
		}
		if (immediatesourceentity.getPersistentData().getDouble("explodenoise") > immediatesourceentity.getPersistentData().getDouble("explodenoise2")) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((2.5 + 0.5 * immediatesourceentity.getPersistentData().getDouble("magicsize")) / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:fireexplode")), SoundSource.NEUTRAL,
									(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), (float) (1 - immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1));
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:fireexplode")), SoundSource.NEUTRAL,
									(float) (1 + immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), (float) (1 - immediatesourceentity.getPersistentData().getDouble("magicsize") * 0.1), false);
						}
					}
				}
			}
			immediatesourceentity.getPersistentData().putDouble("explodenoise2", (immediatesourceentity.getPersistentData().getDouble("explodenoise")));
		}
	}
}