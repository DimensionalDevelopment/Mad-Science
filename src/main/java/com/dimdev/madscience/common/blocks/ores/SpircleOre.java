package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class SpircleOre extends Block
{
    //TODO takes another random ore!
    public SpircleOre(Properties pProperties) {
        super(pProperties.strength(3f,3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
