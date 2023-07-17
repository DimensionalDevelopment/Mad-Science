package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BygoneMineral extends Block
{
    public BygoneMineral(Properties pProperties) {
        super(pProperties.strength(6f,10f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
