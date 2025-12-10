package com.lupicus.spig.renderer.entity;

import com.lupicus.spig.ClientInit;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.monster.spider.CaveSpider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CaveSpiderPigRenderer extends SpiderPigRenderer<CaveSpider>
{
    private static final Identifier TEXTURES = Identifier.parse("spig:textures/entity/cave_spider_pig.png");

    public CaveSpiderPigRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, ClientInit.PIG70);
        this.shadowRadius = 0.56F;
    }

    @Override
    public Identifier getTextureLocation(LivingEntityRenderState state) {
        return TEXTURES;
    }
}
