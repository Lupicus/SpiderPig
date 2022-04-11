package com.lupicus.spig;

import com.lupicus.spig.renderer.entity.CaveSpiderPigRenderer;
import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.entity.EntityType;

@Environment(EnvType.CLIENT)
public class MainClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
    	EntityRendererRegistry.INSTANCE.register(EntityType.SPIDER, SpiderPigRenderer::new);
    	EntityRendererRegistry.INSTANCE.register(EntityType.CAVE_SPIDER, CaveSpiderPigRenderer::new);
	}
}
