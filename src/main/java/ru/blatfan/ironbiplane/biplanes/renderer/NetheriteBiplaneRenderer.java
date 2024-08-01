package ru.blatfan.ironbiplane.biplanes.renderer;

import immersive_aircraft.client.render.entity.renderer.BiplaneEntityRenderer;
import immersive_aircraft.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.AircraftEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;
import ru.blatfan.ironbiplane.biplanes.entity.NetheriteBiplaneEntity;

public class NetheriteBiplaneRenderer extends BiplaneEntityRenderer<NetheriteBiplaneEntity> {
    private static final ResourceLocation ID = ModBiplanes.locate("netherite_biplane");
    
    private final ModelPartRenderHandler<NetheriteBiplaneEntity> model = new ModelPartRenderHandler<>();
    
    @Override
    protected ResourceLocation getModelId() {
        return ID;
    }
    
    public NetheriteBiplaneRenderer(EntityRendererProvider.Context context) {
        super(context);
    }
    
    @Override
    protected ModelPartRenderHandler<NetheriteBiplaneEntity> getModel(AircraftEntity entity) {
        return model;
    }
}
