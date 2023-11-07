package com.wuxianji.fourbeasts.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBlackTortoiseOre extends OreBlock {

    public BlockBlackTortoiseOre(){
        super(Properties.create(Material.ROCK)
                .setRequiresTool()
                .setLightLevel((light)->5)
                .hardnessAndResistance(5.0F)
                .sound(SoundType.STONE));
    }
}
