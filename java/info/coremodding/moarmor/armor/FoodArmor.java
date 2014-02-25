package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The food armor
 */
public class FoodArmor extends ItemArmor {
	
	/**
	 * The food armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("FOOD", 10, new int[]{1, 5, 3, 1}, 1);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public FoodArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
