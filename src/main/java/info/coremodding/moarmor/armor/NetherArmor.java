package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The nether brick armor
 */
public class NetherArmor extends ItemArmor
{
    
    /**
     * The nether brick armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("NETHER_BRICK",
                                                 21, new int[] { 3, 11, 7, 3 },
                                                 5);
    
    /**
     * @param par4
     *            The armor type
     */
    public NetherArmor(int par4)
    {
        super(material, 0, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/netherbrick_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/netherbrick_layer_2.png"; }
        return null;
    }
}
