package ru.blatfan.ironbiplane;

import immersive_aircraft.cobalt.registration.Registration;
import immersive_aircraft.forge.CommonForge;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;
import ru.blatfan.ironbiplane.biplanes.renderer.*;

@Mod(IronBiplane.MODID)
@Mod.EventBusSubscriber(modid = IronBiplane.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IronBiplane {
    private static boolean registered = false;
    
    public static final String MODID = "iron_biplane";
    public static final Logger LOGGER = LoggerFactory.getLogger("Iron Biplane");
    
    public IronBiplane() {
    }
    
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void setup(EntityRenderersEvent.RegisterRenderers event) {
            Registration.register(ModBiplanes.COPPER_BIPLANE_ENTITY.get(), CopperBiplaneRenderer::new);
            Registration.register(ModBiplanes.IRON_BIPLANE_ENTITY.get(), IronBiplaneRenderer::new);
            Registration.register(ModBiplanes.GOLDEN_BIPLANE_ENTITY.get(), GoldenBiplaneRenderer::new);
            Registration.register(ModBiplanes.DIAMOND_BIPLANE_ENTITY.get(), DiamondBiplaneRenderer::new);
            Registration.register(ModBiplanes.NETHERITE_BIPLANE_ENTITY.get(), NetheriteBiplaneRenderer::new);
        }
    }
    @SubscribeEvent
    public static void onRegistryEvent(RegisterEvent event) {
        if (!registered) {
            registered = true;
            ModBiplanes.init();
        }
    }
}
