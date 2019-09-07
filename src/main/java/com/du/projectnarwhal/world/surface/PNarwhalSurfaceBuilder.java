package com.du.projectnarwhal.world.surface;

import com.du.projectnarwhal.init.PNarwhalBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.*;

import java.util.function.Function;

public abstract class PNarwhalSurfaceBuilder extends SurfaceBuilder {


    public static final BlockState SHEEPORE_BLOCK;
    public static final TernarySurfaceConfig SHEEPORE_CONFIG;

    static {

        SHEEPORE_BLOCK = PNarwhalBlocks.SHEEP_ORE.getDefaultState();
        SHEEPORE_CONFIG = new TernarySurfaceConfig(SHEEPORE_BLOCK, SHEEPORE_BLOCK, SHEEPORE_BLOCK);


    }

    public PNarwhalSurfaceBuilder(Function function_1) {
        super(function_1);
    }
}
