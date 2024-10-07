package com.dimdev.madscience.common.blocks.ores;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class AEmberJet extends Block
{
    public AEmberJet(Properties pProperties) {
        super(pProperties.strength(6f,8f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }
}
