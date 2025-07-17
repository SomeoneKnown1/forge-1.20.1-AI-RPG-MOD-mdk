package net.ianhwang.ai_rpg_mod.datagen;

import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AI_RPG_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ModRecipieProvider(packOutput));
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));

        generator.addProvider(event.includeServer(), new ModBlockStateProvider(packOutput,existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemModelProvider(packOutput,existingFileHelper));


    }
}
