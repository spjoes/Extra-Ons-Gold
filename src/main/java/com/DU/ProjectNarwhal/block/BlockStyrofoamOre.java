package com.DU.ProjectNarwhal.block;

import com.DU.ProjectNarwhal.init.PNarwhalItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Random;

public class BlockStyrofoamOre extends OreBlock {

    public BlockStyrofoamOre(Material materialIn) {
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