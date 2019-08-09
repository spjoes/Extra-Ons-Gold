package com.du.projectnarwhal.item;


import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.block.BlockThrowableLamps;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.thrown.SnowballEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ItemBlockThrowableLamps extends BlockItem {



    public ItemBlockThrowableLamps(Block block_1, Item.Settings item$Settings_1) {
        super(block_1, item$Settings_1);
    }

//    new ItemBlockThrowableLamps(BlockThrowableLamps, itemSettingsYouCreate);



    public TypedActionResult<ItemStack> use(World world_1, PlayerEntity playerEntity_1, Hand hand_1) {
        ItemStack itemStack_1 = playerEntity_1.getStackInHand(hand_1);
        if (!playerEntity_1.abilities.creativeMode) {
            itemStack_1.decrement(1);
        }

        world_1.playSound((PlayerEntity)null, playerEntity_1.x, playerEntity_1.y, playerEntity_1.z, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));
        if (!world_1.isClient) {
            SnowballEntity snowballEntity_1 = new SnowballEntity(world_1, playerEntity_1);
            snowballEntity_1.setItem(itemStack_1);
            snowballEntity_1.setProperties(playerEntity_1, playerEntity_1.pitch, playerEntity_1.yaw, 0.0F, 1.5F, 1.0F);
            world_1.spawnEntity(snowballEntity_1);
        }
        return new TypedActionResult(ActionResult.SUCCESS, itemStack_1);
    }

}