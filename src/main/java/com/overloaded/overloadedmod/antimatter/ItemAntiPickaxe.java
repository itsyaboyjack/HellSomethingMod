package com.overloaded.overloadedmod.antimatter;

import com.overloaded.overloadedmod.OverloadedMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemAntiPickaxe extends ItemPickaxe {

    private static final String name = "antimatter_pickaxe";

    public ItemAntiPickaxe(ToolMaterial material) {
        super(material);
        GameRegistry.registerItem(this, name);
        setUnlocalizedName("antimatter_pickaxe");
        setTextureName(OverloadedMod.MODID + ":antimatter_pickaxe");
        setCreativeTab(CreativeTabs.tabCombat);

    }

}
