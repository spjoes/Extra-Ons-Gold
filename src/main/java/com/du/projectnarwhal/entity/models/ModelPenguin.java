package com.du.projectnarwhal.entity.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

/**
 * ModelPenguinB - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelPenguin<T extends Entity> extends EntityModel<T> {
    public ModelPart Head;
    public ModelPart Body;
    public ModelPart RightFoot;
    public ModelPart LeftFoot;
    public ModelPart Beak;
    public ModelPart Mouth;
    public ModelPart Hair;
    public ModelPart RightFlipper;
    public ModelPart LeftFlipper;

    public ModelPenguin() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelPart(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Body.addCuboid(-5.0F, 0.0F, -4.0F, 10, 10, 8, 0.0F);
        this.RightFlipper = new ModelPart(this, 0, 31);
        this.RightFlipper.setRotationPoint(-5.0F, 1.0F, 0.0F);
        this.RightFlipper.addCuboid(-1.0F, 0.0F, -3.5F, 1, 10, 7, 0.0F);
        this.Mouth = new ModelPart(this, 50, 3);
        this.Mouth.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.Mouth.addCuboid(-2.5F, 0.0F, -2.0F, 5, 1, 2, 0.0F);
        this.Hair = new ModelPart(this, 0, 61);
        this.Hair.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Hair.addCuboid(-2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F);
        this.setRotateAngle(Hair, -0.4363323129985824F, 0.0F, 0.0F);
        this.RightFoot = new ModelPart(this, 0, 48);
        this.RightFoot.setRotationPoint(2.0F, 23.0F, 0.0F);
        this.RightFoot.addCuboid(-2.5F, 0.0F, -8.0F, 5, 1, 10, 0.0F);
        this.setRotateAngle(RightFoot, 0.017453292519943295F, -0.4363323129985824F, 0.0F);
        this.LeftFlipper = new ModelPart(this, 0, 31);
        this.LeftFlipper.mirror = true;
        this.LeftFlipper.setRotationPoint(5.0F, 1.0F, 0.0F);
        this.LeftFlipper.addCuboid(0.0F, 0.0F, -3.5F, 1, 10, 7, 0.0F);
        this.LeftFoot = new ModelPart(this, 0, 48);
        this.LeftFoot.mirror = true;
        this.LeftFoot.setRotationPoint(-2.0F, 23.0F, 0.0F);
        this.LeftFoot.addCuboid(-2.5F, 0.0F, -8.0F, 5, 1, 10, 0.0F);
        this.setRotateAngle(LeftFoot, 0.017453292519943295F, 0.4363323129985824F, 0.0F);
        this.Beak = new ModelPart(this, 50, 0);
        this.Beak.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.Beak.addCuboid(-2.5F, -1.0F, -2.0F, 5, 1, 2, 0.0F);
        this.Head = new ModelPart(this, 0, 18);
        this.Head.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Head.addCuboid(-4.5F, -6.0F, -3.5F, 9, 6, 7, 0.0F);
        this.Body.addChild(this.RightFlipper);
        this.Head.addChild(this.Mouth);
        this.Head.addChild(this.Hair);
        this.Body.addChild(this.LeftFlipper);
        this.Head.addChild(this.Beak);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
        this.RightFoot.render(f5);
        this.LeftFoot.render(f5);
        this.Head.render(f5);
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
