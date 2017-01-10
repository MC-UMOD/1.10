package io.github.mc_umod;

import io.github.mc_umod.item.ItemBackPack;
import io.github.mc_umod.item.ItemBattery;
import io.github.mc_umod.item.ItemCabletester;
import io.github.mc_umod.item.ItemEnergyDisplay;
import io.github.mc_umod.item.ItemGeneratorPlacer;
import io.github.mc_umod.item.ItemSwellPlacer;
import io.github.mc_umod.item.infected.ItemInfectedBeef;
import io.github.mc_umod.item.infected.ItemInfectedCrop;
import io.github.mc_umod.item.infected.ItemInfectedMilk;
import io.github.mc_umod.item.materials.ItemAcid;
import io.github.mc_umod.item.materials.ItemDusts;
import io.github.mc_umod.item.materials.ItemFundamental;
import io.github.mc_umod.item.materials.ItemIngots;
import io.github.mc_umod.item.materials.ItemManganOxid;
import io.github.mc_umod.item.materials.ItemPetrol;
import io.github.mc_umod.item.materials.ItemPlastic;
import io.github.mc_umod.item.materials.energy.ItemCopperCoil;
import io.github.mc_umod.item.materials.energy.ItemCopperWire;
import io.github.mc_umod.item.materials.energy.ItemSolarCell;
import io.github.mc_umod.item.materials.energy.ItemThickerCopperCoil;
import io.github.mc_umod.item.materials.energy.ItemThickerCopperWire;
import io.github.mc_umod.item.materials.energy.ItemTransformer;
import io.github.mc_umod.item.materials.magic.ItemChargedQuartz;
import io.github.mc_umod.item.materials.magic.ItemMagicBottle;
import io.github.mc_umod.item.materials.magic.ItemMagicBrew;
import io.github.mc_umod.item.materials.magic.ItemMagicDiamond;
import io.github.mc_umod.item.materials.magic.ItemMagicIngot;
import io.github.mc_umod.utils.URegistryUtils;
import net.minecraft.item.Item;

public class UItems {
	
	// Ingot
	public static Item ingots;
	
	// Dust
	public static Item dusts;
	public static Item manganoxid;
	// magic
	public static Item magic_diamond;
	public static Item magic_ingot;
	public static Item charged_quartz;
	public static Item magic_brew;
	public static Item magic_bottle;
	
	// Cobble Dust
	public static Item cdust;
	
	// Infected
	public static Item infectedcrop;
	public static Item infectedleather;
	public static Item infectedbeef;
	public static Item infectedmilk;
	public static Item acid;
	public static Item plastic;
	
	// Battery
	public static Item battery;
	public static Item tester;
	public static Item energydisplay;
	public static Item copper_coil;
	public static Item copper_wire;
	public static Item transformer;
	public static Item thicker_copper_wire;
	public static Item thicker_copper_coil;
	public static Item solar_cell;
	public static Item petrol;
	
	// Backpack
	public static Item backpack;
	
	public static Item railplacer;
	public static Item genPlacer;
	
	public UItems() {
		init();
		register();
	}
	
	private void init() {
		
		// Ingot
		ingots = new ItemIngots().setUnlocalizedName("ingots");
		
		// Dust
		dusts = new ItemDusts().setUnlocalizedName("dusts");
		manganoxid = new ItemManganOxid().setUnlocalizedName("manganoxid");
		
		// magic
		magic_diamond = new ItemMagicDiamond().setUnlocalizedName("magic_diamond");
		magic_ingot = new ItemMagicIngot().setUnlocalizedName("magic_ingot");
		charged_quartz = new ItemChargedQuartz().setUnlocalizedName("charged_quartz");
		magic_brew = new ItemMagicBrew().setUnlocalizedName("magic_brew");
		magic_bottle = new ItemMagicBottle().setUnlocalizedName("magic_bottle");
		
		// Cobble Dust
		cdust = new ItemFundamental().setUnlocalizedName("cdust");
		
		// Infected
		infectedcrop = new ItemInfectedCrop().setUnlocalizedName("infectedcrop");
		infectedleather = new ItemFundamental().setUnlocalizedName("infectedleather");
		infectedbeef = new ItemInfectedBeef().setUnlocalizedName("infectedbeef");
		infectedmilk = new ItemInfectedMilk().setUnlocalizedName("infectedmilk");
		acid = new ItemAcid().setUnlocalizedName("acid");
		plastic = new ItemPlastic().setUnlocalizedName("plastic");
		
		// Battery
		tester = new ItemCabletester().setUnlocalizedName("tester");
		battery = new ItemBattery().setUnlocalizedName("battery");
		energydisplay = new ItemEnergyDisplay().setUnlocalizedName("energy");
		copper_wire = new ItemCopperWire().setUnlocalizedName("copper_wire");
		copper_coil = new ItemCopperCoil().setUnlocalizedName("copper_coil");
		transformer = new ItemTransformer().setUnlocalizedName("transformer");
		thicker_copper_wire = new ItemThickerCopperWire().setUnlocalizedName("thicker_copper_wire");
		solar_cell = new ItemSolarCell().setUnlocalizedName("solar_cell");
		thicker_copper_coil = new ItemThickerCopperCoil().setUnlocalizedName("thicker_copper_coil");
		petrol = new ItemPetrol().setUnlocalizedName("petrol");
		
		// Backpack
		backpack = new ItemBackPack().setUnlocalizedName("backpack");
		
		railplacer = new ItemSwellPlacer().setUnlocalizedName("railpl");
		
		genPlacer = new ItemGeneratorPlacer().setUnlocalizedName("Generator");
		
		UMod.log.debug("Init Items");
	}
	
	private void register() {
		
		// Ingot
		URegistryUtils.registerItem(ingots);
		
		// Dust
		URegistryUtils.registerItem(dusts);
		URegistryUtils.registerItem(manganoxid);
		
		// magic
		URegistryUtils.registerItem(magic_diamond);
		URegistryUtils.registerItem(magic_ingot);
		URegistryUtils.registerItem(charged_quartz);
		URegistryUtils.registerItem(magic_brew);
		URegistryUtils.registerItem(magic_bottle);
		
		// Cobble Dust
		URegistryUtils.registerItem(cdust);
		
		// Infected
		URegistryUtils.registerItem(infectedcrop);
		URegistryUtils.registerItem(infectedleather);
		URegistryUtils.registerItem(infectedbeef);
		URegistryUtils.registerItem(infectedmilk);
		URegistryUtils.registerItem(acid);
		URegistryUtils.registerItem(plastic);
		
		// Battery
		URegistryUtils.registerItem(tester);
		URegistryUtils.registerItem(battery);
		URegistryUtils.registerItem(energydisplay);
		URegistryUtils.registerItem(copper_wire);
		URegistryUtils.registerItem(copper_coil);
		URegistryUtils.registerItem(transformer);
		URegistryUtils.registerItem(thicker_copper_wire);
		URegistryUtils.registerItem(thicker_copper_coil);
		URegistryUtils.registerItem(solar_cell);
		URegistryUtils.registerItem(petrol);
		
		// Backpack
		URegistryUtils.registerItem(backpack);
		
		URegistryUtils.registerItem(railplacer);
		
		URegistryUtils.registerItem(genPlacer);
		
		UMod.log.debug("Register Items");
	}
	
}
