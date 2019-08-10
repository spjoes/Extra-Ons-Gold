package com.du.projectnarwhal.item;

import com.du.projectnarwhal.ProjectNarwhal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ItemRedstoneSaber extends BaseItem {

    public ItemRedstoneSaber() {
        super(new Item.Settings().group(ProjectNarwhal.PNARWHAL_TAB));
    }

}
