package com.overloaded.overloadedmod.entities;

import com.overloaded.overloadedmod.ModTools;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityDemonWizardMob extends EntityMob implements IBossDisplayData {


public EntityDemonWizardMob(World world) {

        super(world);

        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(3, new EntityAIWander(this, .3D));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class,  60.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    @Override
    public boolean isAIEnabled() {

        return true;

    }

    public void applyEntityAttributes() {

        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(.6D);
    }

    @Override
    protected boolean canDespawn() {
         return false;
    }

    @Override
    protected Item getDropItem() {
        return ModTools.antimatterGreatSword;
    }

    @Override
    protected int getExperiencePoints(EntityPlayer p_70693_1_) {
        this.experienceValue = (int)((float)this.experienceValue * 560.5F);
        return super.getExperiencePoints(p_70693_1_);
    }


}
