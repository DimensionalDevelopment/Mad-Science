package com.dimdev.madscience.common.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ItemGroupInit {
    public static final CreativeModeTab BASE = new CreativeModeTab(CreativeModeTab.getGroupCountSafe(), "madscience.base") {
        @Override
        public ItemStack makeIcon() {
            return Blocks.BARREL.asItem().getDefaultInstance();
        }
    };

    public static final CreativeModeTab POWER = new CreativeModeTab(CreativeModeTab.getGroupCountSafe(), "madscience.power") {
        @Override
        public ItemStack makeIcon() {
            return Blocks.ALLIUM.asItem().getDefaultInstance();
        }
    };

    //TODO more categories

    public static void init(){
    }
}
