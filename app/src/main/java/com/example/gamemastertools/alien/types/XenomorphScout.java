package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphScout extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphScout(Parcel in) {
        super(in);
    }

    public XenomorphScout() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            case 7:
            default:return "HYPNOTIZING GAZE";
            case 2: return "PLAYING WITH ITS PREY";
            case 3: return "DEADLY GRAB";
            case 4: return "READY TO KILL";
            case 5: return "CAPTURE FOR THE HIVE";
            case 6: return "HEADBITE";
        }

    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1:
            case 7:
            default:return "The Xenomorph, eyeless as it may seem, stares deeply into the soul of its victim. The victim is mesmerized by the dread beauty of such a beast. They stand in awe of what nature, or god, or the devil has created, get +1 Stress level and must make an immediate Panic Roll.";
            case 2: return "The Xeno attacks, but not to kill. The target is knocked to the ground and drops all hand-held items, but otherwise takes no damage. The Xenomorph stands over them, taunting its prey to run so the game can go on. The victim gets +1 Stress level and must make an immediate Panic Roll.";
            case 3: return "The beast launches through the air, grabbing its victim. It attacks with 10d6, Damage 1. If it hits it immediately drags them into a neighboring zone, dumping them on the floor. The victim is prone, drops all hand-held items and must make an immediate Panic Roll.";
            case 4: return "The Xenomorph grabs its victim, its inner jaws poised to strike. Roll the attack with 10d6. If it hits, the victim counts as grabbed (pg.93) and needs to make an opposed CLOSE COMBAT roll against 10d6 to break lose. The victim and all friendly characters in the same zone must make Panic Rolls. Unless the victim breaks free, the Xenomorph will use a HEADBITE attack against them on its next initiative.";
            case 5: return "The Xenomorph attack with its venom-spiked tail with 10d6, Damage 1. If the attack causes any damage, the Xeno pulls its punch so only 1 point of damage is inflicted, and the paralyzing venom takes effect. The victim must make a STAMINA roll - the number of successes rolled it the number of Rounds they can stay up, then they fall unconscious for 1 shift. The paralysis can removed with a shot of adrenaline (a MEDICAL AID roll using a Medkit).";
            case 6: return "The Xenomorph opens its outer jaws wide, and the deadly inner jaws lean out, gnashing in anticipation before snapping forwards. The attack has a strength of 9d6, Damage 2. If it causes any damage it automatically inflicts critical injury #64, killing the victim in one dreadful blow. However, should the GM wish it, the victim remains just alive enough for the Xenomorph to initiate the ovomorping process.";
        }

    }
}
