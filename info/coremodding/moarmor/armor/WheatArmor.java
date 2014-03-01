package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The wheat armor
 */
public class WheatArmor extends ItemArmor {

	/**
	 * The wheat armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("ENDER",
			5, new int[] { 1, 3, 2, 1 }, 15);

	/**
	 * @param renderindex
	 *            Unknown
	 * @param par4
	 *            The armor type
	 */
	public WheatArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
