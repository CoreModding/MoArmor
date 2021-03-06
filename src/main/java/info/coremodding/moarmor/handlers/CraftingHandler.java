package info.coremodding.moarmor.handlers;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 * Handles crafting events
 */
public class CraftingHandler
{
    
    @SuppressWarnings({ "static-method", "javadoc" })
    @SubscribeEvent
    public void onPlayerItemCrafted(PlayerEvent.ItemCraftedEvent event)
    {
        IInventory craftMatrix = event.craftMatrix;
        for (int i = 0; i < craftMatrix.getSizeInventory(); i++)
        {
            if (craftMatrix.getStackInSlot(i) != null)
            {
                ItemStack j = craftMatrix.getStackInSlot(i);
                if (j.getItem() != null && (j.getItem() == RegistrationHandler.hammer || j.getItem() == RegistrationHandler.diamondHammer))
                {
                    ItemStack k;
                    if (j.getItem() == RegistrationHandler.hammer) k = new ItemStack(RegistrationHandler.hammer, 2, (j.getItemDamage() + 1));
                    else k = new ItemStack(RegistrationHandler.diamondHammer, 2, (j.getItemDamage() + 1));
                    if (k.getItemDamage() >= k.getMaxDamage())
                    {
                        k.stackSize--;
                    }
                    craftMatrix.setInventorySlotContents(i, k);
                }
            }
        }
        
        if (event.crafting.getItem() == RegistrationHandler.hammer) event.player.triggerAchievement(RegistrationHandler.hammerAchievement);
        if (event.crafting.getItem() == RegistrationHandler.diamondHammer) event.player.triggerAchievement(RegistrationHandler.diamondHammerAchievement);
        if (event.crafting.isItemEqual(RegistrationHandler.grassPlate)) event.player.triggerAchievement(RegistrationHandler.ecoAchievement);
        if (event.crafting.isItemEqual(RegistrationHandler.tntPlate)) event.player.triggerAchievement(RegistrationHandler.suicideAchievement);
        if (event.crafting.isItemEqual(RegistrationHandler.obsidianPlate)) event.player.triggerAchievement(RegistrationHandler.betterAchievement);
    }
}
