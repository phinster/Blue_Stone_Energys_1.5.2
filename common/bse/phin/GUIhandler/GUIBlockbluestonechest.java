package bse.phin.GUIhandler;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import bse.phin.GUIcontainers.Containerbluestonechest;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GUIBlockbluestonechest extends GuiContainer {

	public GUIBlockbluestonechest(InventoryPlayer inventory, int x, int y, int z) {
		super(new Containerbluestonechest());
		
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRenderer.drawString("Blue Stone Chest", 0, 0, 4210752);
		this.fontRenderer.drawString("Inventory", 0, 0, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.renderEngine.bindTexture("/mods/bse/textures/gui/BlockbluestonechestGUI.png");
		
		this.xSize = 400;
		this.ySize = 429;
		
		int var1 = (this.width - this.xSize) / 2;
		int var2 = (this.width - this.ySize) / 2;
		
		this.drawTexturedModalRect(var1, var2, 0, 0, this.xSize, this.ySize);
		}

}
