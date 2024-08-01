package ru.blatfan.ironbiplane.biplanes;

import immersive_aircraft.Items;
import immersive_aircraft.cobalt.registration.Registration;
import immersive_aircraft.item.AircraftItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;
import ru.blatfan.ironbiplane.IronBiplane;
import ru.blatfan.ironbiplane.biplanes.entity.*;

import java.util.function.Supplier;

import static immersive_aircraft.Items.baseProps;

public class ModBiplanes {
    
    public static Supplier<Item> COPPER_BIPLANE_ITEM;
    public static Supplier<Item> COPPER_ENGINE;
    public static Supplier<EntityType<CopperBiplaneEntity>> COPPER_BIPLANE_ENTITY;
    
    public static Supplier<Item> IRON_BIPLANE_ITEM;
    public static Supplier<Item> IRON_ENGINE;
    public static Supplier<EntityType<IronBiplaneEntity>> IRON_BIPLANE_ENTITY;
    
    public static Supplier<Item> GOLDEN_BIPLANE_ITEM;
    public static Supplier<Item> GOLDEN_ENGINE;
    public static Supplier<EntityType<GoldenBiplaneEntity>> GOLDEN_BIPLANE_ENTITY;
    
    public static Supplier<Item> DIAMOND_BIPLANE_ITEM;
    public static Supplier<Item> DIAMOND_ENGINE;
    public static Supplier<EntityType<DiamondBiplaneEntity>> DIAMOND_BIPLANE_ENTITY;
    
    public static Supplier<Item> NETHERITE_BIPLANE_ITEM;
    public static Supplier<Item> NETHERITE_ENGINE;
    public static Supplier<EntityType<NetheriteBiplaneEntity>> NETHERITE_BIPLANE_ENTITY;
    
    public static Supplier<Item> BLATIUM_ENGINE;
    public static Supplier<Item> NLIUM_ENGINE;
    
    public static void init() {
        // Register COPPER_BIPLANE
        COPPER_BIPLANE_ITEM = register("copper_biplane", () -> new AircraftItem(baseProps().stacksTo(1), world -> new CopperBiplaneEntity(COPPER_BIPLANE_ENTITY.get(), world)));
        COPPER_ENGINE = register("copper_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        COPPER_BIPLANE_ENTITY = register("copper_biplane", EntityType.Builder
            .of(CopperBiplaneEntity::new, MobCategory.MISC)
            .sized(1.75f, 0.85f)
            .clientTrackingRange(12)
            .fireImmune()
        );
        IronBiplane.LOGGER.info("COPPER_BIPLANE registered");
        
        // Register IRON_BIPLANE
        IRON_BIPLANE_ITEM = register("iron_biplane", () -> new AircraftItem(baseProps().stacksTo(1), world -> new IronBiplaneEntity(IRON_BIPLANE_ENTITY.get(), world)));
        IRON_ENGINE = register("iron_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        IRON_BIPLANE_ENTITY = register("iron_biplane", EntityType.Builder
            .of(IronBiplaneEntity::new, MobCategory.MISC)
            .sized(1.75f, 0.85f)
            .clientTrackingRange(12)
            .fireImmune()
        );
        IronBiplane.LOGGER.info("IRON_BIPLANE registered");
        
        // Register GOLDEN_BIPLANE
        GOLDEN_BIPLANE_ITEM = register("golden_biplane", () -> new AircraftItem(baseProps().stacksTo(1), world -> new GoldenBiplaneEntity(GOLDEN_BIPLANE_ENTITY.get(), world)));
        GOLDEN_ENGINE = register("golden_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        GOLDEN_BIPLANE_ENTITY = register("golden_biplane", EntityType.Builder
            .of(GoldenBiplaneEntity::new, MobCategory.MISC)
            .sized(1.75f, 0.85f)
            .clientTrackingRange(12)
            .fireImmune()
        );
        IronBiplane.LOGGER.info("GOLDEN_BIPLANE registered");
        
        // Register DIAMOND_BIPLANE
        
        DIAMOND_BIPLANE_ITEM = register("diamond_biplane", () -> new AircraftItem(baseProps().stacksTo(1), world -> new DiamondBiplaneEntity(DIAMOND_BIPLANE_ENTITY.get(), world)));
        DIAMOND_ENGINE = register("diamond_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        DIAMOND_BIPLANE_ENTITY = register("diamond_biplane", EntityType.Builder
            .of(DiamondBiplaneEntity::new, MobCategory.MISC)
            .sized(1.75f, 0.85f)
            .clientTrackingRange(12)
            .fireImmune()
        );
        IronBiplane.LOGGER.info("DIAMOND_BIPLANE registered");
        
        // Register NETHERITE_BIPLANE
        NETHERITE_BIPLANE_ITEM = register("netherite_biplane", () -> new AircraftItem(baseProps().stacksTo(1), world -> new NetheriteBiplaneEntity(NETHERITE_BIPLANE_ENTITY.get(), world)));
        NETHERITE_ENGINE = register("netherite_engine", () -> new Item(new Item.Properties().stacksTo(1)));
        NETHERITE_BIPLANE_ENTITY = register("netherite_biplane", EntityType.Builder
            .of(NetheriteBiplaneEntity::new, MobCategory.MISC)
            .sized(1.75f, 0.85f)
            .clientTrackingRange(12)
            .fireImmune()
        );
        IronBiplane.LOGGER.info("NETHERITE_BIPLANE registered");
        
        // Register Blatium mod addon
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
    
    static <T extends Entity> Supplier<EntityType<T>> register(String name, EntityType.Builder<T> builder) {
        ResourceLocation id = locate(name);
        return Registration.register(BuiltInRegistries.ENTITY_TYPE, id, () -> builder.build(id.toString()));
    }
    
    public static ResourceLocation locate(String name) {
        return new ResourceLocation(IronBiplane.MODID, name);
    }
}
