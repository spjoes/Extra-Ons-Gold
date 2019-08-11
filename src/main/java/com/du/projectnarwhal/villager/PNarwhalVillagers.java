package com.du.projectnarwhal.villager;

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
    public static VillagerProfession DOCTOR;


    public static void init() {
        DOCTOR_POI = PointOfInterestRegistry.register("pnarwhal", new PointOfInterestTypeCustom("doctor_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.CRAFTING_TABLE), 1, null, 1));

        DOCTOR = VillagerProfessionRegistry.register(new Identifier("pnarwhal", "doctor"), DOCTOR_POI, ImmutableSet.of(), ImmutableSet.of());

    }


}
