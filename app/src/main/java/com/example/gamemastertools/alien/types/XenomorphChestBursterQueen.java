package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphChestBursterQueen extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphChestBursterQueen(Parcel in) {
        super(in);
    }

    public XenomorphChestBursterQueen() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            case 2:
            case 3:
            default:return "ESCAPE";
            case 4: return "TERRORIZING HISS";
            case 5:
            case 7: return "LEG SLASH";
            case 6: return "THROAT BITE";
        }

    }

    @Override
    public String  makeAttackText(int roll) {

        switch (roll){
            case 1:
            case 2:
            case 3:
            default:return "With a snarl the Queenburster flees, moving two zones away in one action, into the nearest vent, sewer or duct if possible. As soon as the PCs lose line of sight the Queenburster has escaped. Stealth mode ensues as the Queenburster tries to hide and grow.";
            case 4: return "The Queenburster jumps towards a target, flashing its razor-sharp teeth and hissing malevolently. The target must make an immediate Panic Roll.";
            case 5:
            case 7: return "With a snarl the Queenburster slashes its target's leg metallic teeth flashing in the light. Roll for the attack using 6d6, Damage 2. If the attack causes damage, it automatically inflicts critical injury #53 (even if the victim is not BROKEN), triggering an immediate Panic Roll.";
            case 6: return "The Queenburster squeals a high-pitched shriek and goes for the throat. Roll for the attack with 8d6, Damage 1. If the attack causes damage, it immediately inflicts critical injury #61 (even if the victim is not BROKEN), triggering an immediate Panic Roll.";
        }

    }
}
