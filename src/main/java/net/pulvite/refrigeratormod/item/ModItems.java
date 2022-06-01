package net.pulvite.refrigeratormod.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pulvite.refrigeratormod.RefrigeratorMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RefrigeratorMod.MOD_ID);
    //frozen tools
    public static final RegistryObject<Item> FROZEN_SWORD = ITEMS.register("frozen_sword",
            () -> new SwordItem(ModTiers.ICE, 2, 0f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> FROZEN_AXE = ITEMS.register("frozen_axe",
            () -> new AxeItem(ModTiers.ICE, 3, -1f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> FROZEN_PICKAXE = ITEMS.register("frozen_pickaxe",
            () -> new PickaxeItem(ModTiers.ICE, 2, 3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> FROZEN_SHOVEL = ITEMS.register("frozen_shovel",
            () -> new ShovelItem(ModTiers.ICE, 2, 3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> FROZEN_HOE = ITEMS.register("frozen_hoe",
            () -> new HoeItem(ModTiers.ICE, 6, 1.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    /*
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    */
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
