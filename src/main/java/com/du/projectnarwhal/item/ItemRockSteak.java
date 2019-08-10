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
        super(settings);
    }
    public ItemStack finishUsing(ItemStack itemStack_1, World world_1, LivingEntity livingEntity_1) {

        System.out.print("The effects ran");


        if (!world_1.isClient) {
            Random rando = new Random();
            int number = rando.nextInt(8);
            number = number + 1;
            if (number == 1) {

                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 2));
                // .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 2), 1.0F);
            } else if (number == 2) {

                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.POISON, 300, 2));
                // .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 300, 1), 1.0F);
            } else if (number == 3) {
                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 300, 2));
                // .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 300, 10), 1.0F);

            } else if (number == 4) {
                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 300, 2));
            } else if (number == 5) {

                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 300, 2));

            } else if (number == 6) {
                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 2));
            } else if (number == 7) {
                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 300, 2));
            } else if (number == 8) {
                livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.WITHER, 300, 2));
            }
        }
        return super.finishUsing(itemStack_1, world_1, livingEntity_1);
    }


}
