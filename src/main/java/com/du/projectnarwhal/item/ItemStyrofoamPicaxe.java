package com.du.projectnarwhal.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ItemStyrofoamPicaxe extends PickaxeItem {



    public ItemStyrofoamPicaxe(ToolMaterial toolMaterial_1, int int_1, float float_1, Settings item$Settings_1) {
        super(toolMaterial_1,int_1, float_1, item$Settings_1);

    }


    public boolean isEffectiveOn(BlockState blockState_1) {
        Block block_1 = blockState_1.getBlock();
        int int_1 = this.getMaterial().getMiningLevel();
        if (block_1 == Blocks.OBSIDIAN) {
            return int_1 == 3;
        } else if (block_1 != Blocks.DIAMOND_BLOCK && block_1 != Blocks.DIAMOND_ORE && block_1 != Blocks.EMERALD_ORE && block_1 != Blocks.EMERALD_BLOCK && block_1 != Blocks.GOLD_BLOCK && block_1 != Blocks.GOLD_ORE && block_1 != Blocks.REDSTONE_ORE) {
            if (block_1 != Blocks.IRON_BLOCK && block_1 != Blocks.IRON_ORE && block_1 != Blocks.LAPIS_BLOCK && block_1 != Blocks.LAPIS_ORE) {
                Material material_1 = blockState_1.getMaterial();
                return material_1 == Material.STONE || material_1 == Material.METAL || material_1 == Material.ANVIL;
            } else {
                return int_1 >= 1;
            }
        } else {
            return int_1 >= 2;
        }
    }

    public float getMiningSpeed(ItemStack itemStack_1, BlockState blockState_1) {
        Material material_1 = blockState_1.getMaterial();
        return material_1 != Material.METAL && material_1 != Material.ANVIL && material_1 != Material.STONE ? super.getMiningSpeed(itemStack_1, blockState_1) : this.miningSpeed;
    }

}
