package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMobEffects;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

import java.util.Comparator;

public class BendingWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getBoolean("attack") == false) {
			entity.getPersistentData().putDouble("inrangerange", (1 + entity.getPersistentData().getDouble("bendingoutput")));
			if (immediatesourceentity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY))
				_livingEntity4.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).setBaseValue(
						(entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY) ? _livingEntity3.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue() : 0));
			immediatesourceentity.getPersistentData().putDouble("immunity", (entity.getPersistentData().getDouble("immunity")));
			immediatesourceentity.getPersistentData().putBoolean("attack", true);
			if (entity.getPersistentData().getBoolean("firearmor") == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firesummon")), SoundSource.PLAYERS,
								(float) (1 + entity.getPersistentData().getDouble("bendingoutput") * 0.1), 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:firesummon")), SoundSource.PLAYERS, (float) (1 + entity.getPersistentData().getDouble("bendingoutput") * 0.1), 1,
								false);
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("firearmor") == true) {
			{
				Entity _entity = immediatesourceentity;
				String command = "photon fx photon:" + "fireparticle" + " entity " + _entity.getScoreboardName() + " 0 0 0 0 0 0 " + (entity.getPersistentData().getDouble("bendingoutput")) + " "
						+ (entity.getPersistentData().getDouble("bendingoutput")) + " " + (entity.getPersistentData().getDouble("bendingoutput")) + " " + (int) 0 + " " + true + " " + true;
				if (!_entity.level().isClientSide() && _entity.getServer() != null) {
					_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(), _entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4,
							_entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((1 + entity.getPersistentData().getDouble("bendingoutput")) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if ((entityiterator instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
						? _livingEntity17.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
						: 0) != (entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
								? _livingEntity18.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
								: 0)) {
					if (entity.getPersistentData().getBoolean("firearmor") == true) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) entity.getPersistentData().getDouble("empower"), false, false));
						if (!immediatesourceentity.level().isClientSide())
							immediatesourceentity.discard();
					}
				}
			}
		}
		if ((immediatesourceentity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.HEALTH)
				? _livingEntity24.getAttribute(DreamsOfDivinityModAttributes.HEALTH).getBaseValue()
				: 0) < 0) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
		DreamsOfDivinityMod.queueServerWork(10, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}