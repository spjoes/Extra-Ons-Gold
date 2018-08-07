package com.spjoes.pnarwhal.proxies;


import com.spjoes.pnarwhal.Constants;
import com.spjoes.pnarwhal.items.ItemHandler;


import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	public void registerModels() {
		OBJLoader.INSTANCE.addDomain(Constants.MODID);
		
		for(EnumDyeColor col : EnumDyeColor.values()) {
			// this.registerModel(ItemHandler.MICROPHONE, col.getMetadata(), new ResourceLocation(Constants.MODID, "mic/" + col.getName()));
			
		}
		for(int i = 0; i < 3; i++) {
			// EnumConsoleType type = EnumConsoleType.fromMeta(i);
			// this.registerModel(ItemHandler.CONSOLE, i, new ResourceLocation(Constants.MODID, "console_" + type.getName()));
			
		}
		
		this.registerModel(ItemHandler.TAB_ICON, 0, new ResourceLocation(Constants.MODID, "tab_icon"));
		this.registerModel(ItemHandler.WALKER, 0, new ResourceLocation(Constants.MODID, "walker"));
		this.registerModel(ItemHandler.VR, 0, new ResourceLocation(Constants.MODID, "vr_headset"));
		this.registerModel(ItemHandler.MHELMET, 0, new ResourceLocation(Constants.MODID, "mhelmet"));
		this.registerModel(ItemHandler.GGUN, 0, new ResourceLocation(Constants.MODID, "ggun"));
		this.registerModel(ItemHandler.DHAT, 0, new ResourceLocation(Constants.MODID, "dhat"));
	
	}
	
	public void registerItemColors() {
		IItemColor jeb = new IItemColor() {
			public int getColorFromItemstack(ItemStack stack, int tintIndex) {
				int time = (int) (Minecraft.getSystemTime()%6000);
				int r = 0, g = 0, b = 0;
				if(time < 1000) {
					r = 255;
					g = (int) ((time/1000.0)*255);
				} else if(time < 2000) {
					g = 255;
					r = (int) ((1.0-((time-1000)/1000.0))*255);
				} else if(time < 3000) {
					g = 255;
					b = (int) (((time-2000)/1000.0)*255);
				} else if(time < 4000) {
					b = 255;
					g = (int) ((1.0-((time-3000)/1000.0))*255);
				} else if(time < 5000) {
					b = 255;
					r = (int) (((time-4000)/1000.0)*255);
				} else {
					r = 255;
					b = (int) ((1.0-((time-5000)/1000.0))*255);
				}
				return tintIndex == 1 && stack.getItemDamage() == 16 ? ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | ((b & 0xFF) << 0) : 0xFFFFFF;
			}

			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		// Minecraft.getMinecraft().getItemColors().registerItemColorHandler(jeb, ItemHandler.HEADPHONES, ItemHandler.MICROPHONE);
	}
	
	private void registerModel(Item item, int damage, ResourceLocation rl) {
		ModelLoader.setCustomModelResourceLocation(item, damage, new ModelResourceLocation(rl, "inventory"));
	}
	
	public void registerTERenders() {

	}
	
}