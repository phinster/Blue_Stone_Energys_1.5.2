package bse.phin.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Blockbluestonetorch extends Block {

	public Blockbluestonetorch(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		
		this.blockIcon = reg.registerIcon("bse:Blockbluestonetorch");
		
	}
	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) { 
		float f1 = (float)x + 0.5F;
		float f2 = (float)y + 1.5F;
		float f3 = (float)z + 0.f;
		float f4 = rand.nextFloat() * 0.6F -0.3F;
		float f5 = rand.nextFloat() * 0.6F -0.3F;
		
		world.spawnParticle("smoke", (double)(f1 + f4), (double)f2, (double)(f3 + f5), 0.0D, 0.0D, 0.0D);
		world.spawnParticle("flame", (double)(f1 + f4), (double)f2, (double)(f3 + f5), 0.0D, 0.0D, 0.0D);
		
	}
	

}
