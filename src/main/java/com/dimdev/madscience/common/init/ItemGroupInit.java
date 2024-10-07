package com.dimdev.madscience.common.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ItemGroupInit {
    //TODO more categories

    public static final List<Supplier<? extends ItemLike>> MAIN_BLOCKS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MAIN_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> POWER_BLOCKS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> POWER_ITEMS = new ArrayList<>();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "madscience");
    public static final RegistryObject<CreativeModeTab> BASE = CREATIVE_TABS.register("madscience.base" , () -> CreativeModeTab.builder()
            .withSearchBar()
            .displayItems(((params, output) -> {
                MAIN_BLOCKS.forEach(itemLike -> output.accept(itemLike.get()));
                MAIN_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
            }))
            .icon(() -> Blocks.BARREL.asItem().getDefaultInstance())
            .build());

    public static final RegistryObject<CreativeModeTab> POWER = CREATIVE_TABS.register("madscience.power" , () -> CreativeModeTab.builder()
            .withSearchBar()
            .displayItems(((params, output) -> {
                POWER_BLOCKS.forEach(itemLike -> output.accept(itemLike.get()));
                POWER_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
            }))
            .icon(() -> Blocks.ALLIUM.asItem().getDefaultInstance())
            .build());

    public static <T extends Item> RegistryObject<T> addToMainTabBlocks (RegistryObject<T> itemLike) {
        MAIN_BLOCKS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToMainTabItems (RegistryObject<T> itemLike) {
        MAIN_ITEMS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToPowerTabBlocks (RegistryObject<T> itemLike) {
        POWER_BLOCKS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToPowerTabItems (RegistryObject<T> itemLike) {
        POWER_ITEMS.add(itemLike);
        return itemLike;
    }

    public static void init(IEventBus bus){
        CREATIVE_TABS.register(bus);
    }
}
