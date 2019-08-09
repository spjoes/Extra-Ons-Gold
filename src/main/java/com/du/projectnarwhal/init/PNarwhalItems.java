package com.du.projectnarwhal.init;

import com.du.projectnarwhal.block.BlockThrowableLamps;
import com.du.projectnarwhal.item.BaseItem;
import com.du.projectnarwhal.ProjectNarwhal;

import com.du.projectnarwhal.item.ItemBlockThrowableLamps;
import com.du.projectnarwhal.item.ItemThrowableCar;
import com.du.projectnarwhal.item.ItemThrowableHotdog;
import net.minecraft.item.Item;
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
      public static final BaseItem ITEMTLAMPS;

    static {
        // EASTER_EGG_ITEM = RegistryUtils.registerItem(new Item(new Item.Settings().food(EASTER_EGG)), new Identifier(ProjectNarwhal.MOD_ID, "easter_egg_item"));


        THOTDOG = registerItem(new ItemThrowableHotdog(), new Identifier(ProjectNarwhal.MOD_ID, "thotdog"));
        TCAR = registerItem(new ItemThrowableCar(), new Identifier(ProjectNarwhal.MOD_ID, "tcar"));
        STYROFOAM = registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "styrofoam"));
        ITEMTLAMPS = registerItem(new ItemBlockThrowableLamps(PNarwhalBlocks.TLAMPS), new Identifier(ProjectNarwhal.MOD_ID, "itemtlamps"));

    }

    public static <T extends Item> T registerItem(T item, Identifier name) {
        Registry.register(Registry.ITEM, name, item);
        return item;
    }

}
