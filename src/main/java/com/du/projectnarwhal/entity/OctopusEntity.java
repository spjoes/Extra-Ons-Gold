package com.du.projectnarwhal.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.world.World;

public class OctopusEntity extends SquidEntity {
    public OctopusEntity(EntityType<? extends SquidEntity> entityType_1, World world_1) {
        super(entityType_1, world_1);
    }

    @Override
    protected void initAttributes() {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(40.0F);
    }

}
