package com.dimdev.madscience;

import com.dimdev.madscience.common.init.*;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MadScience.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MadScience {
    public static final String MODID = "madscience";
    private static final Logger LOGGER = LogUtils.getLogger();
    public MadScience() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        onInitialize(bus);
    }

    public static ResourceLocation id(String id) {
        return new ResourceLocation(MODID, id);
    }

    public void onInitialize(IEventBus bus) {
        BlockInit.init(bus);
        ItemInit.init(bus);
        BlockEntityInit.init(bus);
        FluidTypesInit.init(bus);
        FluidInit.init(bus);
        ItemGroupInit.init(bus);
        EntityInit.init(bus);
        SoundInit.init(bus);
        EffectInit.init(bus);
        MenuTypeInit.init(bus);
    }


    private void commonSetup(final FMLCommonSetupEvent event) {}
}
