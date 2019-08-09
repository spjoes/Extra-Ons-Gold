package com.du.projectnarwhal.world;

import com.du.projectnarwhal.init.PNarwhalBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;


public class BiomeFeatures {

    public static void addOres() {
        Registry.BIOME.forEach(biome -> {
            if (biome.getCategory() != Biome.Category.OCEAN && biome.getTemperatureGroup() != Biome.TemperatureGroup.COLD) {
                biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, PNarwhalBlocks.STYROFOAM_ORE.getDefaultState(), 9), Decorator.COUNT_RANGE, new RangeDecoratorConfig(20, 0, 0, 64)));
                System.out.print("STYROFOAM ORE STATUS: COMPLETED!");
                biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, PNarwhalBlocks.SHEEP_ORE.getDefaultState(), 9), Decorator.COUNT_RANGE, new RangeDecoratorConfig(20, 0, 0, 64)));
                System.out.print("SHEEP ORE STATUS: COMPLETED!");
            }
        });
    }

}
