package com.wuxianji.fourbeasts.blocks;

import com.wuxianji.fourbeasts.Utils;
import com.wuxianji.fourbeasts.blocks.ore.BlockAzureDragonOre;
import com.wuxianji.fourbeasts.blocks.ore.BlockBlackTortoiseOre;
import com.wuxianji.fourbeasts.blocks.ore.BlockVermilionBirdOre;
import com.wuxianji.fourbeasts.blocks.ore.BlockWhiteTigerOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);

    //方块注册
    public static final RegistryObject<Block> AzureDragonOre = BLOCKS.register("azure_dragon_ore", BlockAzureDragonOre::new);
    public static final RegistryObject<Block> VermilionBirdOre = BLOCKS.register("vermilion_bird_ore", BlockVermilionBirdOre::new);
    public static final RegistryObject<Block> WhiteTigerOre = BLOCKS.register("white_tiger_ore", BlockWhiteTigerOre::new);
    public static final RegistryObject<Block> BlackTortoiseOre = BLOCKS.register("black_tortoise_ore", BlockBlackTortoiseOre::new);
}
