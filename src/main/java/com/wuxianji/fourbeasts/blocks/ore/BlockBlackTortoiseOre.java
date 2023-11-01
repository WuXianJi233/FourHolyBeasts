package com.wuxianji.fourbeasts.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBlackTortoiseOre extends Block {

    public BlockBlackTortoiseOre(){
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(15.0F)
                .sound(SoundType.STONE));
    }
}
