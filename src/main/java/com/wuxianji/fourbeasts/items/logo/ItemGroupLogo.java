package com.wuxianji.fourbeasts.items.logo;

import com.wuxianji.fourbeasts.group.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemGroupLogo extends Item {

    public ItemGroupLogo(){
        super(new Properties().group(ModGroup.itemGroup));
    }
}
