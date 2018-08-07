package com.spjoes.pnarwhal.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class CreativeTabPNarwhal extends CreativeTabs {

	public CreativeTabPNarwhal() {
		super("pnarwhal");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemHandler.TAB_ICON);
	}
	
	@Override
	public void displayAllRelevantItems(NonNullList<ItemStack> list) {
		for(int i = 0; i < 17; i++) {
			// list.add(new ItemStack(ItemHandler.MICROPHONE, 1, i));
		}
		list.add(new ItemStack(ItemHandler.WALKER));
		list.add(new ItemStack(ItemHandler.VR));
		list.add(new ItemStack(ItemHandler.MHELMET));
		list.add(new ItemStack(ItemHandler.GGUN));
		list.add(new ItemStack(ItemHandler.DHAT));
		list.add(new ItemStack(ItemHandler.CMASK));
		list.add(new ItemStack(ItemHandler.ITEM_POP));
		list.add(new ItemStack(ItemHandler.OJ));
		
		for(int i = 0; i < 3; i++) {
			// list.add(new ItemStack(ItemHandler.CONSOLE, 1, i));
		}
		for(int i = 0; i < 3; i++) {
			// list.add(new ItemStack(ItemHandler.CONTROLLER, 1, i));
		}
		for(int i = 0; i < 17; i++) {
			// list.add(new ItemStack(ItemHandler.HEADPHONES, 1, i));
		}
	}

}