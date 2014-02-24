package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The quartz armor
 */
public class QuartzArmor extends ItemArmor {
	
	/**
	 * The quartz armor material
	 */
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("QUARTZ", 10, new int[]{1, 5, 3, 2}, 5);
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public QuartzArmor(int renderindex, int par4) {
		super(material, renderindex, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		// item.addEnchantment(Enchantment.thorns, 1);
	}
	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(slot == 0 || slot == 1 || slot == 2){
		return "core_moarmor:textures/models/armor/netherquartz_layer_1.png";
		}
		if(slot == 3){
		return "core_moarmor:textures/models/armor/netherquartz_layer_2.png";
		} else {
			return null;
		}

	};
}
