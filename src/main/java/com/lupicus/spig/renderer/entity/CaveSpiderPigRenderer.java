package com.lupicus.spig.renderer.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CaveSpiderPigRenderer extends SpiderPigRenderer<CaveSpiderEntity>
{
    private static final Identifier TEXTURES = new Identifier("spig:textures/entity/cave_spider_pig.png");

    public CaveSpiderPigRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
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
