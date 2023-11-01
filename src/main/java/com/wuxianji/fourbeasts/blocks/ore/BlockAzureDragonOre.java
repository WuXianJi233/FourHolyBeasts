package com.wuxianji.fourbeasts.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Items;

public class BlockAzureDragonOre extends Block {

    public BlockAzureDragonOre(){
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(15.0F)
                .sound(SoundType.STONE));
    }
}
