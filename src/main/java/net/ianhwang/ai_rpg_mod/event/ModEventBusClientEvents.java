package net.ianhwang.ai_rpg_mod.event;

import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.ianhwang.ai_rpg_mod.entity.ModEntities;
import net.ianhwang.ai_rpg_mod.entity.client.EvilAiBotModel;
import net.ianhwang.ai_rpg_mod.entity.client.ModModelLayers;
import net.ianhwang.ai_rpg_mod.entity.custom.EvilAIBotEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AI_RPG_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.EvilAIBot_LAYER, EvilAiBotModel::createBodyLayer);
    }
}
