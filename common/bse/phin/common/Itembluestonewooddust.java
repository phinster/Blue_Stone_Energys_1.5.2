package bse.phin.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Itembluestonewooddust extends Item{

	public Itembluestonewooddust(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	@Override
	public void registerIcons(IconRegister reg)
{
	this.itemIcon = reg.registerIcon("bse:Itembluestonewooddust");

}
	

}
