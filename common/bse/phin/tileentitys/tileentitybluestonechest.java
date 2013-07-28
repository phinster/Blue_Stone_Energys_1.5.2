package bse.phin.tileentitys;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;


public class tileentitybluestonechest extends TileEntity implements ISidedInventory, net.minecraftforge.common.ISidedInventory{

	
	private ItemStack[] inv = new ItemStack[54];
	private String localizedName;
	
	public int playerchestuseatm;
	
	private String IICname;
	
	public int getSizeInventory() {
		return 54;
	}

	
	public ItemStack getStackInSlot(int i) {
		return this.inv[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		
	}
	
	public void writeToNBT(NBTTagCompound nbt) { 
		super.writeToNBT(nbt);
		
		NBTTagList nbttaglist = new NBTTagList();
		
		for (int i = 0; i < this.inv.length; i++) { 
			if (this.inv[i] != null) { 
				NBTTagCompound tag = new NBTTagCompound();
				tag.setByte("Slot", (byte)i);
				
				this.inv[i].writeToNBT(tag);
				
				nbttaglist.appendTag(tag);
			}
		}
		
		nbt.setTag("IIC", nbttaglist);
		
		if (this.isInvNameLocalized()) { 
			nbt.setString("IICname", this.IICname);
		}
	}
	
	public void readFromNBT(NBTTagCompound nbt) { 
		super.readFromNBT(nbt);
		
		NBTTagList nbttaglist = nbt.getTagList("IIC");
		this.inv = new ItemStack[this.getSizeInventory()];
		
		for (int i = 0; i < nbttaglist.tagCount(); i++) { 
			int var1 = nbt.getByte("Slot") & 225;
			
			if (var1 >= 0 && var1 < this.inv.length) { 
				this.inv[var1] = ItemStack.loadItemStackFromNBT(nbt);
			}
		}
		
		if (nbt.hasKey("IICname")) { 
			this.IICname = nbt.getString("IICname");
		}
	}
		
	
	
	public String getInvName() {
		return this.isInvNameLocalized() ? this.localizedName : "xontainerdfdfsfsdfsdsdfsdbluestonechest"; // TODO
	}

	
	public boolean isInvNameLocalized() {
		return this.localizedName != null && this.localizedName.length() > 0;
	}
	
	/**
	* Setting the localized name variable
	*@param part1Str
	*/
	public void func_94043_a(String par1Str) { 
		this.localizedName = par1Str;
	}

	
	public int getInventoryStackLimit() {
		return 64;
	}

	
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entityplayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord) <= 64.0D;                                               
	}

	
	public void openChest() {
		return;
	}

	@Override
	public void closeChest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isStackValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	@Deprecated
	public
	int getStartInventorySide(ForgeDirection side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Deprecated
	public
	int getSizeInventorySide(ForgeDirection side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return true;
	} 

}
