package info.coremodding.moarmor.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * The plate item class
 */
public class ItemPlate extends Item
{
    
    /**
     * The item constructor
     */
    public ItemPlate()
    {
        super();
        this.setHasSubtypes(true);
        this.setCreativeTab(CreativeTabs.tabMaterials);
        
    }
    
    /**
     * The names of plates
     */
    public static final String[] names = new String[] { "flintPlate",
            "quartzPlate", "obsidianPlate", "flamePlate", "enderPlate",
            "dirtPlate", "grassPlate", "netherPlate", "tntPlate", "woodPlate" };
    
    @Override
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return names[i];
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs,
            List par3List)
    {
        for (int x = 0; x < names.length; x++)
        {
            par3List.add(new ItemStack(this, 1, x));
        }
    }
    
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.icons = new IIcon[names.length];
        
        for (int i = 0; i < this.icons.length; i++)
        {
            this.icons[i] = par1IconRegister.registerIcon("core_moarmor:"
                    + names[i]);
        }
    }
    
    @Override
    public IIcon getIconFromDamage(int par1)
    {
        return this.icons[par1];
    }
}
