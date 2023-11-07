package com.wuxianji.fourbeasts.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockWhiteTigerOre extends OreBlock {

    public BlockWhiteTigerOre(){
        super(Properties.create(Material.ROCK)
                .setRequiresTool()
                .setLightLevel((light)->5)
                .hardnessAndResistance(5.0F)
                .sound(SoundType.STONE));
    }
}
