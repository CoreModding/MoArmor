package info.coremodding.moarmor;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import info.coremodding.moarmor.handlers.CraftingHandler;
import info.coremodding.moarmor.handlers.ForgeEventHandler;
import info.coremodding.moarmor.handlers.RegistrationHandler;

/**
 * The main mod class
 */
@Mod(modid = "core_moarmor", name = "Mo' Armor", version = "1.0.0.0")
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
        
        FMLCommonHandler.instance().bus().register(new CraftingHandler());
    }
    
    /**
     * @param evt
     *            The event that triggered the method
     */
    @SuppressWarnings("static-method")
    @EventHandler
    public void init(FMLInitializationEvent evt)
    {
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
    
    /**
     * @param evt
     *            The event that triggered the method
     */
    @SuppressWarnings("static-method")
    @EventHandler
    public void preinit(FMLPreInitializationEvent evt)
    {
        register();
    }
}
