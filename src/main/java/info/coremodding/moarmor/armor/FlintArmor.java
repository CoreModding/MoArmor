package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * The flint armor class
 */
public class FlintArmor extends ItemArmor
{
    
    /**
     * The flint armor material
     */
    public static ArmorMaterial material = EnumHelper
                                                 .addArmorMaterial(
                                                         "FLINT",
                                                         7,
                                                         new int[] { 1, 3, 2, 1 },
                                                         5);
    
    /**
     * @param type
     *            The armor type
     */
    public FlintArmor(int type)
    {
        super(material, 0, type);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack item)
    {
        if (!item.isItemEnchanted()) item.addEnchantment(Enchantment.thorns, 1);
    }
    
    @Deprecated
    @Override
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/flint_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/flint_layer_2.png"; }
        return null;
    }
}
