package bse.phin.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class Biomebluestoneforest extends BiomeGenBase{

	public Biomebluestoneforest(int par1) {
		super(par1);
		this.topBlock = (byte)Block.cobblestone.blockID;
		this.fillerBlock = (byte)Block.bedrock.blockID;
	}

}
