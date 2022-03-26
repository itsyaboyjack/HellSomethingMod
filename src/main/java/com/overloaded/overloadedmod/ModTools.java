package com.overloaded.overloadedmod;

import com.overloaded.overloadedmod.antimatter.ItemAntiAxe;
import com.overloaded.overloadedmod.antimatter.ItemAntiGreatSword;
import com.overloaded.overloadedmod.antimatter.ItemAntiPickaxe;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools {

    public static Item antimatterGreatSword;
    public static Item antimatterAxe;
    public static Item antimatterPickaxe;

    public static void init() {

        //AntimatterTools
        Item.ToolMaterial antimatterSwordToolMaterial = EnumHelper.addToolMaterial("antimatterSwordToolMaterial", 9, 5000, 5, 257, 8);
        Item.ToolMaterial antimatterAxeToolMaterial = EnumHelper.addToolMaterial("antimatterAxeToolMaterial", 9, 5000, 8, 27, 8);
        Item.ToolMaterial antimatterPickaxeToolMaterial = EnumHelper.addToolMaterial("antimatterPickaxeToolMaterial", 9, 5000, 8, 20, 8);
        antimatterGreatSword = new ItemAntiGreatSword(antimatterSwordToolMaterial);
        antimatterAxe = new ItemAntiAxe(antimatterAxeToolMaterial);
        antimatterPickaxe = new ItemAntiPickaxe(antimatterPickaxeToolMaterial);

    }

}
