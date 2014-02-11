package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The flint armor
 */
public class FlintArmor extends ItemArmor {

	/**
	 * The flint armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("FLINT", 7, new int[]{1, 5, 3, 2}, 5);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public FlintArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		item.addEnchantment(Enchantment.thorns, 1);
	}
}
