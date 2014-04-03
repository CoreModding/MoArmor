package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.helpers.ArmorHelper;
import info.coremodding.moarmor.helpers.PlayerHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The TNT armor class
 */
public class TntArmor extends ItemArmor
{
    /**
     * The TNT armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("TNT",
                                                 18, new int[] { 3, 7, 5, 3 },
                                                 9);
    
    /**
     * @param type
     *            The armor type
     */
    public TntArmor(int type)
    {
        super(material, 0, type);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/tnt_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/tnt_layer_2.png"; }
        return null;
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack item)
    {
        if (PlayerHelper.armorHasAbility(entity, PlayerHelper.AbilityExplosive))
        {
            if (entity.isBurning())
            {
                boolean[] armor = ArmorHelper.getArmorTypeSlots(
                        entity.inventory.armorInventory, ArmorHelper.TntArmor);
                if (armor[0]) entity.inventory.armorInventory[3] = null;
                if (armor[1]) entity.inventory.armorInventory[2] = null;
                if (armor[2]) entity.inventory.armorInventory[1] = null;
                if (armor[3]) entity.inventory.armorInventory[0] = null;
                float f = 4.0F;
                entity.worldObj.createExplosion(entity, entity.posX,
                        entity.posY, entity.posZ, f, true);
            }
        }
    }
}
