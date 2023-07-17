package com.dimdev.madscience.common.init;

import com.dimdev.madscience.MadScience;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, MadScience.MODID);

    public static void init(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
