package com.DU.ProjectNarwhal.init;

import com.DU.ProjectNarwhal.ProjectNarwhal;
import com.DU.ProjectNarwhal.item.*;
import io.github.vampirestudios.vampirelib.utils.registry.RegistryUtils;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class PNarwhalItems {

//    public static final FoodComponent EASTER_EGG = new FoodComponent.Builder().saturationModifier(0.3F).hunger(4).snack().alwaysEdible()
//            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 2), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 1), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300, 10), 1.0F)
//            .build();

//    public static final Item EASTER_EGG_ITEM;
      public static final Item THOTDOG;
      public static final Item TCAR;
      public static final Item STYROFOAM;

    static {
        // EASTER_EGG_ITEM = RegistryUtils.registerItem(new Item(new Item.Settings().food(EASTER_EGG)), new Identifier(ProjectNarwhal.MOD_ID, "easter_egg_item"));


        THOTDOG = RegistryUtils.registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "thotdog"));
        TCAR = RegistryUtils.registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "tcar"));
        STYROFOAM = RegistryUtils.registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "styrofoam"));
    }



}
