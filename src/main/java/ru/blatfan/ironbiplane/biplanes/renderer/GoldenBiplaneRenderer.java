package ru.blatfan.ironbiplane.biplanes.renderer;

import immersive_aircraft.client.render.entity.renderer.BiplaneEntityRenderer;
import immersive_aircraft.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.AircraftEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import ru.blatfan.ironbiplane.biplanes.entity.GoldenBiplaneEntity;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;

public class GoldenBiplaneRenderer extends BiplaneEntityRenderer<GoldenBiplaneEntity> {
    private static final ResourceLocation ID = ModBiplanes.locate("golden_biplane");
    
    private final ModelPartRenderHandler<GoldenBiplaneEntity> model = new ModelPartRenderHandler<>();
    
    @Override
    protected ResourceLocation getModelId() {
        return ID;
    }
    
    public GoldenBiplaneRenderer(EntityRendererProvider.Context context) {
        super(context);
    }
    
    @Override
    protected ModelPartRenderHandler<GoldenBiplaneEntity> getModel(AircraftEntity entity) {
        return model;
    }
}
