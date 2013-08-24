package betweenlands.entities.render;
import betweenlands.entities.mobs.EntityDarkDruid;
import betweenlands.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderDarkDruid extends RenderLiving
{
    private static final ResourceLocation field_110833_a = new ResourceLocation(ModInfo.ID.toLowerCase() + ":" + "textures/mobs/DarkDruid.png");

    public RenderDarkDruid(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntityDarkDruid par1Entity)
    {
        return field_110833_a;
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110832_a((EntityDarkDruid)par1Entity);
    }
}
