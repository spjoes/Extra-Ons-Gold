package com.du.projectnarwhal.entity;

import com.du.projectnarwhal.entity.models.ModelOctopus;
import com.du.projectnarwhal.entity.models.ModelPenguin;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SquidEntityModel;
import net.minecraft.util.Identifier;

public class OctopusRenderer extends MobEntityRenderer<OctopusEntity, ModelOctopus<OctopusEntity>> {

    public OctopusRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new ModelOctopus<>(), 1);
    }


    @Override
    protected Identifier getTexture(OctopusEntity octopusEntity)
    {
        return new Identifier("pnarwhal:textures/entity/octopus.png");
    }
}
