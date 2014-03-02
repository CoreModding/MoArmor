package info.coremodding.moarmor.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * The grass armor
 */
public class GrassArmor extends ItemArmor {
	
	/**
	 * The grass armor material
	 */
	public static ArmorMaterial material = DirtArmor.material;
	
	/**
	 * @param renderindex Unknown
	 * @param par4 The armor type
	 */
	public GrassArmor(int par4) {
		super(material, 0, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(slot == 0 || slot == 1 || slot == 3){
		return "core_moarmor:textures/models/armor/grass_layer_1.png";
		}
		if(slot == 2){
		return "core_moarmor:textures/models/armor/grass_layer_2.png";
		} else {
			return null;
		}

	};
}
