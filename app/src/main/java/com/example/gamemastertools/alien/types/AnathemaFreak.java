package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AnathemaFreak extends AlienXenoCreature implements AlienXenoAttack {

    public AnathemaFreak(Parcel in) {
        super(in);
    }

    public AnathemaFreak() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll) {
            case 1:
            default:
                return "HORRIFIC HOWL";
            case 2:
            case 7:
                return "FIST STRIKE";
            case 3:
                return "EYE GOUGE";
            case 4:
                return "BEAT DOWN";
            case 5:
                return "BEARHUG";
            case 6:
                return "BLACK VOMIT";
        }
    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll) {
            case 1:
            default:
                return "The Freak throws its head back and roars, asserting its dominance. All PCs in SHORT range must make an immediate Panic Roll.";
            case 2:
            case 7:
                return "The Freak strikes its victim with a powerful punch. Roll for the attack with 10d6, Damage 1.";
            case 3:
                return "The Freak grabs the victim's head and tries to jab its thumbs into their eyes. Roll for the attack using 7d6, Damage 1. If the attack causes damage, it automatically triggers critical injury #34 (even if the victim is not Broken), triggering an immediate Panic Roll.";
            case 4:
                return "The Freak leaps onto its victim like a gorilla. Roll for the attack using 8d6, Damage 1. If the attack hits, the victim is knocked to the ground, drops and hand-held items, and must make an immediate Panic Roll. The Freak then starts pummeling the victim's head and chest with its powerful fists. This is resolved as an immediate bonus attack with 10d6, Damage 2.";
            case 5:
                return "The Freak pulls the victim to its chest and begins to squeeze. Roll for the attack using 8d6, Damage 1. If the attack causes damage, it automatically inflicts critical injury #56, triggering an immediate Panic Roll.";
            case 6:
                return "The Freak holds the victim down and vomits black goo all over their face. The victim must make a Sickness Roll against Virulence 10. Failure means they become an Anathema. If the victim wears a HAZMAT suit, the Freak first tries to pull the visor off - the victim must make an immediate CLOSE COMBAT roll (no action) to stop this. ";
        }
    }
}
