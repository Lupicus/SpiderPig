package com.lupicus.spig;

import org.apache.commons.lang3.tuple.Pair;

import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.FMLNetworkConstants;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "spig";

    public Main()
    {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST,
                () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event)
    {
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void setupClient(final FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityType.SPIDER, rm -> new SpiderPigRenderer(rm));
        RenderingRegistry.registerEntityRenderingHandler(EntityType.CAVE_SPIDER, rm -> new SpiderPigRenderer(rm));
    }
}
