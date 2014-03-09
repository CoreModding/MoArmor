package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.handlers.TeleportationHandler;
import info.coremodding.moarmor.helpers.ArmorHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * The ender armor
 */
public class EnderArmor extends ItemArmor
{
    
    /**
     * Delay in ticks until the next teleportation can occur
     */
    public static int           tpdelay  = 0;
    /**
     * The ender armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("ENDER",
                                                 20, new int[] { 2, 9, 7, 2 },
                                                 15);
    
    /**
     * @param par4
     *            The armor type
     */
    public EnderArmor(int par4)
    {
        super(material, 0, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack item)
    {
        if (ArmorHelper.isFullSet(entity.inventory.armorInventory,
                ArmorHelper.EnderArmor))
        {
            TeleportationHandler th = new TeleportationHandler(entity);
            if (tpdelay > 0) tpdelay--;
            if (entity.isWet())
            {
                entity.attackEntityFrom(DamageSource.drown, 1.0F);
            }
            
            if ((entity.isWet() || entity.isBurning()) && tpdelay == 0)
            {
                th.random();
                tpdelay = 80;
            }
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
}
