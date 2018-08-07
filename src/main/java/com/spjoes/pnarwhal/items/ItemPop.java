package com.spjoes.pnarwhal.items;

import com.spjoes.pnarwhal.PNarwhal;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPop extends Item {

    public ItemPop() {
        this.setMaxStackSize(1);
        this.setRegistryName("pop");
        this.setUnlocalizedName("pop");
    }
    
    
}