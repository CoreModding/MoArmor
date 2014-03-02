package info.coremodding.moarmor.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

@SuppressWarnings("javadoc")
public class ItemPlate extends Item {
    public static final String[] names = new String[]{"flintPlate",
            "quartzPlate", "obsidianPlate", "flamePlate", "enderPlate"};

    public ItemPlate() {
        super();
        this.setHasSubtypes(true);
        this.setCreativeTab(CreativeTabs.tabMaterials);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs,
                            List par3List) {
        for (int x = 0; x < 5; x++) {
            par3List.add(new ItemStack(this, 1, x));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack par1ItemStack) {
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return names[i];
    }
}
