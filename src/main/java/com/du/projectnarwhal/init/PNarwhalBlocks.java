package com.du.projectnarwhal.init;

import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.block.*;

import com.du.projectnarwhal.item.ItemBlockThrowableLamps;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PNarwhalBlocks {

   public static final BlockThrowableLamps TLAMPS;
    public static final BlockSnes SNES;
    public static final BlockStyrofoamOre STYROFOAM_ORE;
    public static final BlockSheepOre SHEEP_ORE;
    public static final BlockSteakOre STEAK_ORE;
    public static final BlockHTable H_TABLE;
    public static final BlockTv TV;

    static {
        // TLAMPS = register(new BlockThrowableLamps(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "tlamps"));
        SNES = register(new BlockSnes(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "snes"));
        STYROFOAM_ORE = register(new BlockStyrofoamOre(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "styrofoamore"));
        SHEEP_ORE = register(new BlockSheepOre(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "sheepore"));
        STEAK_ORE = register(new BlockSteakOre(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "steakore"));
        H_TABLE = register(new BlockHTable(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "htable"));
        TV = register(new BlockTv(Material.ANVIL), new Identifier(ProjectNarwhal.MOD_ID, "tv"));

        TLAMPS = new BlockThrowableLamps(Material.ANVIL);
        register(TLAMPS, new Identifier(ProjectNarwhal.MOD_ID, "tlamps"), new ItemBlockThrowableLamps(TLAMPS));
    }




    private static <T extends Block> T register(T block, Identifier name) {
        Registry.register(Registry.BLOCK, name, block);
        Registry.register(Registry.ITEM, name, new BlockItem(block, new Item.Settings().group(ProjectNarwhal.PNARWHAL_TAB)));
        return block;
    }

    private static <T extends Block> T register(T block, Identifier name, BlockItem item) {
        Registry.register(Registry.BLOCK, name, block);
        Registry.register(Registry.ITEM, name, item);
        return block;
    }

}