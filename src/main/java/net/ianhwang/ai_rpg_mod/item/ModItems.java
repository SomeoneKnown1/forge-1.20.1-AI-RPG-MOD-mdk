package net.ianhwang.ai_rpg_mod.item;
import net.ianhwang.ai_rpg_mod.AI_RPG_Mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AI_RPG_Mod.MOD_ID);
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
