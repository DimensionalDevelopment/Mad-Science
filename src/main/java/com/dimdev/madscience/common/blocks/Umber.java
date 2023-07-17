package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Umber extends Block
{
    public Umber(Properties pProperties) {
        super(pProperties.strength(6f,8f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    }
}
