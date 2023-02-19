package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationEtypePerfected extends AlienXenoCreature implements AlienXenoAttack {
    public AbominationEtypePerfected(Parcel in) {
        super(in);
    }

    public AbominationEtypePerfected() {
    }

    @Override
    public String makeAttackTitle(int roll) {

       switch (roll){
           case 1: return "MESMERIZE";
           case 2:
           default:return "TURN";
           case 3:
           case 7: return "PSIONIC BLAST";
           case 4: return "SLASH AND GRAB";
           case 5: return "PSIONIC SUMMONING";
           case 6: return "FATAL KISS";
       }
    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1: return "The Perfected stares down its victim in SHORT range with its pitch-black eyes. The victim must make a Wits roll or be lost in the depths of those soulless voids, entranced and immobilized. If the roll fails, the victim loses their next fast and slow action. In addition, Stress level increases by +1 for the victim and all friendly Pcs in SHORT range. If uninterrupted, the Perfected will attempt to a FATAL KISS attack on its next action.";
            case 2:
            default:return "TURN";
            case 3:
            case 7: return "This mental surge reverberates through the victim's skull, automatically causing critical injury #16 and ears, eyes and nose to bleed. The attack is made with 10d6, Damage 2.";
            case 4: return "The Perfected attempts to rake its nails across its victim's torso - using 6d6, Damage 1. Unless the victim is able to containt the bleeding, the Perfected will be able to track the victim through the scent of their blood.";
            case 5: return "A psionic whistling rings in the ears of everyone present, calling two Deacons to the Perfected's defense. They reach the zone the following Round, the draw initiative and can act.";
            case 6: return "Make an opposed roll with 10d6 against the target's CLOSE COMBAT skill (no action). If the victim wins, they fend off the kiss, but must still make an immediate Panic Roll. If the Perfected is successful, it embrace the victim, leaning in for a kiss. Immediately roll for another attack with 10d6. If successful, the Perfected locks lips with the victim, lashing its barbed tongue into their mouth. The victim is immediately BROKEN by this and automatically suffers critical injury #46.";
        }
    }
}
