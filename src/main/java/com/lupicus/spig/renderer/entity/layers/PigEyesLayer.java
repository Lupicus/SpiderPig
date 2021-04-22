package com.lupicus.spig.renderer.entity.layers;

import com.lupicus.spig.Main;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.AbstractEyesLayer;
import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PigEyesLayer<T extends MobEntity, M extends PigModel<T>> extends AbstractEyesLayer<T, M>
{
    private static final RenderType RENDER_TYPE = RenderType.getEyes(new ResourceLocation(Main.MODID, "textures/entity/pig_eyes.png"));

    public PigEyesLayer(IEntityRenderer<T, M> renderer) {
        super(renderer);
    }

    @Override
    public RenderType getRenderType() {
        return RENDER_TYPE;
    }
}
