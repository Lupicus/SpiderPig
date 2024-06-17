package com.lupicus.spig.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.CaveSpider;

@Environment(EnvType.CLIENT)
public class CaveSpiderPigRenderer extends SpiderPigRenderer<CaveSpider>
{
    private static final ResourceLocation TEXTURES = ResourceLocation.parse("spig:textures/entity/cave_spider_pig.png");

    public CaveSpiderPigRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
        this.shadowRadius *= 0.7F;
    }

    @Override
    protected void scale(CaveSpider entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(0.7F, 0.7F, 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(CaveSpider entity) {
        return TEXTURES;
    }
}
