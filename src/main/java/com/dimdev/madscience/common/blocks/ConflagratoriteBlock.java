package com.dimdev.madscience.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ConflagratoriteBlock extends Block {
    public ConflagratoriteBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties.strength(2f,2f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    }
}
