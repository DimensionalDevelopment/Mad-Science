package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class FractalOre extends Block
{
    public FractalOre(Properties pProperties) {
        super(pProperties.strength(5f,0f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
