package com.du.projectnarwhal.materials;


import java.util.function.Supplier;

import com.du.projectnarwhal.init.PNarwhalItems;
import com.du.projectnarwhal.tag.PNarwhalItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

public enum PNarwhalToolMaterials implements ToolMaterial {

    STYROFOAM(0,29,1.0F,0.0F,15, () -> {
        return Ingredient.fromTag(PNarwhalItemTags.STYROFOAM);
    }),


    FUTURE(0,29,1.0F,0.0F,15, () -> {
        return Ingredient.fromTag(PNarwhalItemTags.FUTURE);
    }),

    DIRTMATERIAL(0, 19, 0.7F, 0.0F, 15, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.DIRT});
    }),

    REDSTONEMATERIAL(0, 19, 0.7F, 0.0F, 15, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.REDSTONE_BLOCK});
    });



    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private PNarwhalToolMaterials(int int_1, int int_2, float float_1, float float_2, int int_3, Supplier<Ingredient> supplier_1) {
        this.miningLevel = int_1;
        this.itemDurability = int_2;
        this.miningSpeed = float_1;
        this.attackDamage = float_2;
        this.enchantability = int_3;
        this.repairIngredient = new Lazy(supplier_1);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeed() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
