package com.du.projectnarwhal.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public abstract class BlockModContainer extends Block implements BlockEntityProvider {

    public BlockModContainer(Material materialIn) {
        super(Settings.of(materialIn));
    }

    public void onBroken(IWorld worldIn, BlockPos pos, BlockState state) {
        super.onBroken(worldIn, pos, state);
        worldIn.breakBlock(pos, false);
    }

}