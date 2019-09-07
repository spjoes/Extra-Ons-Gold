package com.du.projectnarwhal.item;


import com.sun.scenario.Settings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.FireBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FireChargeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SnowballItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;



public class ItemOrb extends SnowballItem {


    public ItemOrb(Settings settings) {
        super(settings);
    }


    public ActionResult useOnBlock(ItemUsageContext itemUsageContext_1) {
        World world_1 = itemUsageContext_1.getWorld();
        if (world_1.isClient) {
            return ActionResult.SUCCESS;
        } else {
            BlockPos blockPos_1 = itemUsageContext_1.getBlockPos();
            BlockState blockState_1 = world_1.getBlockState(blockPos_1);
            if (blockState_1.getBlock() == Blocks.CAMPFIRE) {
                if (!(Boolean)blockState_1.get(CampfireBlock.LIT) && !(Boolean)blockState_1.get(CampfireBlock.WATERLOGGED)) {
                    this.playUseSound(world_1, blockPos_1);
                    world_1.setBlockState(blockPos_1, (BlockState)blockState_1.with(CampfireBlock.LIT, true));
                }
            } else {
                blockPos_1 = blockPos_1.offset(itemUsageContext_1.getSide());
                if (world_1.getBlockState(blockPos_1).isAir()) {
                    this.playUseSound(world_1, blockPos_1);
                    world_1.setBlockState(blockPos_1, ((FireBlock)Blocks.FIRE).getStateForPosition(world_1, blockPos_1));
                }
            }

            itemUsageContext_1.getStack().decrement(1);
            return ActionResult.SUCCESS;
        }
    }

    public UseAction getUseAction(ItemStack itemStack_1) {
        return UseAction.DRINK;
    }


    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(itemStack, world, tooltip, tooltipContext);
        tooltip.add((new LiteralText("The Orb Is Full Of Magic")).formatted(Formatting.GRAY));
    }

    private void playUseSound(World world_1, BlockPos blockPos_1) {
        world_1.playSound((PlayerEntity)null, blockPos_1, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 1.0F, (RANDOM.nextFloat() - RANDOM.nextFloat()) * 0.2F + 1.0F);
    }
//
//    @Override
//    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
//        super.appendTooltip(itemStack, world, tooltip, tooltipContext);
//        tooltip.add((new TranslatableText("The Orb Is Empty")).formatted(Formatting.GRAY));
//    }
}
