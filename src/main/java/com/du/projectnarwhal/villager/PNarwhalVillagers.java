package com.du.projectnarwhal.villager;

import com.du.projectnarwhal.ProjectNarwhal;
import com.google.common.collect.ImmutableSet;
import io.github.vampirestudios.vampirelib.api.custom_villagers.PointOfInterestRegistry;
import io.github.vampirestudios.vampirelib.api.custom_villagers.PointOfInterestTypeCustom;
import io.github.vampirestudios.vampirelib.api.custom_villagers.VillagerProfessionRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.village.VillagerProfession;

public class PNarwhalVillagers {

    public static PointOfInterestType DOCTOR_POI;
//    public static PointOfInterestType ROBOT_POI;
//    public static PointOfInterestType BLUE_POI;
//    public static PointOfInterestType KING_POI;
//    public static PointOfInterestType POLICE_POI;
//    public static PointOfInterestType SANTA_POI;
//    public static PointOfInterestType SKELETON_POI;
    public static VillagerProfession DOCTOR;
//    public static VillagerProfession ROBOT;
//    public static VillagerProfession BLUE;
//    public static VillagerProfession KING;
//    public static VillagerProfession POLICE;
//    public static VillagerProfession SANTA;
//    public static VillagerProfession SKELETON;


    public static void init() {
        DOCTOR_POI = PointOfInterestRegistry.register(ProjectNarwhal.MOD_ID, new PointOfInterestTypeCustom("doctor_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.CRAFTING_TABLE), 1, null, 1));
//        ROBOT_POI = PointOfInterestRegistry.register(ProjectNarwhal.MOD_ID, new PointOfInterestTypeCustom("robot_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.BEACON), 1, null, 1));
//        BLUE_POI = PointOfInterestRegistry.register(ProjectNarwhal.MOD_ID, new PointOfInterestTypeCustom("blue_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.LAPIS_BLOCK), 1, null, 1));
//        KING_POI = PointOfInterestRegistry.register(ProjectNarwhal.MOD_ID, new PointOfInterestTypeCustom("king_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.GOLD_BLOCK), 1, null, 1));
//        POLICE_POI = PointOfInterestRegistry.register(ProjectNarwhal.MOD_ID, new PointOfInterestTypeCustom("police_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.PUMPKIN), 1, null, 1));
//        SANTA_POI = PointOfInterestRegistry.register(ProjectNarwhal.MOD_ID, new PointOfInterestTypeCustom("santa_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.RED_WOOL), 1, null, 1));
//        SKELETON_POI = PointOfInterestRegistry.register(ProjectNarwhal.MOD_ID, new PointOfInterestTypeCustom("skeleton_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.RED_WOOL), 1, null, 1));

        DOCTOR = VillagerProfessionRegistry.register(new Identifier(ProjectNarwhal.MOD_ID, "doctor"), DOCTOR_POI, ImmutableSet.of(), ImmutableSet.of());
//        ROBOT = VillagerProfessionRegistry.register(new Identifier(ProjectNarwhal.MOD_ID, "robot"), ROBOT_POI, ImmutableSet.of(), ImmutableSet.of());
//        BLUE = VillagerProfessionRegistry.register(new Identifier(ProjectNarwhal.MOD_ID, "blue"), BLUE_POI, ImmutableSet.of(), ImmutableSet.of());
//        KING = VillagerProfessionRegistry.register(new Identifier(ProjectNarwhal.MOD_ID, "king"), KING_POI, ImmutableSet.of(), ImmutableSet.of());
//        POLICE = VillagerProfessionRegistry.register(new Identifier(ProjectNarwhal.MOD_ID, "police"), POLICE_POI, ImmutableSet.of(), ImmutableSet.of());
//        SANTA = VillagerProfessionRegistry.register(new Identifier(ProjectNarwhal.MOD_ID, "santa"), SANTA_POI, ImmutableSet.of(), ImmutableSet.of());
//        SKELETON = VillagerProfessionRegistry.register(new Identifier(ProjectNarwhal.MOD_ID, "skeleton"), SKELETON_POI, ImmutableSet.of(), ImmutableSet.of());

    }


}
