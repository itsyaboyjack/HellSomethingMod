package com.overloaded.overloadedmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {

    //antimatter
    public static Item antimatter;

    //Hellstone
    public static Item hellstone;
    public static Item hellstone_dust;

    //reinforced
    public static Item reinforced_stick;

    public static void init() {

        //HellStone
        hellstone = new Item().setUnlocalizedName("hellstone").setTextureName(OverloadedMod.MODID + ":hellstone").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(hellstone, hellstone.getUnlocalizedName());
        hellstone_dust = new Item().setUnlocalizedName("hellstone_dust").setTextureName(OverloadedMod.MODID + ":hellstone_dust").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(hellstone_dust, hellstone_dust.getUnlocalizedName());
        
        //AntiMatter
        antimatter = new Item().setUnlocalizedName("antimatter").setTextureName(OverloadedMod.MODID + ":antimatter").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(antimatter, antimatter.getUnlocalizedName());

        //Reinforced
        reinforced_stick = new Item().setUnlocalizedName("reinforced_stick").setTextureName(OverloadedMod.MODID + ":reinforced_stick").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(reinforced_stick, reinforced_stick.getUnlocalizedName());

    }

}
