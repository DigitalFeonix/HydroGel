package com.digitalfeonix.hydrogel;

import com.digitalfeonix.hydrogel.block.ModBlocks;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class HydroEventHandler {

    @SubscribeEvent
    public static void onBucketUse(FillBucketEvent event)
    {
        if (event.getTarget() != null)
        {
            if (event.getTarget().typeOfHit == RayTraceResult.Type.BLOCK)
            {
                if (event.getWorld().getBlockState(event.getTarget().getBlockPos()).getBlock() == ModBlocks.blockHydroGel)
                {
                    event.setCanceled(true);
                }
            }
        }
    }
}
