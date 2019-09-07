package com.du.projectnarwhal.world.biomes.source;

import com.du.projectnarwhal.world.biomes.layers.*;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.layer.*;

import java.util.function.LongFunction;

public final class PNarwhalGalaxyBiomeLayers {

    private static Biome[] biomes = new Biome[] {};

    public static BiomeLayerSampler[] createLayers(long seed) {
        ImmutableList<LayerFactory<CachingLayerSampler>> samplers = build(seed, (salt) -> new CachingLayerContext(25, seed, salt));
        BiomeLayerSampler noiseLayer = new BiomeLayerSampler(samplers.get(0));
        BiomeLayerSampler biomeLayer = new BiomeLayerSampler(samplers.get(1));

        return new BiomeLayerSampler[]{noiseLayer, biomeLayer};
    }

    private static <T extends LayerSampler, C extends LayerSampleContext<T>> ImmutableList<LayerFactory<T>> build(long seed, LongFunction<C> context) {
        int biomeSize = 4;

        LayerFactory<T> biomeFactory = GalaxyBiomeLayer.INSTANCE.create(context.apply(1L));
        biomes = GalaxyBiomeLayer.INSTANCE.getBiomes();

        biomeFactory = ScaleLayer.NORMAL.create(context.apply(1000L), biomeFactory);
        biomeFactory = ScaleLayer.NORMAL.create(context.apply(1001L), biomeFactory);

        biomeFactory = GalaxySubBiomeLayer.INSTANCE.create(context.apply(2L), biomeFactory);
        biomes = GalaxySubBiomeLayer.INSTANCE.addBiomes(biomes);

        for (int i = 0; i < biomeSize; ++i) {
            biomeFactory = ScaleLayer.NORMAL.create(context.apply(2000 + i), biomeFactory);
        }

        LayerFactory<T> cellScaleFactory = CellScaleLayer.INSTANCE.create(context.apply(10L), biomeFactory);

        return ImmutableList.of(biomeFactory, cellScaleFactory);
    }

    public static Biome[] getBiomes() {
        return biomes;
    }
}
