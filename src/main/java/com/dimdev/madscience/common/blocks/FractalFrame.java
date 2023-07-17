package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class FractalFrame extends Block
{
    public FractalFrame(Properties pProperties) {
        super(pProperties.strength(1f,0f).lightLevel(light -> 1).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    }
}
