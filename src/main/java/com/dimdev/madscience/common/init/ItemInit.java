package com.dimdev.madscience.common.init;

import com.dimdev.madscience.MadScience;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MadScience.MODID);
    private static final Item.Properties ITEM_SETTINGS = new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).stacksTo(1).tab(ItemGroupInit.BASE);

    public static <T extends Item> RegistryObject<T> register(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    static <T extends Item> RegistryObject<T> register(Supplier<T> c, String id) {
        return register(id, c);
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
