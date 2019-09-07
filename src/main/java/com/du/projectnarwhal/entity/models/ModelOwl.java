package com.du.projectnarwhal.entity.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

/**
 * ModelOwl - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelOwl<T extends Entity> extends EntityModel<T> {
    public ModelPart Body;
    public ModelPart Head;
    public ModelPart RightWing;
    public ModelPart LeftWing;
    public ModelPart RightFoot;
    public ModelPart LeftFoot;
    public ModelPart Tail;
    public ModelPart Cheeks;
    public ModelPart Beak;

    public ModelOwl() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.RightWing = new ModelPart(this, 0, 0);
        this.RightWing.setRotationPoint(-3.0F, 18.0F, 0.0F);
        this.RightWing.addCuboid(-1.0F, 0.0F, -2.5F, 1, 6, 5, 0.0F);
        this.RightFoot = new ModelPart(this, 0, 16);
        this.RightFoot.setRotationPoint(-2.0F, -0.1F, 2.0F);
        this.RightFoot.addCuboid(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RightFoot, 0.0F, 0.2617993877991494F, 0.0F);
        this.LeftFoot = new ModelPart(this, 0, 16);
        this.LeftFoot.mirror = true;
        this.LeftFoot.setRotationPoint(2.0F, -0.1F, 2.0F);
        this.LeftFoot.addCuboid(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LeftFoot, 0.0F, -0.2617993877991494F, 0.0F);
        this.Cheeks = new ModelPart(this, 22, 25);
        this.Cheeks.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cheeks.addCuboid(-5.5F, -6.0F, -2.5F, 11, 6, 1, 0.0F);
        this.Beak = new ModelPart(this, 10, 0);
        this.Beak.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Beak.addCuboid(-1.5F, -2.0F, -4.0F, 3, 1, 1, 0.0F);
        this.Head = new ModelPart(this, 12, 0);
        this.Head.setRotationPoint(0.0F, 18.5F, 0.0F);
        this.Head.addCuboid(-3.5F, -5.0F, -3.0F, 7, 5, 6, 0.0F);
        this.Tail = new ModelPart(this, 0, 11);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail.addCuboid(-2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Tail, 0.4363323129985824F, 0.0F, 0.0F);
        this.Body = new ModelPart(this, 0, 22);
        this.Body.setRotationPoint(0.0F, 23.5F, -2.5F);
        this.Body.addCuboid(-3.0F, -5.0F, 0.0F, 6, 5, 5, 0.0F);
        this.LeftWing = new ModelPart(this, 0, 0);
        this.LeftWing.setRotationPoint(3.0F, 18.0F, 0.0F);
        this.LeftWing.addCuboid(0.0F, 0.0F, -2.5F, 1, 6, 5, 0.0F);
        this.Body.addChild(this.RightFoot);
        this.Body.addChild(this.LeftFoot);
        this.Head.addChild(this.Cheeks);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.Tail);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.RightWing.render(f5);
        this.Head.render(f5);
        this.Body.render(f5);
        this.LeftWing.render(f5);
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
