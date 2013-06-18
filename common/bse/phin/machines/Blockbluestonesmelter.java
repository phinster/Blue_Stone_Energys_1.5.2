package bse.phin.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class Blockbluestonesmelter extends Block{

	public Blockbluestonesmelter(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public Icon field_94392_a;
	public Icon field_94392_b;
	
	
		@Override
		public void registerIcons(IconRegister reg)
		{
			
			this.blockIcon = reg.registerIcon("bse:Blockbluestonesmelter_front");
			field_94392_a = reg.registerIcon("bse:Blockbluestonesmelter_top");
			field_94392_b = reg.registerIcon("bse:Blockbluestonesmelter_side");
			
			
		}
	
		public Icon getIcon(int par1, int par2) { 
			return par1 == 0 ? this.field_94392_b  : (par1 == 1 ? this.field_94392_a  : this.blockIcon);
		}

}

	


