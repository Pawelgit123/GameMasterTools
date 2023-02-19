package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class ProtomorphSquid extends AlienXenoCreature implements AlienXenoAttack {
    public ProtomorphSquid(Parcel in) {
        super(in);
    }

    public ProtomorphSquid() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            case 2:
            case 3:
            default:return "SLITHERING ESCAPE";
            case 4: return "REVULSION";
            case 5:
            case 7: return "VICE-LIKE GRAPPLE";
            case 6: return "SMOTHER ATTACK";
        }

    }

    @Override
    public String  makeAttackText(int roll) {

        switch (roll){
            case 1:
            case 2:
            case 3:
            default:return "In a blur of whipping tentacles, the Squid flees one zone away, slipping into the nearest cover or air duct if possible. As soon as the PCs lose line of sight, combat ends and stealth mode ensues. After one shift, the squid grows into a Trilobite and begins looking for a host to implant.";
            case 4: return "The squid undulating motions are revolting to watch, inducing waves of nausea in everyone within close range. Victims must make a Sickness Roll against Virulence 8 or immediately drop what they are carrying, losing a round of action.";
            case 5:
            case 7: return "The squid hurls itself at the victim and latches on with its tiny but strong tentacles. Roll using 6d6, Damage 2. If any damage is caused, the victim is grappled, automatically inflicting critical injury #13 (even if victim is not BROKEN) and triggering an immediate Panic Roll.";
            case 6: return "The squid snaps its tentacles onto the victim's head and squeezes with an unexpected crushing power. The attack has a strength of 6d6, Damage 1. Any damage sustained automatically inflicts critical injury #16, but the squid remains attached. The victim will suffocate unless the squid grip can be broken (Suffocation pg.110).";
        }

    }
}
