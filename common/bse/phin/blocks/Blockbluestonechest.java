package bse.phin.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import bse.phin.GUIcontainers.Containerbluestonechest;
import bse.phin.GUIhandler.Guibluestonechest;
import bse.phin.tileentitys.tileentitybluestonechest;


public class Blockbluestonechest extends BlockContainer {

	public Blockbluestonechest(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(Block.soundWoodFootstep);
		
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		
		this.blockIcon = reg.registerIcon("bse:Blockbluestonechest");
		
	}
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) { 
		tileentitybluestonechest chest = (tileentitybluestonechest) world.getBlockTileEntity(x,y,z);
		
		if (player instanceof EntityPlayerMP && chest != null) { 
			IInventory inven = player.inventory;
		
			for(int j = 0; j < inven.getSizeInventory(); i++) { 
				inven.setInventorySlotContents(j, null);
			}
			
			for (int j = 0; j < chest.getSizeInventory(); j++ ) { 
				inven.setInventorySlotContents(j, chest.getStackInSlot(j));
			}
			ModLoader.serverOpenWindow((EntityPlayerMP) player, new Containerbluestonechest(player, world,x,y,z), 0, x, y, z);
				} else {
			ModLoader.openGUI((EntityPlayerSP)player, new Guibluestonechest(player, world,x,y,z));
			
		}
	
		return true;
	
	}
	
	public TileEntity createNewTileEntity(World par1World) {
		return new tileentitybluestonechest(); 
		
	}

	
	

	
}













