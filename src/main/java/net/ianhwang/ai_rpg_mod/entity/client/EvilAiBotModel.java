package net.ianhwang.ai_rpg_mod.entity.client;// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class EvilAiBotModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart evilaibot;
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart right_leg;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart left_leg;
	private final ModelPart headwear;
	private final ModelPart head;

	public EvilAiBotModel(ModelPart root) {
		this.evilaibot = root.getChild("evilaibot");
		this.body = this.evilaibot.getChild("body");
		this.torso = this.body.getChild("torso");
		this.right_leg = this.body.getChild("right_leg");
		this.right_arm = this.body.getChild("right_arm");
		this.left_arm = this.body.getChild("left_arm");
		this.left_leg = this.body.getChild("left_leg");
		this.headwear = this.body.getChild("headwear");
		this.head = this.body.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition evilaibot = partdefinition.addOrReplaceChild("evilaibot", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = evilaibot.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(6.0F, -24.0F, 1.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(15, 15).addBox(-10.0F, 0.0F, -3.0F, 8.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(-4, 13).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 12.0F, -0.9F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(35, 13).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, 2.0F, -1.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(37, 13).mirror().addBox(-2.0F, -3.0F, -2.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 3.0F, -1.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(-4, 13).mirror().addBox(-2.0F, 0.0F, -2.1F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-4.0F, 12.0F, -0.9F));

		PartDefinition headwear = body.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(-6.0F, 0.0F, -1.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		evilaibot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return evilaibot;
	}
}