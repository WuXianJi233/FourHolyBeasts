package com.wuxianji.fourbeasts.items.tool.weapon;

import com.wuxianji.fourbeasts.attribute.FourHolyBeastsAttribute;
import com.wuxianji.fourbeasts.group.ModGroup;
import com.wuxianji.fourbeasts.items.tool.tier.FourHolyBeastsToolTier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 *
 * 四圣兽剑
 * 成员：
 * index=当前属性下标；RightClickBurialTime=右键切换属性冷却时间；hitEntityDeBuffTime=被攻击实体获得buff的时间刻
 * convert=获取属性buff开关，只有右键切换后可以打开；attributeName=四圣兽属性名字
 * attributeMap=四圣兽属性对应buff集合
 *
 */
public class FourHolyBeastsSword extends SwordItem {

    private int index =0;
    private int RightClickBurialTime=100;
    private int hitEntityDeBuffTime=6*20;
    private boolean convert = true;
    private String[] attributeName = FourHolyBeastsAttribute.getAttributeName();
    private Map<String,EffectInstance[]> attributeMap = FourHolyBeastsAttribute.getAttribute(true);

    public FourHolyBeastsSword() {
        super(FourHolyBeastsToolTier.FOURHOLYBEASTS,5,-2.4F,new Item.Properties().group(ModGroup.itemGroup));
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if(!worldIn.isRemote&&isSelected){
            if(RightClickBurialTime<100){
                RightClickBurialTime++;
            }
            getPlayerParticle(attributeName[index],worldIn,entityIn);
            if(convert){
                PlayerEntity player =(PlayerEntity) entityIn;
                if(!player.getActivePotionEffects().isEmpty()){
                    for(EffectInstance effectInstance:attributeMap.get(attributeName[index==0?3:index-1])){
                        player.removePotionEffect(effectInstance.getPotion());
                    }
                }
                for(EffectInstance effect:attributeMap.get(attributeName[index])){
                    player.addPotionEffect(effect);
                }
                convert=false;
            }
        }
        super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(!worldIn.isRemote){
            if(RightClickBurialTime>=100){
                index=index>=3?0:index+1;
                TranslationTextComponent textComponent = new TranslationTextComponent(attributeName[index]);
                playerIn.sendStatusMessage(textComponent,true);
                RightClickBurialTime=0;
                convert=true;
            }else{
                TranslationTextComponent textComponent = new TranslationTextComponent("message.fourHolyBeastsSword.rightClickBurialTime",5-RightClickBurialTime/20);
                playerIn.sendStatusMessage(textComponent,true);
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        setDeBuffOnHitEntity(target,attributeName[index]);
        return super.hitEntity(stack, target, attacker);
    }

    private void setDeBuffOnHitEntity(LivingEntity entity,String attributeName){
        switch (attributeName){
            case "attribute.azureDragon":entity.addPotionEffect(new EffectInstance(Effects.POISON,hitEntityDeBuffTime));break;
            case "attribute.vermilionBird":entity.forceFireTicks(hitEntityDeBuffTime);break;
            case "attribute.whiteTiger":entity.addPotionEffect(new EffectInstance(Effects.WEAKNESS,hitEntityDeBuffTime));break;
            case "attribute.blackTortoise":entity.addPotionEffect(new EffectInstance(Effects.WITHER,hitEntityDeBuffTime));break;
        }
    }

    public int getIndex(){
        return this.index;
    }

    private void getPlayerParticle(String attributeName,World world,Entity entity){
        switch (attributeName){
            case "attribute.azureDragon":((ServerWorld)world).spawnParticle((ServerPlayerEntity) entity, ParticleTypes.HAPPY_VILLAGER,false,entity.getPosX(),entity.getPosY()+0.5,entity.getPosZ(),1,0.5D,1.0D,0.5D,0.2D);break;
            case "attribute.vermilionBird":((ServerWorld)world).spawnParticle((ServerPlayerEntity) entity, ParticleTypes.LAVA,false,entity.getPosX(),entity.getPosY()+0.5,entity.getPosZ(),1,0.5D,1.0D,0.5D,0.2D);break;
            case "attribute.whiteTiger":((ServerWorld)world).spawnParticle((ServerPlayerEntity) entity, ParticleTypes.INSTANT_EFFECT,false,entity.getPosX(),entity.getPosY()+0.5,entity.getPosZ(),1,0.5D,1.0D,0.5D,0.2D);break;
            case "attribute.blackTortoise":((ServerWorld)world).spawnParticle((ServerPlayerEntity) entity, ParticleTypes.NAUTILUS,false,entity.getPosX(),entity.getPosY()+0.5,entity.getPosZ(),1,0.5D,1.0D,0.5D,0.2D);break;
        }
    }

}
