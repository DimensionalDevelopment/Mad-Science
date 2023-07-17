package com.dimdev.madscience.common.init;

import com.dimdev.madscience.MadScience;
import com.dimdev.madscience.common.blocks.ores.AEmberOre;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MadScience.MODID);

    public static final RegistryObject<AEmberOre> AEMBER_ORE = registerBlockToBase("aemberore", () -> new AEmberOre(BlockBehaviour.Properties.of(Material.STONE)));

    private static <B extends Block> RegistryObject<B> registerBlockToBase(String name, Supplier<B> block) {
        return registerBlock(name, block, b -> () -> new BlockItem(b.get(), new Item.Properties().tab(ItemGroupInit.BASE)));
    }

    public static <B extends Block> RegistryObject<B> registerOnlyBlock(String name, Supplier<B> block) {
        return BLOCKS.register(name, block);
    }
    public static <L extends LiquidBlock> RegistryObject<L> registerFluidBlock(String name, Supplier<L> block) {
        var reg = BLOCKS.register(name, block);
        return reg;
    }

    private static <B extends Block, I extends BlockItem> RegistryObject<B> registerBlock(String name, Supplier<B> block, Function<RegistryObject<B>, Supplier<I>> item) {
        var reg = BLOCKS.register(name, block);
        ItemInit.ITEMS.register(name, () -> item.apply(reg).get());
        return reg;
    }


    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
