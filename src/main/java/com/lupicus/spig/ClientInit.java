package com.lupicus.spig;

import com.lupicus.spig.renderer.entity.CaveSpiderPigRenderer;
import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.minecraft.client.model.animal.pig.PigModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.MeshTransformer;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityTypes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;

@EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT)
public class ClientInit
{
    public static final ModelLayerLocation PIG70 = new ModelLayerLocation(Identifier.fromNamespaceAndPath(Main.MODID, "pig70"), "main");

    @SubscribeEvent
    public static void onRenderers(final RegisterRenderers event)
    {
    	event.registerEntityRenderer(EntityTypes.SPIDER, SpiderPigRenderer::new);
    	event.registerEntityRenderer(EntityTypes.CAVE_SPIDER, CaveSpiderPigRenderer::new);
    }

    @SubscribeEvent
    public static void onLayerDef(final RegisterLayerDefinitions event)
    {
    	event.registerLayerDefinition(PIG70, () -> PigModel.createBodyLayer(CubeDeformation.NONE).apply(MeshTransformer.scaling(0.7F)));
    }
}
