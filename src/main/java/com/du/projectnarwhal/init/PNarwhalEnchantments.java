package com.du.projectnarwhal.init;

import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.enchantments.FrostEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PNarwhalEnchantments {

    public static final Enchantment FROST;
    static{
    FROST = Registry.register(Registry.ENCHANTMENT, new Identifier(ProjectNarwhal.MOD_ID, "frost"), new FrostEnchantment(Enchantment.Weight.VERY_RARE,
            EnchantmentTarget.WEAPON,  new EquipmentSlot[] { EquipmentSlot.MAINHAND }));
}
}
