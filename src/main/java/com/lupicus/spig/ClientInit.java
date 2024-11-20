package com.lupicus.spig;

import com.lupicus.spig.renderer.entity.CaveSpiderPigRenderer;
import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.minecraft.client.model.PigModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.MeshTransformer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class ClientInit
{
    public static final ModelLayerLocation PIG70 = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Main.MODID, "pig70"), "main");

    @SubscribeEvent
    public static void onRenderers(final RegisterRenderers event)
    {
    	event.registerEntityRenderer(EntityType.SPIDER, SpiderPigRenderer::new);
    	event.registerEntityRenderer(EntityType.CAVE_SPIDER, CaveSpiderPigRenderer::new);
    }

    @SubscribeEvent
    public static void onLayerDef(final RegisterLayerDefinitions event)
    {
    	event.registerLayerDefinition(PIG70, () -> PigModel.createBodyLayer(CubeDeformation.NONE).apply(MeshTransformer.scaling(0.7F)));
    }
}
