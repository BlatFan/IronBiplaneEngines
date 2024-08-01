package ru.blatfan.ironbiplane.biplanes.renderer;

import immersive_aircraft.client.render.entity.renderer.BiplaneEntityRenderer;
import immersive_aircraft.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.AircraftEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import ru.blatfan.ironbiplane.biplanes.entity.CopperBiplaneEntity;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;

public class CopperBiplaneRenderer extends BiplaneEntityRenderer<CopperBiplaneEntity> {
    private static final ResourceLocation ID = ModBiplanes.locate("copper_biplane");
    
    private final ModelPartRenderHandler<CopperBiplaneEntity> model = new ModelPartRenderHandler<>();
    
    @Override
    protected ResourceLocation getModelId() {
        return ID;
    }
    
    public CopperBiplaneRenderer(EntityRendererProvider.Context context) {
        super(context);
    }
    
    @Override
    protected ModelPartRenderHandler<CopperBiplaneEntity> getModel(AircraftEntity entity) {
        return model;
    }
}
