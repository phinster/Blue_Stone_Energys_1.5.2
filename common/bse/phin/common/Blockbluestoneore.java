package bse.phin.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Blockbluestoneore extends Block{

	public Blockbluestoneore(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@Override
		public void registerIcons(IconRegister reg)
	{
		
		this.blockIcon = reg.registerIcon("bse:bluestoneore");
		
	}
	
 
		
	
	
	
	
	
}
