package bse.phin.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;


public class customfuels implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == core.bluestonecoal.itemID) { 
			return 1900;
		
		}else{
			
			return 0;


		

		
		
		
	

	
		}
	}
}
	
