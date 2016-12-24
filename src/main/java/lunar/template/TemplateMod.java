package lunar.template;

import lunar.template.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class TemplateMod {
	@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
	public static class Template {
		
		@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
		public static CommonProxy proxy;
		
		@EventHandler
		public void preinit(FMLPreInitializationEvent event)
		{
			
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event)
		{
			proxy.registerRenders();
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{
			
		}
	}
	}
