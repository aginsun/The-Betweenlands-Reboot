package betweenlands;


import net.minecraftforge.common.MinecraftForge;
import betweenlands.blocks.Blocks;
import betweenlands.entities.mobs.EntityDarkDruid;
import betweenlands.items.Items;
import betweenlands.lib.ModInfo;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod ( channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true )


public class Betweenlands {
	@Instance(ModInfo.ID)
	public static Betweenlands instance;

public static final String PREFIX = "thebl";

	@SidedProxy( clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide = ModInfo.PROXY_LOCATION + ".CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.initRenderers();
		proxy.initSounds();
		MinecraftForge.EVENT_BUS.register(new BetweenlandsSoundEvent());
		Items.init();
		Blocks.init();
		// ConfigHandler.init(event.getSuggestedConfigurationFile()); -- Leave those there, we may need them.
		
		

	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		Items.addNames();
		Blocks.addNames();
		//proxy.registerSound();
		 EntityRegistry.registerModEntity(EntityDarkDruid.class, "darkDruid", 2, instance, 30, 3, true);
		 LanguageRegistry.instance().addStringLocalization("entity.DarkDruid.name", "en_US","DarkDruid");
		//Reciepes.init();
		// For ores GameRegistry.registerWorldGenerator(new WORLDGENNAMEGOESHERE());
		 //
		// new GuiHandler();
		
		// DimensionManager.registerProviderType(Universe.dimensionId, WorldProviderUniverse.class, false);
		// DimensionManager.registerDimension(Universe.dimensionId, Universe.dimensionId);

		
	

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		

	}
	
}
