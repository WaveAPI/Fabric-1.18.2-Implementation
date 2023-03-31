package org.waveapi.content.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.world.World;
import org.waveapi.api.world.entity.EntityBase;

public class EntityWrap extends Entity {

    public final EntityBase entity;

    public EntityWrap(EntityType<?> type, World world, EntityBase base) {
        super(type, world);
        this.entity = base;
    }

    @Override
    protected void initDataTracker() {

    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {

    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {

    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        return entity.onDamage(new org.waveapi.api.world.entity.DamageSource(source), amount);
    }

    @Override
    public boolean handleAttack(Entity attacker) {
        return entity.handleAttack();
    }
}
