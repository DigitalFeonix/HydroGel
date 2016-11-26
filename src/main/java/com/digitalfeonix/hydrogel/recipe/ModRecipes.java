package com.digitalfeonix.hydrogel.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.digitalfeonix.hydrogel.block.ModBlocks;


public class ModRecipes {

    public static void init() {
        // Crafting
        GameRegistry.addShapedRecipe(
            new ItemStack(ModBlocks.blockHydroGel,1),
                "BsB",
                "sWs",
                "BsB",
            'B', Blocks.IRON_BARS,
            's', Items.SLIME_BALL,
            'W', new ItemStack(Items.WATER_BUCKET.setContainerItem(Items.BUCKET))
        );
        // TODO: finalize the recipe
    }

}