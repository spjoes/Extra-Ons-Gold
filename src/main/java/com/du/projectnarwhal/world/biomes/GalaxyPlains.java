package com.du.projectnarwhal.world.biomes;

import com.du.projectnarwhal.init.PNarwhalBlocks;
import com.du.projectnarwhal.init.PNarwhalPlacements;
import com.du.projectnarwhal.world.gen.feature.GalaxyTreeFeature;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class GalaxyPlains extends Biome {

    public GalaxyPlains() {
        super(new Settings()
                .configureSurfaceBuilder(SurfaceBuilder.DEFAULT, new TernarySurfaceConfig(Blocks.AIR.getDefaultState(),
                        PNarwhalBlocks.GALAXY_DIRT.getDefaultState(), Blocks.AIR.getDefaultState()))
                .scale(1.0F)
                .temperature(0.0F)
                .waterColor(0xFFFFFF)
                .waterFogColor(0xFFFFFF)
                .downfall(0.0F)
                .category(Category.PLAINS)
                .precipitation(Precipitation.NONE)
                .depth(1.0F)
        );

        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Biome.configureFeature(new GalaxyTreeFeature(DefaultFeatureConfig::deserialize, true), FeatureConfig.DEFAULT, PNarwhalPlacements.COUNT_UNDERGROUND_32, new CountDecoratorConfig(10)));
    }

    @Override
    public int getSkyColor(float float_1) {
        return 0x171B32;
    }

}
