package info.coremodding.moarmor.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import info.coremodding.moarmor.armor.*;
import info.coremodding.moarmor.helpers.ArmorHelper;
import info.coremodding.moarmor.items.ItemDiamondHammer;
import info.coremodding.moarmor.items.ItemHammer;
import info.coremodding.moarmor.items.ItemPlate;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Handles item and block registry
 */
@SuppressWarnings("javadoc")
public class RegistrationHandler
{
    
    private static final Item      plate               = new ItemPlate();
    
    public static final Item       diamondHammer       = new ItemDiamondHammer()
                                                               .setUnlocalizedName(
                                                                       "diamondHammer")
                                                               .setTextureName(
                                                                       "core_moarmor:diamond_hammer");
    private static final ItemStack diamondHammerStack  = new ItemStack(
                                                               diamondHammer,
                                                               1,
                                                               OreDictionary.WILDCARD_VALUE);
    public static final Item       hammer              = new ItemHammer()
                                                               .setUnlocalizedName(
                                                                       "hammer")
                                                               .setTextureName(
                                                                       "core_moarmor:hammer");
    public static final ItemStack  hammerStack         = new ItemStack(
                                                               hammer,
                                                               1,
                                                               OreDictionary.WILDCARD_VALUE);
    
    public static final Item       dirtArmorBoots      = new DirtArmor(3)
                                                               .setUnlocalizedName(
                                                                       "dirtArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:dirt_boots");
    public static final Item       dirtArmorChest      = new DirtArmor(1)
                                                               .setUnlocalizedName(
                                                                       "dirtArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:dirt_chestplate");
    public static final Item       dirtArmorHelmet     = new DirtArmor(0)
                                                               .setUnlocalizedName(
                                                                       "dirtArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:dirt_helmet");
    public static final Item       dirtArmorLegs       = new DirtArmor(2)
                                                               .setUnlocalizedName(
                                                                       "dirtArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:dirt_leggings");
    public static final ItemStack  dirtPlate           = new ItemStack(plate,
                                                               1, 5);
    
    public static final Item       grassArmorBoots     = new GrassArmor(3)
                                                               .setUnlocalizedName(
                                                                       "grassArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:grass_boots");
    public static final Item       grassArmorChest     = new GrassArmor(1)
                                                               .setUnlocalizedName(
                                                                       "grassArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:grass_chestplate");
    public static final Item       grassArmorHelmet    = new GrassArmor(0)
                                                               .setUnlocalizedName(
                                                                       "grassArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:grass_helmet");
    public static final Item       grassArmorLegs      = new GrassArmor(2)
                                                               .setUnlocalizedName(
                                                                       "grassArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:grass_leggings");
    public static final ItemStack  grassPlate          = new ItemStack(plate,
                                                               1, 7);
    
    public static final Item       enderArmorBoots     = new EnderArmor(3)
                                                               .setUnlocalizedName(
                                                                       "enderArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:ender_boots");
    public static final Item       enderArmorChest     = new EnderArmor(1)
                                                               .setUnlocalizedName(
                                                                       "enderArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:ender_chestplate");
    
    public static final Item       enderArmorHelmet    = new EnderArmor(0)
                                                               .setUnlocalizedName(
                                                                       "enderArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:ender_helmet");
    public static final Item       enderArmorLegs      = new EnderArmor(2)
                                                               .setUnlocalizedName(
                                                                       "enderArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:ender_leggings");
    public static final ItemStack  enderPlate          = new ItemStack(plate,
                                                               1, 4);
    
    public static final Item       flameArmorBoots     = new FlameArmor(3)
                                                               .setUnlocalizedName(
                                                                       "flameArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:flame_helmet");
    
    public static final Item       flameArmorChest     = new FlameArmor(1)
                                                               .setUnlocalizedName(
                                                                       "flameArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:flame_helmet");
    public static final Item       flameArmorHelmet    = new FlameArmor(0)
                                                               .setUnlocalizedName(
                                                                       "flameArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:flame_helmet");
    public static final Item       flameArmorLegs      = new FlameArmor(2)
                                                               .setUnlocalizedName(
                                                                       "flameArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:flame_helmet");
    public static final ItemStack  flamePlate          = new ItemStack(plate,
                                                               1, 3);
    
    public static final Item       flintArmorBoots     = new FlintArmor(3)
                                                               .setUnlocalizedName(
                                                                       "flintArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:flint_boots");
    public static final Item       flintArmorChest     = new FlintArmor(1)
                                                               .setUnlocalizedName(
                                                                       "flintArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:flint_chestplate");
    public static final Item       flintArmorHelmet    = new FlintArmor(0)
                                                               .setUnlocalizedName(
                                                                       "flintArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:flint_helmet");
    public static final Item       flintArmorLegs      = new FlintArmor(2)
                                                               .setUnlocalizedName(
                                                                       "flintArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:flint_leggings");
    public static final ItemStack  flintPlate          = new ItemStack(plate,
                                                               1, 0);
    
    private static final Item      obsidianArmorBoots  = new ObsidianArmor(3)
                                                               .setUnlocalizedName(
                                                                       "obsidianArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:obsidian_boots");
    
    private static final Item      obsidianArmorChest  = new ObsidianArmor(1)
                                                               .setUnlocalizedName(
                                                                       "obsidianArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:obsidian_chestplate");
    private static final Item      obsidianArmorHelmet = new ObsidianArmor(0)
                                                               .setUnlocalizedName(
                                                                       "obsidianArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:obsidian_helmet");
    private static final Item      obsidianArmorLegs   = new ObsidianArmor(2)
                                                               .setUnlocalizedName(
                                                                       "obsidianArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:obsidian_leggings");
    public static final ItemStack  obsidianPlate       = new ItemStack(plate,
                                                               1, 2);
    
    private static final Item      quartzArmorBoots    = new QuartzArmor(3)
                                                               .setUnlocalizedName(
                                                                       "quartzArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:netherquartz_boots");
    private static final Item      quartzArmorChest    = new QuartzArmor(1)
                                                               .setUnlocalizedName(
                                                                       "quartzArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:netherquartz_chestplate");
    private static final Item      quartzArmorHelmet   = new QuartzArmor(0)
                                                               .setUnlocalizedName(
                                                                       "quartzArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:netherquartz_helmet");
    private static final Item      quartzArmorLegs     = new QuartzArmor(2)
                                                               .setUnlocalizedName(
                                                                       "quartzArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:netherquartz_leggings");
    public static final ItemStack  quartzPlate         = new ItemStack(plate,
                                                               1, 1);
    
    public static final Item       tntArmorBoots       = new TntArmor(3)
                                                               .setUnlocalizedName(
                                                                       "tntArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:tnt_boots");
    public static final Item       tntArmorChest       = new TntArmor(1)
                                                               .setUnlocalizedName(
                                                                       "tntArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:tnt_chestplate");
    public static final Item       tntArmorHelmet      = new TntArmor(0)
                                                               .setUnlocalizedName(
                                                                       "tntArmorHelmet")
                                                               .setTextureName(
                                                                       "core_moarmor:tnt_helmet");
    public static final Item       tntArmorLegs        = new TntArmor(2)
                                                               .setUnlocalizedName(
                                                                       "tntArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:tnt_leggings");
    public static final ItemStack  tntPlate            = new ItemStack(plate,
                                                               1, 9);
    
    public static final Item       foodArmorBoots      = new FoodArmor(3, "")
                                                               .setUnlocalizedName(
                                                                       "foodArmorBoots")
                                                               .setTextureName(
                                                                       "core_moarmor:food_boots");
    public static final Item       foodArmorChest      = new FoodArmor(1, "")
                                                               .setUnlocalizedName(
                                                                       "foodArmorChest")
                                                               .setTextureName(
                                                                       "core_moarmor:food_chestplate");
    public static final Item       foodArmorHelmetPorkchop     = new FoodArmor(0, "Automatically restores 4 hungerbars when hungry")
                                                               .setUnlocalizedName(
                                                                       "foodArmorHelmetPork")
                                                               .setTextureName(
                                                                       "core_moarmor:food_helmet");
    public static final Item       foodArmorHelmetCookie     = new FoodArmor(0, "Automatically restores 1 hungerbar when hungry")
    														   .setUnlocalizedName(
    															        "foodArmorHelmetCookie")
    														   .setTextureName(
    														            "core_moarmor:food_helmet");
    public static final Item       foodArmorHelmetBread     = new FoodArmor(0, "Automatically restores 2 and a half hungerbar when hungry")
	   .setUnlocalizedName(
		        "foodArmorHelmetBread")
	   .setTextureName(
	            "core_moarmor:food_helmet");
    public static final Item       foodArmorHelmetApple     = new FoodArmor(0, "Automatically restores 2 hungerbars when hungry")
	   .setUnlocalizedName(
		        "foodArmorHelmetApple")
	   .setTextureName(
	            "core_moarmor:food_helmet");
    public static final Item       foodArmorLegs       = new FoodArmor(2, "")
                                                               .setUnlocalizedName(
                                                                       "foodArmorLegs")
                                                               .setTextureName(
                                                                       "core_moarmor:food_leggings");
    
    /**
     * Registers the armor items
     */
    public static void registerArmorItems()
    {
        registerArmorSet(flameArmorHelmet, flameArmorChest, flameArmorLegs,
                flameArmorBoots);
        registerArmorSet(flintArmorHelmet, flintArmorChest, flintArmorLegs,
                flintArmorBoots);
        registerArmorSet(quartzArmorHelmet, quartzArmorChest, quartzArmorLegs,
                quartzArmorBoots);
        registerArmorSet(obsidianArmorHelmet, obsidianArmorChest,
                obsidianArmorLegs, obsidianArmorBoots);
        registerArmorSet(enderArmorHelmet, enderArmorChest, enderArmorLegs,
                enderArmorBoots);
        registerArmorSet(dirtArmorHelmet, dirtArmorChest, dirtArmorLegs,
                dirtArmorBoots);
        registerArmorSet(grassArmorHelmet, grassArmorChest, grassArmorLegs,
                grassArmorBoots);
        registerArmorSet(tntArmorHelmet, tntArmorChest, tntArmorLegs,
                tntArmorBoots);
    }
    
    /**
     * Registers the armor recipes
     */
    public static void registerArmorRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(flintArmorHelmet, 1), "FFF",
                "F F", 'F', flintPlate);
        GameRegistry.addRecipe(new ItemStack(flintArmorChest, 1), "F F", "FFF",
                "FFF", 'F', flintPlate);
        GameRegistry.addRecipe(new ItemStack(flintArmorLegs, 1), "FFF", "F F",
                "F F", 'F', flintPlate);
        GameRegistry.addRecipe(new ItemStack(flintArmorBoots, 1), "   ", "F F",
                "F F", 'F', flintPlate);
        
        GameRegistry.addRecipe(new ItemStack(quartzArmorHelmet, 1), "QQQ",
                "Q Q", 'Q', quartzPlate);
        GameRegistry.addRecipe(new ItemStack(quartzArmorChest, 1), "Q Q",
                "QQQ", "QQQ", 'Q', quartzPlate);
        GameRegistry.addRecipe(new ItemStack(quartzArmorLegs, 1), "QQQ", "Q Q",
                "Q Q", 'Q', quartzPlate);
        GameRegistry.addRecipe(new ItemStack(quartzArmorBoots, 1), "   ",
                "Q Q", "Q Q", 'Q', quartzPlate);
        
        GameRegistry.addRecipe(new ItemStack(obsidianArmorHelmet, 1), "OOO",
                "O O", 'O', obsidianPlate);
        GameRegistry.addRecipe(new ItemStack(obsidianArmorChest, 1), "O O",
                "OOO", "OOO", 'O', obsidianPlate);
        GameRegistry.addRecipe(new ItemStack(obsidianArmorLegs, 1), "OOO",
                "O O", "O O", 'O', obsidianPlate);
        GameRegistry.addRecipe(new ItemStack(obsidianArmorBoots, 1), "   ",
                "O O", "O O", 'O', obsidianPlate);
        
        GameRegistry.addRecipe(new ItemStack(flameArmorHelmet, 1), "OOO",
                "O O", 'O', flamePlate);
        GameRegistry.addRecipe(new ItemStack(flameArmorChest, 1), "O O", "OOO",
                "OOO", 'O', flamePlate);
        GameRegistry.addRecipe(new ItemStack(flameArmorLegs, 1), "OOO", "O O",
                "O O", 'O', flamePlate);
        GameRegistry.addRecipe(new ItemStack(flameArmorBoots, 1), "   ", "O O",
                "O O", 'O', flamePlate);
        
        GameRegistry.addRecipe(new ItemStack(tntArmorHelmet, 1), "OOO", "O O",
                'O', tntPlate);
        GameRegistry.addRecipe(new ItemStack(tntArmorChest, 1), "O O", "OOO",
                "OOO", 'O', tntPlate);
        GameRegistry.addRecipe(new ItemStack(tntArmorLegs, 1), "OOO", "O O",
                "O O", 'O', tntPlate);
        GameRegistry.addRecipe(new ItemStack(tntArmorBoots, 1), "   ", "O O",
                "O O", 'O', tntPlate);
        
        GameRegistry.addRecipe(new ItemStack(grassArmorHelmet, 1), "OOO",
                "O O", 'O', grassPlate);
        GameRegistry.addRecipe(new ItemStack(grassArmorChest, 1), "O O", "OOO",
                "OOO", 'O', grassPlate);
        GameRegistry.addRecipe(new ItemStack(grassArmorLegs, 1), "OOO", "O O",
                "O O", 'O', grassPlate);
        GameRegistry.addRecipe(new ItemStack(grassArmorBoots, 1), "   ", "O O",
                "O O", 'O', grassPlate);
        
        GameRegistry.addRecipe(new ItemStack(dirtArmorHelmet, 1), "OOO", "O O",
                'O', dirtPlate);
        GameRegistry.addRecipe(new ItemStack(dirtArmorChest, 1), "O O", "OOO",
                "OOO", 'O', dirtPlate);
        GameRegistry.addRecipe(new ItemStack(dirtArmorLegs, 1), "OOO", "O O",
                "O O", 'O', dirtPlate);
        GameRegistry.addRecipe(new ItemStack(dirtArmorBoots, 1), "   ", "O O",
                "O O", 'O', dirtPlate);
    }
    
    private static void registerArmorSet(Item helmet, Item chestplate,
            Item leggings, Item boots)
    {
        GameRegistry.registerItem(helmet, helmet.getUnlocalizedName());
        GameRegistry.registerItem(chestplate, chestplate.getUnlocalizedName());
        GameRegistry.registerItem(leggings, leggings.getUnlocalizedName());
        GameRegistry.registerItem(boots, boots.getUnlocalizedName());
    }
    
    /**
     * Registers other items
     */
    public static void registerOtherItems()
    {
        GameRegistry.registerItem(hammer,
                "moarmor_" + hammer.getUnlocalizedName());
        GameRegistry.registerItem(diamondHammer,
                "moarmor_" + diamondHammer.getUnlocalizedName());
    }
    
    /**
     * Registers other item recipes
     */
    public static void registerOtherRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(hammer, 1), "III", "III", " S ",
                'S', Items.stick, 'I', Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(diamondHammer, 1), "DDD", "DDD",
                " S ", 'S', Items.stick, 'D', Items.diamond);
    }
    
    /**
     * Registers plates and their recipes
     */
    public static void registerPlates()
    {
        GameRegistry.registerItem(plate, plate.getUnlocalizedName());
        
        GameRegistry.addShapelessRecipe(flintPlate, new Object[] {
                new ItemStack(Items.flint), hammerStack });
        GameRegistry.addShapelessRecipe(flintPlate, new Object[] {
                new ItemStack(Items.flint), diamondHammerStack });
        
        GameRegistry.addShapelessRecipe(quartzPlate, new Object[] {
                new ItemStack(Items.quartz), hammerStack });
        GameRegistry.addShapelessRecipe(quartzPlate, new Object[] {
                new ItemStack(Items.quartz), diamondHammerStack });
        
        GameRegistry.addShapelessRecipe(tntPlate, new Object[] {
                new ItemStack(Blocks.tnt), hammerStack });
        GameRegistry.addShapelessRecipe(tntPlate, new Object[] {
                new ItemStack(Blocks.tnt), diamondHammerStack });
        
        GameRegistry.addShapelessRecipe(dirtPlate, new Object[] {
                new ItemStack(Blocks.dirt), hammerStack });
        GameRegistry.addShapelessRecipe(dirtPlate, new Object[] {
                new ItemStack(Blocks.dirt), diamondHammerStack });
        
        GameRegistry.addShapelessRecipe(grassPlate, new Object[] {
                new ItemStack(Blocks.grass), hammerStack });
        GameRegistry.addShapelessRecipe(grassPlate, new Object[] {
                new ItemStack(Blocks.grass), diamondHammerStack });
        
        GameRegistry.addShapelessRecipe(obsidianPlate, new Object[] {
                new ItemStack(Blocks.obsidian), diamondHammerStack });
        
        GameRegistry.addShapelessRecipe(flamePlate, new Object[] {
                new ItemStack(Items.blaze_rod), diamondHammerStack });
        
        GameRegistry.addShapelessRecipe(enderPlate, new Object[] {
                new ItemStack(Items.ender_pearl),
                new ItemStack(Blocks.end_stone), diamondHammerStack });
    }
    
    /**
     * Registers food armor and their recipes
     */
    public static void registerFoodArmor()
    {
        GameRegistry.registerItem(foodArmorHelmetPorkchop, foodArmorHelmetPorkchop.getUnlocalizedName());
        GameRegistry.registerItem(foodArmorHelmetCookie, foodArmorHelmetCookie.getUnlocalizedName());
        GameRegistry.registerItem(foodArmorHelmetBread, foodArmorHelmetBread.getUnlocalizedName());
        GameRegistry.registerItem(foodArmorHelmetApple, foodArmorHelmetApple.getUnlocalizedName());
        GameRegistry.registerItem(foodArmorChest, foodArmorChest.getUnlocalizedName());
        GameRegistry.registerItem(foodArmorLegs, foodArmorLegs.getUnlocalizedName());
        GameRegistry.registerItem(foodArmorBoots, foodArmorBoots.getUnlocalizedName());
        
        ItemStack porkArmorHelmet = new ItemStack(foodArmorHelmetPorkchop);
        ItemStack cookieArmorHelmet = new ItemStack(foodArmorHelmetCookie);
        ItemStack breadArmorHelmet = new ItemStack(foodArmorHelmetBread);
        ItemStack appleArmorHelmet = new ItemStack(foodArmorHelmetApple);
        
        ArmorHelper.addStringToNBT(porkArmorHelmet, "feedlevel", "8");
        GameRegistry.addRecipe(porkArmorHelmet, "OOO", "O O", 'O',
                Items.cooked_porkchop);
        GameRegistry.addRecipe(porkArmorHelmet, "OOO", "O O", 'O',
                Items.cooked_beef);
        
        ArmorHelper.addStringToNBT(cookieArmorHelmet, "feedlevel", "2");
        GameRegistry.addRecipe(cookieArmorHelmet, "OOO", "O O", 'O',
                Items.cookie);
        
        ArmorHelper.addStringToNBT(breadArmorHelmet, "feedlevel", "5");
        GameRegistry.addRecipe(breadArmorHelmet, "OOO", "O O", 'O',
                Items.bread);
       
        ArmorHelper.addStringToNBT(appleArmorHelmet, "feedlevel", "4");
        GameRegistry.addRecipe(appleArmorHelmet, "OOO", "O O", 'O',
                Items.apple);
        
        GameRegistry.addRecipe(new ItemStack(foodArmorChest, 1), "O O", "OOO",
                "OOO", 'O', Items.cooked_porkchop);
        GameRegistry.addRecipe(new ItemStack(foodArmorLegs, 1), "OOO", "O O",
                "O O", 'O', Items.cooked_porkchop);
        GameRegistry.addRecipe(new ItemStack(foodArmorBoots, 1), "   ", "O O",
                "O O", 'O', Items.cooked_porkchop);

        GameRegistry.addRecipe(new ItemStack(foodArmorChest, 1), "O O", "OOO",
                "OOO", 'O', Items.cooked_beef);
        GameRegistry.addRecipe(new ItemStack(foodArmorLegs, 1), "OOO", "O O",
                "O O", 'O', Items.cooked_beef);
        GameRegistry.addRecipe(new ItemStack(foodArmorBoots, 1), "   ", "O O",
                "O O", 'O', Items.cooked_beef);
        
        GameRegistry.addRecipe(new ItemStack(foodArmorChest, 1), "O O", "OOO",
                "OOO", 'O', Items.cookie);
        GameRegistry.addRecipe(new ItemStack(foodArmorLegs, 1), "OOO", "O O",
                "O O", 'O', Items.cookie);
        GameRegistry.addRecipe(new ItemStack(foodArmorBoots, 1), "   ", "O O",
                "O O", 'O', Items.cookie);
        
        GameRegistry.addRecipe(new ItemStack(foodArmorChest, 1), "O O", "OOO",
                "OOO", 'O', Items.bread);
        GameRegistry.addRecipe(new ItemStack(foodArmorLegs, 1), "OOO", "O O",
                "O O", 'O', Items.bread);
        GameRegistry.addRecipe(new ItemStack(foodArmorBoots, 1), "   ", "O O",
                "O O", 'O', Items.bread);
        
        GameRegistry.addRecipe(new ItemStack(foodArmorChest, 1), "O O", "OOO",
                "OOO", 'O', Items.apple);
        GameRegistry.addRecipe(new ItemStack(foodArmorLegs, 1), "OOO", "O O",
                "O O", 'O', Items.apple);
        GameRegistry.addRecipe(new ItemStack(foodArmorBoots, 1), "   ", "O O",
                "O O", 'O', Items.apple);
    }
}
