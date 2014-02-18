package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The ender armor
 */
public class EnderArmor extends ItemArmor {
	
	/**
	 * The ender armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("ENDER", 50, new int[]{8, 20, 15, 8}, 3);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public EnderArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
