package bse.phin.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Itembluestonediamondplate extends Item{

	public Itembluestonediamondplate(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public void registerIcons(IconRegister reg)
{
	this.itemIcon = reg.registerIcon("bse:Itembluestonediamondplate");

}

}
