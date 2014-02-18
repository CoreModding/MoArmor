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
	 
	    public static final String[] names = new String[] { "flintPlate", "quartzPlate", "obsidianPlate" };
	 
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
	        for (int x = 0; x < 3; x++)
	        {
	            par3List.add(new ItemStack(this, 1, x));
	        }
	    }
}
