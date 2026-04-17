// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmagiccirclefire<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "magiccirclefire"), "main");
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart bone11;
	private final ModelPart bone5;
	private final ModelPart hexadecagon;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart hexadecagon5;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart hexadecagon6;
	private final ModelPart hexadecagon7;
	private final ModelPart hexadecagon8;
	private final ModelPart bone20;
	private final ModelPart hexadecagon10;
	private final ModelPart hexadecagon11;
	private final ModelPart hexadecagon12;
	private final ModelPart bone7;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart hexadecagon2;
	private final ModelPart hexadecagon3;
	private final ModelPart hexadecagon4;
	private final ModelPart bone17;
	private final ModelPart hexadecagon9;
	private final ModelPart hexadecagon13;
	private final ModelPart hexadecagon14;

	public Modelmagiccirclefire(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.bone11 = this.head.getChild("bone11");
		this.bone5 = this.bone11.getChild("bone5");
		this.hexadecagon = this.bone5.getChild("hexadecagon");
		this.bone2 = this.bone5.getChild("bone2");
		this.bone3 = this.bone5.getChild("bone3");
		this.bone4 = this.bone5.getChild("bone4");
		this.bone6 = this.bone11.getChild("bone6");
		this.hexadecagon5 = this.bone6.getChild("hexadecagon5");
		this.bone8 = this.bone6.getChild("bone8");
		this.bone9 = this.bone6.getChild("bone9");
		this.bone10 = this.bone6.getChild("bone10");
		this.bone12 = this.bone11.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.bone14 = this.bone13.getChild("bone14");
		this.hexadecagon6 = this.bone14.getChild("hexadecagon6");
		this.hexadecagon7 = this.bone14.getChild("hexadecagon7");
		this.hexadecagon8 = this.bone14.getChild("hexadecagon8");
		this.bone20 = this.bone13.getChild("bone20");
		this.hexadecagon10 = this.bone20.getChild("hexadecagon10");
		this.hexadecagon11 = this.bone20.getChild("hexadecagon11");
		this.hexadecagon12 = this.bone20.getChild("hexadecagon12");
		this.bone7 = this.head.getChild("bone7");
		this.bone15 = this.bone7.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.hexadecagon2 = this.bone16.getChild("hexadecagon2");
		this.hexadecagon3 = this.bone16.getChild("hexadecagon3");
		this.hexadecagon4 = this.bone16.getChild("hexadecagon4");
		this.bone17 = this.bone15.getChild("bone17");
		this.hexadecagon9 = this.bone17.getChild("hexadecagon9");
		this.hexadecagon13 = this.bone17.getChild("hexadecagon13");
		this.hexadecagon14 = this.bone17.getChild("hexadecagon14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -26.0F, 23.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone11 = head.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -19.0F));

		PartDefinition bone5 = bone11.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -38.0F, -17.0F));

		PartDefinition hexadecagon = bone5.addOrReplaceChild("hexadecagon", CubeListBuilder.create().texOffs(158, 150)
				.addBox(-4.7739F, 14.0F, 17.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(154, 26)
				.addBox(-4.7739F, 60.0F, 17.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(166, 160)
				.addBox(22.0F, 33.2261F, 17.0F, 2.0F, 9.5478F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(126, 166)
						.addBox(22.0F, -4.7739F, -1.0F, 2.0F, 9.5478F, 3.0F, new CubeDeformation(0.0F)).texOffs(153, 64)
						.addBox(-4.7739F, 22.0F, -1.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(158, 36)
						.addBox(-4.7739F, -24.0F, -1.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create()
				.texOffs(145, 167).addBox(22.0F, -4.7739F, -1.0F, 2.0F, 9.5478F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(156, 69).addBox(-4.7739F, 22.0F, -1.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(158, 155).addBox(-4.7739F, -24.0F, -1.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(157, 111).addBox(-4.7739F, 22.0F, -1.0F, 9.5478F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(158, 31).addBox(-4.7739F, -24.0F, -1.0F, 9.5478F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone2 = bone5.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-28.0F, 6.0F, 17.0F, 56.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-28.0F, 68.0F, 17.0F, 56.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 28)
						.addBox(30.0F, 10.0F, 17.0F, 2.0F, 56.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1",
				CubeListBuilder.create().texOffs(0, 12)
						.addBox(-28.0F, -32.0F, -1.0F, 56.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(30.0F, -28.0F, -1.0F, 2.0F, 56.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone3 = bone5.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(54, 93).addBox(22.2F,
				17.28F, 17.26F, 1.48F, 41.44F, 1.74F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3_r1 = bone3.addOrReplaceChild("bone3_r1", CubeListBuilder.create().texOffs(0, 18)
				.addBox(-20.72F, -23.68F, -0.74F, 41.44F, 1.48F, 1.74F, new CubeDeformation(0.0F)).texOffs(58, 93)
				.addBox(22.2F, -20.72F, -0.74F, 1.48F, 41.44F, 1.74F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone4 = bone5.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(16, 24)
						.addBox(-15.7472F, 20.0032F, 17.4376F, 31.4944F, 1.1248F, 1.5624F, new CubeDeformation(0.0F))
						.texOffs(14, 22)
						.addBox(-15.7472F, 54.872F, 17.4376F, 31.4944F, 1.1248F, 1.5624F, new CubeDeformation(0.0F))
						.texOffs(40, 130).addBox(16.872F, 22.2528F, 17.4376F, 1.1248F, 31.4944F, 1.5624F,
								new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone4_r1 = bone4.addOrReplaceChild("bone4_r1",
				CubeListBuilder.create().texOffs(16, 26)
						.addBox(-15.7472F, -17.9968F, -0.5624F, 31.4944F, 1.1248F, 1.5624F, new CubeDeformation(0.0F))
						.texOffs(134, 130)
						.addBox(16.872F, -15.7472F, -0.5624F, 1.1248F, 31.4944F, 1.5624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone6 = bone11.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, -38.0F, -17.0F));

		PartDefinition hexadecagon5 = bone6.addOrReplaceChild("hexadecagon5", CubeListBuilder.create().texOffs(166, 0)
				.addBox(-24.0F, 33.2261F, 17.0F, 2.0F, 9.5478F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon5_r1 = hexadecagon5.addOrReplaceChild("hexadecagon5_r1", CubeListBuilder.create()
				.texOffs(163, 84).addBox(-24.0F, -4.7739F, -1.0F, 2.0F, 9.5478F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(151, 21).addBox(-4.7739F, -24.0F, -1.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon5_r2 = hexadecagon5.addOrReplaceChild("hexadecagon5_r2", CubeListBuilder.create()
				.texOffs(166, 96).addBox(-24.0F, -4.7739F, -1.0F, 2.0F, 9.5478F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(136, 109).addBox(-4.7739F, 22.0F, -1.0F, 9.5478F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon5_r3 = hexadecagon5.addOrReplaceChild("hexadecagon5_r3",
				CubeListBuilder.create().texOffs(149, 79).addBox(-4.7739F, 22.0F, -1.0F, 9.5478F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon5_r4 = hexadecagon5.addOrReplaceChild("hexadecagon5_r4",
				CubeListBuilder.create().texOffs(150, 74).addBox(-4.7739F, -24.0F, -1.0F, 9.5478F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone8 = bone6.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 22).addBox(-32.0F,
				10.0F, 17.0F, 2.0F, 56.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone8_r1 = bone8.addOrReplaceChild("bone8_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-28.0F, -32.0F, -1.0F, 56.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 22)
						.addBox(-32.0F, -28.0F, -1.0F, 2.0F, 56.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone9 = bone6.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(46, 93).addBox(-23.68F,
				17.28F, 17.26F, 1.48F, 41.44F, 1.74F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone9_r1 = bone9.addOrReplaceChild("bone9_r1", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-20.72F, -23.68F, -0.74F, 41.44F, 1.48F, 1.74F, new CubeDeformation(0.0F)).texOffs(50, 93)
				.addBox(-23.68F, -20.72F, -0.74F, 1.48F, 41.44F, 1.74F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone10 = bone6
				.addOrReplaceChild(
						"bone10", CubeListBuilder.create().texOffs(40, 98).addBox(-17.9968F, 22.2528F, 17.4376F,
								1.1248F, 31.4944F, 1.5624F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone10_r1 = bone10.addOrReplaceChild("bone10_r1",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-15.7472F, -17.9968F, -0.5624F, 31.4944F, 1.1248F, 1.5624F, new CubeDeformation(0.0F))
						.texOffs(36, 113)
						.addBox(-17.9968F, -15.7472F, -0.5624F, 1.1248F, 31.4944F, 1.5624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 38.0F, 18.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, -32.0F));

		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offset(0.0F, -50.36F, -3.96F));

		PartDefinition hexadecagon6 = bone14.addOrReplaceChild("hexadecagon6", CubeListBuilder.create().texOffs(0, 93)
				.addBox(-9.9357F, 1.472F, 35.644F, 19.8713F, 1.998F, 4.995F, new CubeDeformation(0.0F)).texOffs(28, 83)
				.addBox(-9.9357F, 99.374F, 35.644F, 19.8713F, 1.998F, 4.995F, new CubeDeformation(0.0F))
				.texOffs(30, 146).addBox(47.952F, 41.4863F, 35.644F, 1.998F, 19.8713F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon6_r1 = hexadecagon6.addOrReplaceChild("hexadecagon6_r1",
				CubeListBuilder.create().texOffs(20, 146)
						.addBox(47.952F, -9.9357F, -1.998F, 1.998F, 19.8713F, 4.995F, new CubeDeformation(0.0F))
						.texOffs(88, 89)
						.addBox(-9.9357F, -49.95F, -1.998F, 19.8713F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon6_r2 = hexadecagon6.addOrReplaceChild("hexadecagon6_r2",
				CubeListBuilder.create().texOffs(138, 147)
						.addBox(47.952F, -9.9357F, -1.998F, 1.998F, 19.8713F, 4.995F, new CubeDeformation(0.0F))
						.texOffs(74, 83)
						.addBox(-9.9357F, 47.952F, -1.998F, 19.8713F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon6_r3 = hexadecagon6.addOrReplaceChild("hexadecagon6_r3",
				CubeListBuilder.create().texOffs(0, 88).addBox(-9.9357F, 47.952F, -1.998F, 19.8713F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon6_r4 = hexadecagon6.addOrReplaceChild("hexadecagon6_r4",
				CubeListBuilder.create().texOffs(46, 88).addBox(-9.9357F, -49.95F, -1.998F, 19.8713F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon7 = bone14.addOrReplaceChild("hexadecagon7", CubeListBuilder.create().texOffs(62, 109)
				.addBox(-8.346F, 9.464F, 35.644F, 16.6919F, 1.998F, 4.995F, new CubeDeformation(0.0F)).texOffs(98, 100)
				.addBox(-8.346F, 91.382F, 35.644F, 16.6919F, 1.998F, 4.995F, new CubeDeformation(0.0F))
				.texOffs(154, 130).addBox(39.96F, 43.076F, 35.644F, 1.998F, 16.6919F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon7_r1 = hexadecagon7.addOrReplaceChild("hexadecagon7_r1",
				CubeListBuilder.create().texOffs(154, 44)
						.addBox(39.96F, -8.346F, -1.998F, 1.998F, 16.6919F, 4.995F, new CubeDeformation(0.0F))
						.texOffs(0, 108)
						.addBox(-8.346F, -41.958F, -1.998F, 16.6919F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon7_r2 = hexadecagon7.addOrReplaceChild("hexadecagon7_r2", CubeListBuilder.create()
				.texOffs(156, 0).addBox(39.96F, -8.346F, -1.998F, 1.998F, 16.6919F, 4.995F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(-8.346F, 39.96F, -1.998F, 16.6919F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon7_r3 = hexadecagon7.addOrReplaceChild("hexadecagon7_r3",
				CubeListBuilder.create().texOffs(62, 104).addBox(-8.346F, 39.96F, -1.998F, 16.6919F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon7_r4 = hexadecagon7.addOrReplaceChild("hexadecagon7_r4",
				CubeListBuilder.create().texOffs(98, 105).addBox(-8.346F, -41.958F, -1.998F, 16.6919F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon8 = bone14.addOrReplaceChild("hexadecagon8", CubeListBuilder.create().texOffs(80, 20)
				.addBox(-9.737F, 2.471F, 36.643F, 19.4739F, 7.992F, 2.997F, new CubeDeformation(0.0F)).texOffs(32, 74)
				.addBox(-9.737F, 92.381F, 36.643F, 19.4739F, 7.992F, 2.997F, new CubeDeformation(0.0F)).texOffs(0, 125)
				.addBox(40.959F, 41.685F, 36.643F, 7.992F, 19.4739F, 2.997F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon8_r1 = hexadecagon8.addOrReplaceChild("hexadecagon8_r1",
				CubeListBuilder.create().texOffs(116, 122)
						.addBox(40.959F, -9.737F, -0.999F, 7.992F, 19.4739F, 2.997F, new CubeDeformation(0.0F))
						.texOffs(78, 65)
						.addBox(-9.737F, -48.951F, -0.999F, 19.4739F, 7.992F, 2.997F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon8_r2 = hexadecagon8.addOrReplaceChild("hexadecagon8_r2", CubeListBuilder.create()
				.texOffs(18, 125).addBox(40.959F, -9.737F, -0.999F, 7.992F, 19.4739F, 2.997F, new CubeDeformation(0.0F))
				.texOffs(74, 47).addBox(-9.737F, 40.959F, -0.999F, 19.4739F, 7.992F, 2.997F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon8_r3 = hexadecagon8.addOrReplaceChild("hexadecagon8_r3",
				CubeListBuilder.create().texOffs(74, 56).addBox(-9.737F, 40.959F, -0.999F, 19.4739F, 7.992F, 2.997F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon8_r4 = hexadecagon8.addOrReplaceChild("hexadecagon8_r4",
				CubeListBuilder.create().texOffs(74, 74).addBox(-9.737F, -48.951F, -0.999F, 19.4739F, 7.992F, 2.997F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone20 = bone13.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 19.0F));

		PartDefinition hexadecagon10 = bone20
				.addOrReplaceChild(
						"hexadecagon10", CubeListBuilder.create().texOffs(0, 146).addBox(-49.95F, 41.4863F, 35.644F,
								1.998F, 19.8713F, 4.995F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -49.36F, -22.96F));

		PartDefinition hexadecagon10_r1 = hexadecagon10.addOrReplaceChild("hexadecagon10_r1",
				CubeListBuilder.create().texOffs(124, 143)
						.addBox(-49.95F, -9.9357F, -1.998F, 1.998F, 19.8713F, 4.995F, new CubeDeformation(0.0F))
						.texOffs(72, 42)
						.addBox(-9.9357F, -49.95F, -1.998F, 19.8713F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon10_r2 = hexadecagon10.addOrReplaceChild("hexadecagon10_r2",
				CubeListBuilder.create().texOffs(10, 146)
						.addBox(-49.95F, -9.9357F, -1.998F, 1.998F, 19.8713F, 4.995F, new CubeDeformation(0.0F))
						.texOffs(32, 64)
						.addBox(-9.9357F, 47.952F, -1.998F, 19.8713F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon10_r3 = hexadecagon10.addOrReplaceChild("hexadecagon10_r3",
				CubeListBuilder.create().texOffs(32, 69).addBox(-9.9357F, 47.952F, -1.998F, 19.8713F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon10_r4 = hexadecagon10.addOrReplaceChild("hexadecagon10_r4",
				CubeListBuilder.create().texOffs(72, 33).addBox(-9.9357F, -49.95F, -1.998F, 19.8713F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon11 = bone20
				.addOrReplaceChild(
						"hexadecagon11", CubeListBuilder.create().texOffs(148, 147).addBox(-41.958F, 43.076F, 35.644F,
								1.998F, 16.6919F, 4.995F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -49.36F, -22.96F));

		PartDefinition hexadecagon11_r1 = hexadecagon11.addOrReplaceChild("hexadecagon11_r1",
				CubeListBuilder.create().texOffs(148, 28)
						.addBox(-41.958F, -8.346F, -1.998F, 1.998F, 16.6919F, 4.995F, new CubeDeformation(0.0F))
						.texOffs(62, 99)
						.addBox(-8.346F, -41.958F, -1.998F, 16.6919F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon11_r2 = hexadecagon11.addOrReplaceChild("hexadecagon11_r2",
				CubeListBuilder.create().texOffs(44, 152)
						.addBox(-41.958F, -8.346F, -1.998F, 1.998F, 16.6919F, 4.995F, new CubeDeformation(0.0F))
						.texOffs(62, 94)
						.addBox(-8.346F, 39.96F, -1.998F, 16.6919F, 1.998F, 4.995F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon11_r3 = hexadecagon11.addOrReplaceChild("hexadecagon11_r3",
				CubeListBuilder.create().texOffs(0, 98).addBox(-8.346F, 39.96F, -1.998F, 16.6919F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon11_r4 = hexadecagon11.addOrReplaceChild("hexadecagon11_r4",
				CubeListBuilder.create().texOffs(98, 95).addBox(-8.346F, -41.958F, -1.998F, 16.6919F, 1.998F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon12 = bone20
				.addOrReplaceChild(
						"hexadecagon12", CubeListBuilder.create().texOffs(80, 122).addBox(-48.951F, 41.685F, 36.643F,
								7.992F, 19.4739F, 2.997F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -49.36F, -22.96F));

		PartDefinition hexadecagon12_r1 = hexadecagon12.addOrReplaceChild("hexadecagon12_r1",
				CubeListBuilder.create().texOffs(62, 122)
						.addBox(-48.951F, -9.737F, -0.999F, 7.992F, 19.4739F, 2.997F, new CubeDeformation(0.0F))
						.texOffs(32, 55)
						.addBox(-9.737F, -48.951F, -0.999F, 19.4739F, 7.992F, 2.997F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon12_r2 = hexadecagon12.addOrReplaceChild("hexadecagon12_r2",
				CubeListBuilder.create().texOffs(98, 122)
						.addBox(-48.951F, -9.737F, -0.999F, 7.992F, 19.4739F, 2.997F, new CubeDeformation(0.0F))
						.texOffs(32, 28)
						.addBox(-9.737F, 40.959F, -0.999F, 19.4739F, 7.992F, 2.997F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon12_r3 = hexadecagon12.addOrReplaceChild("hexadecagon12_r3",
				CubeListBuilder.create().texOffs(32, 37).addBox(-9.737F, 40.959F, -0.999F, 19.4739F, 7.992F, 2.997F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon12_r4 = hexadecagon12.addOrReplaceChild("hexadecagon12_r4",
				CubeListBuilder.create().texOffs(32, 46).addBox(-9.737F, -48.951F, -0.999F, 19.4739F, 7.992F, 2.997F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 51.422F, 37.642F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone7 = head.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -39.0F));

		PartDefinition bone15 = bone7.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(0.0F, 6.8F, -8.6F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offset(0.0F, -40.288F, -3.168F));

		PartDefinition hexadecagon2 = bone16.addOrReplaceChild("hexadecagon2",
				CubeListBuilder.create().texOffs(0, 121)
						.addBox(-7.9485F, -6.4224F, 11.5152F, 15.8971F, 1.5984F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(118, 62)
						.addBox(-7.9485F, 71.8992F, 11.5152F, 15.8971F, 1.5984F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(86, 160).addBox(38.3616F, 25.5891F, 11.5152F, 1.5984F, 15.8971F, 3.996F,
								new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon2_r1 = hexadecagon2.addOrReplaceChild("hexadecagon2_r1",
				CubeListBuilder.create().texOffs(78, 160)
						.addBox(38.3616F, -7.9485F, -1.5984F, 1.5984F, 15.8971F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(120, 70)
						.addBox(-7.9485F, -39.96F, -1.5984F, 15.8971F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon2_r2 = hexadecagon2.addOrReplaceChild("hexadecagon2_r2",
				CubeListBuilder.create().texOffs(94, 160)
						.addBox(38.3616F, -7.9485F, -1.5984F, 1.5984F, 15.8971F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(96, 118)
						.addBox(-7.9485F, 38.3616F, -1.5984F, 15.8971F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon2_r3 = hexadecagon2.addOrReplaceChild("hexadecagon2_r3",
				CubeListBuilder.create().texOffs(120, 16).addBox(-7.9485F, 38.3616F, -1.5984F, 15.8971F, 1.5984F,
						3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon2_r4 = hexadecagon2.addOrReplaceChild("hexadecagon2_r4",
				CubeListBuilder.create().texOffs(120, 66).addBox(-7.9485F, -39.96F, -1.5984F, 15.8971F, 1.5984F, 3.996F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon3 = bone16.addOrReplaceChild("hexadecagon3",
				CubeListBuilder.create().texOffs(134, 126)
						.addBox(-6.6768F, -0.0288F, 11.5152F, 13.3535F, 1.5984F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(132, 118)
						.addBox(-6.6768F, 65.5056F, 11.5152F, 13.3535F, 1.5984F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(164, 41).addBox(31.968F, 26.8608F, 11.5152F, 1.5984F, 13.3535F, 3.996F,
								new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon3_r1 = hexadecagon3.addOrReplaceChild("hexadecagon3_r1",
				CubeListBuilder.create().texOffs(118, 163)
						.addBox(31.968F, -6.6768F, -1.5984F, 1.5984F, 13.3535F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(134, 122)
						.addBox(-6.6768F, -33.5664F, -1.5984F, 13.3535F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon3_r2 = hexadecagon3.addOrReplaceChild("hexadecagon3_r2",
				CubeListBuilder.create().texOffs(164, 127)
						.addBox(31.968F, -6.6768F, -1.5984F, 1.5984F, 13.3535F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(134, 95)
						.addBox(-6.6768F, 31.968F, -1.5984F, 13.3535F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon3_r3 = hexadecagon3.addOrReplaceChild("hexadecagon3_r3",
				CubeListBuilder.create().texOffs(134, 100).addBox(-6.6768F, 31.968F, -1.5984F, 13.3535F, 1.5984F,
						3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon3_r4 = hexadecagon3.addOrReplaceChild("hexadecagon3_r4",
				CubeListBuilder.create().texOffs(134, 105).addBox(-6.6768F, -33.5664F, -1.5984F, 13.3535F, 1.5984F,
						3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon4 = bone16.addOrReplaceChild("hexadecagon4",
				CubeListBuilder.create().texOffs(116, 74)
						.addBox(-7.7896F, -5.6232F, 12.3144F, 15.5791F, 6.3936F, 2.3976F, new CubeDeformation(0.0F))
						.texOffs(62, 114)
						.addBox(-7.7896F, 66.3048F, 12.3144F, 15.5791F, 6.3936F, 2.3976F, new CubeDeformation(0.0F))
						.texOffs(92, 143).addBox(32.7672F, 25.748F, 12.3144F, 6.3936F, 15.5791F, 2.3976F,
								new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon4_r1 = hexadecagon4.addOrReplaceChild("hexadecagon4_r1",
				CubeListBuilder.create().texOffs(76, 143)
						.addBox(32.7672F, -7.7896F, -0.7992F, 6.3936F, 15.5791F, 2.3976F, new CubeDeformation(0.0F))
						.texOffs(116, 54)
						.addBox(-7.7896F, -39.1608F, -0.7992F, 15.5791F, 6.3936F, 2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon4_r2 = hexadecagon4.addOrReplaceChild("hexadecagon4_r2",
				CubeListBuilder.create().texOffs(108, 143)
						.addBox(32.7672F, -7.7896F, -0.7992F, 6.3936F, 15.5791F, 2.3976F, new CubeDeformation(0.0F))
						.texOffs(116, 0)
						.addBox(-7.7896F, 32.7672F, -0.7992F, 15.5791F, 6.3936F, 2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon4_r3 = hexadecagon4.addOrReplaceChild("hexadecagon4_r3",
				CubeListBuilder.create().texOffs(116, 8).addBox(-7.7896F, 32.7672F, -0.7992F, 15.5791F, 6.3936F,
						2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon4_r4 = hexadecagon4.addOrReplaceChild("hexadecagon4_r4",
				CubeListBuilder.create().texOffs(116, 46).addBox(-7.7896F, -39.1608F, -0.7992F, 15.5791F, 6.3936F,
						2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.8F, 15.2F));

		PartDefinition hexadecagon9 = bone17
				.addOrReplaceChild(
						"hexadecagon9", CubeListBuilder.create().texOffs(62, 160).addBox(-39.96F, 25.5891F, 11.5152F,
								1.5984F, 15.8971F, 3.996F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -39.488F, -18.368F));

		PartDefinition hexadecagon9_r1 = hexadecagon9.addOrReplaceChild("hexadecagon9_r1",
				CubeListBuilder.create().texOffs(54, 157)
						.addBox(-39.96F, -7.9485F, -1.5984F, 1.5984F, 15.8971F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(116, 82)
						.addBox(-7.9485F, -39.96F, -1.5984F, 15.8971F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon9_r2 = hexadecagon9.addOrReplaceChild("hexadecagon9_r2",
				CubeListBuilder.create().texOffs(70, 160)
						.addBox(-39.96F, -7.9485F, -1.5984F, 1.5984F, 15.8971F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(74, 29)
						.addBox(-7.9485F, 38.3616F, -1.5984F, 15.8971F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon9_r3 = hexadecagon9.addOrReplaceChild("hexadecagon9_r3",
				CubeListBuilder.create().texOffs(74, 38).addBox(-7.9485F, 38.3616F, -1.5984F, 15.8971F, 1.5984F, 3.996F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon9_r4 = hexadecagon9.addOrReplaceChild("hexadecagon9_r4",
				CubeListBuilder.create().texOffs(84, 16).addBox(-7.9485F, -39.96F, -1.5984F, 15.8971F, 1.5984F, 3.996F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon13 = bone17.addOrReplaceChild(
				"hexadecagon13", CubeListBuilder.create().texOffs(110, 160).addBox(-33.5664F, 26.8608F, 11.5152F,
						1.5984F, 13.3535F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -39.488F, -18.368F));

		PartDefinition hexadecagon13_r1 = hexadecagon13.addOrReplaceChild("hexadecagon13_r1",
				CubeListBuilder.create().texOffs(102, 160)
						.addBox(-33.5664F, -6.6768F, -1.5984F, 1.5984F, 13.3535F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(131, 91)
						.addBox(-6.6768F, -33.5664F, -1.5984F, 13.3535F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon13_r2 = hexadecagon13.addOrReplaceChild("hexadecagon13_r2",
				CubeListBuilder.create().texOffs(158, 160)
						.addBox(-33.5664F, -6.6768F, -1.5984F, 1.5984F, 13.3535F, 3.996F, new CubeDeformation(0.0F))
						.texOffs(122, 20)
						.addBox(-6.6768F, 31.968F, -1.5984F, 13.3535F, 1.5984F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon13_r3 = hexadecagon13.addOrReplaceChild("hexadecagon13_r3",
				CubeListBuilder.create().texOffs(122, 24).addBox(-6.6768F, 31.968F, -1.5984F, 13.3535F, 1.5984F, 3.996F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon13_r4 = hexadecagon13.addOrReplaceChild("hexadecagon13_r4",
				CubeListBuilder.create().texOffs(130, 86).addBox(-6.6768F, -33.5664F, -1.5984F, 13.3535F, 1.5984F,
						3.996F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon14 = bone17.addOrReplaceChild(
				"hexadecagon14", CubeListBuilder.create().texOffs(138, 130).addBox(-39.1608F, 25.748F, 12.3144F,
						6.3936F, 15.5791F, 2.3976F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -39.488F, -18.368F));

		PartDefinition hexadecagon14_r1 = hexadecagon14.addOrReplaceChild("hexadecagon14_r1",
				CubeListBuilder.create().texOffs(44, 135)
						.addBox(-39.1608F, -7.7896F, -0.7992F, 6.3936F, 15.5791F, 2.3976F, new CubeDeformation(0.0F))
						.texOffs(114, 38)
						.addBox(-7.7896F, -39.1608F, -0.7992F, 15.5791F, 6.3936F, 2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon14_r2 = hexadecagon14.addOrReplaceChild("hexadecagon14_r2",
				CubeListBuilder.create().texOffs(60, 143)
						.addBox(-39.1608F, -7.7896F, -0.7992F, 6.3936F, 15.5791F, 2.3976F, new CubeDeformation(0.0F))
						.texOffs(102, 110)
						.addBox(-7.7896F, 32.7672F, -0.7992F, 15.5791F, 6.3936F, 2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon14_r3 = hexadecagon14.addOrReplaceChild("hexadecagon14_r3",
				CubeListBuilder.create().texOffs(0, 113).addBox(-7.7896F, 32.7672F, -0.7992F, 15.5791F, 6.3936F,
						2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon14_r4 = hexadecagon14.addOrReplaceChild("hexadecagon14_r4",
				CubeListBuilder.create().texOffs(114, 29).addBox(-7.7896F, -39.1608F, -0.7992F, 15.5791F, 6.3936F,
						2.3976F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5376F, 13.1136F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone.xRot = headPitch / (180F / (float) Math.PI);
	}
}