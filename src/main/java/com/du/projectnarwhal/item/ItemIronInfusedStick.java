package com.du.projectnarwhal.item;

import com.du.projectnarwhal.ProjectNarwhal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.thrown.SnowballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ItemIronInfusedStick extends BaseItem {

    public ItemIronInfusedStick() {
        super(new Settings().group(ProjectNarwhal.PNARWHAL_TAB));
    }

}