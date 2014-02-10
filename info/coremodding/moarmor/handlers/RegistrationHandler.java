package info.coremodding.moarmor.handlers;

import net.minecraft.item.Item;
import info.coremodding.moarmor.armor.FlameArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegistrationHandler {
	// Flame Armor
	private Item flameArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("flameArmorHelmet");
	private Item flameArmorChest = new FlameArmor(0, 1).setUnlocalizedName("flameArmorChest");
	private Item flameArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("flameArmorLegs");
	private Item flameArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("flameArmorBoots");
	// Quartz Armor
	private Item quartzArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("quartzArmorHelmet");
	private Item quartzArmorChest = new FlameArmor(0, 1).setUnlocalizedName("quartzArmorChest");
	private Item quartzArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("quartzArmorLegs");
	private Item quartzArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("quartzArmorBoots");
	// Flint Armor
	private Item flintArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("flintArmorHelmet");
	private Item flintArmorChest = new FlameArmor(0, 1).setUnlocalizedName("flintArmorChest");
	private Item flintArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("flintArmorLegs");
	private Item flintArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("flintArmorBoots");
	
	public RegistrationHandler(){};

	public void registerArmorItems(){
		// Flame Armor
		GameRegistry.registerItem(flameArmorHelmet, "MoArmor_" + flameArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorChest, "MoArmor_" + flameArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorLegs, "MoArmor_" + flameArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorBoots, "MoArmor_" + flameArmorBoots.getUnlocalizedName());
		// Quartz Armor
		GameRegistry.registerItem(quartzArmorHelmet, "MoArmor_" + quartzArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(quartzArmorChest, "MoArmor_" + quartzArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(quartzArmorLegs, "MoArmor_" + quartzArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(quartzArmorBoots, "MoArmor_" + quartzArmorBoots.getUnlocalizedName());
		// Flint Armor
		GameRegistry.registerItem(flintArmorHelmet, "MoArmor_" + flintArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(flintArmorChest, "MoArmor_" + flintArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(flintArmorLegs, "MoArmor_" + flintArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(flintArmorBoots, "MoArmor_" + flintArmorBoots.getUnlocalizedName());
		}
}
