package com.spjoes.pnarwhal.blocks;


import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockHandler {

	public static Block POP;
	
	public static void registerBlocks() {
		POP = new BlockPop();
	
		
		ForgeRegistries.BLOCKS.register(POP);
		
	}
	
}
