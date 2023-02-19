package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphCrusher extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphCrusher(Parcel in) {
        super(in);
    }

    public XenomorphCrusher() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll){
            case 1: return "CALL THE GUARD";
            case 2:
            default:return "CHARGE";
            case 3:
            case 7: return "BEASTLY BITE";
            case 4: return "CRUSHING BLOW";
            case 5: return "TAIL SPIKE";
            case 6: return "HEADBITE";
        }
    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1: return "The enormous Xenomorph lets out a shrill cry to help, calling d6 Soldiers to its defense. They reach the zone the following Round, then draw initiative and can act.";
            case 2:
            default:return "The target must make a MOBILITY roll (no action) or be crushed, being immediately BROKEN and suffering a random critical injury. Even if the victim makes the roll, they fall down and gain +1 Stress level.";
            case 3:
            case 7: return "The Xenomorph takes a huge bite from its victim. The attack is rolled with 10d6, Damage 1. If the attack causes any damage, it inflicts critical injury #61 even if the victim isn't BROKEN, triggering a Panic Roll.";
            case 4: return "The Xenomorph brings its entire weight down on the poor victim, who must make a MOBILITY roll at -2 (no action) or be crushed, immediately suffering 3 critical injuries (roll 3 times regardless of whether or not the victim is BROKEN). The victim is knocked to the ground and must make an immediate Panic Roll.";
            case 5: return "The tail impales the victim with terrible force. Roll for the attack using 10d6, Damage 1. The attack is armor piercing (AP). If the attack causes any damage it automatically triggers critical injury #66, killing them outright.";
            case 6: return "The Xenomorph opens its mouth wide an the inner jaws lash out. The attack uses 10d6, Damage 2. If it causes any damage the victim immediately suffers critical injury #64, killing them in one dreadful blow.";
        }
    }
}
