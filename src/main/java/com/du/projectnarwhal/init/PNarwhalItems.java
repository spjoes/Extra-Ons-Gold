package com.du.projectnarwhal.init;

import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.item.*;
import com.du.projectnarwhal.materials.PNarwhalToolMaterials;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PNarwhalItems {



    public static final FoodComponent OMLET = new FoodComponent.Builder().saturationModifier(0.3F).hunger(10).snack().alwaysEdible()
//            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 2), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 1), 1.0F)
//            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300, 10), 1.0F)
            .build();

    public static final FoodComponent ROCK_STEAK = new FoodComponent.Builder().saturationModifier(0.3F).hunger(6).snack().alwaysEdible()

            .build();

    public static final FoodComponent ORB = new FoodComponent.Builder().saturationModifier(0.3F).hunger(6).snack().alwaysEdible()

            .build();


    public static final FoodComponent MEDICINE = new FoodComponent.Builder().saturationModifier(0.3F).hunger(20).snack().alwaysEdible()

            .build();

    public static final FoodComponent PILL = new FoodComponent.Builder().saturationModifier(0.3F).hunger(10).snack().alwaysEdible()

            .build();


      public static final BaseItem THOTDOG;
      public static final BaseItem TCAR;
      public static final BaseItem STYROFOAM;
      public static final BaseItem OMLET_ITEM;
      public static final BaseItem ROCK_STEAK_ITEM;
      public static final ItemStyrofoamPicaxe STYROFOAM_PICAXE;
      public static final ItemDirtPicaxe DIRT_PICAXE;
      // public static final ItemFuturePicaxe FUTURE_PICAXE;
      public static final ItemRedstoneSaber REDSTONE_SABER;
      public static final BaseItem MEDICINE_ITEM;
      public static final BaseItem PILL_ITEM;
      public static final ItemOrb ORB_ITEM;
      public static ItemIronInfusedStick IRON_INFUSED_STICK;


    static {


        OMLET_ITEM = registerItem(new BaseItem(new Item.Settings().food(OMLET)), new Identifier(ProjectNarwhal.MOD_ID, "omlet"));
        ROCK_STEAK_ITEM = registerItem(new ItemRockSteak(new Item.Settings().food(ROCK_STEAK)), new Identifier(ProjectNarwhal.MOD_ID, "rocksteak"));
        MEDICINE_ITEM = registerItem(new ItemMedicine(new Item.Settings().food(MEDICINE)), new Identifier(ProjectNarwhal.MOD_ID, "medicine"));
        PILL_ITEM = registerItem(new ItemPill(new Item.Settings().food(PILL)), new Identifier(ProjectNarwhal.MOD_ID, "pill"));
        ORB_ITEM = registerItem(new ItemOrb(new Item.Settings().food(ORB).group(ProjectNarwhal.PNARWHAL_TAB)), new Identifier(ProjectNarwhal.MOD_ID, "orb"));

        THOTDOG = registerItem(new ItemThrowableHotdog(), new Identifier(ProjectNarwhal.MOD_ID, "thotdog"));
        REDSTONE_SABER = registerItem(new ItemRedstoneSaber(PNarwhalToolMaterials.REDSTONEMATERIAL, 3, -2.4F, new Item.Settings()), new Identifier(ProjectNarwhal.MOD_ID, "redstone-saber"));
        TCAR = registerItem(new ItemThrowableCar(), new Identifier(ProjectNarwhal.MOD_ID, "tcar"));
        STYROFOAM = registerItem(new BaseItem(), new Identifier(ProjectNarwhal.MOD_ID, "styrofoam"));
        IRON_INFUSED_STICK = registerItem(new ItemIronInfusedStick(), new Identifier(ProjectNarwhal.MOD_ID, "iis"));
        STYROFOAM_PICAXE = registerItem(new ItemStyrofoamPicaxe(PNarwhalToolMaterials.STYROFOAM, 1, -4.2F, new Item.Settings()), new Identifier(ProjectNarwhal.MOD_ID, "styrofoam-picaxe"));
        DIRT_PICAXE = registerItem(new ItemDirtPicaxe(PNarwhalToolMaterials.DIRTMATERIAL, 1, -3.8F, new Item.Settings()), new Identifier(ProjectNarwhal.MOD_ID, "dirt-picaxe"));
       // FUTURE_PICAXE = registerItem(new ItemFuturePicaxe(PNarwhalToolMaterials.FUTURE, 1, -3.8F, new Item.Settings()), new Identifier(ProjectNarwhal.MOD_ID, "future-picaxe"));


        // IRON_SWORD = register((String)"iron_sword", (Item)(new SwordItem(ToolMaterials.IRON, 3, -2.4F, (new Settings()).group(ItemGroup.COMBAT))));


    }



    public static <T extends Item> T registerItem(T item, Identifier name) {
        Registry.register(Registry.ITEM, name, item);
        return item;
    }

//    public static <T extends Item> T setItem(T item, Identifier name) {
//        Registry.set(Registry.ITEM, name, item);
//        return item;
//    }

}
