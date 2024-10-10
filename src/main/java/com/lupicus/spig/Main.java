package com.lupicus.spig;

import com.lupicus.spig.renderer.entity.CaveSpiderPigRenderer;
import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.minecraft.world.entity.EntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "spig";

    public Main(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.register(this);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event)
    {
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void setupClient(final FMLClientSetupEvent event)
    {
    }

    @EventBusSubscriber(bus = Bus.MOD)
    public static class ModEvents
    {
        @SubscribeEvent
        public static void onRenderers(final RegisterRenderers event)
        {
        	event.registerEntityRenderer(EntityType.SPIDER, SpiderPigRenderer::new);
        	event.registerEntityRenderer(EntityType.CAVE_SPIDER, CaveSpiderPigRenderer::new);
        }
    }
}
