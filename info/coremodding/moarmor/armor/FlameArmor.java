package info.coremodding.moarmor.armor;

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
 * The quartz armor
 */
public class FlameArmor extends ItemArmor {
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("FLAME", 21, new int[]{3, 11, 7, 3}, 5);
	public FlameArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		List<Object> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(entity.posX - 1, entity.posY - 2, entity.posZ - 1, entity.posX + 1, entity.posY + 2, entity.posZ + 1));
		for(Object e : entities){
			if(e instanceof EntityLivingBase && e != entity){
				((EntityLivingBase)e).setFire(10);
			}
		}
	}
}
