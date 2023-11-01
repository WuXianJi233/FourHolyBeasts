package com.wuxianji.fourbeasts.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockWhiteTigerOre extends Block {

    public BlockWhiteTigerOre(){
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(15.0F)
                .sound(SoundType.STONE));
    }
}
