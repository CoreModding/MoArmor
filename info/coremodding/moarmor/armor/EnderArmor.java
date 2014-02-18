package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import info.coremodding.moarmor.handlers.TeleportationHandler;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The ender armor
 */
public class EnderArmor extends ItemArmor {
	
	/**
	 * The ender armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("ENDER", 50, new int[]{8, 20, 15, 8}, 3);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public EnderArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		if(entity.inventory.armorInventory[0] != null && entity.inventory.armorInventory[1] != null && entity.inventory.armorInventory[2] != null && entity.inventory.armorInventory[3] != null){
			if(entity.inventory.armorInventory[0].getItem() == RegistrationHandler.flameArmorBoots && entity.inventory.armorInventory[1].getItem() == RegistrationHandler.flameArmorLegs && entity.inventory.armorInventory[2].getItem() == RegistrationHandler.flameArmorChest && entity.inventory.armorInventory[3].getItem() == RegistrationHandler.flameArmorHelmet){
				if(entity.prevHealth > entity.getHealth()){
					new TeleportationHandler(entity).random();
				}
			}
		}
	}
}
