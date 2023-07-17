package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class AEmberOre extends Block
{
    public AEmberOre(Properties pProperties) {
        super(pProperties.strength(12f,12f).sound(SoundType.STONE));
    }
}
