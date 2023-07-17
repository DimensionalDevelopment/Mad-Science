package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class ShadowOre extends Block
{
    public ShadowOre(Properties pProperties) {
        super(pProperties.strength(3f,3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
