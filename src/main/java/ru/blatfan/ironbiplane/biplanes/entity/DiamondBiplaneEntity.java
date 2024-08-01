package ru.blatfan.ironbiplane.biplanes.entity;

import immersive_aircraft.entity.AircraftEntity;
import immersive_aircraft.entity.BiplaneEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import ru.blatfan.ironbiplane.biplanes.ModBiplanes;

public class DiamondBiplaneEntity extends BiplaneEntity {
    public DiamondBiplaneEntity(EntityType<? extends AircraftEntity> entityType, Level world) {
        super(entityType, world);
    }
    
    @Override
    protected float getBrakeFactor() {
        return 0.6f;
    }
    
    @Override
    public Item asItem() {
        return (Item) ModBiplanes.DIAMOND_BIPLANE_ITEM.get();
    }
}
