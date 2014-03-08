package info.coremodding.moarmor.helpers;

import info.coremodding.moarmor.handlers.ExtendedPlayerHandler;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Some player utilities
 */
public class PlayerHelper
{
    
    /**
     * Does the player have the camo ability
     */
    public static final int AbilityCamouflage        = 0;
    
    /**
     * Does the player have the explosive ability
     */
    public static final int AbilityExplosive         = 1;
    
    /**
     * Does the player have the self food replenish ability
     */
    public static final int AbilitySelfFoodReplenish = 2;
    
    /**
     * @param p
     *            The player to check
     * @param ability
     *            The ability to check for
     * @return Does the player have the given armor ability
     */
    public static boolean armorHasAbility(EntityPlayer p, int ability)
    {
        switch (ability)
        {
            case AbilityCamouflage:
                if (ArmorHelper.isFullSet(p.inventory.armorInventory,
                        ArmorHelper.GrassArmor)
                        || ArmorHelper.isFullSet(p.inventory.armorInventory,
                                ArmorHelper.DirtArmor)) return true;
                break;
            case AbilityExplosive:
                boolean[] tntBool = ArmorHelper.getArmorTypeSlots(
                        p.inventory.armorInventory, ArmorHelper.TntArmor);
                if (tntBool[0] || tntBool[1] || tntBool[2] || tntBool[3]) return true;
                break;
            case AbilitySelfFoodReplenish:
                boolean[] foodBool = ArmorHelper.getArmorTypeSlots(
                        p.inventory.armorInventory, ArmorHelper.FoodArmor);
                if (foodBool[0]) return true;
                break;
            default:
                break;
        }
        return false;
    }
    
    /**
     * Gets ExtendedPlayerHandler for specified player
     * 
     * @param player
     *            Player to get properties for
     * @return Extended player properties
     */
    public static final ExtendedPlayerHandler getProperties(EntityPlayer player)
    {
        return (ExtendedPlayerHandler) player
                .getExtendedProperties(ExtendedPlayerHandler.EXT_PROP_NAME);
    }
}
