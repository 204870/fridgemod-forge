package net.pulvite.refrigeratormod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pulvite.refrigeratormod.RefrigeratorMod;
import net.pulvite.refrigeratormod.block.ModBlocks;
import net.pulvite.refrigeratormod.block.entity.custom.RefrigeratorBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RefrigeratorMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<RefrigeratorBlockEntity>> REFRIGERATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("refrigerator_block_entity", () ->
                    BlockEntityType.Builder.of(RefrigeratorBlockEntity::new,
                            ModBlocks.REFRIGERATOR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
