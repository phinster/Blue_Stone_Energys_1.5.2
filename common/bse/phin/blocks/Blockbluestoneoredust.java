package bse.phin.blocks;

import java.util.Random;

import bse.phin.common.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Blockbluestoneoredust extends Block{

	public Blockbluestoneoredust(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
		public void registerIcons(IconRegister reg)
	{
		
		this.blockIcon = reg.registerIcon("bse:bluestoneoredust");
		
	}
	
	
	public int idDropped(int par1, Random rand, int par2) { 
		return core.bluestonedust.itemID;
	}
	
	public int quantityDropped(Random rand) { 
		return 3;
		
	}
	
}
