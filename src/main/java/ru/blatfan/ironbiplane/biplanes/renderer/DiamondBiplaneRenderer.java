package ru.blatfan.ironbiplane.biplanes.renderer;

import immersive_aircraft.client.render.entity.renderer.BiplaneEntityRenderer;
import immersive_aircraft.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.AircraftEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;
import ru.blatfan.ironbiplane.biplanes.entity.DiamondBiplaneEntity;
import ru.blatfan.ironbiplane.biplanes.entity.GoldenBiplaneEntity;

public class DiamondBiplaneRenderer extends BiplaneEntityRenderer<DiamondBiplaneEntity> {
    private static final ResourceLocation ID = ModBiplanes.locate("diamond_biplane");
    
    private final ModelPartRenderHandler<DiamondBiplaneEntity> model = new ModelPartRenderHandler<>();
    
    @Override
    protected ResourceLocation getModelId() {
        return ID;
    }
    
    public DiamondBiplaneRenderer(EntityRendererProvider.Context context) {
        super(context);
    }
    
    @Override
    protected ModelPartRenderHandler<DiamondBiplaneEntity> getModel(AircraftEntity entity) {
        return model;
    }
}
