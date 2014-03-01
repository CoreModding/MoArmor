package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The nether brick armor
 */
public class NetherArmor extends ItemArmor {

	/**
	 * The nether brick armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial(
			"NETHER_BRICK", 15, new int[] { 2, 6, 5, 2 }, 9);

	/**
	 * @param renderindex
	 *            Unknown
	 * @param par4
	 *            The armor type
	 */
	public NetherArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
