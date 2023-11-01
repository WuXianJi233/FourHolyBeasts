package com.wuxianji.fourbeasts.items;

import com.wuxianji.fourbeasts.Utils;
import com.wuxianji.fourbeasts.items.ingot.ItemAzureDragonIngot;
import com.wuxianji.fourbeasts.items.ingot.ItemBlackTortoiseIngot;
import com.wuxianji.fourbeasts.items.ingot.ItemVermilionBirdIngot;
import com.wuxianji.fourbeasts.items.ingot.ItemWhiteTigerIngot;
import com.wuxianji.fourbeasts.items.logo.ItemGroupLogo;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    //物品注册
    public static final RegistryObject<Item> GroupLogo = ITEMS.register("group_logo", ItemGroupLogo::new);
    public static final RegistryObject<Item> AzureDragonIngot = ITEMS.register("azure_dragon_ingot", ItemAzureDragonIngot::new);
    public static final RegistryObject<Item> VermilionBirdIngot = ITEMS.register("vermilion_bird_ingot", ItemVermilionBirdIngot::new);
    public static final RegistryObject<Item> WhiteTigerIngot = ITEMS.register("white_tiger_ingot", ItemWhiteTigerIngot::new);
    public static final RegistryObject<Item> BlackTortoiseIngot = ITEMS.register("black_tortoise_ingot", ItemBlackTortoiseIngot::new);
}
