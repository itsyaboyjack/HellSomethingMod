package com.overloaded.overloadedmod.antimatter;

import com.overloaded.overloadedmod.OverloadedMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemAntiAxe extends ItemAxe {

    private static final String name = "antimatter_axe";

    public ItemAntiAxe(ToolMaterial material) {

        super(material);
        GameRegistry.registerItem(this, name);
        setUnlocalizedName("antimatter_axe");
        setTextureName(OverloadedMod.MODID + ":antimatter_axe");
        setCreativeTab(CreativeTabs.tabCombat);

    }

}
