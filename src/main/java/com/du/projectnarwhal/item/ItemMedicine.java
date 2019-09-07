package com.du.projectnarwhal.item;

import com.du.projectnarwhal.ThingForLater;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.world.World;

import java.util.Random;

public class ItemMedicine extends BaseItem {



    public ItemMedicine(Settings settings) {
        super(settings);
    }


    @Override
    public ItemStack finishUsing(ItemStack itemStack_1, World world_1, LivingEntity livingEntity_1) {

        System.out.print("InfectedRate cure ran");


        if (!world_1.isClient) {
            livingEntity_1.clearStatusEffects();
                 if (livingEntity_1 instanceof PlayerEntity) {


                  ((ThingForLater)livingEntity_1).setInfectedLevel(((ThingForLater)livingEntity_1).getInfectedLevel()-(((ThingForLater)livingEntity_1).getInfectedLevel()));

                     ((ThingForLater)livingEntity_1).setDruggedLevel(((ThingForLater)livingEntity_1).getDruggedLevel()+25.0f);
                     ((PlayerEntity) livingEntity_1).addChatMessage(new LiteralText("Drugged: " + ((ThingForLater)livingEntity_1).getDruggedLevel() +"%"), false);



                     if (((ThingForLater)livingEntity_1).getDruggedLevel()<=100) {

                }
            }
        }
        return super.finishUsing(itemStack_1, world_1, livingEntity_1);
    }


}
