package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class NeomorphAdult extends AlienXenoCreature implements AlienXenoAttack {
    public NeomorphAdult(Parcel in) {
        super(in);
    }

    public NeomorphAdult() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll){
            case 1: return "TERRIFYING HISS";
            case 2:
            default:return "TAIL SLASH";
            case 3: return "DEADLY GRAB";
            case 4:
            case 7: return "LEAPING ATTACK";
            case 5: return "THROAT BITE";
            case 6: return "TAIL SPIKE";
        }

    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1: return "The Neomorph leans in close to the victim, showing its razor-sharp teeth and hissing. The victim must make an immediate Panic Roll.";
            case 2:
            default:return "The Neomorph pivots, slashing its victim with its sharp tail. The victim is attacked using 10d6, Damage 2. The attack is armor piercing (AP).";
            case 3: return "The Neomorph jumps at its victim, grabbing it and dragging it away. Roll for the attack using 8d6, Damage 1. If it hits, the Neomorph immediately drags the victim into the next zone (MEDIUM range) before releasing it. The victim falls prone, drops any hand-held items and must make an immediate Panic Roll.";
            case 4:
            case 7: return "The Neomorph jumps at the victim. Roll for the attack using 8d6, Damage 1. If the attack is successful, the victim is thrown to the ground and must make an immediate Panic Roll, and the Neomorph immediately performs an extra attack with 10d6, Damage 2. The extra attack cannot be blocked.";
            case 5: return "The Neomorph bites the victim's throat. Roll for the attack using 8d6, Damage 1. If the attack causes damage, it automatically inflicts critical injury #61 (even if the victim is not BROKEN), triggering an immediate Panic Roll.";
            case 6: return "The Neomorph impales the victim with its razor-sharp tail. Roll for the attack using 7d6, Damage 1. The attack is armor piercing (AP). If the attack causes damage, it automatically triggers critical injury #66 (even if the victim is not BROKEN), killing the victim outright.";
        }

    }
}
