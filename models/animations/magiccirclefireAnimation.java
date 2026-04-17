// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 4.12.3 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author phant
 */
public class magiccirclefireAnimation {
	public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(1.0F)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.6F, 1.6F, 1.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone11",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 360.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone7",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -360.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}