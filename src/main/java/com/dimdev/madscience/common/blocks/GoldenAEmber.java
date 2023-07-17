package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class GoldenAEmber extends Block
{
    public GoldenAEmber(Properties pProperties) {
        super(pProperties.strength(6f,8f).lightLevel(light -> 4).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    }
}
