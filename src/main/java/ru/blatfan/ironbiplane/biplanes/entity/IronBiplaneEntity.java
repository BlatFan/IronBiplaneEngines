package ru.blatfan.ironbiplane.biplanes.entity;

import immersive_aircraft.entity.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;

public class IronBiplaneEntity extends BiplaneEntity {
    public IronBiplaneEntity(EntityType<? extends AircraftEntity> entityType, Level world) {
        super(entityType, world);
    }
    
    @Override
    protected float getBrakeFactor() {
        return 0.8f;
    }
    
    @Override
    public Item asItem() {
        return (Item) ModBiplanes.IRON_BIPLANE_ITEM.get();
    }
}
