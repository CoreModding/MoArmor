package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The food armor
 */
public class FoodArmor extends ItemArmor
{
    
    /**
     * The food armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("FOOD",
                                                 10, new int[] { 1, 5, 3, 1 },
                                                 1);
    
    /**
     * @param par4
     *            The armor type
     */
    public FoodArmor(int par4)
    {
        super(material, 0, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/food_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/food_layer_2.png"; }
        return null;
        
    }
}
