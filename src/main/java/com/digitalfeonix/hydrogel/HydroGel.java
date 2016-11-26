package com.digitalfeonix.hydrogel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.common.MinecraftForge;
import com.digitalfeonix.hydrogel.proxy.CommonProxy;
import com.digitalfeonix.hydrogel.block.ModBlocks;
import com.digitalfeonix.hydrogel.recipe.ModRecipes;

@Mod(modid = HydroGel.MODID, version = HydroGel.VERSION, name = HydroGel.NAME)
public class HydroGel
{
    public static final String MODID = "hydrogel";
    public static final String NAME = "HydroGel";
    public static final String VERSION = "0.9";

    @Mod.Instance(MODID)
    public static HydroGel instance;

    @SidedProxy(serverSide = "com.digitalfeonix.hydrogel.proxy.CommonProxy", clientSide = "com.digitalfeonix.hydrogel.proxy.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        proxy.preInit(event);
        MinecraftForge.EVENT_BUS.register(HydroEventHandler.class);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        ModRecipes.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
