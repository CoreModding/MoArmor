package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

/**
 * The grass armor
 */
class GrassArmor extends ItemArmor {

    /**
     * The grass armor material
     */
    private static final ArmorMaterial material = DirtArmor.material;

    /**
     * @param renderindex Unknown
     * @param par4        The armor type
     */
    public GrassArmor(int renderindex, int par4) {
        super(material, renderindex, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
