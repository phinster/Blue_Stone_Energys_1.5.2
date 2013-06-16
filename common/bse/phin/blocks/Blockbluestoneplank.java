package bse.phin.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Blockbluestoneplank extends Block{

	public Blockbluestoneplank(int id, Material par2Material) {
		super(id, par2Material);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@Override
		public void registerIcons(IconRegister reg)
	{
		
		this.blockIcon = reg.registerIcon("bse:bluestoneplank");
		
	}
	
}
