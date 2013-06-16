package bse.phin.common;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import bse.phin.armor.Itembluestonechestplate;
import bse.phin.armor.Itembluestonediamondboots;
import bse.phin.armor.Itembluestonediamondpants;
import bse.phin.armor.Itembluestonehelmet;
import bse.phin.tool.Itembluestoneaxe;
import bse.phin.tool.Itembluestonediamondaxe;
import bse.phin.tool.Itembluestonediamondhoe;
import bse.phin.tool.Itembluestonediamondpick;
import bse.phin.tool.Itembluestonediamondshear;
import bse.phin.tool.Itembluestonediamondshovel;
import bse.phin.tool.Itembluestonediamondsword;
import bse.phin.tool.Itembluestonehoe;
import bse.phin.tool.Itembluestonepick;
import bse.phin.tool.Itembluestoneshear;
import bse.phin.tool.Itembluestoneshovel;
import bse.phin.tool.Itembluestonesword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "bse", name = "Blue Stone Energy's", version = "0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class core {
	
	
	
	
	public static final String modid = "Blue Stone Energy's";
	
	/* items */
	public static Item bluestonediamond;
	public static Item bluestonedust;
	public static Item bluestoneingot;
	public static Item bluestonestick;
	public static Item bluestonewooddust;
	
	/* blocks */
	public static Block bluestoneblock;
	public static Block bluestoneplank;
	public static Block chisledbluestone;
	public static Block bluestoneore;
	public static Block Bluestoneoredust;
	public static Block bluestonediamondore;
	public static Block bluestoneleaf;
	public static Block bluecobblestone;
	public static Block blueglowstone;
	public static Block bluestonefence;
	public static Block bluestonegravel;
	public static Block bluestonetorch;
	
	/*tools */
	public static Item bluestoneaxe;
	public static Item bluestonesword;
	public static Item bluestonepick;
	public static Item bluestoneshear;
	public static Item bluestonehoe;
	public static Item bluestoneshovel;
	
	/*diamond tools */
	public static Item bluestonediamondaxe;
	public static Item bluestonediamondsword;
	public static Item bluestonediamondpick;
	public static Item bluestonediamondshear;
	public static Item bluestonediamondhoe;
	public static Item bluestonediamondshovel;
	
	/* blueingot armour */
	public static Item bluestonehelmet;
	public static Item bluestonechestplate;
	public static Item bluestonepants;
	public static Item bluestoneboots;
	
	/* blue diamond armour */
	public static Item bluestonediamondhelmet;
	public static Item bluestonediamondchestplate;
	public static Item bluestonediamondpants;
	public static Item bluestonediamondboots;
	
	
	public static EnumArmorMaterial armorbluestonediamond = EnumHelper.addArmorMaterial("BLUESTONEDIAMOND", 40,  new int[]{3, 11, 9, 5}, 30);
	public static EnumArmorMaterial armorbluestoneingot = EnumHelper.addArmorMaterial("BLUESTONEINGOT", 19, new int[]{2, 6, 5, 3}, 15);                                          
	public static EnumToolMaterial toolbluestonediamond = EnumHelper.addToolMaterial("BLUESTONEDIAMOND", 3, 4000, 12.0F, 6, 30);
	public static EnumToolMaterial toolbluestoneingot = EnumHelper.addToolMaterial("BLUESTONEINGOT", 2, 2000, 6.0F, 3, 15);
	worldgen eventmanager = new worldgen();
	
	@Init
	public void load(FMLInitializationEvent event) {
	
		/*misc blocks ids 1000-1200*/
		bluestoneblock = new Blockbluestoneblock(1000, Material.rock).setUnlocalizedName("bluestoneblock").setHardness(2.5f);
		GameRegistry.registerBlock(bluestoneblock, modid + bluestoneblock.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneblock, "Blue Stone Block");
		
		bluestoneingot = new Itembluestoneingot(1001).setUnlocalizedName("bluestoneingot");
		LanguageRegistry.addName(bluestoneingot, "Blue Stone Ingot");
		
		bluestoneplank = new Blockbluestoneplank(1002, Material.rock).setUnlocalizedName("bluestoneplank").setHardness(2f);
		GameRegistry.registerBlock(bluestoneplank, modid + bluestoneplank.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneplank, "Blue Stone Plank");
		
		chisledbluestone = new Blockchisledbluestone(1003, Material.rock).setUnlocalizedName("chisledbluestone").setHardness(2.5f);
		GameRegistry.registerBlock(chisledbluestone, modid + chisledbluestone.getUnlocalizedName());
		LanguageRegistry.addName(chisledbluestone, "Chisled Blue Stone");
		
		bluestonedust = new Itembluestonedust(1004).setUnlocalizedName("bluestonedust");
		LanguageRegistry.addName(bluestonedust, "Blue Stone Dust");
		
		bluestoneore = new Blockbluestoneore(1005, Material.rock).setUnlocalizedName("bluestoneore").setHardness(2.5f);
		GameRegistry.registerBlock(bluestoneore, modid + bluestoneore.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneore, "Blue Stone Ore");
		
		Bluestoneoredust = new Blockbluestoneoredust(1006, Material.rock).setUnlocalizedName("bluestoneoredust").setHardness(2.5f);
		GameRegistry.registerBlock(Bluestoneoredust, modid + Bluestoneoredust.getUnlocalizedName());
		LanguageRegistry.addName(Bluestoneoredust, "Blue Stone Ore Dust");
		
		bluestonediamondore = new Blockbluestonediamondore(1007, Material.rock).setUnlocalizedName("bluestonediamondore").setHardness(2.5f);                 
		GameRegistry.registerBlock(bluestonediamondore, modid + bluestonediamondore.getUnlocalizedName());
		LanguageRegistry.addName(bluestonediamondore, "Blue Stone Diamod Ore");
		
		bluestonediamond = new Itembluestonediamond(1008).setUnlocalizedName("bluestonediamond");
		LanguageRegistry.addName(bluestonediamond, "Blue Stone Diamond");
		
		GameRegistry.registerWorldGenerator(eventmanager);
		
		bluestoneleaf = new Blockbluestoneleaf(1009, Material.leaves).setUnlocalizedName("bluestoneleaf").setHardness(1.0f).setLightValue(90);                              
		GameRegistry.registerBlock(bluestoneleaf, modid + bluestoneleaf.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneleaf, "Blue Stone Leaf");
		
		bluestonestick = new Itembluestonestick(1010).setUnlocalizedName("bluestonestick");
		LanguageRegistry.addName(bluestonestick, "Blue Stone Stick");
		
		bluestonewooddust = new Itembluestonewooddust(1011).setUnlocalizedName("bluestonewooddust");
		LanguageRegistry.addName(bluestonewooddust, "Blue Stone Wood Dust");
		
		bluecobblestone = new Blockbluecobblestone(1012, Material.rock).setUnlocalizedName("bluecobblestone").setHardness(2.5F);
		GameRegistry.registerBlock(bluecobblestone, modid + bluecobblestone.getUnlocalizedName());
		LanguageRegistry.addName(bluecobblestone, "Blue CobbleStone");
		
		blueglowstone = new Blockblueglowstone(1013, Material.rock).setUnlocalizedName("blueglowstone").setHardness(1.0F).setLightValue(15).setLightOpacity(1);
		GameRegistry.registerBlock(blueglowstone, modid + blueglowstone.getUnlocalizedName());
		LanguageRegistry.addName(blueglowstone, "Blue Glow Stone");
		
		bluestonefence = new Blockbluestonefence(1014, Material.iron).setUnlocalizedName("bluestonefence").setHardness(1.5F);
		GameRegistry.registerBlock(bluestonefence, modid + bluestonefence.getUnlocalizedName());
		LanguageRegistry.addName(bluestonefence, "Blue Stone Fence");
		
		bluestonegravel = new Blockbluestonegravel(1015, Material.sand).setUnlocalizedName("bluestonegravel").setHardness(1.7F);
		GameRegistry.registerBlock(bluestonegravel, modid + bluestonegravel.getUnlocalizedName());
		LanguageRegistry.addName(bluestonegravel, "Blue Stone Gravel");
		
		bluestonetorch= new Blockbluestonetorch(1016, Material.wood).setUnlocalizedName("bluestonetorch").setHardness(1.5F).setLightOpacity(1).setLightValue(10000);
		GameRegistry.registerBlock(bluestonetorch, modid + bluestonetorch.getUnlocalizedName());
		LanguageRegistry.addName(bluestonetorch, "Blue Stone Torch");
		
		
		
		
		
		//bluestone = new bluestone() 
		
		/*tools ids 1200-1350*/
		bluestoneaxe = new Itembluestoneaxe(1200, toolbluestoneingot).setUnlocalizedName("bluestoneaxe").setCreativeTab(CreativeTabs.tabTools);
		bluestonesword = new Itembluestonesword(1201, toolbluestoneingot).setUnlocalizedName("bluestonesword").setCreativeTab(CreativeTabs.tabCombat);
		bluestonepick = new Itembluestonepick(1202, toolbluestoneingot).setUnlocalizedName("bluestonepick").setCreativeTab(CreativeTabs.tabTools);
		bluestoneshear = new Itembluestoneshear(1203, toolbluestoneingot).setUnlocalizedName("bluestoneshear").setCreativeTab(CreativeTabs.tabTools);
		bluestonehoe = new Itembluestonehoe(1204, toolbluestoneingot).setUnlocalizedName("bluestonehoe").setCreativeTab(CreativeTabs.tabTools);
		bluestoneshovel = new Itembluestoneshovel(1205, toolbluestoneingot).setUnlocalizedName("bluestoneshovel").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondaxe = new Itembluestonediamondaxe(1206, toolbluestonediamond).setUnlocalizedName("bluestonediamondaxe").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondsword = new Itembluestonediamondsword(1207, toolbluestonediamond).setUnlocalizedName("bluestonediamondsword").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondpick = new Itembluestonediamondpick(1208, toolbluestonediamond).setUnlocalizedName("bluestonediamondpick").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondshear = new Itembluestonediamondshear(1209, toolbluestonediamond).setUnlocalizedName("bluestonediamondshear").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondhoe = new Itembluestonediamondhoe(1210, toolbluestonediamond).setUnlocalizedName("bluestonediamondhoe").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondshovel = new Itembluestonediamondshovel(1211, toolbluestonediamond).setUnlocalizedName("bluestonediamondshovel").setCreativeTab(CreativeTabs.tabTools);
		
		bluestonehelmet = new Itembluestonehelmet(1212, armorbluestoneingot, 0, 0).setUnlocalizedName("bluestonehelmet").setCreativeTab(CreativeTabs.tabCombat);
		bluestonechestplate = new Itembluestonechestplate(1213, armorbluestoneingot, 1, 1).setUnlocalizedName("bluestonechestplate").setCreativeTab(CreativeTabs.tabCombat);
		bluestonepants = new Itembluestonediamondpants(1214, armorbluestoneingot, 2, 2).setUnlocalizedName("bluestonepants").setCreativeTab(CreativeTabs.tabCombat);
		bluestoneboots = new Itembluestonediamondboots(1215, armorbluestoneingot, 3, 3).setUnlocalizedName("bluestoneboots").setCreativeTab(CreativeTabs.tabCombat);
		
		
		/* tool names  + armor */
		LanguageRegistry.addName(bluestoneaxe, "Blue Stone Axe");
		LanguageRegistry.addName(bluestonesword, "Blue Stone Sword");
		LanguageRegistry.addName(bluestonepick, "Blue Stone PickAxe");
		LanguageRegistry.addName(bluestoneshear, "Blue Stone Shears");
		LanguageRegistry.addName(bluestonehoe, "Blue Stone Hoe");
		LanguageRegistry.addName(bluestoneshovel, "Blue Stone Shovel");
		LanguageRegistry.addName(bluestonediamondaxe, "Blue Stone Diamond Axe");
		LanguageRegistry.addName(bluestonediamondsword, "Blue Stone Diamond Sword");
		LanguageRegistry.addName(bluestonediamondpick, "Blue Stone Diamond PickAxe");
		LanguageRegistry.addName(bluestonediamondshear, "Blue Stone Diamond Shears");
		LanguageRegistry.addName(bluestonediamondhoe, "Blue Stone Diamond Hoe");
		LanguageRegistry.addName(bluestonediamondshovel, "Blue Stone Diamond Shovel");
		LanguageRegistry.addName(bluestonehelmet, "Blue Stone Helmet");
		LanguageRegistry.addName(bluestonechestplate, "Blue Stone Chestpeice");
		LanguageRegistry.addName(bluestonepants, "Blue Stone Pants");
		LanguageRegistry.addName(bluestoneboots, "Blue Stone Boots");
		
		
		/* smelting recipes*/
		GameRegistry.addSmelting(core.bluestoneore.blockID, new ItemStack(bluestoneingot), 4.0F);
		GameRegistry.addSmelting(core.bluestonedust.itemID, new ItemStack(bluestoneingot), 4.0F);
		GameRegistry.addSmelting(core.bluestoneingot.itemID, new ItemStack(bluestonedust), 4.0F);
		
		/* recipes */
		GameRegistry.addRecipe(new ItemStack(bluestoneblock,1), new Object[] { 
			"TTT", "TTT", "TTT", 'T' , bluestoneingot,
			});
		GameRegistry.addRecipe(new ItemStack(bluestonepick,1), new Object[] { 
			"TTT", " S ", " S ", 'T', bluestoneingot, 'S', bluestonestick,
			});
		GameRegistry.addRecipe(new ItemStack(bluestoneaxe,1), new Object[] { 
			"TT ", "TS ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonesword,1), new Object[] { 
			" T ", " T ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		//GameRegistry.addRecipe(new ItemStack(bluestoneshear,1), new Object[] { 
			//shapeless
		//});
		GameRegistry.addRecipe(new ItemStack(bluestonehoe,1), new Object[] { 
			"TT ", " S ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneshovel,1), new Object[] { 
			" T ", " S ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondaxe,1), new Object[] { 
			"TT ", "TS ", " S ", 'S', bluestonestick, 'T', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondsword,1), new Object[] { 
			" T ", " T ", " S ", 'S', bluestonestick, 'T', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondpick,1), new Object[] { 
			"TTT", " S ", " S ", 'S', bluestonestick, 'T', bluestonediamond,
		});
		//GameRegistry.addRecipe(new ItemStack(bluestonediamondshear,1), new Object[] { 
			//shapeless
		
	
		
		
		
		
		
		
		
	}

	
		
		
		
	
			
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
