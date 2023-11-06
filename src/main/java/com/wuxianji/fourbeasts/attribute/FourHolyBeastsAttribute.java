package com.wuxianji.fourbeasts.attribute;

import io.netty.util.internal.StringUtil;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * 四圣兽属性类型
 * attributeName:属性名集合
 * isSword：是否为武器类型，否则为工具类型
 *
 * 武器类型buff：
 * 青龙：迅捷2、跳跃提升2
 * 朱雀：抗火、生命恢复2
 * 白虎：力量2、伤害吸收2
 * 玄武：潮涌能量、海豚的恩惠
 *
 */
public class FourHolyBeastsAttribute {

    private static final String[] ATTRIBUTENAME=new String []{"attribute.azureDragon"
            ,"attribute.vermilionBird","attribute.whiteTiger","attribute.blackTortoise"};

    public static Map<String, EffectInstance[]> getAttribute(boolean isSword){
        if(isSword){
            int duration = 60*60*20;
            Map<String,EffectInstance[]> result = new HashMap<>();
            result.put("attribute.azureDragon",new EffectInstance[]{
                    new EffectInstance(Effects.SPEED,duration,1),
                    new EffectInstance(Effects.JUMP_BOOST,duration,1)});
            result.put("attribute.vermilionBird",new EffectInstance[]{
                    new EffectInstance(Effects.FIRE_RESISTANCE,duration),
                    new EffectInstance(Effects.REGENERATION,duration,1)
            });
            result.put("attribute.whiteTiger",new EffectInstance[]{
                    new EffectInstance(Effects.STRENGTH,duration,1),
                    new EffectInstance(Effects.ABSORPTION,duration,1)
            });
            result.put("attribute.blackTortoise",new EffectInstance[]{
                    new EffectInstance(Effects.CONDUIT_POWER,duration),
                    new EffectInstance(Effects.DOLPHINS_GRACE,duration)
            });
            return result;
        }else{
            return null;
        }
    }

    public static String[] getAttributeName() {
        return ATTRIBUTENAME;
    }
}
