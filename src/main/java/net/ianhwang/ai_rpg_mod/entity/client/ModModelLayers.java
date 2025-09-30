package net.ianhwang.ai_rpg_mod.entity.client;

import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.resources.ResourceLocation.fromNamespaceAndPath;

public class ModModelLayers {
    public static final ModelLayerLocation EvilAIBot_LAYER = new ModelLayerLocation(
            new ResourceLocation(AI_RPG_Mod.MOD_ID, "evilaibot_layer"), "main");
            //fromNamespaceAndPath(AI_RPG_Mod.MOD_ID,"evilaibot_layer"),"main");

}
