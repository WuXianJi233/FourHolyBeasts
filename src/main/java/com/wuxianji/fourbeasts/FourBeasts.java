package com.wuxianji.fourbeasts;

import com.wuxianji.fourbeasts.blocks.BlockRegistry;
import com.wuxianji.fourbeasts.items.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class FourBeasts {
    public FourBeasts(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
