package com.overloaded.overloadedmod;

import com.overloaded.overloadedmod.antimatter.ItemAntiPickaxe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static void init(){

        //antimatter
        GameRegistry.addRecipe(new ItemStack(ModTools.antimatterGreatSword), " X ", " X ", " Y ", 'X', ModItems.antimatter, 'Y', ModItems.reinforced_stick);

    }
}