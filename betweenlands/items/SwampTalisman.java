package betweenlands.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import betweenlands.entities.mobs.EntityDarkDruid;
import betweenlands.lib.ModInfo;
import betweenlands.lib.Names;


public class SwampTalisman extends Item {

	public SwampTalisman(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName(Names.swampTalisman_unlocalizedName);
		this.setMaxStackSize(64);
		
		}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
	itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.swampTalisman_unlocalizedName);
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
		/*
		Entity entity = EntityList.createEntityByName("entity.instance.darkDruid.name", world);
		world.spawnEntityInWorld(entity);
		entity.setPosition(player.posX, player.posY, player.posZ);
		*/
		
		 /*EntityDarkDruid entitychicken = new EntityDarkDruid(world);
		 entitychicken.setPosition(player.posX, player.posY, player.posZ);
		 world.spawnEntityInWorld(entitychicken); */
		return itemstack;
    }
	
}
