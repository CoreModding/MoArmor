package info.coremodding.moarmor.handlers;

import info.coremodding.moarmor.helpers.ArmorHelper;
import info.coremodding.moarmor.helpers.PlayerHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * Handles forge events
 */
@SuppressWarnings({ "static-method", "javadoc" })
public class ForgeEventHandler
{
    
    @SubscribeEvent
    public void onEntityConstructing(EntityConstructing event)
    {
        if (event.entity instanceof EntityPlayer
                && PlayerHelper.getProperties((EntityPlayer) event.entity) == null) ExtendedPlayerHandler
                .register((EntityPlayer) event.entity);
    }
    
    @SubscribeEvent
    public void onLivingSetAttackTarget(LivingSetAttackTargetEvent event)
    {
        if (event.target instanceof EntityPlayer
                && event.entityLiving instanceof EntityLiving)
        {
            EntityLiving el = (EntityLiving) event.entityLiving;
            EntityPlayer e = (EntityPlayer) event.target;
            
            if (!PlayerHelper.getProperties(e).isPlayerTargetable())
            {
                if (PlayerHelper.armorHasAbility(e,
                        PlayerHelper.AbilityCamouflage)) el
                        .setAttackTarget(null);
            } else
            {
                PlayerHelper.getProperties(e).setTimeUntilUnseen(100);
            }
        }
    }
    
    @SubscribeEvent
    public void onAttackEntityEvent(AttackEntityEvent event)
    {
        if (event.target instanceof EntityLiving
                && event.entityLiving instanceof EntityPlayer) PlayerHelper
                .getProperties((EntityPlayer) event.entityLiving)
                .setTimeUntilUnseen(100);
    }
    
    @SubscribeEvent
    public void onLivingUpdateEvent(LivingUpdateEvent event)
    {
        if (event.entityLiving instanceof EntityPlayer)
        {
            EntityPlayer p = (EntityPlayer) event.entityLiving;
            ExtendedPlayerHandler properties = PlayerHelper.getProperties(p);
            if (properties.getTimeUntilUnseen() > 0) properties
                    .setTimeUntilUnseen(properties.getTimeUntilUnseen() - 1);
            // this.worldObj.canLightningStrikeAt(MathHelper.floor_double(this.posX),
            // MathHelper.floor_double(this.posY),
            // MathHelper.floor_double(this.posZ)) ||
            // this.worldObj.canLightningStrikeAt(MathHelper.floor_double(this.posX),
            // MathHelper.floor_double(this.posY + (double)this.height),
            // MathHelper.floor_double(this.posZ));
            if (p.getFoodStats().needFood())
            {
                if (PlayerHelper.armorHasAbility(p,
                        PlayerHelper.AbilitySelfFoodReplenish))
                {
                    int feedLevel;
                    if (ArmorHelper.getStringFromNBT(
                            p.inventory.armorInventory[3], "feedlevel") != null
                            && ArmorHelper.getStringFromNBT(
                                    p.inventory.armorInventory[3], "feedlevel") != "") feedLevel = Integer
                            .parseInt(ArmorHelper.getStringFromNBT(
                                    p.inventory.armorInventory[3], "feedlevel"));
                    else feedLevel = 1;
                    
                    if (20 - p.getFoodStats().getFoodLevel() >= feedLevel)
                    {
                        p.getFoodStats().setFoodLevel(
                                p.getFoodStats().getFoodLevel() + feedLevel);
                        p.inventory.armorInventory[3] = new ItemStack(
                                p.inventory.armorInventory[3].getItem(),
                                1,
                                (p.inventory.armorInventory[3].getItemDamage() + 22));
                        ArmorHelper.addStringToNBT(
                                p.inventory.armorInventory[3], "feedlevel",
                                String.valueOf(feedLevel));
                        if (p.inventory.armorInventory[3].getItemDamage() >= p.inventory.armorInventory[3]
                                .getMaxDamage()) p.inventory.armorInventory[3] = null;
                    }
                }
            }
            if (PlayerHelper.armorHasAbility(p,
                    PlayerHelper.AbilityArmorSelfRepair))
            {
                if ((p.worldObj.canBlockSeeTheSky(
                        MathHelper.floor_double(p.posX),
                        MathHelper.floor_double(p.posY),
                        MathHelper.floor_double(p.posZ)) || p.worldObj
                        .canBlockSeeTheSky(MathHelper.floor_double(p.posX),
                                MathHelper.floor_double(p.posY + p.height),
                                MathHelper.floor_double(p.posZ)))
                        && p.worldObj.isDaytime() && !p.worldObj.isRemote)
                {
                    float f = p.getBrightness(1.0F);
                    if (f > 0.5F)
                    {
                        if (properties.shouldPlayerRepair())
                        {
                            if (p.inventory.armorInventory[0].getItemDamage() > 0) p.inventory.armorInventory[0] = new ItemStack(
                                    p.inventory.armorInventory[0].getItem(), 1,
                                    (p.inventory.armorInventory[0]
                                            .getItemDamage() - 1));
                            if (p.inventory.armorInventory[1].getItemDamage() > 0) p.inventory.armorInventory[1] = new ItemStack(
                                    p.inventory.armorInventory[1].getItem(), 1,
                                    (p.inventory.armorInventory[1]
                                            .getItemDamage() - 1));
                            if (p.inventory.armorInventory[2].getItemDamage() > 0) p.inventory.armorInventory[2] = new ItemStack(
                                    p.inventory.armorInventory[2].getItem(), 1,
                                    (p.inventory.armorInventory[2]
                                            .getItemDamage() - 1));
                            if (p.inventory.armorInventory[3].getItemDamage() > 0) p.inventory.armorInventory[3] = new ItemStack(
                                    p.inventory.armorInventory[3].getItem(), 1,
                                    (p.inventory.armorInventory[3]
                                            .getItemDamage() - 1));
                            properties.setTimeUntilRepair(80);
                        } else
                        {
                            properties.setTimeUntilRepair(properties
                                    .getTimeUntilRepair() - 1);
                        }
                    }
                }
            }
        }
    }
    
    @SubscribeEvent
    public void onLivingAttackEvent(LivingAttackEvent event)
    {
        if (event.source.isFireDamage())
        {
            if (event.entityLiving instanceof EntityPlayer)
            {
                EntityPlayer p = (EntityPlayer) event.entityLiving;
                if (PlayerHelper.armorHasAbility(p,
                        PlayerHelper.AbilityNoFireDamage))
                {
                    event.setCanceled(true);
                }
            }
        }
        if (event.source.getSourceOfDamage() instanceof EntityLiving)
        {
            EntityPlayer p = (EntityPlayer) event.entityLiving;
            
            if (PlayerHelper.armorHasAbility(p, PlayerHelper.AbilityTeleport))
            {
                TeleportationHandler th = new TeleportationHandler(p);
                th.random();
            }
        }
    }
}
