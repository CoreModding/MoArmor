package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The TnT armor
 */
public class TntArmor extends ItemArmor {
	
	/**
	 * The TnT armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("TNT", 18, new int[]{3, 7, 5, 3}, 9);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public TntArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
