package info.coremodding.moarmor.handlers;

import net.minecraft.item.Item;
import info.coremodding.moarmor.armor.FlameArmor;
import info.coremodding.moarmor.armor.ObsidianArmor;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Handles item and block registry
 */
public class RegistrationHandler {

	private static Item flameArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("flameArmorHelmet");
	private static Item flameArmorChest = new FlameArmor(0, 1).setUnlocalizedName("flameArmorChest");
	private static Item flameArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("flameArmorLegs");
	private static Item flameArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("flameArmorBoots");

	private static Item quartzArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("quartzArmorHelmet");
	private static Item quartzArmorChest = new FlameArmor(0, 1).setUnlocalizedName("quartzArmorChest");
	private static Item quartzArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("quartzArmorLegs");
	private static Item quartzArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("quartzArmorBoots");

	private static Item flintArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("flintArmorHelmet");
	private static Item flintArmorChest = new FlameArmor(0, 1).setUnlocalizedName("flintArmorChest");
	private static Item flintArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("flintArmorLegs");
	private static Item flintArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("flintArmorBoots");
	
	private static Item obsidianArmorHelmet = new ObsidianArmor(0, 0).setUnlocalizedName("obsidianArmorHelmet");
	private static Item obsidianArmorChest = new ObsidianArmor(0, 1).setUnlocalizedName("obsidianArmorChest");
	private static Item obsidianArmorLegs = new ObsidianArmor(0, 2).setUnlocalizedName("obsidianArmorLegs");
	private static Item obsidianArmorBoots = new ObsidianArmor(0, 3).setUnlocalizedName("obsidianArmorBoots");

	/**
	 * Registers the armor items
	 */
	public static void registerArmorItems(){
		GameRegistry.registerItem(flameArmorHelmet, "MoArmor_" + flameArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorChest, "MoArmor_" + flameArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorLegs, "MoArmor_" + flameArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(flameArmorBoots, "MoArmor_" + flameArmorBoots.getUnlocalizedName());

		GameRegistry.registerItem(quartzArmorHelmet, "MoArmor_" + quartzArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(quartzArmorChest, "MoArmor_" + quartzArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(quartzArmorLegs, "MoArmor_" + quartzArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(quartzArmorBoots, "MoArmor_" + quartzArmorBoots.getUnlocalizedName());

		GameRegistry.registerItem(flintArmorHelmet, "MoArmor_" + flintArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(flintArmorChest, "MoArmor_" + flintArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(flintArmorLegs, "MoArmor_" + flintArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(flintArmorBoots, "MoArmor_" + flintArmorBoots.getUnlocalizedName());
		
		GameRegistry.registerItem(obsidianArmorHelmet, "MoArmor_" + obsidianArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(obsidianArmorChest, "MoArmor_" + obsidianArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(obsidianArmorLegs, "MoArmor_" + obsidianArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(obsidianArmorBoots, "MoArmor_" + obsidianArmorBoots.getUnlocalizedName());
	}
}
