package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlueAEmber extends Block
{
    public BlueAEmber(Properties pProperties) {
        super(pProperties.strength(6f,8f).lightLevel(light -> 6).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    }
}
