package com.du.projectnarwhal.entity.galaxy;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.world.World;

public class GalaxySpiderEntity extends SpiderEntity {
    public GalaxySpiderEntity(EntityType<? extends SpiderEntity> entityType_1, World world_1) {
        super(entityType_1, world_1);
    }

    @Override
    protected void initAttributes() {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(20.0F);
    }

}
