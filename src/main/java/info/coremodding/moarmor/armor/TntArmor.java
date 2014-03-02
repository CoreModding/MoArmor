package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The TnT armor
 */
public class TntArmor extends ItemArmor {
	/**
	 * The TnT armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("TNT", 18, new int[]{3, 7, 5, 3}, 9);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public TntArmor(int par4) {
		super(material, 0, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(slot == 0 || slot == 1 || slot == 3){
		return "core_moarmor:textures/models/armor/tnt_layer_1.png";
		}
		if(slot == 2){
		return "core_moarmor:textures/models/armor/tnt_layer_2.png";
		} else {
			return null;
		}
	};	
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		if(entity.inventory.armorInventory[0] != null && entity.inventory.armorInventory[1] != null && entity.inventory.armorInventory[2] != null && entity.inventory.armorInventory[3] != null){
			if(entity.inventory.armorInventory[0].getItem() == RegistrationHandler.tntArmorBoots && entity.inventory.armorInventory[1].getItem() == RegistrationHandler.tntArmorLegs && entity.inventory.armorInventory[2].getItem() == RegistrationHandler.tntArmorChest && entity.inventory.armorInventory[3].getItem() == RegistrationHandler.tntArmorHelmet){
				if(entity.isBurning()){
					float f = 4.0F;
					entity.inventory.armorInventory[0].stackSize--;
					entity.inventory.armorInventory[1].stackSize--;
					entity.inventory.armorInventory[2].stackSize--;
					entity.inventory.armorInventory[3].stackSize--;
			        entity.worldObj.createExplosion(entity, entity.posX, entity.posY, entity.posZ, f, true);
			    }
			}
		}
	}
}
