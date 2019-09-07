package com.du.projectnarwhal.entity;

import com.du.projectnarwhal.entity.models.ModelSeaLion;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.util.Identifier;

public class SeaLionRenderer extends MobEntityRenderer<SeaLionEntity, ModelSeaLion<SeaLionEntity>> {

    public SeaLionRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new ModelSeaLion<>(), 1);
    }


    @Override
    protected Identifier getTexture(SeaLionEntity seaLionEntity)
    {
        return new Identifier("pnarwhal:textures/entity/sealion.png");
    }
}
