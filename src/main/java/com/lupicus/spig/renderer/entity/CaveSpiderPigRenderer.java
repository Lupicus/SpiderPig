package com.lupicus.spig.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CaveSpiderPigRenderer extends SpiderPigRenderer<CaveSpider>
{
    private static final ResourceLocation TEXTURES = new ResourceLocation("spig:textures/entity/cave_spider_pig.png");

    public CaveSpiderPigRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn);
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
