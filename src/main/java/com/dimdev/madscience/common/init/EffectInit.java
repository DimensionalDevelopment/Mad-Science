package com.dimdev.madscience.common.init;

import com.dimdev.madscience.MadScience;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectInit {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MadScience.MODID);

    public static void init(IEventBus bus) {
        MOB_EFFECTS.register(bus);
    }
}
