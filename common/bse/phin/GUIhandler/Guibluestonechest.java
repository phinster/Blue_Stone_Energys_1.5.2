package bse.phin.GUIhandler;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import bse.phin.GUIcontainers.Containerbluestonechest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Guibluestonechest extends GuiContainer {

	public Guibluestonechest(EntityPlayer player, World world,int x, int y, int z) {
		super(new Containerbluestonechest(player, world,x,y,z));
		}
	
	protected void drawGuiContainerForeGroundLayer(int par1, int par2) { 
		this.fontRenderer.drawString("Blue Stone Chest", 0, 0, 4210752);
		this.fontRenderer.drawString("Inventory", 0, 0, 4210752);
	}
	
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.renderEngine.bindTexture("/mods/bse/textures/gui/GUIbluestonechest.png");
		
		this.xSize = 176;
		this.ySize = 223;
		
		int var1 = (this.width - this.xSize) / 2;
		int var2 = (this.height - this.ySize) / 2;
		
		this.drawTexturedModalRect(var1, var2, 0, 0,this.xSize, this.ySize);
	}


}
