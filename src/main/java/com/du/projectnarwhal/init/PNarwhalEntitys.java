package com.du.projectnarwhal.init;

import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.entity.*;
import com.du.projectnarwhal.entity.galaxy.*;
import io.github.vampirestudios.vampirelib.utils.registry.EntityRegistryBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

public class PNarwhalEntitys {

    public static final EntityType<CreeperCowEntity> CREEPER_COW;
    public static final EntityType<CreeperPigEntity> CREEPER_PIG;
    public static final EntityType<DiamondChickenEntity> DIAMOND_CHICKEN;
    public static final EntityType<SeaLionEntity> SEALION;
    public static final EntityType<PenguinEntity> PENGUIN;
    public static final EntityType<BirdEntity> BIRD;
    public static final EntityType<OctopusEntity> OCTOPUS;
    public static final EntityType<OwlEntity> OWL;
    public static final EntityType<GalaxyWolfEntity> GALAXY_WOLF;
    public static final EntityType<GalaxyHorseEntity> GALAXY_HORSE;
    public static final EntityType<GalaxySpiderEntity> GALAXY_SPIDER;

    static {
        CREEPER_COW = EntityRegistryBuilder.<CreeperCowEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "creepercow"))
                .entity(CreeperCowEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x00ff00, 0x654321)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        CREEPER_PIG = EntityRegistryBuilder.<CreeperPigEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "creeperpig"))
                .entity(CreeperPigEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x00ff00, 0xff69b4)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        DIAMOND_CHICKEN = EntityRegistryBuilder.<DiamondChickenEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "diamondchicken"))
                .entity(DiamondChickenEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0xffffff, 0x00ffff)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        SEALION = EntityRegistryBuilder.<SeaLionEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "sealion"))
                .entity(SeaLionEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x595453, 0x645650)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        PENGUIN = EntityRegistryBuilder.<PenguinEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "penguin"))
                .entity(PenguinEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x000000, 0xff8f00)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        BIRD = EntityRegistryBuilder.<BirdEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "bird"))
                .entity(BirdEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0xff0000, 0x000000)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        OCTOPUS = EntityRegistryBuilder.<OctopusEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "octopus"))
                .entity(OctopusEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0xff0000, 0x970a0a)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        OWL = EntityRegistryBuilder.<OwlEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "owl"))
                .entity(OwlEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x5c3838, 0xbca016)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        GALAXY_WOLF = EntityRegistryBuilder.<GalaxyWolfEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "galaxywolf"))
                .entity(GalaxyWolfEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x000000, 0x6002b4)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        GALAXY_HORSE = EntityRegistryBuilder.<GalaxyHorseEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "galaxyhorse"))
                .entity(GalaxyHorseEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x000000, 0x6002b4)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();
        GALAXY_SPIDER = EntityRegistryBuilder.<GalaxySpiderEntity>createBuilder(new Identifier(ProjectNarwhal.MOD_ID, "galaxyspider"))
                .entity(GalaxySpiderEntity::new)
                .category(EntityCategory.AMBIENT)
                .egg(0x000000, 0x6002b4)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(1.0F, 1.0F))
                .build();

    }


}
