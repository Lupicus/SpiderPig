package com.lupicus.spig.renderer.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CaveSpiderPigRenderer extends SpiderPigRenderer<CaveSpiderEntity>
{
    private static final Identifier TEXTURES = new Identifier("spig:textures/entity/cave_spider_pig.png");

    public CaveSpiderPigRenderer(EntityRenderDispatcher renderManagerIn, EntityRendererRegistry.Context ctx) {
        super(renderManagerIn, ctx);
        this.shadowRadius *= 0.7F;
    }

    @Override
    protected void scale(CaveSpiderEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(0.7F, 0.7F, 0.7F);
    }

    @Override
    public Identifier getTexture(CaveSpiderEntity entity) {
        return TEXTURES;
    }
}
