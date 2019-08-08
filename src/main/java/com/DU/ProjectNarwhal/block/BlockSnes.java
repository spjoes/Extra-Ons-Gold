package com.DU.ProjectNarwhal.block;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.block.Block;

public class BlockSnes extends Block {

    public BlockSnes(Material materialIn) {
        super(Settings.of(materialIn));
    }

    @Override
    public boolean isOpaque(BlockState blockState_1) {
        return false;
    }

    @Override
    public boolean isSimpleFullBlock(BlockState blockState_1, BlockView blockView_1, BlockPos blockPos_1) {
        return false;
    }

}