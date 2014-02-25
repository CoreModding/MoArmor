package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.handlers.RegistrationHandler;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

/**
 * The flame armor
 */
public class FlameArmor extends ItemArmor {
	
	/**
	 * The flame armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("FLAME", 21, new int[]{3, 11, 7, 3}, 5);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public FlameArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		if(entity.inventory.armorInventory[0] != null && entity.inventory.armorInventory[1] != null && entity.inventory.armorInventory[2] != null && entity.inventory.armorInventory[3] != null){
			if(entity.inventory.armorInventory[0].getItem() == RegistrationHandler.flameArmorBoots && entity.inventory.armorInventory[1].getItem() == RegistrationHandler.flameArmorLegs && entity.inventory.armorInventory[2].getItem() == RegistrationHandler.flameArmorChest && entity.inventory.armorInventory[3].getItem() == RegistrationHandler.flameArmorHelmet){
				List<Object> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(entity.posX - 1, entity.posY - 2, entity.posZ - 1, entity.posX + 1, entity.posY + 2, entity.posZ + 1));
				for(Object e : entities){
					if(e instanceof EntityLivingBase && e != entity){
						((EntityLivingBase)e).setFire(10);
					}
				}
			}
		}
	}
}
