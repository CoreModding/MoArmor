package info.coremodding.moarmor.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import info.coremodding.moarmor.armor.FlameArmor;
import info.coremodding.moarmor.armor.ObsidianArmor;
import info.coremodding.moarmor.items.ItemDiamondHammer;
import info.coremodding.moarmor.items.ItemHammer;
import info.coremodding.moarmor.items.ItemPlate;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Handles item and block registry
 */
public class RegistrationHandler {

	public static Item flameArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("flameArmorHelmet");
	public static Item flameArmorChest = new FlameArmor(0, 1).setUnlocalizedName("flameArmorChest");
	public static Item flameArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("flameArmorLegs");
	public static Item flameArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("flameArmorBoots");

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
	
	public static Item hammer = new ItemHammer().setUnlocalizedName("hammer");
	public static ItemStack hammerStack = new ItemStack(hammer, 1, OreDictionary.WILDCARD_VALUE);
	public static Item diamondHammer = new ItemDiamondHammer().setUnlocalizedName("diamondHammer");
	public static ItemStack diamondHammerStack = new ItemStack(diamondHammer, 1, OreDictionary.WILDCARD_VALUE);
	
	public static Item plate = new ItemPlate();
	public static ItemStack flintPlate = new ItemStack(plate, 1, 0);
	public static ItemStack quartzPlate = new ItemStack(plate, 1, 1);
	public static ItemStack obsidianPlate = new ItemStack(plate, 1, 2);
	public static ItemStack flamePlate = new ItemStack(plate, 1, 3);
	public static ItemStack enderPlate = new ItemStack(plate, 1, 4);

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

		registerArmorSet(flintArmorHelmet, flintArmorChest, flintArmorLegs, flintArmorBoots);
		
		GameRegistry.registerItem(obsidianArmorHelmet, "MoArmor_" + obsidianArmorHelmet.getUnlocalizedName());
		GameRegistry.registerItem(obsidianArmorChest, "MoArmor_" + obsidianArmorChest.getUnlocalizedName());
		GameRegistry.registerItem(obsidianArmorLegs, "MoArmor_" + obsidianArmorLegs.getUnlocalizedName());
		GameRegistry.registerItem(obsidianArmorBoots, "MoArmor_" + obsidianArmorBoots.getUnlocalizedName());
	}
	
	/**
	 * Registers other items
	 */
	public static void registerOtherItems(){
		GameRegistry.registerItem(hammer, "MoArmor_" + hammer.getUnlocalizedName());
		GameRegistry.registerItem(diamondHammer, "MoArmor_" + diamondHammer.getUnlocalizedName());
	}
	
	/**
	 * Registers the armor recipes
	 */
	public static void registerArmorRecipes(){
		GameRegistry.addRecipe(new ItemStack(flintArmorHelmet, 1), "FFF","F F", 'F', flintPlate);
		GameRegistry.addRecipe(new ItemStack(flintArmorChest, 1), "F F","FFF", "FFF", 'F', flintPlate);
		GameRegistry.addRecipe(new ItemStack(flintArmorLegs, 1), "FFF","F F", "F F", 'F', flintPlate);
		GameRegistry.addRecipe(new ItemStack(flintArmorBoots, 1), "   ","F F", "F F", 'F', flintPlate);
		
		GameRegistry.addRecipe(new ItemStack(quartzArmorHelmet, 1), "QQQ","Q Q", 'Q', quartzPlate);
		GameRegistry.addRecipe(new ItemStack(quartzArmorChest, 1), "Q Q","QQQ", "QQQ", 'Q', quartzPlate);
		GameRegistry.addRecipe(new ItemStack(quartzArmorLegs, 1), "QQQ","Q Q", "Q Q", 'Q', quartzPlate);
		GameRegistry.addRecipe(new ItemStack(quartzArmorBoots, 1), "   ","Q Q", "Q Q", 'Q', quartzPlate);
		
		GameRegistry.addRecipe(new ItemStack(obsidianArmorHelmet, 1), "OOO","O O", 'O', obsidianPlate);
		GameRegistry.addRecipe(new ItemStack(obsidianArmorChest, 1), "O O","OOO", "OOO", 'O', obsidianPlate);
		GameRegistry.addRecipe(new ItemStack(obsidianArmorLegs, 1), "OOO","O O", "O O", 'O', obsidianPlate);
		GameRegistry.addRecipe(new ItemStack(obsidianArmorBoots, 1), "   ","O O", "O O", 'O', obsidianPlate);
		
		GameRegistry.addRecipe(new ItemStack(flameArmorHelmet, 1), "OOO","O O", 'O', flamePlate);
		GameRegistry.addRecipe(new ItemStack(flameArmorChest, 1), "O O","OOO", "OOO", 'O', flamePlate);
		GameRegistry.addRecipe(new ItemStack(flameArmorLegs, 1), "OOO","O O", "O O", 'O', flamePlate);
		GameRegistry.addRecipe(new ItemStack(flameArmorBoots, 1), "   ","O O", "O O", 'O', flamePlate);
	}
	
	/**
	 * Registers plates and their recipes
	 */
	public static void registerPlates(){
		GameRegistry.registerItem(plate, "MoArmor_" + plate.getUnlocalizedName());
		
		GameRegistry.addShapelessRecipe(flintPlate, new Object[] {
			new ItemStack(Items.flint), hammerStack
		});
		GameRegistry.addShapelessRecipe(flintPlate, new Object[] {
			new ItemStack(Items.flint), diamondHammerStack
		});
		
		GameRegistry.addShapelessRecipe(quartzPlate, new Object[] {
			new ItemStack(Items.quartz), hammerStack
		});
		GameRegistry.addShapelessRecipe(quartzPlate, new Object[] {
			new ItemStack(Items.quartz), diamondHammerStack
		});
		
		GameRegistry.addShapelessRecipe(obsidianPlate, new Object[] {
				new ItemStack(Blocks.obsidian), diamondHammerStack
			});
		
		GameRegistry.addShapelessRecipe(flamePlate, new Object[] {
				new ItemStack(Items.blaze_rod), diamondHammerStack
			});
		
		GameRegistry.addShapelessRecipe(enderPlate, new Object[] {
				new ItemStack(Items.ender_pearl), new ItemStack(Blocks.end_stone), diamondHammerStack
			});
	}
	
	/**
	 * Registers other item recipes
	 */
	public static void registerOtherRecipes(){
		GameRegistry.addRecipe(new ItemStack(hammer, 1), "III","III", " S ", 'S', Items.stick, 'I', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(diamondHammer, 1), "DDD","DDD", " S ", 'S', Items.stick, 'D', Items.diamond);
	}
	
	private static void registerArmorSet(Item helmet, Item chestplate, Item leggings, Item boots){
		GameRegistry.registerItem(helmet, "MoArmor_" + helmet.getUnlocalizedName());
		GameRegistry.registerItem(chestplate, "MoArmor_" + chestplate.getUnlocalizedName());
		GameRegistry.registerItem(leggings, "MoArmor_" + leggings.getUnlocalizedName());
		GameRegistry.registerItem(boots, "MoArmor_" + boots.getUnlocalizedName());
	}
}
