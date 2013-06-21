package bse.phin.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import bse.phin.GUIhandler.GUIBlockbluestonechest;
import bse.phin.armor.Itembluestoneboots;
import bse.phin.armor.Itembluestonechestplate;
import bse.phin.armor.Itembluestonediamondboots;
import bse.phin.armor.Itembluestonediamondchestplate;
import bse.phin.armor.Itembluestonediamondhelmet;
import bse.phin.armor.Itembluestonediamondpants;
import bse.phin.armor.Itembluestonehelmet;
import bse.phin.armor.Itembluestonepants;
import bse.phin.biomes.Biomebluestoneforest;
import bse.phin.blocks.Blockbluecobblestone;
import bse.phin.blocks.Blockblueglowstone;
import bse.phin.blocks.Blockbluesmoothstone;
import bse.phin.blocks.Blockbluestoneblock;
import bse.phin.blocks.Blockbluestonechest;
import bse.phin.blocks.Blockbluestonecoalore;
import bse.phin.blocks.Blockbluestonediamondblock;
import bse.phin.blocks.Blockbluestonediamondore;
import bse.phin.blocks.Blockbluestonedirt;
import bse.phin.blocks.Blockbluestonefence;
import bse.phin.blocks.Blockbluestonegravel;
import bse.phin.blocks.Blockbluestoneleaf;
import bse.phin.blocks.Blockbluestonemachineblock;
import bse.phin.blocks.Blockbluestoneore;
import bse.phin.blocks.Blockbluestoneoredust;
import bse.phin.blocks.Blockbluestoneplank;
import bse.phin.blocks.Blockbluestonetorch;
import bse.phin.blocks.Blockbluetonewood;
import bse.phin.blocks.Blockchisledbluestone;
import bse.phin.blocks.Blockmoltenbluestone;
import bse.phin.items.Itembluediamondstar;
import bse.phin.items.Itemblueingotstar;
import bse.phin.items.Itembluesiliconball;
import bse.phin.items.Itembluesilicondust;
import bse.phin.items.Itembluestonecarbon;
import bse.phin.items.Itembluestonecarbonplate;
import bse.phin.items.Itembluestonecoal;
import bse.phin.items.Itembluestonecoaldust;
import bse.phin.items.Itembluestonediamond;
import bse.phin.items.Itembluestonediamondplate;
import bse.phin.items.Itembluestonedust;
import bse.phin.items.Itembluestoneingot;
import bse.phin.items.Itembluestoneplate;
import bse.phin.items.Itembluestonestick;
import bse.phin.items.Itembluestonewooddust;
import bse.phin.items.Itemrawbluesilicon;
import bse.phin.lib.reference;
import bse.phin.machines.Blockbluestonecompressor;
import bse.phin.machines.Blockbluestoneextractor;
import bse.phin.machines.Blockbluestoneforge;
import bse.phin.machines.Blockbluestoneliquiddeployer;
import bse.phin.machines.Blockbluestonerockcrusher;
import bse.phin.machines.Blockbluestonesmelter;
import bse.phin.tileentitys.TileEntityBlockbluestonechest;
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
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = reference.MOD_ID , name = reference.MOD_NAME , version = reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class core extends BaseMod {
	
	
	public static final String modid = "Blue Stone Energy's";
	
	//biome and maybe biomes and biome blocks
	public static BiomeGenBase bluestoneforest;														
	
	public static final Block bluestonedirt = (new Blockbluestonedirt(160, Material.ground).setUnlocalizedName("bluestonedirt").setHardness(0.5F).setResistance(1.1F).setStepSound(Block.soundGrassFootstep));
	
	/* items */// indicates that i need to implement a recipe still // just for organization purposes
	public static Item bluestonediamond;
	public static Item bluestonedust;
	public static Item bluestoneingot;
	public static Item bluestonestick;
	public static Item bluestonewooddust; //
	public static Item bluestonediamondplate;
	public static Item bluestonecoal;
	public static Item bluestonecoaldust; 
	public static Item bluestonecarbon;
	public static Item bluestonecarbonplate;
	public static Item blueingotstar;
	public static Item bluediamondstar;
	public static Item bluestoneplate; 
	public static Item rawbluesilicon;
	public static Item bluesilicondust;
	public static Item bluesiliconball;
	
	//machines 
	public static Block bluestonesmelter;
	public static Block bluestonerockcrusher;
	public static Block bluestonecompressor;
	public static Block bluestoneextractor; 
	public static Block bluestoneforge;
	public static Block bluestoneliquiddeployer;   
	
	
	/* blocks */
	public static Block bluestoneblock; 
	public static Block bluestoneplank; //need a super block ie bluestonewood = 4 planks
	public static Block chisledbluestone; 
	public static Block bluestoneore;
	public static Block Bluestoneoredust; 
	public static Block bluestonediamondore;
	public static Block bluestoneleaf; //gen//
	public static Block bluecobblestone;
	public static Block blueglowstone;
	public static Block bluestonefence;//
	public static Block bluestonegravel; // 
	public static Block bluestonetorch; // 
	public static Block bluestonediamondblock;
	public static Block bluestonemachineblock;
	public static Block bluestonecoalore;
	public static Block bluesmoothstone;
	public static Block bluetonewood;
	public static Block bluestonechest;//
	public static Block moltenbluestone;//

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
	public static EnumToolMaterial toolbluestonediamond = EnumHelper.addToolMaterial("BLUESTONEDIAMOND", 3, 4000, 6.0F, 6, 13);
	public static EnumToolMaterial toolbluestoneingot = EnumHelper.addToolMaterial("BLUESTONEINGOT", 2, 2000, 3.5F, 3, 7);
	worldgen eventmanager = new worldgen();
	customfuels fuelHandler = new customfuels();
	
	
	@Instance("phin")
	public static core instance;
	
	@SidedProxy(clientSide = "bse.phin.common.clientproxy", serverSide = "bse.phin.common.commonproxy")
	public static commonproxy proxy;
	
	@PreInit
	public void preInit (FMLPreInitializationEvent event) {
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
	
		
		
		/*misc blocks ids 1000-1200  */
		bluestoneblock = new Blockbluestoneblock(1000, Material.rock).setUnlocalizedName("bluestoneblock").setHardness(2.5f);
		GameRegistry.registerBlock(bluestoneblock, modid + bluestoneblock.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneblock, "Blue Stone Ingot Block");
		
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
		
		bluestonediamondore = new Blockbluestonediamondore(1007, Material.rock).setUnlocalizedName("bluestonediamondore").setHardness(2.5f).setLightValue(0.3F);               
		GameRegistry.registerBlock(bluestonediamondore, modid + bluestonediamondore.getUnlocalizedName());
		LanguageRegistry.addName(bluestonediamondore, "Blue Stone Diamod Ore");
		
		bluestonediamond = new Itembluestonediamond(1008).setUnlocalizedName("bluestonediamond");
		LanguageRegistry.addName(bluestonediamond, "Blue Stone Diamond");
		
		GameRegistry.registerWorldGenerator(eventmanager);
		GameRegistry.registerFuelHandler(fuelHandler);
		
		bluestoneleaf = new Blockbluestoneleaf(1009, Material.leaves).setUnlocalizedName("bluestoneleaf").setLightValue(0.3f).setHardness(0.9f);// configing still                             
		GameRegistry.registerBlock(bluestoneleaf, modid + bluestoneleaf.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneleaf, "Blue Stone Leaf");
		
		bluestonestick = new Itembluestonestick(1010).setUnlocalizedName("bluestonestick");
		LanguageRegistry.addName(bluestonestick, "Blue Stone Stick");
		
		bluestonewooddust = new Itembluestonewooddust(1011).setUnlocalizedName("bluestonewooddust");
		LanguageRegistry.addName(bluestonewooddust, "Blue Stone Wood Dust");
		
		bluecobblestone = new Blockbluecobblestone(1012, Material.rock).setUnlocalizedName("bluecobblestone").setHardness(2.5F);
		GameRegistry.registerBlock(bluecobblestone, modid + bluecobblestone.getUnlocalizedName());
		LanguageRegistry.addName(bluecobblestone, "Blue CobbleStone");
		
		blueglowstone = new Blockblueglowstone(1013, Material.rock).setUnlocalizedName("blueglowstone").setHardness(1.0F).setLightValue(1.0F).setLightOpacity(0);
		GameRegistry.registerBlock(blueglowstone, modid + blueglowstone.getUnlocalizedName());
		LanguageRegistry.addName(blueglowstone, "Blue Glow Stone");
		
		bluestonefence = new Blockbluestonefence(1014, Material.iron).setUnlocalizedName("bluestonefence").setHardness(1.5F);
		GameRegistry.registerBlock(bluestonefence, modid + bluestonefence.getUnlocalizedName());
		LanguageRegistry.addName(bluestonefence, "Blue Stone Fence");
		
		bluestonegravel = new Blockbluestonegravel(1015, Material.sand).setUnlocalizedName("bluestonegravel").setHardness(1.7F);
		GameRegistry.registerBlock(bluestonegravel, modid + bluestonegravel.getUnlocalizedName());
		LanguageRegistry.addName(bluestonegravel, "Blue Stone Gravel");
		
		bluestonetorch= new Blockbluestonetorch(1016, Material.wood).setUnlocalizedName("bluestonetorch").setHardness(1.5F).setLightOpacity(1).setLightValue(1.0f);
		GameRegistry.registerBlock(bluestonetorch, modid + bluestonetorch.getUnlocalizedName());
		LanguageRegistry.addName(bluestonetorch, "Blue Stone Torch");
		
		bluestonediamondblock = new Blockbluestonediamondblock(1017, Material.rock).setUnlocalizedName("bluestonediamondblock").setHardness(2F);
		GameRegistry.registerBlock(bluestonediamondblock, modid + bluestonediamondblock.getUnlocalizedName());
		LanguageRegistry.addName(bluestonediamondblock, "Blue Stone Diamond Block");
		
		bluestonediamondplate = new Itembluestonediamondplate(1018).setUnlocalizedName("bluestonediamondplate");
		LanguageRegistry.addName(bluestonediamondplate, "Blue Stone Diamond Plate");
		
		bluestonemachineblock = new Blockbluestonemachineblock(1019,Material.rock).setUnlocalizedName("bluestonemachineblock").setHardness(2.0F).setResistance(5);
		GameRegistry.registerBlock(bluestonemachineblock, modid + bluestonemachineblock.getUnlocalizedName());
		LanguageRegistry.addName(bluestonemachineblock, "Blue Stone Machine Block");
		
		bluestonecoal = new Itembluestonecoal(1020).setUnlocalizedName("bluestonecoal");
		LanguageRegistry.addName(bluestonecoal, "Blue Stone Coal");
		
		bluestonecoalore = new Blockbluestonecoalore(1021, Material.rock).setUnlocalizedName("bluestonecoalore").setHardness(2.5F);
	    GameRegistry.registerBlock(bluestonecoalore, modid + bluestonecoalore.getUnlocalizedName());
		LanguageRegistry.addName(bluestonecoalore, "Blue Stone Coal Ore");
		
		bluesmoothstone = new Blockbluesmoothstone(1022, Material.rock).setUnlocalizedName("bluesmoothstone").setHardness(2.5F);
		GameRegistry.registerBlock(bluesmoothstone, modid + bluesmoothstone.getUnlocalizedName());
		LanguageRegistry.addName(bluesmoothstone, "Blue Smooth Stone");
		
		bluestonecoaldust = new Itembluestonecoaldust(1023).setUnlocalizedName("bluestonecoaldust");
		LanguageRegistry.addName(bluestonecoaldust, "Blue Stone Coal Dust");
		
		bluestonecarbon = new Itembluestonecarbon(1024).setUnlocalizedName("bluestonecarbon");
		LanguageRegistry.addName(bluestonecarbon, "Blue Stone Carbon");
		
		bluestonecarbonplate = new Itembluestonecarbonplate(1025).setUnlocalizedName("bluestonecarbonplate");
		LanguageRegistry.addName(bluestonecarbonplate, "Blue Stone Carbon Plate");
		
		blueingotstar = new Itemblueingotstar(1026).setUnlocalizedName("blueingotstar");
		LanguageRegistry.addName(blueingotstar, "Blue Ingot Star");
		
		bluediamondstar = new Itembluediamondstar(1027).setUnlocalizedName("bluediamondstar");
		LanguageRegistry.addName(bluediamondstar, "Blue Stone Diamond Star");
		
		bluestoneplate = new Itembluestoneplate(1028).setUnlocalizedName("bluestoneplate"); 
		LanguageRegistry.addName(bluestoneplate, "Blue Stone Plate");
		
		rawbluesilicon = new Itemrawbluesilicon(1029).setUnlocalizedName("rawbluesilicon");
		LanguageRegistry.addName(rawbluesilicon, "Raw Blue Stone Silicon"); 
		
		bluesilicondust = new Itembluesilicondust(1030).setUnlocalizedName("bluesilicondust");
		LanguageRegistry.addName(bluesilicondust, "Blue Silicon Dust");
		
		bluesiliconball = new Itembluesiliconball(1031).setUnlocalizedName("bluesiliconball");
		LanguageRegistry.addName(bluesiliconball, "Blue Silicon Ball");
		
		bluetonewood = new Blockbluetonewood(1032, Material.wood).setUnlocalizedName("bluetonewood").setHardness(2.0f);
		GameRegistry.registerBlock(bluetonewood, modid + bluetonewood.getUnlocalizedName());
		LanguageRegistry.addName(bluetonewood, "Blue Stone Oak Wood");
		
		bluestonechest = new Blockbluestonechest(1033, Material.rock).setUnlocalizedName("bluestonechest").setHardness(2.0f);
		GameRegistry.registerBlock(bluestonechest, modid + bluestonechest.getUnlocalizedName());
		LanguageRegistry.addName(bluestonechest, "Blue Stone Chest");
		
		moltenbluestone = new Blockmoltenbluestone(1034, Material.rock).setUnlocalizedName("moltenbluestone").setHardness(10.0f).setLightValue(0.7F).setResistance(0.9F);
		GameRegistry.registerBlock(moltenbluestone, modid + moltenbluestone.getUnlocalizedName());
		LanguageRegistry.addName(moltenbluestone, "Molten Blue Stone");
		
		
		
		
		//bluestone = new bluestone()
		
		//biome block registry
		GameRegistry.registerBlock(bluestonedirt, modid + bluestonedirt.getUnlocalizedName());
		LanguageRegistry.addName(bluestonedirt, "Blue Stone Dirt");
		
		
		
		
		
		
		
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
		bluestonepants = new Itembluestonepants(1214, armorbluestoneingot, 2, 2).setUnlocalizedName("bluestonepants").setCreativeTab(CreativeTabs.tabCombat);
		bluestoneboots = new Itembluestoneboots(1215, armorbluestoneingot, 3, 3).setUnlocalizedName("bluestoneboots").setCreativeTab(CreativeTabs.tabCombat);
		
		bluestonediamondhelmet = new Itembluestonediamondhelmet(1216, armorbluestonediamond, 0 , 0).setUnlocalizedName("bluestonediamondhelmet").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondchestplate = new Itembluestonediamondchestplate(1217, armorbluestonediamond, 1 ,1).setUnlocalizedName("bluestonediamondchestplate").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondpants = new Itembluestonediamondpants(1218, armorbluestonediamond, 2 ,2).setUnlocalizedName("bluestonediamondpants").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondboots = new Itembluestonediamondboots(1219, armorbluestonediamond, 3, 3).setUnlocalizedName("bluestonediamondboots").setCreativeTab(CreativeTabs.tabCombat);
		
		//Biome declarations 
		bluestoneforest = new Biomebluestoneforest(150).setBiomeName("Blue Stone Forest").setMinMaxHeight(0.23F, 0.22F);
		GameRegistry.addBiome(bluestoneforest);
		
		
		
		
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
		LanguageRegistry.addName(bluestonediamondhelmet, "Blue Stone Diamond Helmet");
		LanguageRegistry.addName(bluestonediamondchestplate, "Blue Stone Diamond Chestpeice");
		LanguageRegistry.addName(bluestonediamondpants, "Blue Stone Diamond Pants");
		LanguageRegistry.addName(bluestonediamondboots, "Blue Stone Diamond Boots");
		
		//machines id 1350 - 1450
		bluestonesmelter = new Blockbluestonesmelter(1350, Material.rock).setUnlocalizedName("bluestonesmelter").setHardness(1.5F).setLightValue(0.2f);
		GameRegistry.registerBlock(bluestonesmelter, modid  + bluestonesmelter.getUnlocalizedName());
		LanguageRegistry.addName(bluestonesmelter, "Blue Stone Smelter");
		
		bluestonerockcrusher = new Blockbluestonerockcrusher(1351, Material.rock).setUnlocalizedName("bluestonerockcrusher").setHardness(1.5f).setLightValue(0.2f);
		GameRegistry.registerBlock(bluestonerockcrusher, modid + bluestonerockcrusher.getUnlocalizedName());
		LanguageRegistry.addName(bluestonerockcrusher, "Blue Stone Rock Crusher");
		
		bluestonecompressor = new Blockbluestonecompressor(1352, Material.rock).setUnlocalizedName("bluestonecompressor").setHardness(1.5f).setLightValue(0.2f);
	    GameRegistry.registerBlock(bluestonecompressor, modid + bluestonecompressor.getUnlocalizedName());
	    LanguageRegistry.addName(bluestonecompressor, "Blue Stone Compressor");	
	    
	    bluestoneextractor = new Blockbluestoneextractor(1353, Material.rock).setUnlocalizedName("bluestoneextractor").setHardness(1.5f).setLightValue(0.2f);
	    GameRegistry.registerBlock(bluestoneextractor, modid + bluestoneextractor.getUnlocalizedName());
	    LanguageRegistry.addName(bluestoneextractor, "Blue Stone Extractor");
	    
	    bluestoneforge = new Blockbluestoneforge(1354, Material.rock).setUnlocalizedName("bluestoneforge").setHardness(1.5f).setLightValue(0.2f);
	    GameRegistry.registerBlock(bluestoneforge, modid + bluestoneforge.getUnlocalizedName());
	    LanguageRegistry.addName(bluestoneforge, "Blue Stone Forge");
	    
	    bluestoneliquiddeployer = new Blockbluestoneliquiddeployer(1355, Material.rock).setUnlocalizedName("bluestoneliquiddeployer").setHardness(1.5f).setLightValue(0.2f);
	    GameRegistry.registerBlock(bluestoneliquiddeployer, modid + bluestoneliquiddeployer.getUnlocalizedName());
	    LanguageRegistry.addName(bluestoneliquiddeployer, "Blue Stone Liquid Deployer");
	    
	    //container/gui declarations
	    ModLoader.registerContainerID(this, 30);
	    
	    //tile entity's
	    GameRegistry.registerTileEntity(TileEntityBlockbluestonechest.class , "TileEntityBlockbluestonechest");
	    
	    
	    
	    
	    
		
		/* smelting recipes*/
		GameRegistry.addSmelting(core.bluestoneore.blockID, new ItemStack(bluestoneingot), 4.0F);
		GameRegistry.addSmelting(core.bluestonedust.itemID, new ItemStack(bluestoneingot), 4.0F);
		GameRegistry.addSmelting(core.bluestoneingot.itemID, new ItemStack(bluestonedust), 4.0F);
		GameRegistry.addSmelting(core.bluecobblestone.blockID, new ItemStack(bluesmoothstone), 4.0F);
		GameRegistry.addSmelting(core.bluestonecoaldust.itemID, new ItemStack(bluestonecarbon), 5.0F);
		GameRegistry.addSmelting(core.bluestonecoal.itemID, new ItemStack(bluestonecoaldust), 5.0F);
		
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
		GameRegistry.addShapelessRecipe(new ItemStack(bluestoneshear,1), new Object[] { 
			bluestoneingot,bluestoneingot
		});
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
		GameRegistry.addShapelessRecipe(new ItemStack(bluestonediamondshear,1), new Object[] { 
			bluestonediamond,bluestonediamond
		});
		GameRegistry.addRecipe(new ItemStack(bluestonechestplate,1), new Object[] { 
			"I I","III","III", 'I', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonepants, 1), new Object[] {
			"III", "I I", "I I", 'I', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonehelmet, 1), new Object[] {
			"III","I I",'I',bluestoneingot
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneboots, 1), new Object[] {
			"I I","I I",'I',bluestoneingot
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondboots, 1), new Object[] {
			"I I","I I",'I',bluestonediamond
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondhelmet, 1), new Object[] {
			"III","I I",'I',bluestonediamond
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondpants, 1), new Object[] {
			"III", "I I", "I I", 'I', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondchestplate,1), new Object[] { 
			"I I","III","III", 'I', bluestonediamond,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestoneingot, 9), new Object[] {
			bluestoneblock
		});
		GameRegistry.addRecipe(new ItemStack(bluestonestick, 4), new Object[] { 
			"I  ","I  ", 'I',bluestoneplank
		});
		GameRegistry.addRecipe(new ItemStack(bluestonestick, 4), new Object[] { 
			" I "," I ", 'I',bluestoneplank
		});
		GameRegistry.addRecipe(new ItemStack(bluestonestick, 4), new Object[] { 
			"  I","  I", 'I',bluestoneplank
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondblock, 1), new Object[] {
			"III","III","III",'I',bluestonediamond
		});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestonediamond, 9), new Object[] {
			bluestonediamondblock
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondplate,1), new Object[] {
			"XXX","III","XXX", 'I', bluestoneingot, 'X', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonemachineblock,1), new Object[] {
			"XXX","XDX","XXX", 'X', bluestoneingot, 'D', bluestonedust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(blueglowstone,1), new Object[] {
			bluestonedust,bluestonedust,bluestonedust,bluestonedust
		});
		GameRegistry.addRecipe(new ItemStack(bluestonetorch,4), new Object[] {
			"I  ","S  ", 'I',bluestonecoal, 'S', bluestonestick
		});
		GameRegistry.addRecipe(new ItemStack(bluestonetorch,4), new Object[] {
			" I "," S ",  'I',bluestonecoal, 'S', bluestonestick
		});
		GameRegistry.addRecipe(new ItemStack(bluestonetorch,4), new Object[] {
			"  I","  S",  'I',bluestonecoal, 'S', bluestonestick
		});
		GameRegistry.addRecipe(new ItemStack(chisledbluestone,4), new Object[] {
			"II ", "II ", 'I', bluesmoothstone
		});
		GameRegistry.addRecipe(new ItemStack(chisledbluestone,4), new Object[] {
			" II", " II", 'I', bluesmoothstone
		});
		GameRegistry.addRecipe(new ItemStack(bluestonecarbonplate,1), new Object[] {
			"CCC","CDC","CCC",'C',bluestonecarbon,'D',bluestonedust
		});
		GameRegistry.addRecipe(new ItemStack(blueingotstar,1), new Object[] {
			" I ", "III", " I ", 'I', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluediamondstar,1), new Object[] {
			" I ", "III", " I ", 'I', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneplate,1), new Object[] { 
			"III","DDD","III",'I',bluestoneingot,'D',bluestonedust
		});
		GameRegistry.addRecipe(new ItemStack(rawbluesilicon,1), new Object[] {
			"SS ", "SS ", 'S', bluesilicondust
		});
		GameRegistry.addRecipe(new ItemStack(rawbluesilicon,1), new Object[] {
			" SS", " SS", 'S', bluesilicondust
		});
		GameRegistry.addRecipe(new ItemStack(bluesiliconball,2), new Object[] {
			"SSS", "SDS", "SSS", 'S', rawbluesilicon,'D',bluestonedust 
		});
		GameRegistry.addRecipe(new ItemStack(bluestonefence,2), new Object[] {
			"SSS","SSS",'S',bluestonestick
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneplank,2), new Object[] {
			" SS"," SS",'S',bluestonestick
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneplank,4), new Object[] {
			"SS ","SS ",'S',bluestonestick
		});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestoneplank,4), new Object[] {
			bluetonewood
		});
		GameRegistry.addRecipe(new ItemStack(bluestonechest,1), new Object[] {
			"SSS","S S","SSS",'S',bluesmoothstone
		});
		
		//machine recipes
		GameRegistry.addRecipe(new ItemStack(bluestonesmelter,1), new Object[] {
			"SDS","SBS","SDS",'S',bluesmoothstone,'B', bluestonemachineblock,'D',bluestonedust
		});
		GameRegistry.addRecipe(new ItemStack(bluestonerockcrusher,1), new Object[] {
			"SSS", "CMC","CDC", 'D',bluestonedust , 'M',bluestonemachineblock,'S', bluesilicondust, 'C', bluecobblestone
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneliquiddeployer,1), new Object[] {
			"BBB","SMS","DCD",'D',bluestonedust,'B',Item.bucketWater,'S',bluesmoothstone,'M',bluestonemachineblock,'C',bluecobblestone
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneforge,1), new Object[] {
			"PCP","SMS","LCL",'L',Item.bucketLava, 'P', bluesiliconball,'C',bluecobblestone,'S',bluesilicondust,'M',bluestonemachineblock
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneextractor,1), new Object[] {
			"DID","IMI","B B", 'B',Item.bucketWater,'D',bluestonedust,'M',bluestonemachineblock,'I',bluestoneingot
		});
		GameRegistry.addRecipe(new ItemStack(bluestonecompressor,1), new Object[] {
			"CIC","IMI","BLB",'C',bluestonecarbonplate,'I',bluestoneingot,'M', bluestonemachineblock,'B',bluecobblestone,'L',Item.bucketLava
		});
		
		
		
	}
	
	
	//Declaration of the gui containers for all of blue stone energy's
	public GuiContainer getContainerGUI(EntityClientPlayerMP player, int id, int x, int y, int z) { 
		switch(id) { 
		case 30:
			return new GUIBlockbluestonechest(player.inventory, x, y, z);
		
		default:
			return null;
		
		}
	}
		
		
		
		
		
		
		
		
		                                                                                                                                                 
		
				
		
		
		
		
	
		
		
		
		
		
		
	
	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
		}

	@Override
	public String getVersion() {
	return null;
	}

	@Override
	public void load() {
	
	}
		
}

	
		
		
		
		
	
			
		
		
		
		 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
