package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The wheat armor class
 */
public class WheatArmor extends ItemArmor
{
    
    /**
     * The wheat armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("ENDER",
                                                 5, new int[] { 1, 3, 2, 1 },
                                                 15);
    
    /**
     * @param type
     *            The armor type
     */
    public WheatArmor(int type)
    {
        super(material, 0, type);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/wheat_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/wheat_layer_2.png"; }
        return null;
    }
}
