package com.wuxianji.fourbeasts.group;

import com.wuxianji.fourbeasts.items.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FourHolyBeastsGroup extends ItemGroup {

    public FourHolyBeastsGroup(){
        super("four_holy_beasts_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.GroupLogo.get());
    }
}
