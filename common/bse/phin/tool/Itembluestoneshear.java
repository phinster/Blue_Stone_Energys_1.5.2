package bse.phin.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemShears;

public class Itembluestoneshear extends ItemShears{

	public Itembluestoneshear(int par1, EnumToolMaterial toolbluestoneingot) {
		super(par1);
	
	}

		public void registerIcons(IconRegister reg)
	{
		this.itemIcon = reg.registerIcon("bse:Itembluestoneshear");
	}


}
