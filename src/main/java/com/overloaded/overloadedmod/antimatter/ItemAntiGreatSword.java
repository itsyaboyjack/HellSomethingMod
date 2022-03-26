package com.overloaded.overloadedmod.antimatter;

import com.overloaded.overloadedmod.OverloadedMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemAntiGreatSword extends ItemSword {

    private static final String name = "antimatter_greatsword";

    public ItemAntiGreatSword(ToolMaterial material) {
        super(material);
        GameRegistry.registerItem(this, name);
        setUnlocalizedName("antimatter_greatsword");
        setTextureName(OverloadedMod.MODID + ":antimatter_greatsword");
        setCreativeTab(CreativeTabs.tabCombat);

    }
    public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity)
    {
        hitEntity.addPotionEffect(new PotionEffect(Potion.wither.id, 20, 0));
        return true;
    }

}
