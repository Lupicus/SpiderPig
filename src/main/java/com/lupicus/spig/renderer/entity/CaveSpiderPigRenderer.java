package com.lupicus.spig.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CaveSpiderPigRenderer extends SpiderPigRenderer<CaveSpiderEntity>
{
    private static final ResourceLocation TEXTURES = new ResourceLocation("spig:textures/entity/cave_spider_pig.png");

    public CaveSpiderPigRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
        this.shadowSize *= 0.7F;
    }

    @Override
    protected void preRenderCallback(CaveSpiderEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(0.7F, 0.7F, 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(CaveSpiderEntity entity) {
        return TEXTURES;
    }
}
