package ru.blatfan.ironbiplane.biplanes.entity;

import immersive_aircraft.entity.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;

public class GoldenBiplaneEntity extends BiplaneEntity {
    public GoldenBiplaneEntity(EntityType<? extends AircraftEntity> entityType, Level world) {
        super(entityType, world);
    }
    
    @Override
    protected float getBrakeFactor() {
        return 0.7f;
    }
    
    @Override
    public Item asItem() {
        return (Item) ModBiplanes.GOLDEN_BIPLANE_ITEM.get();
    }
}
