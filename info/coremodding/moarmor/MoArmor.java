package info.coremodding.moarmor;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * The main mod class
 */
@Mod(modid = "zeus_MoArmor", name = "Mo' Armor", version = "1.0.0.0")
public class MoArmor {
	
	/**
	 * @param evt The event that triggered the method
	 */
	@EventHandler
	public void init(FMLInitializationEvent evt){
		
	}
	
	/**
	 * @param evt The event that triggered the method
	 */
	@SuppressWarnings("static-method")
	@EventHandler
	public void preinit(FMLPreInitializationEvent evt){
		register();
	}
	
	/**
	 * Registers stuff
	 */
	public static void register(){
		RegistrationHandler.registerArmorItems();
	}
}
