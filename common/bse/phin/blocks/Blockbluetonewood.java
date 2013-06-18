package bse.phin.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class Blockbluetonewood extends Block {

	public Blockbluetonewood(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public Icon field_94392_a;
	public Icon field_94392_b;
	
		@Override
		public void registerIcons(IconRegister reg)
		{
			
			this.blockIcon = reg.registerIcon("bse:Blockbluetonewood_side");
			field_94392_a = reg.registerIcon("bse:Blockbluetonewood_top");
			field_94392_b = reg.registerIcon("bse:Blockbluetonewood_bottom");
			
		}
	
		public Icon getIcon(int par1, int par2) { 
			return par1 == 0 ? this.field_94392_b  : (par1 == 1 ? this.field_94392_a : this.blockIcon);
		}

}
