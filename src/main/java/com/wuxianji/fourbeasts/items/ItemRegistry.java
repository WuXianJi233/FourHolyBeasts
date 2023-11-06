package com.wuxianji.fourbeasts.items;

import com.wuxianji.fourbeasts.Utils;
import com.wuxianji.fourbeasts.blocks.BlockRegistry;
import com.wuxianji.fourbeasts.group.ModGroup;
import com.wuxianji.fourbeasts.items.ingot.ItemAzureDragonIngot;
import com.wuxianji.fourbeasts.items.ingot.ItemBlackTortoiseIngot;
import com.wuxianji.fourbeasts.items.ingot.ItemVermilionBirdIngot;
import com.wuxianji.fourbeasts.items.ingot.ItemWhiteTigerIngot;
import com.wuxianji.fourbeasts.items.logo.ItemGroupLogo;
import com.wuxianji.fourbeasts.items.tool.weapon.FourHolyBeastsSword;
import net.minecraft.item.BlockItem;
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
    public static final RegistryObject<Item> FourHolyBeastsSword = ITEMS.register("four_holy_beasts_sword", FourHolyBeastsSword::new);

    //方块物品注册
    public static final RegistryObject<Item> AzureDragonOre = ITEMS.register("azure_dragon_ore",()->new BlockItem(BlockRegistry.AzureDragonOre.get(),new Item.Properties().group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> VermilionBirdOre = ITEMS.register("vermilion_bird_ore",()->new BlockItem(BlockRegistry.VermilionBirdOre.get(),new Item.Properties().group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> WhiteTigerOre = ITEMS.register("white_tiger_ore",()->new BlockItem(BlockRegistry.WhiteTigerOre.get(),new Item.Properties().group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> BlackTortoiseOre = ITEMS.register("black_tortoise_ore",()->new BlockItem(BlockRegistry.BlackTortoiseOre.get(),new Item.Properties().group(ModGroup.itemGroup)));
}
