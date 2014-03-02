package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The wood armor
 */
public class WoodArmor extends ItemArmor {

    /**
     * The wood armor material
     */
    public static final ArmorMaterial material = EnumHelper.addArmorMaterial("WOOD",
            7, new int[]{1, 4, 3, 1}, 2);

    /**
     * @param renderindex Unknown
     * @param par4        The armor type
     */
    public WoodArmor(int renderindex, int par4) {
        super(material, renderindex, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
