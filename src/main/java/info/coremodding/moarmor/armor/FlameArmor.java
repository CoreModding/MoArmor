package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.helpers.ArmorHelper;

import java.util.List;
import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The flame armor
 */
public class FlameArmor extends ItemArmor
{
    
    /**
     * The flame armor material
     */
    public static ArmorMaterial material = EnumHelper.addArmorMaterial("FLAME",
                                                 15, new int[] { 2, 6, 5, 2 },
                                                 9);
    /**
     * Used to determine when to spawn particles around the player
     */
    private int                 tickId   = 0;
    
    private final Random        rand     = new Random();
    
    /**
     * @param par4
     *            The armor type
     */
    public FlameArmor(int par4)
    {
        super(material, 0, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack item)
    {
        if (ArmorHelper.isFullSet(entity.inventory.armorInventory,
                ArmorHelper.FlameArmor) && !entity.isWet())
        {
            List<Object> entities = world.getEntitiesWithinAABB(
                    EntityLivingBase.class, AxisAlignedBB.getBoundingBox(
                            entity.posX - 2, entity.posY - 2, entity.posZ - 2,
                            entity.posX + 2, entity.posY + 2, entity.posZ + 2));
            for (Object e : entities)
            {
                if (e instanceof EntityLivingBase && e != entity)
                {
                    ((EntityLivingBase) e).setFire(10);
                }
            }
            if (this.tickId == 15)
            {
                entity.worldObj.spawnParticle("flame",
                        entity.posX - this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ - this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                entity.worldObj.spawnParticle("flame",
                        entity.posX - this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ + this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                entity.worldObj.spawnParticle("flame",
                        entity.posX + this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ - this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                entity.worldObj.spawnParticle("flame",
                        entity.posX + this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ + this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                
                entity.worldObj.spawnParticle("smoke",
                        entity.posX - this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ - this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                entity.worldObj.spawnParticle("smoke",
                        entity.posX - this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ + this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                entity.worldObj.spawnParticle("smoke",
                        entity.posX + this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ - this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                entity.worldObj.spawnParticle("smoke",
                        entity.posX + this.rand.nextDouble() / 2,
                        entity.posY - 1, entity.posZ + this.rand.nextDouble()
                                / 2, entity.motionX,
                        this.rand.nextDouble() / 10, entity.motionZ);
                this.tickId = 0;
            } else this.tickId++;
        }
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type)
    {
        if (slot == 0 || slot == 1 || slot == 3) { return "core_moarmor:textures/models/armor/flame_layer_1.png"; }
        if (slot == 2) { return "core_moarmor:textures/models/armor/flame_layer_2.png"; }
        return null;
    }
}
