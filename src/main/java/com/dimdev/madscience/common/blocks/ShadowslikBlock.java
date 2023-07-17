package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class ShadowslikBlock extends Block
{
    public ShadowslikBlock(Properties pProperties) {
        super(pProperties.strength(1f,15f).requiresCorrectToolForDrops());
    }
}
