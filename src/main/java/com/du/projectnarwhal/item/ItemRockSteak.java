package com.du.projectnarwhal.item;

import com.du.projectnarwhal.ProjectNarwhal;
import net.minecraft.advancement.criterion.Criterions;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

import java.util.Random;

public class ItemRockSteak extends BaseItem {

    public ItemRockSteak(Settings settings) {
        super(new Settings().group(ProjectNarwhal.PNARWHAL_TAB));
    }
    public ItemStack finishUsing(ItemStack itemStack_1, World world_1, LivingEntity livingEntity_1) {

        Random rando = new Random();
        int number = rando.nextInt(8);
        number = number + 1;
        if (number == 1) {

            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.NAUSEA));
            // .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 2), 1.0F);
        } else if (number == 2) {

            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.POISON));
            // .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 300, 1), 1.0F);
        } else if (number == 3) {
            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.WEAKNESS));
            // .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 300, 10), 1.0F);

        } else if (number == 4) {
            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE));
        } else if (number == 5) {

            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE));

        } else if (number == 6) {
            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.SLOWNESS));
        } else if (number == 7) {
            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.UNLUCK));
        } else if (number == 8) {
            livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.WITHER));
        }
        return null;
    }

}
