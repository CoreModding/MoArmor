package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The dirt armor
 */
public class DirtArmor extends ItemArmor {
	
	/**
	 * The dirt armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("DIRT", 4, new int[]{1, 1, 1, 1}, 3);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public DirtArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
