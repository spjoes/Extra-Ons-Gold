package com.DU.ProjectNarwhal.init;

import com.DU.ProjectNarwhal.block.*;
import com.DU.ProjectNarwhal.ProjectNarwhal;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PNarwhalBlocks {

    public static final BlockThrowableLamps TLAMPS;
    public static final BlockSnes SNES;
    public static final BlockStyrofoamOre STYROFOAM_ORE;
    public static final BlockSheepOre SHEEP_ORE;

    static {
        TLAMPS = register(new BlockThrowableLamps(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "tlamps"));
        SNES = register(new BlockSnes(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "snes"));
        STYROFOAM_ORE = register(new BlockStyrofoamOre(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "styrofoamore"));
        SHEEP_ORE = register(new BlockSheepOre(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "sheepore"));
    }

    private static <T extends Block> T register(T block, Identifier name) {
        Registry.register(Registry.BLOCK, name, block);
        return block;
    }

}