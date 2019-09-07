package com.du.projectnarwhal.entity.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

/**
 * ModelBerb - 
 * Created using Tabula 7.0.0
 */
public class ModelBird<T extends Entity> extends EntityModel<T> {
    public ModelPart Body;
    public ModelPart Head;
    public ModelPart RightWing;
    public ModelPart LeftWing;
    public ModelPart RightFoot;
    public ModelPart LeftFoot;
    public ModelPart Tail;
    public ModelPart Beak;
    public ModelPart Hair;

    public ModelBird() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Body = new ModelPart(this, 0, 24);
        this.Body.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.Body.addCuboid(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Body, 0.5235987755982988F, 0.0F, 0.0F);
        this.Tail = new ModelPart(this, 0, 19);
        this.Tail.setRotationPoint(0.0F, 4.5F, 1.75F);
        this.Tail.addCuboid(-1.5F, 0.0F, -0.5F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Tail, -0.7853981633974483F, 0.0F, 0.0F);
        this.Beak = new ModelPart(this, 0, 10);
        this.Beak.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Beak.addCuboid(-0.5F, 0.0F, -3.5F, 1, 1, 2, 0.0F);
        this.RightFoot = new ModelPart(this, 0, 7);
        this.RightFoot.setRotationPoint(-1.0F, 22.0F, 1.5F);
        this.RightFoot.addCuboid(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFoot, 0.3490658503988659F, 0.0F, 0.0F);
        this.LeftFoot = new ModelPart(this, 0, 7);
        this.LeftFoot.setRotationPoint(1.0F, 22.0F, 1.5F);
        this.LeftFoot.addCuboid(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFoot, 0.3490658503988659F, 0.0F, 0.0F);
        this.RightWing = new ModelPart(this, 12, 25);
        this.RightWing.setRotationPoint(-2.0F, 17.5F, 0.0F);
        this.RightWing.addCuboid(-0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(RightWing, 0.7853981633974483F, 0.17453292519943295F, 0.0F);
        this.Hair = new ModelPart(this, 7, 20);
        this.Hair.setRotationPoint(0.0F, -1.5F, 1.5F);
        this.Hair.addCuboid(-1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F);
        this.setRotateAngle(Hair, -0.7853981633974483F, 0.0F, 0.0F);
        this.LeftWing = new ModelPart(this, 12, 25);
        this.LeftWing.setRotationPoint(2.0F, 17.5F, 0.0F);
        this.LeftWing.addCuboid(-0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(LeftWing, 0.7853981633974483F, -0.17453292519943295F, 0.0F);
        this.Head = new ModelPart(this, 0, 13);
        this.Head.setRotationPoint(0.0F, 16.5F, -0.5F);
        this.Head.addCuboid(-1.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
        this.Body.addChild(this.Tail);
        this.Head.addChild(this.Beak);
        this.Head.addChild(this.Hair);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
        this.RightFoot.render(f5);
        this.LeftFoot.render(f5);
        this.RightWing.render(f5);
        this.LeftWing.render(f5);
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
