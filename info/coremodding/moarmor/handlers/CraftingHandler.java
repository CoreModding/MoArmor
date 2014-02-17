package info.coremodding.moarmor.handlers;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 * Handles crafting event
 */
public class CraftingHandler {
	@SubscribeEvent
	public void onPlayerItemCrafted(PlayerEvent.ItemCraftedEvent event)
	{
		System.out.println("EVENT LAUNCHED");
		IInventory craftMatrix = event.craftMatrix;
		for(int i=0; i < craftMatrix.getSizeInventory(); i++) //Checks all the slots
		{               
		if(craftMatrix.getStackInSlot(i) != null) //If there is an item
		{
		ItemStack j = craftMatrix.getStackInSlot(i); //Gets the item
		if(j.getItem() != null && j.getItem() == RegistrationHandler.hammer){ //If it's a hammer
			System.out.println("Found hammmer");
		         ItemStack k = new ItemStack(RegistrationHandler.hammer, 2, (j.getItemDamage() + 1)); //Makes a new itemstack that's been damaged and has 2 items
		         if(k.getItemDamage() >= k.getMaxDamage()){ //If it is destroyed
		         k.stackSize--; //Removes the added item
		         System.out.println("Item's destroyed");
		         }
		         System.out.println("Setting item...");
		         craftMatrix.setInventorySlotContents(i, k); //Sets the slot to the new item
		}
		}
		}
	}
}
