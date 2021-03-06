package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The nether brick armor class
 */
public class NetherArmor extends ItemArmor
{
    
    /**
     * The nether brick armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("NETHER_BRICK", 18, new int[] { 2, 5, 4, 2 }, 5);
    
    /**
     * @param type
     *            The armor type
     */
    public NetherArmor(int type)
    {
        super(material, 0, type);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/netherbrick_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/netherbrick_layer_2.png"; }
        return null;
    }
}
