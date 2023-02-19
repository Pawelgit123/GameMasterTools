package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class ProtomorphDeacon extends AlienXenoCreature implements AlienXenoAttack {
    public ProtomorphDeacon(Parcel in) {
        super(in);
    }

    public ProtomorphDeacon() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        switch (roll){
            case 1: return "HORRIFIC SCREECH";
            case 2:
            default:return "RIPPING CLAWS";
            case 3: return "PIERCING SHRIEK";
            case 4:
            case 7: return "SLASHING LIMBS";
            case 5: return "HOOK JAW";
            case 6: return "SNAP SHREDDER";
        }
    }

    @Override
    public String  makeAttackText(int roll) {

        switch (roll){
            case 1: return "The Deacon emits an ear-piercing wall that shakes anyone present to their very core. All victims within MEDIUM range must make an immediate Panic Roll.";
            case 2:
            default:return "By slashing hands and kicking feet, the Deacon's claws tear at its victim. The attack is made using 6d6, Damage 1 (AP).";
            case 3: return "The Deacon focuses on the nearest target and emits a terrible war-shriek directly at them. The victim must make an immediate STAMINA roll (no action) or lose their next slow and fast actions. They gains Stress level +1 either way, as the Deacon marks them for death.";
            case 4:
            case 7: return "The Deacon uses its incredible agility to attack one victim with 8d6, Damage 1, then pivots and slashes at a second target within SHORT range. This second attack is made with 6d6, Damage 1 (AP). If there is no target within range the second attack is made against original victim. All who witness this terrible display gains Stress level +1.";
            case 5: return "The Deacon's jaws spring forward, latching onto a victim's limb. The victim is attacked with 8d6, Damage 2. If the attack causes damage, it automatically inflicts critical injury #36 (even if the victim is not BROKEN) and grapples the victim. Anything the victim is holding is dropped and the Deacon stays latched on. Any CLOSE COMBAT attempt to break the grapple suffers a -3 modifier. The victim must make an immediate Panic Roll. As a slow action on each of its initiatives, the Deacon can then attack the grappled victim using 6d6, Damage 2. This attack cannot be blocked.";
            case 6: return "The Deacon make its Hook Jaw attack the victim's limb - with 8d6, Damage 2. If the attack causes damage, it automatically inflicts critical injury #36 (even if the victim is not BROKEN) then immediately snaps its extended jaw back into its mouth. The victim is then attacked again using 8d6, Damage 2. If the attack causes damage, it automatically inflicts critical injury #54 or #55 (even if the victim is not BROKEN). The victim's limb is shredded an severed in the process. This attack causes a Panic Roll.";
        }
    }
}
