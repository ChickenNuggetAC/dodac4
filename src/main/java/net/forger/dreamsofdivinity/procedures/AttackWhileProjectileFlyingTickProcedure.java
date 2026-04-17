package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.forger.dreamsofdivinity.init.DreamsOfDivinityModMobEffects;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;
import net.forger.dreamsofdivinity.DreamsOfDivinityMod;

import java.util.Comparator;

public class AttackWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getBoolean("attack") == false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("dod_has_fused_spell")) {
				immediatesourceentity.getPersistentData().putBoolean("fireattack",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire")));
				immediatesourceentity.getPersistentData().putBoolean("waterattack",
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("water")));
			}
			if (entity.getPersistentData().getDouble("weaponenhance") > 0.5) {
				immediatesourceentity.getPersistentData().putBoolean("fireattack", (entity.getPersistentData().getBoolean("fireattack")));
				immediatesourceentity.getPersistentData().putBoolean("waterattack", (entity.getPersistentData().getBoolean("waterattack")));
			}
			entity.getPersistentData().putDouble("inrangerange",
					(1 + entity.getPersistentData().getDouble("attacksize") + entity.getPersistentData().getDouble("attacksize")
							+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize")
							+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize")));
			immediatesourceentity.getPersistentData().putDouble("inrange", (entity.getPersistentData().getDouble("immunity")));
			immediatesourceentity.getPersistentData().putDouble("attacksize", (entity.getPersistentData().getDouble("attacksize")
					+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicsize")));
			if (immediatesourceentity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY))
				_livingEntity28.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
						.setBaseValue((entity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
								? _livingEntity27.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
								: 0));
			immediatesourceentity.getPersistentData().putDouble("immunity", (entity.getPersistentData().getDouble("immunity")));
			immediatesourceentity.getPersistentData().putDouble("magicpower",
					(1 + (entity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity31.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0)
							+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("magicpower")));
			if (immediatesourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) (1 + (entity instanceof LivingEntity _livingEntity35 && _livingEntity35.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity35.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0)));
			immediatesourceentity.getPersistentData().putBoolean("attack", true);
			if (immediatesourceentity.getPersistentData().getBoolean("fireattack") == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:fireexplode")), SoundSource.PLAYERS,
								(float) (1 + entity.getPersistentData().getDouble("attacksize") * 0.2), 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dreams_of_divinity:fireexplode")), SoundSource.PLAYERS, (float) (1 + entity.getPersistentData().getDouble("attacksize") * 0.2), 1,
								false);
					}
				}
			}
		}
		immediatesourceentity.setNoGravity(true);
		if (immediatesourceentity.getPersistentData().getBoolean("fireattack") == true) {
			{
				Entity _entity = immediatesourceentity;
				String command = "photon fx photon:" + "fireswordsweep" + " entity " + _entity.getScoreboardName() + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("attacksize")) + " "
						+ (immediatesourceentity.getPersistentData().getDouble("attacksize")) + " " + (immediatesourceentity.getPersistentData().getDouble("attacksize")) + " " + (int) 0 + " " + true + " " + true;
				if (!_entity.level().isClientSide() && _entity.getServer() != null) {
					_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(), _entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4,
							_entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world
					.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((1 + immediatesourceentity.getPersistentData().getDouble("attacksize") + immediatesourceentity.getPersistentData().getDouble("attacksize")) / 2d), e -> true)
					.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator.getPersistentData().getDouble("immunity") != entity.getPersistentData().getDouble("immunity")) {
					if (entityiterator.getPersistentData().getDouble("shielded") == 0) {
						entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC), entity, entity),
								(float) ((1 + immediatesourceentity.getPersistentData().getDouble("magicpower"))
										- (entityiterator instanceof LivingEntity _livingEntity53 && _livingEntity53.getAttributes().hasAttribute(Attributes.ARMOR) ? _livingEntity53.getAttribute(Attributes.ARMOR).getValue() : 0)
												/ (immediatesourceentity.getPersistentData().getDouble("magicpower") + 1)));
					}
					if (immediatesourceentity.getPersistentData().getBoolean("fireattack") == true) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(DreamsOfDivinityModMobEffects.FIRE, 60, (int) immediatesourceentity.getPersistentData().getDouble("magicpower"), false, false));
						{
							Entity _entity = immediatesourceentity;
							String command = "photon fx photon:" + "fireexplode" + " entity " + _entity.getScoreboardName() + " 0 0 0 0 0 0 " + (immediatesourceentity.getPersistentData().getDouble("attacksize")) + " "
									+ (immediatesourceentity.getPersistentData().getDouble("attacksize")) + " " + (immediatesourceentity.getPersistentData().getDouble("attacksize")) + " " + (int) 0 + " " + true + " " + true;
							if (!_entity.level().isClientSide() && _entity.getServer() != null) {
								_entity.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _entity.position(), _entity.getRotationVector(),
										_entity.level() instanceof ServerLevel ? (ServerLevel) _entity.level() : null, 4, _entity.getName().getString(), _entity.getDisplayName(), _entity.level().getServer(), _entity), command);
							}
						}
					}
				}
			}
		}
		if (immediatesourceentity.getPersistentData().getDouble("magicpower") < 0) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
		DreamsOfDivinityMod.queueServerWork(5, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}