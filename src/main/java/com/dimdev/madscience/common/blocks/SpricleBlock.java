package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class SpricleBlock extends Block
{
    public SpricleBlock(Properties pProperties) {
        super(pProperties.strength(5f,6f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
