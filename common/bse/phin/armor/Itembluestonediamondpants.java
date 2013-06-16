package bse.phin.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class Itembluestonediamondpants extends ItemArmor{

	public Itembluestonediamondpants(int par1,
			EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	public void registerIcons(IconRegister reg)
	{
		
		this.itemIcon = reg.registerIcon("bse:Itembluestonediamondpants");
		
	}
}
