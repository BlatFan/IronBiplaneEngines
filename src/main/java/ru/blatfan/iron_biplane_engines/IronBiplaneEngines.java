package ru.blatfan.iron_biplane_engines;

import immersive_aircraft.Items;
import immersive_aircraft.cobalt.registration.Registration;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

import java.util.function.Supplier;

@Mod(IronBiplaneEngines.MODID)
@Mod.EventBusSubscriber(modid = IronBiplaneEngines.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IronBiplaneEngines {
    private static boolean registered = false;
    
    public static final String MODID = "iron_biplane_engines";
    
    public IronBiplaneEngines() {
    }
    
    public static Supplier<Item> COPPER_ENGINE;
    public static Supplier<Item> IRON_ENGINE;
    public static Supplier<Item> GOLDEN_ENGINE;
    public static Supplier<Item> DIAMOND_ENGINE;
    public static Supplier<Item> NETHERITE_ENGINE;
    
    public static Supplier<Item> BLATIUM_ENGINE;
    public static Supplier<Item> NLIUM_ENGINE;
    
    public static void init() {
        COPPER_ENGINE = register("copper_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        IRON_ENGINE = register("iron_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        GOLDEN_ENGINE = register("golden_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        DIAMOND_ENGINE = register("diamond_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        NETHERITE_ENGINE = register("netherite_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        if(ModList.get().isLoaded("blatium")) {
            BLATIUM_ENGINE = register("blatium_engine", () -> new Item(new Item.Properties().stacksTo(1)));
            NLIUM_ENGINE = register("nlium_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        }
    }
    
    static Supplier<Item> register(String name, Supplier<Item> item) {
        Supplier<Item> register = Registration.register(BuiltInRegistries.ITEM, locate(name), item);
        Items.items.add(register);
        return register;
    }
    
    public static ResourceLocation locate(String name) {
        return new ResourceLocation(IronBiplaneEngines.MODID, name);
    }
    
    @SubscribeEvent
    public static void onRegistryEvent(RegisterEvent event) {
        if (!registered) {
            registered = true;
            init();
        }
    }
}
