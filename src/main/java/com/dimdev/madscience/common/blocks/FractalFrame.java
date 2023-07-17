package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class WhiteAEmber extends Block
{
    public WhiteAEmber(Properties pProperties) {
        super(pProperties.strength(6f,8f).lightLevel(light -> 2).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    }
}
