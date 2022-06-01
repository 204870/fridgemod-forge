package net.pulvite.refrigeratormod.item;


import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ICE = new ForgeTier(3, 700, 1.5f,
            1f, 20, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.BLUE_ICE));
}
