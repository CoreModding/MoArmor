package info.coremodding.moarmor.armor;

import info.coremodding.moarmor.handlers.RegistrationHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
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
		this.setTextureName("core_MoArmor:flintArmor");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack item){
		item.addEnchantment(Enchantment.thorns, 1);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		System.out.println("CALLED!");
		if(slot == 0 || slot == 1 || slot == 2){
			System.out.println("return 1!");
		return "core_MoArmor:textures/models/armor/flint_layer_1.png";
		}
		if(slot == 3){
			System.out.println("return 2!");
		return "core_MoArmor:textures/models/armor/flint_layer_2.png";
		} else {
			System.out.println("Return null!");
			return null;
		}

		};
}
