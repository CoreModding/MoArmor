package info.coremodding.moarmor;

import info.coremodding.moarmor.handlers.CraftingHandler;
import info.coremodding.moarmor.handlers.ForgeEventHandler;
import info.coremodding.moarmor.handlers.RegistrationHandler;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * The main mod class
 */
@Mod(modid = "core_moarmor", name = "Mo' Armor", version = "1.0-ALPHA")
public class MoArmor
{
    
    /**
     * Registers stuff
     */
    private static void register()
    {
        RegistrationHandler.registerArmorItems();
        RegistrationHandler.registerArmorRecipes();
        RegistrationHandler.registerFoodArmor();
        RegistrationHandler.registerOtherItems();
        RegistrationHandler.registerOtherRecipes();
        RegistrationHandler.registerPlates();
        RegistrationHandler.registerAchievements();
        
        FMLCommonHandler.instance().bus().register(new CraftingHandler());
    }
    
    /**
     * The forge init call for doing whatever.
     * 
     * @param evt
     *            The event that triggered the method
     */
    @SuppressWarnings("static-method")
    @EventHandler
    public void init(FMLInitializationEvent evt)
    {
        register();
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
}
