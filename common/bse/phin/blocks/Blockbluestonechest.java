package bse.phin.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import bse.phin.GUIcontainers.Containerbluestonechest;
import bse.phin.GUIhandler.GUIBlockbluestonechest;
import bse.phin.tileentitys.TileEntityBlockbluestonechest;

public class Blockbluestonechest extends Block{

	public Blockbluestonechest(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	
	public void registerIcons(IconRegister reg)
	{
		
		this.blockIcon = reg.registerIcon("bse:Blockbluestonechest");
		
	}
	
	
	public boolean onBockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {
		if(player instanceof EntityPlayerMP) { 
			ModLoader.serverOpenWindow((EntityPlayerMP) player, new Containerbluestonechest(), 30, x, y, z);
		} else {
			ModLoader.openGUI((EntityPlayerSP)player, new GUIBlockbluestonechest(player.inventory, x, y, z));
			
			}
		
		return true;
	
	}
	
	public TileEntity createNewTileEntity(World par1World) { 
		return new TileEntityBlockbluestonechest();
		
	}
}



