package moarmor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * The main mod class
 */
@Mod(modid = "zeus_MoArmor", name = "Mo' Armor", version = "1.0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MoArmor {
	
	/**
	 * @param evt The event that triggered the method
	 */
	@EventHandler
	public void init(FMLInitializationEvent evt){
		register();
	}
	
	/**
	 * Registers stuff
	 */
	public void register(){
		
	}
}
