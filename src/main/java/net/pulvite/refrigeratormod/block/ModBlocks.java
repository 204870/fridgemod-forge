package net.pulvite.refrigeratormod.block;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import java.util.function.Supplier;
import net.pulvite.refrigeratormod.RefrigeratorMod;
import net.pulvite.refrigeratormod.item.ModItems;
import net.pulvite.refrigeratormod.block.custom.RefrigeratorBlock;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RefrigeratorMod.MOD_ID);

    public static final RegistryObject<Block> REFINED_ICE = registerBlock("refined_ice",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .friction(1.1f)), CreativeModeTab.TAB_MATERIALS);


    public static final RegistryObject<Block> REFRIGERATOR = registerBlock("refrigerator",
            () -> new RefrigeratorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_DECORATIONS);

    //block registry stuff
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
