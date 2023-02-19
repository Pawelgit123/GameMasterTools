package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class NeomorphBloodBurster extends AlienXenoCreature implements AlienXenoAttack {
    public NeomorphBloodBurster(Parcel in) {
        super(in);
    }

    public NeomorphBloodBurster() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            case 2:
            case 3:
            default:return "ESCAPE";
            case 4:
            case 7: return "TERRIFYING HISS";
            case 5: return "LEG BITE";
            case 6: return "THROAT BITE";
        }

    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1:
            case 2:
            case 3:
            default:return "With a snarl, The Bloodburster flees, moving two zones away in a single action into the nearest air duct if possible. As soon as the PCs lose line of sight, combat ends and stealth mode ensues. After d6 Turns, The Bloodburster grows into a Neophyte and start stalking the PCs.";
            case 4:
            case 7: return "The Bloodburster jumps onto the victim, showing its razor-sharp teeth and hissing. The victim must make an immediate Panic Roll.";
            case 5: return "With a snarl, the Bloodburster bites the victim's leg. Roll for the attack using 6d6, Damage 2. If the attack causes damage, it automatically inflicts critical injury #53 (even if the victim is not BROKEN), triggering an immediate Panic Roll.";
            case 6: return "The Bloodburster bites the victim's throat. Roll for the attack using 8d6, Damage 1. If the attack causes damage, it automatically inflicts critical injury #61 )even if the victim is not BROKEN), triggering an immediate Panic Roll. ";
        }

    }
}
