package com.dimdev.madscience.common.init;

import com.dimdev.madscience.MadScience;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ItemGroupInit {
    public static final CreativeModeTab BASE = new CreativeModeTab(CreativeModeTab.getGroupCountSafe(), "madscience.base") {
        @Override
        public ItemStack makeIcon() {
            return Blocks.BARREL.asItem().getDefaultInstance();
        }
    }.setBackgroundImage(new ResourceLocation(MadScience.MODID, "textures/gui/tab_madscience.png"));

    public static final CreativeModeTab POWER = new CreativeModeTab(CreativeModeTab.getGroupCountSafe(), "madscience.power") {
        @Override
        public ItemStack makeIcon() {
            return Blocks.ALLIUM.asItem().getDefaultInstance();
        }
    }.setBackgroundImage(new ResourceLocation(MadScience.MODID, "textures/gui/tab_madscience.png"));

    //TODO more categories

    public static void init(){
    }
}
