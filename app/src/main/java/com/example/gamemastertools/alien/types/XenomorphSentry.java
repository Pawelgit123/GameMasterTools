package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphSentry extends AlienXenoCreature implements AlienXenoAttack {

    public XenomorphSentry(Parcel in) {
        super(in);
    }

    public XenomorphSentry() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            case 7: return "ASSESSING THE THREAT";
            case 2:
            default:return "ONE FOR ALL";
            case 3: return "ALL-OUT ATTACK";
            case 4: return "CAPTURE FOR THE HIVE";
            case 5: return "DIE FOR THE QUEEN";
            case 6: return "HEADBITE";
        }

    }

    @Override
    public String  makeAttackText(int roll) {

        switch (roll){
            case 1:
            case 7: return "The Xenomorph pauses, hissing quietly but all the more threatening for that. It looks like it's thinking, or maybe giving silent orders to unseen companions. Everyone within MEDIUM range gets +1 Stress level";
            case 2:
            default:return "The Xeno leaps at the largest group of enemies and roars a challenge, sweeping its arms, legs and tail through their ranks. All targets within SHORT range must succeed at a MOBILITY roll or be knocked off their feet, taking 1 point of damage. All the targets must make an immediate Panic Roll.";
            case 3: return "The Xenomorph launches into a wild attack, throwing every claw, fang and its pointed tail at its victim. It attacks with 12d6, Damage 2. The attack is armor piercing (AP)";
            case 4: return "The Xenomorph attack with its venom-spiked tail with 10d6, Damage 1. If the attack causes any damage, the Xeno pulls its punch so only 1 point of damage is inflicted, and the paralyzing venom takes effect. The victim must make a STAMINA roll - the number of successes rolled it the number of Rounds they can stay up, then they fall unconscious for 1 shift. The paralysis can removed with a shot of adrenaline (a MEDICAL AID roll using a Medkit).";
            case 5: return "The Xenomorph, desperate to protect its hive and Queen, leaps towards an enemy, eviscerating itself as it does so. Its acid blood showers everywhere: all targets within SHORT range of the Xeno suffer an immediate acid splash attack of 12d6. The Xeno dies, squealing.";
            case 6: return "The Xenomorph opens its outer jaws wide, and the deadly inner jaws lean out, gnashing in anticipation before snapping forwards. The attack has a strength of 9d6, Damage 2. If it causes any damage it automatically inflicts critical injury #64, killing the victim in one dreadful blow.";
        }

    }
}
