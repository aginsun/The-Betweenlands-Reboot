package betweenlands.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import betweenlands.lib.ModInfo;
import betweenlands.lib.Names;


public class SwampTalismanPiece3 extends Item {

	public SwampTalismanPiece3(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName(Names.swampTalismanPiece3_unlocalizedName);
		this.setMaxStackSize(64);
		
		}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
	itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.swampTalismanPiece3_unlocalizedName);
	}
	
}
