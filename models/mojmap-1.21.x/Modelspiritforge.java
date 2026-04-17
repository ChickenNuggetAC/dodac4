// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelspiritforge<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spiritforge"), "main");
	private final ModelPart spiritforge;
	private final ModelPart pedestal;
	private final ModelPart claws;
	private final ModelPart claw1;
	private final ModelPart claw11;
	private final ModelPart claw2;
	private final ModelPart claw3;
	private final ModelPart claw4;
	private final ModelPart claw5;
	private final ModelPart claw6;
	private final ModelPart claw7;

	public Modelspiritforge(ModelPart root) {
		this.spiritforge = root.getChild("spiritforge");
		this.pedestal = this.spiritforge.getChild("pedestal");
		this.claws = this.spiritforge.getChild("claws");
		this.claw1 = this.claws.getChild("claw1");
		this.claw11 = this.claw1.getChild("claw11");
		this.claw2 = this.claws.getChild("claw2");
		this.claw3 = this.claw2.getChild("claw3");
		this.claw4 = this.claws.getChild("claw4");
		this.claw5 = this.claw4.getChild("claw5");
		this.claw6 = this.claws.getChild("claw6");
		this.claw7 = this.claw6.getChild("claw7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition spiritforge = partdefinition.addOrReplaceChild("spiritforge", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pedestal = spiritforge.addOrReplaceChild("pedestal",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -9.0F, -8.0F, 16.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-7.0F, -10.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition claws = spiritforge.addOrReplaceChild("claws", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition claw1 = claws.addOrReplaceChild("claw1", CubeListBuilder.create(),
				PartPose.offset(0.0F, -9.8481F, 3.076F));

		PartDefinition cube_r1 = claw1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 46).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1519F, -0.076F, -0.5236F, 0.0F, 0.0F));

		PartDefinition claw11 = claw1.addOrReplaceChild("claw11", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.116F, 1.076F));

		PartDefinition cube_r2 = claw11.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 40).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9641F, -1.1519F, -0.5236F, 0.0F, 0.0F));

		PartDefinition claw2 = claws.addOrReplaceChild("claw2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -9.8481F, -3.076F));

		PartDefinition cube_r3 = claw2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 46).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1519F, 0.076F, 0.5236F, 0.0F, 0.0F));

		PartDefinition claw3 = claw2.addOrReplaceChild("claw3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.116F, -1.076F));

		PartDefinition cube_r4 = claw3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(24, 40).addBox(-1.0F, -5.0F, 1.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9641F, 1.1519F, 0.5236F, 0.0F, 0.0F));

		PartDefinition claw4 = claws.addOrReplaceChild("claw4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.076F, -9.8481F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r5 = claw4.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1519F, -0.076F, -0.5236F, 0.0F, 0.0F));

		PartDefinition claw5 = claw4.addOrReplaceChild("claw5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.116F, 1.076F));

		PartDefinition cube_r6 = claw5.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(36, 40).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9641F, -1.1519F, -0.5236F, 0.0F, 0.0F));

		PartDefinition claw6 = claws.addOrReplaceChild("claw6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.076F, -9.8481F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r7 = claw6.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(48, 40).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1519F, -0.076F, -0.5236F, 0.0F, 0.0F));

		PartDefinition claw7 = claw6.addOrReplaceChild("claw7", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.116F, 1.076F));

		PartDefinition cube_r8 = claw7.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(12, 46).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9641F, -1.1519F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		spiritforge.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}