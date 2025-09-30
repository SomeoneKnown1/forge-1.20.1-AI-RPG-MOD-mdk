package net.ianhwang.ai_rpg_mod.entity.custom;

import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.piglin.AbstractPiglin;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class EvilAIBotEntity extends WitherSkeleton{
    public EvilAIBotEntity(EntityType<? extends WitherSkeleton> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(0,new FloatGoal(this));
        this.goalSelector.addGoal(1,new NearestAttackableTargetGoal<>(this, AbstractClientPlayer.class,false));
        this.goalSelector.addGoal(2,new WaterAvoidingRandomStrollGoal(this,1.1D));
        this.goalSelector.addGoal(3,new RandomLookAroundGoal(this));


    }

    public static AttributeSupplier.Builder createAttributes(){
        return WitherSkeleton.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 25D)
                .add(Attributes.ATTACK_DAMAGE,5f)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f)
                .add(Attributes.ARMOR_TOUGHNESS, 0.1f);
    }
    //@Override
    //protected void dropCustomDeathLoot(DamageSource pSource, int pLooting, boolean pRecentlyHit)
    @Override
    protected void populateDefaultEquipmentSlots(RandomSource pRandom, DifficultyInstance pDifficulty) {
        super.populateDefaultEquipmentSlots(pRandom, pDifficulty);
    }
}
