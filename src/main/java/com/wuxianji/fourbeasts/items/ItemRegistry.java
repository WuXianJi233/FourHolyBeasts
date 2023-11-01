package com.wuxianji.fourbeasts.items;

import com.wuxianji.fourbeasts.Utils;
import com.wuxianji.fourbeasts.items.logo.ItemGroupLogo;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    //物品注册
    public static final RegistryObject<Item> GroupLogo = ITEMS.register("group_logo", com.wuxianji.fourbeasts.items.logo.ItemGroupLogo::new);
}
