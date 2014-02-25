package info.coremodding.moarmor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHammer extends Item {
	public ItemHammer(){
		super();
		this.setHasSubtypes(false);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxDamage(96);
		this.setMaxStackSize(1);
	}
	
	@Override
	public Item setUnlocalizedName(String par1Str) {
		return super.setUnlocalizedName(par1Str);
	}
}
