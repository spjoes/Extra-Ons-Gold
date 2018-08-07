package com.spjoes.pnarwhal.items;

import com.spjoes.pnarwhal.Constants;
import com.spjoes.pnarwhal.blocks.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemHandler {

	public static Item TAB_ICON, WALKER, VR, MHELMET, GGUN, DHAT;
	
	public static void registerItems() {
		TAB_ICON = new Item().setRegistryName(Constants.MODID, "tab_icon");
		WALKER = new ItemWalker();
		VR = new ItemVRHeadset();
		MHELMET = new ItemMHelmet();
		GGUN = new ItemGravityGun();
		DHAT = new ItemDHat();
		
		
		// CHAIR = createIB(BlockHandler.CHAIR);
		
		registerAll(TAB_ICON, WALKER, VR, MHELMET, GGUN, DHAT);
	}
	
	private static Item createIB(Block block) {
		return createIB(block, false);
	}
	
	private static Item createIB(Block block, boolean hasSubtypes) {
		Item item = new ItemBlock(block).setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName());
		if(hasSubtypes) {
			item = item.setMaxDamage(0).setHasSubtypes(true);
		}
		return item;
	}
	
	private static void registerAll(Item... items) {
		for(Item i : items) {
			ForgeRegistries.ITEMS.register(i);
		}
	}
	
}