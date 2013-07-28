package bse.phin.GUIhandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiBlockbluestonesmelter extends GuiScreen {
	
	private World worldmc;
	private EntityPlayer playerp;
	private Minecraft mine;
	
	public GuiBlockbluestonesmelter(World world, EntityPlayer entityplayer, Minecraft minecraft) { 
		
		worldmc = world;
		playerp = entityplayer;
		mine = minecraft;
		
	}
	
	public void initGui() { 
		buttonList.add(new GuiButton(0, width / 2 - 50, height / 2 - 50, 100, 20,"button"));
	}
	
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 0) {
			this.drawCenteredString(fontRenderer, "String", width / 2 - 60, height / 2 - 60, 0xffffff);
			
		}
	}
	
	public void drawScreen(int i, int j, float f) { 
		drawDefaultBackground();
		super.drawScreen(i, j, f);
		
		this.drawCenteredString(fontRenderer, "String", width / 2 - 85, height / 2 - 60, 0xffffff);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
