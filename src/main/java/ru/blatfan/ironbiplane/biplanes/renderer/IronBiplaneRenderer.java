package ru.blatfan.ironbiplane.biplanes.renderer;

import immersive_aircraft.client.render.entity.renderer.BiplaneEntityRenderer;
import immersive_aircraft.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.AircraftEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import ru.blatfan.ironbiplane.biplanes.entity.IronBiplaneEntity;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;

public class IronBiplaneRenderer extends BiplaneEntityRenderer<IronBiplaneEntity> {
    private static final ResourceLocation ID = ModBiplanes.locate("iron_biplane");
    
    private final ModelPartRenderHandler<IronBiplaneEntity> model = new ModelPartRenderHandler<>();
    
    @Override
    protected ResourceLocation getModelId() {
        return ID;
    }
    
    public IronBiplaneRenderer(EntityRendererProvider.Context context) {
        super(context);
    }
    
    @Override
    protected ModelPartRenderHandler<IronBiplaneEntity> getModel(AircraftEntity entity) {
        return model;
    }
}
