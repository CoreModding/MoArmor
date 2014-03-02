package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The obsidian armor
 */
public class TntArmor extends ItemArmor {

    /**
     * The obsidian armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial(
            "OBSIDIAN", 50, new int[]{8, 20, 15, 8}, 3);

    /**
     * @param renderindex Unknown
     * @param par4        The armor type
     */
    public TntArmor(int renderindex, int par4) {
        super(material, renderindex, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
