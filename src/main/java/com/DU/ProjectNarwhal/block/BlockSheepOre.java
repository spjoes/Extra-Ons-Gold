package com.DU.ProjectNarwhal.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BlockSheepOre extends OreBlock {

    public BlockSheepOre(Material materialIn) {
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