package com.du.projectnarwhal.init;

import com.du.projectnarwhal.block.BlockThrowableLamps;
import com.du.projectnarwhal.item.*;
import com.du.projectnarwhal.ProjectNarwhal;

import io.github.vampirestudios.vampirelib.utils.registry.RegistryUtils;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Random;

public class PNarwhalItems {



    public static final FoodComponent OMLET = new FoodComponent.Builder().saturationModifier(0.3F).hunger(6).snack().alwaysEdible()
//            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 2), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 1), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300, 10), 1.0F)
            .build();

    public static final FoodComponent ROCK_STEAK = new FoodComponent.Builder().saturationModifier(0.3F).hunger(6).snack().alwaysEdible()

            .build();

//    public static final Item EASTER_EGG_ITEM;
      public static final BaseItem THOTDOG;
      public static final BaseItem TCAR;
      public static final BaseItem STYROFOAM;
      public static final BaseItem OMLET_ITEM;
      public static final BaseItem ROCK_STEAK_ITEM;
      public static final BaseItem STYROFOAM_PICAXE;
      // public static final BaseItem ITEMTLAMPS;

    static {

        OMLET_ITEM = registerItem(new BaseItem(new Item.Settings().food(OMLET)), new Identifier(ProjectNarwhal.MOD_ID, "omlet"));
        ROCK_STEAK_ITEM = registerItem(new ItemRockSteak(new Item.Settings().food(ROCK_STEAK)), new Identifier(ProjectNarwhal.MOD_ID, "rocksteak"));

        THOTDOG = registerItem(new ItemThrowableHotdog(), new Identifier(ProjectNarwhal.MOD_ID, "thotdog"));
        TCAR = registerItem(new ItemThrowableCar(), new Identifier(ProjectNarwhal.MOD_ID, "tcar"));
        STYROFOAM = registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "styrofoam"));
        STYROFOAM_PICAXE = registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "styrofoam-picaxe"));
        // ITEMTLAMPS = registerItem(new ItemBlockThrowableLamps(PNarwhalBlocks.TLAMPS), new Identifier(ProjectNarwhal.MOD_ID, "itemtlamps"));

    }



    public static <T extends Item> T registerItem(T item, Identifier name) {
        Registry.register(Registry.ITEM, name, item);
        return item;
    }

}
