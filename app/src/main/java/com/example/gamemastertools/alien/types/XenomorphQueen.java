package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphQueen extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphQueen(Parcel in) {
        super(in);
    }

    public XenomorphQueen() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll){
            case 1: return "CALL THE GUARD";
            case 2:
            case 3: return "BEASTLY BITE";
            case 4:
            default:return "CRUSHING BLOW";
            case 5:
            case 7: return "TAIL SPIKE";
            case 6: return "HEADBITE";
        }
    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1: return "The Queen lets out a shrill cry to help, calling d6 Sentries to its defense. They reach the zone the following Round, then draw initiative and can act.";
            case 2:
            case 3: return "The Queen takes a huge bite from its victim. The attack is rolled with 10d6, Damage 1. If the attack causes any damage, it inflicts critical injury #61 even if the victim isn't BROKEN, triggering a Panic Roll.";
            case 4:
            default:return "The Queen brings its entire weight down on the poor victim, who must make a MOBILITY roll at -2 (no action) or be crushed, immediately suffering 3 critical injuries (roll 3 times regardless of whether or not the victim is BROKEN). The victim is knocked to the ground and must make an immediate Panic Roll.";
            case 5:
            case 7: return "The tail impales the victim with terrible force. Roll for the attack using 14d6, Damage 1. The attack is armor piercing (AP). If the attack causes any damage it automatically triggers critical injury #66, killing them outright.";
            case 6: return "The Queen opens its mouth wide an the inner jaws lash out. The attack uses 10d6, Damage 2. If it causes any damage the victim immediately suffers critical injury #64, killing them in one dreadful blow.";
        }
    }
}
