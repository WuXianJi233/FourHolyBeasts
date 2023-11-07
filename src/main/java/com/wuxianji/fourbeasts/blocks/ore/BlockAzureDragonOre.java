package com.wuxianji.fourbeasts.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Items;

public class BlockAzureDragonOre extends OreBlock {

    public BlockAzureDragonOre(){
        super(Properties.create(Material.ROCK)
                .setRequiresTool()
                .setLightLevel((light)->5)
                .hardnessAndResistance(5.0F)
                .sound(SoundType.STONE));
    }
}
