package moarmor.armor;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * The quartz armor
 */
public class QuartzArmor extends ItemArmor {
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public QuartzArmor(int renderindex, int par4) {
		super(ArmorMaterial.IRON, renderindex, par4);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		item.addEnchantment(Enchantment.thorns, 1);
	}
}
