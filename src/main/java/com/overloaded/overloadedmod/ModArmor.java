package com.overloaded.overloadedmod;

import com.overloaded.overloadedmod.hellstone.ItemHellBoots;
import com.overloaded.overloadedmod.hellstone.ItemHellChestplate;
import com.overloaded.overloadedmod.hellstone.ItemHellHelmet;
import com.overloaded.overloadedmod.hellstone.ItemHellLeggings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmor {

    //hellstone armor
    public static Item hellstone_helmet;
    public static Item hellstone_chestplate;
    public static Item hellstone_leggings;
    public static Item hellstone_boots;

    public static void init() {

        //hellstone armor
        ItemArmor.ArmorMaterial hellstoneArmorMaterial = EnumHelper.addArmorMaterial("hellstone_armor_material", 3000, new int[]{25, 45, 37, 25}, 10);
        hellstone_helmet = new ItemHellHelmet(hellstoneArmorMaterial, 0, 0);
        hellstone_chestplate = new ItemHellChestplate(hellstoneArmorMaterial, 0, 1);
        hellstone_leggings = new ItemHellLeggings(hellstoneArmorMaterial, 0, 2);
        hellstone_boots = new ItemHellBoots(hellstoneArmorMaterial, 0, 3);

    }
}
