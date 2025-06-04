package net.ianhwang.ai_rpg_mod.item;

import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.ianhwang.ai_rpg_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AI_RPG_Mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AI_TAB = CREATIVE_MODE_TABS.register("ai_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BATTERY.get()))
                    .title(Component.translatable("creativetab.ai_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LITHIUM.get());
                        pOutput.accept(ModItems.BATTERY.get());
                        pOutput.accept(ModItems.RAW_LITHIUM.get());
                        pOutput.accept(ModBlocks.LITHIUM_ORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
