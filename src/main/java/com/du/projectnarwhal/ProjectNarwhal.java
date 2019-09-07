package com.du.projectnarwhal;

import com.du.projectnarwhal.entity.*;
import com.du.projectnarwhal.entity.galaxy.*;
import com.du.projectnarwhal.init.*;
import com.du.projectnarwhal.villager.*;
import com.du.projectnarwhal.world.dimensions.ChunkGeneratorTypeWorkaround;
import com.du.projectnarwhal.world.dimensions.FabricDimensionType;
import com.du.projectnarwhal.world.dimensions.GalaxyDimension;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biomes.v1.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;

import net.fabricmc.fabric.api.network.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGeneratorConfig;
import net.minecraft.world.gen.chunk.ChunkGeneratorType;
import org.apache.logging.log4j.*;

public class ProjectNarwhal implements ModInitializer {

    public static final String MOD_ID = "pnarwhal";
    public static final String MOD_NAME = "Project Narwhal";
    public static final Logger LOGGER = LogManager.getLogger(String.format("[%s]", MOD_NAME));

    public static final DimensionType THE_GALAXY = new FabricDimensionType(new Identifier(MOD_ID, "the_galaxy"), 100, GalaxyDimension::new);
    public static final ChunkGeneratorType GALAXY_CHUNK_GENERATOR = new ChunkGeneratorTypeWorkaround().getChunkGeneratorType(ChunkGeneratorConfig::new);


    public static final ItemGroup PNARWHAL_TAB = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "pnarwhal_tab"))
            .icon(() -> new ItemStack(PNarwhalBlocks.TLAMPS)).build();


    public static final Identifier SPAWN_TNT = new Identifier(MOD_ID, "spawn_tnt");

    private static Enchantment FROST;



    @Override
    public void onInitialize() {
        new PNarwhalBlocks();
        new PNarwhalItems();
        new PNarwhalEntitys();
        new PNarwhalEnchantments();
        PNarwhalVillagers.init();
        CustomVillagerTrades.init();
        PNarwhalSpawns.sort();

        ServerSidePacketRegistry.INSTANCE.register(SPAWN_TNT, ((PacketContext context, PacketByteBuf buffer) -> {
            PlayerEntity player = context.getPlayer();
            // System.out.println(PlayerEntity.getPos);
        }));


        OverworldBiomes.addContinentalBiome(PNarwhalBiomes.SHEEP_BIOME, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(PNarwhalBiomes.SHEEP_BIOME, OverworldClimate.TEMPERATE, 2D);
        FabricBiomes.addSpawnBiome(PNarwhalBiomes.SHEEP_BIOME);

        EntityRendererRegistry.INSTANCE.register(CreeperCowEntity.class, (entityRenderDispatcher, context) -> new CreeperCowRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(CreeperPigEntity.class, (entityRenderDispatcher, context) -> new CreeperPigRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(DiamondChickenEntity.class, (entityRenderDispatcher, context) -> new DiamondChickenRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(SeaLionEntity.class, (entityRenderDispatcher, context) -> new SeaLionRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(BirdEntity.class, (entityRenderDispatcher, context) -> new BirdRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(OctopusEntity.class, (entityRenderDispatcher, context) -> new OctopusRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(PenguinEntity.class, (entityRenderDispatcher, context) -> new PenguinRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(OwlEntity.class, (entityRenderDispatcher, context) -> new OwlRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(GalaxyWolfEntity.class, (entityRenderDispatcher, context) -> new GalaxyWolfRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(GalaxyHorseEntity.class, (entityRenderDispatcher, context) -> new GalaxyHorseRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(GalaxySpiderEntity.class, (entityRenderDispatcher, context) -> new GalaxySpiderRenderer(entityRenderDispatcher));




//
//            Tesseract.dimensionRegistry.registerDimensionType(new Identifier(MOD_ID, "galaxy"), true, (world, type) ->
//                    new DimensionBuilder()
//                            .bedsExplode(true)
//                            .cloudHeight(70f)
//                            .forcedSpawnPoint(new BlockPos(0, 64, 0))
//                            .renderSkybox(true)
//                            .renderFog(false)
//                            .build(world, type)
//            );
        }


    }