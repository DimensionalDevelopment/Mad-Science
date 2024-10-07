package com.dimdev.madscience.common.init;

import com.dimdev.madscience.MadScience;
import com.dimdev.madscience.common.blocks.ores.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MadScience.MODID);
    public static final RegistryObject<AEmberGold> AEMBER_ORE = registerBlockToMainTab("aember_gold", () -> new AEmberGold(BlockBehaviour.Properties.of()));
    public static final RegistryObject<AEmberGold> AEMBER_JET = registerBlockToMainTab("aember_jet", () -> new AEmberGold(BlockBehaviour.Properties.of()));
    public static final RegistryObject<BygoneMineral> BYGONE_MINERAL = registerBlockToMainTab("bygone_mineral", () -> new BygoneMineral(BlockBehaviour.Properties.of()));
    public static final RegistryObject<FractalOre> FRACTAL_ORE = registerBlockToMainTab("fractal_ore", () -> new FractalOre(BlockBehaviour.Properties.of()));
    public static final RegistryObject<ShadowOre> SHADOW_ORE = registerBlockToMainTab("shadow_ore", () -> new ShadowOre(BlockBehaviour.Properties.of()));
    public static final RegistryObject<TuberousDirt> TUBEROUS_DIRT = registerBlockToMainTab("tuberous_dirt", () -> new TuberousDirt(BlockBehaviour.Properties.of()));

    private static <B extends Block> RegistryObject<B> registerBlockToMainTab(String name, Supplier<B> block) {
        return registerBlockMainTab(name, block, b -> () -> new BlockItem(b.get(), new Item.Properties()));
    }

    public static <B extends Block> RegistryObject<B> registerOnlyBlock(String name, Supplier<B> block) {
        return BLOCKS.register(name, block);
    }

    public static <L extends LiquidBlock> RegistryObject<L> registerFluidBlock(String name, Supplier<L> block) {
        var reg = BLOCKS.register(name, block);
        return reg;
    }

    private static <B extends Block, I extends BlockItem> RegistryObject<B> registerBlockMainTab(String name, Supplier<B> block, Function<RegistryObject<B>, Supplier<I>> item) {
        var reg = BLOCKS.register(name, block);
        ItemGroupInit.addToMainTabBlocks(ItemInit.ITEMS.register(name, () -> item.apply(reg).get()));
        return reg;
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
