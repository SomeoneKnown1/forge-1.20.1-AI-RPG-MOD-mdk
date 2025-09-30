package net.ianhwang.ai_rpg_mod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.ianhwang.ai_rpg_mod.entity.custom.EvilAIBotEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EvilAIBotRenderer extends MobRenderer<EvilAIBotEntity, EvilAiBotModel<EvilAIBotEntity>> {
    public EvilAIBotRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new EvilAiBotModel<>(pContext.bakeLayer(ModModelLayers.EvilAIBot_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(EvilAIBotEntity pEntity) {
        return new ResourceLocation(AI_RPG_Mod.MOD_ID, "textures/entity/evilaibot.png");
    }

    @Override
    public void render(EvilAIBotEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight){
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

}
