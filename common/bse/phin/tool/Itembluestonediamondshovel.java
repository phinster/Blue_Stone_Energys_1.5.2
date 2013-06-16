package bse.phin.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class Itembluestonediamondshovel extends ItemSpade {

	public Itembluestonediamondshovel(int par1,
			EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	
	public void registerIcons(IconRegister reg)
	{
		this.itemIcon = reg.registerIcon("bse:Itembluestonediamondshovel");
	}

	

}
