package com.du.projectnarwhal.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.world.World;

public class PenguinEntity extends PolarBearEntity {
    public PenguinEntity(EntityType<? extends PolarBearEntity> entityType_1, World world_1) {
        super(entityType_1, world_1);
    }

    @Override
    protected void initAttributes() {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(20.0F);
    }

}
