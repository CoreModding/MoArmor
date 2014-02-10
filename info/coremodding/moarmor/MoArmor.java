package info.coremodding.moarmor;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * The main mod class
 */
@Mod(modid = "zeus_MoArmor", name = "Mo' Armor", version = "1.0.0.0")
public class MoArmor {
	public RegistrationHandler rh = new RegistrationHandler();
	
	/**
	 * @param evt The event that triggered the method
	 */
	@EventHandler
	public void init(FMLInitializationEvent evt){
		
	}
	
	/**
	 * @param evt The event that triggered the method
	 */
	@EventHandler
	public void preinit(FMLPreInitializationEvent evt){
		register();
	}
	
	/**
	 * Registers stuff
	 */
	public void register(){
		rh.registerArmorItems();
	}
}
