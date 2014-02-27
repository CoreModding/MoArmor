package info.coremodding.moarmor.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import info.coremodding.moarmor.armor.DirtArmor;
import info.coremodding.moarmor.armor.EnderArmor;
import info.coremodding.moarmor.armor.FlameArmor;
import info.coremodding.moarmor.armor.FlintArmor;
import info.coremodding.moarmor.armor.ObsidianArmor;
import info.coremodding.moarmor.armor.QuartzArmor;
import info.coremodding.moarmor.items.ItemDiamondHammer;
import info.coremodding.moarmor.items.ItemHammer;
import info.coremodding.moarmor.items.ItemPlate;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Handles item and block registry
 */
public class RegistrationHandler {

	public static Item flameArmorHelmet = new FlameArmor(0, 0).setUnlocalizedName("flameArmorHelmet").setTextureName("core_moarmor:flame_helmet");
	public static Item flameArmorChest = new FlameArmor(0, 1).setUnlocalizedName("flameArmorChest").setTextureName("core_moarmor:flame_helmet");
	public static Item flameArmorLegs = new FlameArmor(0, 2).setUnlocalizedName("flameArmorLegs").setTextureName("core_moarmor:flame_helmet");
	public static Item flameArmorBoots = new FlameArmor(0, 3).setUnlocalizedName("flameArmorBoots").setTextureName("core_moarmor:flame_helmet");

	private static Item quartzArmorHelmet = new QuartzArmor(0, 0).setUnlocalizedName("quartzArmorHelmet").setTextureName("core_moarmor:netherquartz_helmet");
	private static Item quartzArmorChest = new QuartzArmor(0, 1).setUnlocalizedName("quartzArmorChest").setTextureName("core_moarmor:netherquartz_chestplate");
	private static Item quartzArmorLegs = new QuartzArmor(0, 2).setUnlocalizedName("quartzArmorLegs").setTextureName("core_moarmor:netherquartz_leggings");
	private static Item quartzArmorBoots = new QuartzArmor(0, 3).setUnlocalizedName("quartzArmorBoots").setTextureName("core_moarmor:netherquartz_boots");

	public static Item flintArmorHelmet = new FlintArmor(0, 0).setUnlocalizedName("flintArmorHelmet").setTextureName("core_moarmor:flint_helmet");
	public static Item flintArmorChest = new FlintArmor(0, 1).setUnlocalizedName("flintArmorChest").setTextureName("core_moarmor:flint_chestplate");
	public static Item flintArmorLegs = new FlintArmor(0, 2).setUnlocalizedName("flintArmorLegs").setTextureName("core_moarmor:flint_leggings");
	public static Item flintArmorBoots = new FlintArmor(0, 3).setUnlocalizedName("flintArmorBoots").setTextureName("core_moarmor:flint_boots");
	
	private static Item obsidianArmorHelmet = new ObsidianArmor(0, 0).setUnlocalizedName("obsidianArmorHelmet").setTextureName("core_moarmor:obsidian_helmet");
	private static Item obsidianArmorChest = new ObsidianArmor(0, 1).setUnlocalizedName("obsidianArmorChest").setTextureName("core_moarmor:obsidian_chestplate");
	private static Item obsidianArmorLegs = new ObsidianArmor(0, 2).setUnlocalizedName("obsidianArmorLegs").setTextureName("core_moarmor:obsidian_leggings");
	private static Item obsidianArmorBoots = new ObsidianArmor(0, 3).setUnlocalizedName("obsidianArmorBoots").setTextureName("core_moarmor:obsidian_boots");
	
	public static Item enderArmorHelmet = new EnderArmor(0, 0).setUnlocalizedName("enderArmorHelmet").setTextureName("core_moarmor:ender_helmet");
	public static Item enderArmorChest = new EnderArmor(0, 1).setUnlocalizedName("enderArmorChest").setTextureName("core_moarmor:ender_chestplate");
	public static Item enderArmorLegs = new EnderArmor(0, 2).setUnlocalizedName("enderArmorLegs").setTextureName("core_moarmor:ender_leggings");
	public static Item enderArmorBoots = new EnderArmor(0, 3).setUnlocalizedName("enderArmorBoots").setTextureName("core_moarmor:ender_boots");
	
	public static Item dirtArmorHelmet = new DirtArmor(0, 0).setUnlocalizedName("dirtArmorHelmet").setTextureName("core_moarmor:dirt_helmet");
	public static Item dirtArmorChest = new DirtArmor(0, 1).setUnlocalizedName("dirtArmorChest").setTextureName("core_moarmor:dirt_helmet");
	public static Item dirtArmorLegs = new DirtArmor(0, 2).setUnlocalizedName("dirtArmorLegs").setTextureName("core_moarmor:dirt_helmet");
	public static Item dirtArmorBoots = new DirtArmor(0, 3).setUnlocalizedName("dirtArmorBoots").setTextureName("core_moarmor:dirt_helmet");
	
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
		registerArmorSet(flameArmorHelmet, flameArmorChest, flameArmorLegs, flameArmorBoots);
		registerArmorSet(flintArmorHelmet, flintArmorChest, flintArmorLegs, flintArmorBoots);
		registerArmorSet(quartzArmorHelmet, quartzArmorChest, quartzArmorLegs, quartzArmorBoots);
		registerArmorSet(obsidianArmorHelmet, obsidianArmorChest, obsidianArmorLegs, obsidianArmorBoots);
		registerArmorSet(enderArmorHelmet, enderArmorChest, enderArmorLegs, enderArmorBoots);
		registerArmorSet(dirtArmorHelmet, dirtArmorChest, dirtArmorLegs, dirtArmorBoots);
	}
	
	/**
	 * Registers other items
	 */
	public static void registerOtherItems(){
		GameRegistry.registerItem(hammer, "moarmor_" + hammer.getUnlocalizedName());
		GameRegistry.registerItem(diamondHammer, "moarmor_" + diamondHammer.getUnlocalizedName());
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
		GameRegistry.registerItem(plate, "moarmor_" + plate.getUnlocalizedName());
		
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
		GameRegistry.registerItem(helmet, helmet.getUnlocalizedName());
		GameRegistry.registerItem(chestplate, chestplate.getUnlocalizedName());
		GameRegistry.registerItem(leggings, leggings.getUnlocalizedName());
		GameRegistry.registerItem(boots, boots.getUnlocalizedName());
	}
}
