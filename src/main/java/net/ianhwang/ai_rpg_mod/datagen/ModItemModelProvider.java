package net.ianhwang.ai_rpg_mod.datagen;

import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.ianhwang.ai_rpg_mod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AI_RPG_Mod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.METAL_SCRAP);
        simpleItem(ModItems.LITHIUM);
        simpleItem(ModItems.RAW_LITHIUM);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(AI_RPG_Mod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
