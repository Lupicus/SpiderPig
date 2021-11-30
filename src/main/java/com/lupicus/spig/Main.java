package com.lupicus.spig;

import com.lupicus.spig.renderer.entity.CaveSpiderPigRenderer;
import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.IExtensionPoint.DisplayTest;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkConstants;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "spig";

    public Main()
    {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        ModLoadingContext.get().registerExtensionPoint(DisplayTest.class,
        		() -> new DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));
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

    @Mod.EventBusSubscriber(bus = Bus.MOD)
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
