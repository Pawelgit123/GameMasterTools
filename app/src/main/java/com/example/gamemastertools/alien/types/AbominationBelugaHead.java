package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationBelugaHead extends AlienXenoCreature implements AlienXenoAttack {

    public AbominationBelugaHead(Parcel in) {
        super(in);
    }

    public AbominationBelugaHead() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll){
            case 1: return "HORRIBLE ROAR";
            case 2:
            case 7: return "FIST STRIKE";
            case 3: return "THROW";
            case 4:
            default:return "POUNCE";
            case 5: return "ARM PULL";
            case 6: return "HEADCRUSH";
        }
    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1: return "The Abomination scream in fury. All humans in SHORT range must make an immediate Panic Roll.";
            case 2:
            case 7: return "The Abomination strikes its victim with a powerful punch. Roll for the attack with 10d6, Damage 1.";
            case 3: return "The Abomination grabs the victim and tries to slam it into the nearest hard surface. Roll for the attack using 9d6, Damage 1. If the attack hits, the victim lands prone at SHORT range from the Abomination, drops any hand-held items, and must make an immediate Panic Roll.";
            case 4:
            default:return "The Abomination leaps onto its victim like a big monkey. Roll for the attack using 8d6, Damage 1. If the attack hits, the victim is knocked to the ground, drops any hand-held items, and must make an immediate Panic Roll. The Abomination then starts pounding the victim with its powerful fists. This is resolved as an immediate bonus attack with 12d6, Damage 2.";
            case 5: return "The Abomination grabs the victim's arm and tries to pull it clean off with its bare hands. Roll for the attack using 6d6, Damage 1. If the attack cause damage, it automatically triggers injury #54 (even if the victim is not BROKEN), triggers immediate Panic Roll.";
            case 6: return "The Abomination grabs the victim's head and tries to crush it with its bare hands. Roll for the attack using 7d6, Damage 1. If the attack cause damage, it automatically triggers critical injury #64 (even if the victim is not BROKEN), killing the victim outright.";
        }

    }
}
