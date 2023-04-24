package com.example.examplemod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class CigarEntity extends Monster {

    public CigarEntity(EntityType<? extends CigarEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static EntityType<?> createEntityType() {
        return EntityType.Builder.<CigarEntity>of(CigarEntity::new, MobCategory.MONSTER)
                .sized(0.6F, 1.8F)
                .build("cigar");
    }
}