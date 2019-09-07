package com.du.projectnarwhal.entity.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

/**
 * ModelOctopus - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelOctopus<T extends Entity> extends EntityModel<T> {
    public ModelPart Head;
    public ModelPart Tentacle1;
    public ModelPart Tentacle2;
    public ModelPart Tentacle3;
    public ModelPart Tentacle4;
    public ModelPart Tentacle5;
    public ModelPart Tentacle6;
    public ModelPart Tentacle7;
    public ModelPart Tentacle8;

    public ModelOctopus() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Tentacle6 = new ModelPart(this, 0, 0);
        this.Tentacle6.setRotationPoint(-1.5F, 24.0F, 1.5F);
        this.Tentacle6.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tentacle6, 0.0F, 2.356194490192345F, 0.0F);
        this.Tentacle1 = new ModelPart(this, 0, 0);
        this.Tentacle1.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.Tentacle1.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Tentacle3 = new ModelPart(this, 0, 0);
        this.Tentacle3.setRotationPoint(2.0F, 24.0F, 0.0F);
        this.Tentacle3.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tentacle3, 0.0F, -1.5707963267948966F, 0.0F);
        this.Head = new ModelPart(this, 0, 10);
        this.Head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Head.addCuboid(-3.0F, -10.0F, -3.0F, 6, 10, 6, 0.0F);
        this.Tentacle4 = new ModelPart(this, 0, 0);
        this.Tentacle4.setRotationPoint(1.5F, 24.0F, 1.5F);
        this.Tentacle4.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tentacle4, 0.0F, -2.356194490192345F, 0.0F);
        this.Tentacle5 = new ModelPart(this, 0, 0);
        this.Tentacle5.setRotationPoint(0.0F, 24.0F, 2.0F);
        this.Tentacle5.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tentacle5, 0.0F, -3.141592653589793F, 0.0F);
        this.Tentacle2 = new ModelPart(this, 0, 0);
        this.Tentacle2.setRotationPoint(1.5F, 24.0F, -1.5F);
        this.Tentacle2.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tentacle2, 0.0F, -0.7853981633974483F, 0.0F);
        this.Tentacle8 = new ModelPart(this, 0, 0);
        this.Tentacle8.setRotationPoint(-1.5F, 24.0F, -1.4F);
        this.Tentacle8.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tentacle8, 0.0F, 0.7853981633974483F, 0.0F);
        this.Tentacle7 = new ModelPart(this, 0, 0);
        this.Tentacle7.setRotationPoint(-2.0F, 24.0F, 0.0F);
        this.Tentacle7.addCuboid(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tentacle7, 0.0F, 1.5707963267948966F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Tentacle6.render(f5);
        this.Tentacle1.render(f5);
        this.Tentacle3.render(f5);
        this.Head.render(f5);
        this.Tentacle4.render(f5);
        this.Tentacle5.render(f5);
        this.Tentacle2.render(f5);
        this.Tentacle8.render(f5);
        this.Tentacle7.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}
