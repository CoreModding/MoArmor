package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import info.coremodding.moarmor.handlers.TeleportationHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The dirt armor
 */
public class DirtArmor extends ItemArmor {
	
	/**
	 * The dirt armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("DIRT", 4, new int[]{1, 1, 1, 1}, 3);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public DirtArmor(int par4) {
		super(material, 0, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		if(entity.inventory.armorInventory[0] != null && entity.inventory.armorInventory[1] != null && entity.inventory.armorInventory[2] != null && entity.inventory.armorInventory[3] != null){
			if(entity.inventory.armorInventory[0].getItem() == RegistrationHandler.dirtArmorBoots && entity.inventory.armorInventory[1].getItem() == RegistrationHandler.dirtArmorLegs && entity.inventory.armorInventory[2].getItem() == RegistrationHandler.dirtArmorChest && entity.inventory.armorInventory[3].getItem() == RegistrationHandler.dirtArmorHelmet){
			
			}
		}
	}	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(slot == 0 || slot == 1 || slot == 3){
		return "core_moarmor:textures/models/armor/dirt_layer_1.png";
		}
		if(slot == 2){
		return "core_moarmor:textures/models/armor/dirt_layer_2.png";
		} else {
			return null;
		}

	};
}
