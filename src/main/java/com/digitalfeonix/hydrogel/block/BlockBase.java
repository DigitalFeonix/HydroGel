package com.digitalfeonix.hydrogel.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.digitalfeonix.hydrogel.HydroGel;
import com.digitalfeonix.hydrogel.item.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @Override
    public void registerItemModel(Item item) {
        HydroGel.proxy.registerItemRenderer(item, 0, name);
    }

}