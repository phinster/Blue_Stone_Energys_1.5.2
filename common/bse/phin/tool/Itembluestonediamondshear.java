package bse.phin.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemShears;

public class Itembluestonediamondshear extends ItemShears{

	public Itembluestonediamondshear(int par1, EnumToolMaterial toolbluestonediamond) {
		super(par1);
	}
	public void registerIcons(IconRegister reg)
	{
		this.itemIcon = reg.registerIcon("bse:Itembluestonediamondshear");
	}

	

}
