package betweenlands;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import betweenlands.CommonProxy;
import betweenlands.entities.mobs.EntityDarkDruid;
import betweenlands.entities.mobs.models.ModelDarkDruid;
import betweenlands.entities.render.RenderDarkDruid;



public class ClientProxy extends CommonProxy {
	
	@Override
	public void initRenderers() {
		EntityRegistry.registerGlobalEntityID(EntityDarkDruid.class, "darkDruid", EntityRegistry.findGlobalUniqueEntityId(), 0x40FF00, 0x0B610B);//the last two parameters are the colour of the spawnegg you can use HTML color codes just replace the '#' with '0x'
        RenderingRegistry.registerEntityRenderingHandler(EntityDarkDruid.class, new RenderDarkDruid(new ModelDarkDruid(), 0.7F));//the 0.5F is the shadowsize
       

	}

	@Override
	public void initSounds() {
		 //MinecraftForge.EVENT_BUS.register(new BetweenlandsSoundEvent());
		// MinecraftForge.EVENT_BUS.register(SoundHandler.INSTANCE);

	}

	public void registerRenderInformation() {
        /*RenderingRegistry.registerEntityRenderingHandler(EntityDarkDruid.class, new RenderDarkDruid(new ModelDarkDruid(), 0.5F));
        EntityRegistry.registerGlobalEntityID(EntityDarkDruid.class, "darkDruid", EntityRegistry.findGlobalUniqueEntityId(), 0x40FF00, 0x0B610B); */
		

	
	}
	
	@Override
     public void registerSound() // TODO : This method has NO reason to exist. It should be removed from proxy.
	{
             // -- Not here. MinecraftForge.EVENT_BUS.register(new BetweenlandsSoundEvent());
     }
	
	
	
}


