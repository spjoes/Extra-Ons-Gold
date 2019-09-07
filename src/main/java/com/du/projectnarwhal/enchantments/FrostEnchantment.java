package com.du.projectnarwhal.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FrostEnchantment extends Enchantment
{
    public FrostEnchantment(Enchantment.Weight weight, EnchantmentTarget target, EquipmentSlot[] slots)
    {
        super(weight, target, slots);
    }

    @Override
    public int getMinimumPower(int int_1)
    {
        return 1;
    }
    @Override
    public int getMaximumLevel()
    {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level)
    {
        if(target instanceof LivingEntity)
        {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, level - 1));
        }

        super.onTargetDamaged(user, target, level);
    }
}
