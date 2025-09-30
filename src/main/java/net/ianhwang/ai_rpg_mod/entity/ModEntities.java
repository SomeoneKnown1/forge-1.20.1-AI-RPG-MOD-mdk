package net.ianhwang.ai_rpg_mod.entity;

import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.ianhwang.ai_rpg_mod.entity.custom.EvilAIBotEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AI_RPG_Mod.MOD_ID);

    public static final RegistryObject<EntityType<EvilAIBotEntity>> EvilAIBot =
            ENTITY_TYPES.register("evil-ai-bot", () -> EntityType.Builder.of(EvilAIBotEntity::new, MobCategory.CREATURE)
                    .sized(2.5f,2.5f).build("evil-ai-bot"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
