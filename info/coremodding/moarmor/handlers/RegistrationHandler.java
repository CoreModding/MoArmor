package info.coremodding.moarmor.handlers;

import net.minecraft.item.Item;
import info.coremodding.moarmor.armor.FlameArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegistrationHandler {
	private Item flameArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("flameArmorHelmet");
	private Item flameArmorChest = new FlameArmor(0, 1).setUnlocalizedName("flameArmorChest");
	private Item flameArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("flameArmorLegs");
	private Item flameArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("flameArmorBoots");
	
	public RegistrationHandler(){};

	public void registerArmorItems(){
		GameRegistry.registerItem(flameArmorHelmet, "MoArmor_" + flameArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorChest, "MoArmor_" + flameArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorLegs, "MoArmor_" + flameArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorBoots, "MoArmor_" + flameArmorBoots.getUnlocalizedName());
		}
}
