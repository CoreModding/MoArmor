package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The dirt armor class
 */
public class DirtArmor extends ItemArmor
{
    
    /**
     * The dirt armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("DIRT", 4, new int[] { 1, 1, 1, 1 }, 3);
    
    /**
     * @param type
     *            The armor type
     */
    public DirtArmor(int type)
    {
        super(material, 0, type);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/dirt_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/dirt_layer_2.png"; }
        return null;
    }
}
