package info.coremodding.moarmor.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemPlate extends Item {
	public ItemPlate(){
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		
	}
	 
	    public static final String[] names = new String[] { "flintPlate", "quartzPlate", "obsidianPlate", "flamePlate", "enderPlate", "dirtPlate", "foodPlate", "grassPlate", "netherPlate", "tntPlate", "wheatPlate", "woodPlate" };
	 
	    @Override
	    public String getUnlocalizedName(ItemStack par1ItemStack)
	    {
	        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
	        return names[i];
	    }
	 
	    @SuppressWarnings({ "unchecked", "rawtypes" })
	    @SideOnly(Side.CLIENT)
	    @Override
	    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	    {
	        for (int x = 0; x < names.length; x++)
	        {
	            par3List.add(new ItemStack(this, 1, x));
	        }
	    }
	    
	    @SideOnly(Side.CLIENT)
	    private IIcon[] icons;
	 
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IIconRegister par1IconRegister)
	    {
	        icons = new IIcon[12];
	 
	        for (int i = 0; i < icons.length; i++)
	        {
	            icons[i] = par1IconRegister.registerIcon("core_moarmor:" + names[i]);
	        }
	    }
	    
	    @Override
	    public IIcon getIconFromDamage(int par1)
	    {
	        return icons[par1];
	    }
}
