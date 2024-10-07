package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class TuberousDirt extends Block
{
    public TuberousDirt(Properties pProperties) {
        super(pProperties.strength(1f,1f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
