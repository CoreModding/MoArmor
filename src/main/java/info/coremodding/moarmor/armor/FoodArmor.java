package info.coremodding.moarmor.armor;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The food armor class
 */
public class FoodArmor extends ItemArmor
{
    
    /**
     * The food armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("FOOD",
                                                 10, new int[] { 1, 5, 3, 1 },
                                                 1);
    private final String        lore;
    
    @SuppressWarnings("hiding")
    private final int           armorType;
    
    /**
     * @param type
     *            The armor type
     * @param lore
     *            The items lore
     */
    public FoodArmor(int type, String lore)
    {
        super(material, 0, type);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.lore = lore;
        this.armorType = type;
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/food_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/food_layer_2.png"; }
        return null;
    }
    
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer player,
            List par3List, boolean par4)
    {
        if (this.armorType == 0)
        {
            par3List.add(this.lore);
            par3List.add("Will be used 5 times at most");
        }
    }
}
