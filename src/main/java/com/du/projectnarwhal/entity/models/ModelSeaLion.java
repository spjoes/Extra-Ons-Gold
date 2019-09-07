package com.du.projectnarwhal.entity.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

/**
 * ModelSeaLion - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelSeaLion<T extends Entity> extends EntityModel<T> {
    public ModelPart  Neck;
    public ModelPart  Body;
    public ModelPart  RightFlipper;
    public ModelPart  LeftFlipper;
    public ModelPart  Head;
    public ModelPart  Tail1;
    public ModelPart  Tail2;

    public ModelSeaLion() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Neck = new ModelPart(this, 40, 13);
        this.Neck.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Neck.addCuboid(-2.5F, -6.0F, -7.0F, 5, 6, 7, 0.0F);
        this.setRotateAngle(Neck, 0.4363323129985824F, 0.0F, 0.0F);
        this.LeftFlipper = new ModelPart(this, 46, 26);
        this.LeftFlipper.setRotationPoint(6.0F, 16.0F, -3.0F);
        this.LeftFlipper.addCuboid(0.0F, 0.0F, -4.0F, 1, 12, 8, 0.0F);
        this.setRotateAngle(LeftFlipper, 0.0F, 0.5235987755982988F, -0.9599310885968813F);
        this.Tail1 = new ModelPart(this, 0, 23);
        this.Tail1.setRotationPoint(0.0F, 1.0F, 17.0F);
        this.Tail1.addCuboid(-4.0F, -2.0F, 0.0F, 8, 4, 12, 0.0F);
        this.setRotateAngle(Tail1, 0.17453292519943295F, 0.0F, 0.0F);
        this.Body = new ModelPart(this, 0, 39);
        this.Body.setRotationPoint(0.0F, 16.0F, -6.0F);
        this.Body.addCuboid(-6.0F, -3.5F, 0.0F, 12, 7, 18, 0.0F);
        this.setRotateAngle(Body, -0.2617993877991494F, 0.0F, 0.0F);
        this.Tail2 = new ModelPart(this, 0, 13);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail2.addCuboid(-8.0F, 0.0F, 0.0F, 16, 1, 6, 0.0F);
        this.setRotateAngle(Tail2, -0.08726646259971647F, 0.0F, 0.0F);
        this.RightFlipper = new ModelPart(this, 46, 26);
        this.RightFlipper.setRotationPoint(-6.0F, 16.0F, -3.0F);
        this.RightFlipper.addCuboid(-1.0F, 0.0F, -4.0F, 1, 12, 8, 0.0F);
        this.setRotateAngle(RightFlipper, 0.0F, -0.5235987755982988F, 0.9599310885968813F);
        this.Head = new ModelPart(this, 36, 0);
        this.Head.setRotationPoint(0.0F, -6.0F, -5.0F);
        this.Head.addCuboid(-3.0F, -5.0F, -4.0F, 6, 5, 8, 0.0F);
        this.setRotateAngle(Head, -0.4363323129985824F, 0.0F, 0.0F);
        this.Body.addChild(this.Tail1);
        this.Tail1.addChild(this.Tail2);
        this.Neck.addChild(this.Head);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Neck.render(f5);
        this.LeftFlipper.render(f5);
        this.Body.render(f5);
        this.RightFlipper.render(f5);
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
