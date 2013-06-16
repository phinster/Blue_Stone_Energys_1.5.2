package bse.phin.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Itembluestonediamond extends Item{

	public Itembluestonediamond(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@Override
	public void registerIcons(IconRegister reg)
	{
		
		this.itemIcon = reg.registerIcon("bse:bluestonediamond");
		
	}
	
	
}
