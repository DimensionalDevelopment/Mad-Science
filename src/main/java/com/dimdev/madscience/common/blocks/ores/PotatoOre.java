package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class PotatoOre extends Block
{
    public PotatoOre(Properties pProperties) {
        super(pProperties.strength(1f,1f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
