package com.du.projectnarwhal.item;


import com.du.projectnarwhal.ProjectNarwhal;

import com.du.projectnarwhal.init.PNarwhalItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ItemThrowableCar extends BaseItem {

    public final boolean creative;

    public ItemThrowableCar(Settings item$Settings_1, boolean creative) {
        super(item$Settings_1);
        this.creative = creative;
    }


    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!player.abilities.creativeMode && !creative) {
            itemStack.decrement(1);
        }

        world.playSound((PlayerEntity) null, player.x, player.y, player.z, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));
        if (!world.isClient) {
            SnowballEntity entity = new SnowballEntity(world, player);
            entity.setItem(new ItemStack(PNarwhalItems.TCAR));
            //TomatoEntity entity = new TomatoEntity(world, player);

            //this.getDataTracker().set(field_17082, SystemUtil.consume(itemStack_1.copy(), (itemStack_1x) -> {
            //    itemStack_1x.setAmount(1);
            // }));


            SnowballEntity snowballEntity_1 = new SnowballEntity(world, player);
            entity.setItem(new ItemStack(PNarwhalItems.TCAR));//itemStack);
            snowballEntity_1.setProperties(player, player.pitch, player.yaw, 0.0F, 1.5F, 1.0F);
            // entity.calculateVelocity(player, player.pitch, player.yaw, 0.0F, 1.5F, 1.0F);
            world.spawnEntity(entity);
        }

        player.incrementStat(Stats.USED.getOrCreateStat(this));
        return new TypedActionResult<>(ActionResult.SUCCESS, itemStack);
    }
}