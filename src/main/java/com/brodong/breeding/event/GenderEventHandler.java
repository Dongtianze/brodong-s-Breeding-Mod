package com.brodong.breeding.event;

import com.brodong.breeding.capability.IGenderCapability;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraftforge.event.AttachCapabilitiesEvent;

public class GenderEventHandler {
    void registerGenderCapability(AttachCapabilitiesEvent<Entity> event)
    {
        Entity entity = event.getObject();
        if(entity instanceof Animal) {

        }
    }
}
