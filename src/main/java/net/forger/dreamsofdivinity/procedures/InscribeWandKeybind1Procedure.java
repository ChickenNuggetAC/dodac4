package net.forger.dreamsofdivinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModItems;
import net.forger.dreamsofdivinity.init.DreamsOfDivinityModAttributes;

public class InscribeWandKeybind1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		MutableComponent spellcoloritem = Component.empty();
		{
			final String _tagName = "fire";
			final boolean _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putBoolean(_tagName, _tagValue));
		}
		{
			final String _tagName = "water";
			final boolean _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putBoolean(_tagName, _tagValue));
		}
		{
			final String _tagName = "keypressed";
			final double _tagValue = 1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "spellname";
			final String _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicname1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DreamsOfDivinityModItems.BLOCK_INSCRIBING_WAND.get()) {
			{
				final String _tagName = "wandkeybind";
				final double _tagValue = 1;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DreamsOfDivinityModItems.BLOCK_INSCRIBING_WAND.get())) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("fire") == true) {
				spellcoloritem = Component
						.literal(("Spirit Stone Fused Spell: " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("spellname"))))
						.withColor((255 << 24 | 255 << 16 | 0 << 8 | 0));
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DreamsOfDivinityModItems.SPIRIT_FUSION_STONE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.ITEM_NAME, spellcoloritem);
		}
		if (!world.isClientSide()) {
			{
				final String _tagName = "immunity";
				final double _tagValue = (entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(DreamsOfDivinityModAttributes.IMMUNITY)
						? _livingEntity26.getAttribute(DreamsOfDivinityModAttributes.IMMUNITY).getBaseValue()
						: 0);
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
		{
			final String _tagName = "magicpower";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicspeed";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicsize";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "overheat";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicstyle";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "piercing";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "tracking";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicshape";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicfollow";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicduration";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "multicast";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "areacoverage";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "magicdirection";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "castingoffset";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
		{
			final String _tagName = "guidedmagic";
			final double _tagValue = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic1;
			CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
		}
	}
}