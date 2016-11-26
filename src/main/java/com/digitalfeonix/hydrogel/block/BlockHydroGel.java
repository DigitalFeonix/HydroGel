package com.digitalfeonix.hydrogel.block;

import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockHydroGel extends BlockBase {

    public BlockHydroGel(String name) {
        // this is what allows the hydration to happen
        super(Material.WATER, name);
        // don't make instant harvest
        this.setHardness(1.0f);
    }

    // prevent blocks from being place where this block is (it supposed to be solid)
    @Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }

    // allow things like torches and stuff to be put on it
    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    // allow the block to be moved by pistons like it is a piece of dirt
    @Override
    public EnumPushReaction getMobilityFlag(IBlockState state)
    {
        return EnumPushReaction.NORMAL;
    }

}
