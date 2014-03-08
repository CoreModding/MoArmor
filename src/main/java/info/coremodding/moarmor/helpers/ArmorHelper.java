package info.coremodding.moarmor.helpers;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumChatFormatting;

/**
 * Some armor utilities
 */
public class ArmorHelper
{
    
    /**
     * The dirt armor int
     */
    public static final int DirtArmor   = 0;
    
    /**
     * The TNT armor int
     */
    public static final int TntArmor    = 1;
    
    /**
     * The grass armor int
     */
    public static final int GrassArmor  = 2;
    
    /**
     * The food armor int
     */
    public static final int FoodArmor   = 3;

    /**
     * The nether armor int
     */
	public static final int NetherArmor = 4;
	
    /**
     * The flame armor int
     */
	public static final int FlameArmor  = 5;
    
    /**
     * 
     * @param armorInventory
     *            Player armor inventory itemstack
     * @param armorType
     *            Type of the armor to check for
     * @return Array of booleans if theres armor of specified type where 0 =
     *         helmet, 1 = chestplate, 2 = leggings, 3 = boots
     */
    public static boolean[] getArmorTypeSlots(ItemStack[] armorInventory,
            int armorType)
    {
        boolean[] returnBool = new boolean[4];
        switch (armorType)
        {
            case ArmorHelper.DirtArmor:
                if (armorInventory[0] != null) if (armorInventory[0].getItem() == RegistrationHandler.dirtArmorBoots) returnBool[3] = true;
                else returnBool[3] = false;
                else returnBool[3] = false;
                
                if (armorInventory[1] != null) if (armorInventory[1].getItem() == RegistrationHandler.dirtArmorLegs) returnBool[2] = true;
                else returnBool[2] = false;
                else returnBool[2] = false;
                
                if (armorInventory[2] != null) if (armorInventory[2].getItem() == RegistrationHandler.dirtArmorChest) returnBool[1] = true;
                else returnBool[1] = false;
                else returnBool[1] = false;
                
                if (armorInventory[3] != null) if (armorInventory[3].getItem() == RegistrationHandler.dirtArmorHelmet) returnBool[0] = true;
                else returnBool[0] = false;
                else returnBool[0] = false;
                break;
            case ArmorHelper.TntArmor:
                if (armorInventory[0] != null) if (armorInventory[0].getItem() == RegistrationHandler.tntArmorBoots) returnBool[3] = true;
                else returnBool[3] = false;
                else returnBool[3] = false;
                
                if (armorInventory[1] != null) if (armorInventory[1].getItem() == RegistrationHandler.tntArmorLegs) returnBool[2] = true;
                else returnBool[2] = false;
                else returnBool[2] = false;
                
                if (armorInventory[2] != null) if (armorInventory[2].getItem() == RegistrationHandler.tntArmorChest) returnBool[1] = true;
                else returnBool[1] = false;
                else returnBool[1] = false;
                
                if (armorInventory[3] != null) if (armorInventory[3].getItem() == RegistrationHandler.tntArmorHelmet) returnBool[0] = true;
                else returnBool[0] = false;
                else returnBool[0] = false;
                break;
            case ArmorHelper.GrassArmor:
                if (armorInventory[0] != null) if (armorInventory[0].getItem() == RegistrationHandler.grassArmorBoots) returnBool[3] = true;
                else returnBool[3] = false;
                else returnBool[3] = false;
                
                if (armorInventory[1] != null) if (armorInventory[1].getItem() == RegistrationHandler.grassArmorLegs) returnBool[2] = true;
                else returnBool[2] = false;
                else returnBool[2] = false;
                
                if (armorInventory[2] != null) if (armorInventory[2].getItem() == RegistrationHandler.grassArmorChest) returnBool[1] = true;
                else returnBool[1] = false;
                else returnBool[1] = false;
                
                if (armorInventory[3] != null) if (armorInventory[3].getItem() == RegistrationHandler.grassArmorHelmet) returnBool[0] = true;
                else returnBool[0] = false;
                else returnBool[0] = false;
                break;
            case ArmorHelper.FoodArmor:
                if (armorInventory[0] != null) if (armorInventory[0].getItem() == RegistrationHandler.foodArmorBoots) returnBool[3] = true;
                else returnBool[3] = false;
                else returnBool[3] = false;
                
                if (armorInventory[1] != null) if (armorInventory[1].getItem() == RegistrationHandler.foodArmorLegs) returnBool[2] = true;
                else returnBool[2] = false;
                else returnBool[2] = false;
                
                if (armorInventory[2] != null) if (armorInventory[2].getItem() == RegistrationHandler.foodArmorChest) returnBool[1] = true;
                else returnBool[1] = false;
                else returnBool[1] = false;
                
                if (armorInventory[3] != null)
                {
                	Item helmet = armorInventory[3].getItem();
                	if (helmet == RegistrationHandler.foodArmorHelmetPorkchop || helmet == RegistrationHandler.foodArmorHelmetCookie || helmet == RegistrationHandler.foodArmorHelmetApple || helmet == RegistrationHandler.foodArmorHelmetBread) returnBool[0] = true;
                    else returnBool[0] = false;	
                }
                else returnBool[0] = false;
                break;
            case ArmorHelper.NetherArmor:
                if (armorInventory[0] != null) if (armorInventory[0].getItem() == RegistrationHandler.netherArmorBoots) returnBool[3] = true;
                else returnBool[3] = false;
                else returnBool[3] = false;
                
                if (armorInventory[1] != null) if (armorInventory[1].getItem() == RegistrationHandler.netherArmorLegs) returnBool[2] = true;
                else returnBool[2] = false;
                else returnBool[2] = false;
                
                if (armorInventory[2] != null) if (armorInventory[2].getItem() == RegistrationHandler.netherArmorChest) returnBool[1] = true;
                else returnBool[1] = false;
                else returnBool[1] = false;
                
                if (armorInventory[3] != null) if (armorInventory[3].getItem() == RegistrationHandler.netherArmorHelmet) returnBool[0] = true;
                else returnBool[0] = false;
                else returnBool[0] = false;
                break;
            case ArmorHelper.FlameArmor:
                if (armorInventory[0] != null) if (armorInventory[0].getItem() == RegistrationHandler.flameArmorBoots) returnBool[3] = true;
                else returnBool[3] = false;
                else returnBool[3] = false;
                
                if (armorInventory[1] != null) if (armorInventory[1].getItem() == RegistrationHandler.flameArmorLegs) returnBool[2] = true;
                else returnBool[2] = false;
                else returnBool[2] = false;
                
                if (armorInventory[2] != null) if (armorInventory[2].getItem() == RegistrationHandler.flameArmorChest) returnBool[1] = true;
                else returnBool[1] = false;
                else returnBool[1] = false;
                
                if (armorInventory[3] != null) if (armorInventory[3].getItem() == RegistrationHandler.flameArmorHelmet) returnBool[0] = true;
                else returnBool[0] = false;
                else returnBool[0] = false;
                break;
            default:
                returnBool[0] = false;
                returnBool[1] = false;
                returnBool[2] = false;
                returnBool[3] = false;
        }
        return returnBool;
    }
    
    /**
     * @param armorInventory
     *            The armor
     * @param armorType
     *            The armor type expected
     * @return Is it a full set of armor
     */
    public static boolean isFullSet(ItemStack[] armorInventory, int armorType)
    {
        boolean[] armorBool = ArmorHelper.getArmorTypeSlots(armorInventory,
                armorType);
        if (armorBool[0] && armorBool[1] && armorBool[2] && armorBool[3]) return true;
        return false;
    }
    
    /**
     * Adds string key/value to specified itemstack
     * 
     * @param item
     *            Itemstack to add string for
     * @param key
     *            Key
     * @param value
     *            Value
     */
    public static void addStringToNBT(ItemStack item, String key, String value)
    {
        if (item.stackTagCompound == null)
        {
            item.setTagCompound(new NBTTagCompound());
        }
        
        item.stackTagCompound.setString(key, value);
    }
    
    /**
     * Gets string from itemstack's NBT Tag Compound
     * 
     * @param item
     *            Itemstack to get string from
     * @param key
     *            Key
     * @return String from itemstack.
     */
    public static String getStringFromNBT(ItemStack item, String key)
    {
        if (item.stackTagCompound == null)
        {
            item.setTagCompound(new NBTTagCompound());
        }
        
        return item.stackTagCompound.getString(key);
    }
}
