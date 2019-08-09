package com.DU.ProjectNarwhal.init;

import com.DU.ProjectNarwhal.ProjectNarwhal;
import com.DU.ProjectNarwhal.item.*;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PNarwhalItems {

//    public static final FoodComponent EASTER_EGG = new FoodComponent.Builder().saturationModifier(0.3F).hunger(4).snack().alwaysEdible()
//            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 2), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 1), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300, 10), 1.0F)
//            .build();

//    public static final Item EASTER_EGG_ITEM;
      public static final BaseItem THOTDOG;
      public static final BaseItem TCAR;
      public static final BaseItem STYROFOAM;

    static {
        // EASTER_EGG_ITEM = RegistryUtils.registerItem(new Item(new Item.Settings().food(EASTER_EGG)), new Identifier(ProjectNarwhal.MOD_ID, "easter_egg_item"));


        THOTDOG = registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "thotdog"));
        TCAR = registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "tcar"));
        STYROFOAM = registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "styrofoam"));
    }

    public static <T extends Item> T registerItem(T item, Identifier name) {
        Registry.register(Registry.ITEM, name, item);
        return item;
    }

}
