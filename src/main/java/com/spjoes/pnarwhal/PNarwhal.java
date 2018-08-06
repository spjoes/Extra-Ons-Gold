package com.spjoes.pnarwhal;

import com.spjoes.pnarwhal.blocks.BlockHandler;
import com.spjoes.pnarwhal.items.CreativeTabPNarwhal;
import com.spjoes.pnarwhal.items.ItemHandler;
import com.spjoes.pnarwhal.proxies.CommonProxy;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid=Constants.MODID, name=Constants.NAME, version=Constants.VERSION, acceptedMinecraftVersions=Constants.MCVER)
public class PNarwhal {


	
	@SidedProxy(clientSide = "com.spjoes.pnarwhal.proxies.ClientProxy", serverSide = "com.spjoes.pnarwhal.proxies.CommonProxy")
	private static CommonProxy proxy;
	
	@Instance
	public static PNarwhal INSTANCE;
	
	public static CreativeTabs TAB;
	
	public static final SimpleNetworkWrapper wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Constants.MODID);
	
	@EventHandler
	public static void onPreInit(FMLPreInitializationEvent e) {
		BlockHandler.registerBlocks();
		ItemHandler.registerItems();
		TAB = new CreativeTabPNarwhal();
		

		
		proxy.registerModels();
		proxy.registerTERenders();

	}
	
	@EventHandler
	public static void onInit(FMLInitializationEvent e) {
		
		

		
		proxy.registerItemColors();
		

	}
	 
}