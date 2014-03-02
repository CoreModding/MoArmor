package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The obsidian armor
 */
public class ObsidianArmor extends ItemArmor {

    /**
     * The obsidian armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial(
            "OBSIDIAN", 50, new int[]{8, 20, 15, 8}, 3);

    /**
     * @param renderindex Unknown
     * @param par4        The armor type
     */
    public ObsidianArmor(int renderindex, int par4) {
        super(material, renderindex, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (slot == 0 || slot == 1 || slot == 3) {
            return "core_moarmor:textures/models/armor/obsidian_layer_1.png";
        }
        if (slot == 2) {
            return "core_moarmor:textures/models/armor/obsidian_layer_2.png";
        }
        return null;

    }
}
