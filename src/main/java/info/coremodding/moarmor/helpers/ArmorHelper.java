package info.coremodding.moarmor.helpers;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import net.minecraft.item.ItemStack;

public class ArmorHelper {
	public static final int DirtArmor = 0;
	public static final int TntArmor = 1;
	public static final int GrassArmor = 2;

	/**
	 * 
	 * @param armorInventory Player armor inventory itemstack
	 * @param armorType Type of the armor to check for
	 * @return Array of booleans if theres armor of specified type where 0 = helmet, 1 = chestplate, 2 = leggings, 3 = boots
	 */
	public static boolean[] getArmorTypeSlots(ItemStack[] armorInventory,
			int armorType) {
		boolean[] returnBool = new boolean[4];
		switch(armorType){
		case ArmorHelper.DirtArmor:
			if(armorInventory[0] != null)
				if(armorInventory[0].getItem() == RegistrationHandler.dirtArmorBoots)
					returnBool[3] = true;
				else
					returnBool[3] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[1] != null)
				if(armorInventory[1].getItem() == RegistrationHandler.dirtArmorLegs)
					returnBool[2] = true;
				else
					returnBool[2] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[2] != null)
				if(armorInventory[2].getItem() == RegistrationHandler.dirtArmorChest)
					returnBool[1] = true;
				else
					returnBool[1] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[3] != null)
				if(armorInventory[3].getItem() == RegistrationHandler.dirtArmorHelmet)
					returnBool[0] = true;
				else
					returnBool[0] = false;
			else
				returnBool[3] = false;
			break;
		case ArmorHelper.TntArmor:
			if(armorInventory[0] != null)
				if(armorInventory[0].getItem() == RegistrationHandler.tntArmorBoots)
					returnBool[3] = true;
				else
					returnBool[3] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[1] != null)
				if(armorInventory[1].getItem() == RegistrationHandler.tntArmorLegs)
					returnBool[2] = true;
				else
					returnBool[2] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[2] != null)
				if(armorInventory[2].getItem() == RegistrationHandler.tntArmorChest)
					returnBool[1] = true;
				else
					returnBool[1] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[3] != null)
				if(armorInventory[3].getItem() == RegistrationHandler.tntArmorHelmet)
					returnBool[0] = true;
				else
					returnBool[0] = false;
			else
				returnBool[3] = false;
			break;
		case ArmorHelper.GrassArmor:
			if(armorInventory[0] != null)
				if(armorInventory[0].getItem() == RegistrationHandler.grassArmorBoots)
					returnBool[3] = true;
				else
					returnBool[3] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[1] != null)
				if(armorInventory[1].getItem() == RegistrationHandler.grassArmorLegs)
					returnBool[2] = true;
				else
					returnBool[2] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[2] != null)
				if(armorInventory[2].getItem() == RegistrationHandler.grassArmorChest)
					returnBool[1] = true;
				else
					returnBool[1] = false;
			else
				returnBool[3] = false;
			
			if(armorInventory[3] != null)
				if(armorInventory[3].getItem() == RegistrationHandler.grassArmorHelmet)
					returnBool[0] = true;
				else
					returnBool[0] = false;
			else
				returnBool[3] = false;
			break;
		default: 
			returnBool[0] = false;
			returnBool[1] = false;
			returnBool[2] = false;
			returnBool[3] = false;
		}
		return returnBool;
	}
	
	public static boolean isFullSet(ItemStack[] armorInventory,
			int armorType){
		boolean[] armorBool = ArmorHelper.getArmorTypeSlots(armorInventory, armorType);
		if(armorBool[0] && armorBool[1] && armorBool[2] && armorBool[3])
			return true;
		return false;
	}
}
