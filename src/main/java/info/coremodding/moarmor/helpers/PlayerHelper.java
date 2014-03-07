package info.coremodding.moarmor.helpers;

import net.minecraft.entity.player.EntityPlayer;

public class PlayerHelper
{
    public static final int AbilityCamouflage = 0;
    public static final int AbilityExplosive  = 1;
    
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
            default:
                break;
        }
        return false;
    }
}
