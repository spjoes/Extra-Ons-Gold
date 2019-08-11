package com.du.projectnarwhal;

import com.du.projectnarwhal.villager.PNarwhalVillagers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.registry.Registry;

import com.du.projectnarwhal.init.PNarwhalBlocks;
import com.du.projectnarwhal.init.PNarwhalItems;

public class ProjectNarwhal implements ModInitializer {

    public static final String MOD_ID = "pnarwhal";
    public static final String MOD_NAME = "Project Narwhal";
    public static final Logger LOGGER = LogManager.getLogger(String.format("[%s]", MOD_NAME));

    public static final ItemGroup PNARWHAL_TAB = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "pnarwhal_tab"))
            .icon(() -> new ItemStack(PNarwhalBlocks.TLAMPS)).build();




    @Override
    public void onInitialize() {
        new PNarwhalBlocks();
        new PNarwhalItems();
        PNarwhalVillagers.init();
    }

//    @Override
//    public void preInitialize() {
//        Registry.addSmelting(new ItemStack(Items.DRAGON_EGG), new ItemStack(PNarwhalItems.OMLET_ITEM), 5.5f);
//    }

}