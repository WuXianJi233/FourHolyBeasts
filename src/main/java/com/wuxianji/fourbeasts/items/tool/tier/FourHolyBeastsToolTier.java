package com.wuxianji.fourbeasts.items.tool.tier;

import com.wuxianji.fourbeasts.items.ItemRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum FourHolyBeastsToolTier implements IItemTier {

    FOURHOLYBEASTS(3,2000,10.0F,4.0F,30);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;

    FourHolyBeastsToolTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
    }


    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ItemRegistry.AzureDragonIngot.get()
                ,ItemRegistry.VermilionBirdIngot.get()
                ,ItemRegistry.WhiteTigerIngot.get()
                ,ItemRegistry.BlackTortoiseIngot.get());
    }
}
