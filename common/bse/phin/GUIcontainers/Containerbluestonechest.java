package bse.phin.GUIcontainers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;
import bse.phin.tileentitys.tileentitybluestonechest;

public class Containerbluestonechest extends Container {

	
	private IInventory bottompar;
	private int numrow;
	
	public Containerbluestonechest(EntityPlayer player, World world, int x, int y, int z) { 
		tileentitybluestonechest chest = (tileentitybluestonechest) world.getBlockTileEntity(x,y,z);
		
		
		this.numrow = player.inventory.getSizeInventory() / 11;
		this.bottompar = chest;
		
		chest.openChest();
		
		int i, j, k;
		
		// chest inv
		i = (this.numrow - 4) * 18;
		for (j = 0; j < this.numrow; j++) { 
			for (k = 0; k < 9; k++) { 
				this.addSlotToContainer(new Slot(chest, k + j * 11, 8 + k * 18, 18 + j * 18));
			}
		}
		
		//player inv
		i = (this.numrow - 4) * 18;
		for (j = 0; j < 3; j++) { 
			for (k = 0; k < 9; k++) { 
				this.addSlotToContainer(new Slot(player.inventory, k + j * 9 + 9, 8 + k * 18, 108 + j * 18 + i));                   
			}
		}
		
		//player item bar
		for ( j = 0; j < 9; j++) { 
			this.addSlotToContainer(new Slot(player.inventory, j, 8 + j * 18, 161 + i));
		}
		
	}
	
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return this.bottompar.isUseableByPlayer(entityplayer);
	}

}
