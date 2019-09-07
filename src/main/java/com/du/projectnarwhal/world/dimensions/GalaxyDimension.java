package com.du.projectnarwhal.world.dimensions;

import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.init.PNarwhalBlocks;
import com.du.projectnarwhal.world.biomes.source.PNarwhalGalaxyBiomeSource;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorConfig;
import org.jetbrains.annotations.Nullable;

public class GalaxyDimension extends Dimension {


        public GalaxyDimension(World world_1, DimensionType dimensionType_1) {
            super(world_1, dimensionType_1);
        }

        @Environment(EnvType.CLIENT)
        public Vec3d getFogColor(float float_1, float float_2) {
            return new Vec3d(0.1, 0.1, 0.2);
        }

        @Nullable
        @Environment(EnvType.CLIENT)
        public float[] getBackgroundColor(float float_1, float float_2) {
            return null;
        }

        @Override
        public ChunkGenerator<?> createChunkGenerator() {
            ChunkGeneratorConfig config = new ChunkGeneratorConfig();
            config.setDefaultBlock(PNarwhalBlocks.GALAXY_DIRT.getDefaultState());
            config.setDefaultFluid(Blocks.AIR.getDefaultState());

            return ProjectNarwhal.GALAXY_CHUNK_GENERATOR.create(this.world, new PNarwhalGalaxyBiomeSource(this.world.getSeed()), config);
        }

        @Override
        public BlockPos getSpawningBlockInChunk(ChunkPos chunkPos, boolean b)
        {
            return null;
        }

        @Override
        public BlockPos getTopSpawningBlockPosition(int var1, int var2, boolean var3)
        {
            return null;
        }

        @Override
        public float getSkyAngle(long long_1, float float_1) {
            return 0.5F;
        }

        @Override
        public boolean hasVisibleSky()
        {
            return false;
        }

        @Override
        public boolean canPlayersSleep() {
            return false;
        }

        @Override
        public boolean hasSkyLight() {
            return false;
        }

        @Override
        public boolean shouldRenderFog(int var1, int var2) {
            return false;
        }

        @Override
        public DimensionType getType() {
            return ProjectNarwhal.THE_GALAXY;
        }

    }