package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphChestBursterGore extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphChestBursterGore(Parcel in) {
        super(in);
    }

    public XenomorphChestBursterGore() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            case 2:
            default:return "BODYSLAM";
            case 3: return "TERRORIZING HISS";
            case 4:
            case 7: return "HEAD ATTACK";
            case 5: return "SUFFOCATION";
            case 6: return "DISEMBOWELMENT";
        }
    }

    @Override
    public String  makeAttackText(int roll) {

        switch (roll){
            case 1:
            case 2:
            default:return "The Goreburster throws itself at its target, knocking them prone in its frenzy to escape. It then immediately moves two zones away, into the nearest vent, sewer or duct if possible. The Goreburster leaves  a slimy pink residue in its wake - easy to follow but toxic (Virulence 6) to anyone touching it.";
            case 3: return "The Goreburster jumps towards a target, flashing its razor-sharp teeth and hissing malevolently. The target must make an immediate Panic Roll.";
            case 4:
            case 7: return "With a guttural growl, the Goreburster launches itself at its target's head and face, metallic teeth gnashing. Roll for the attack using 9d6, Damage 2. If the Goreburster hits, the target is knocked prone. If the attack causes damage, it automatically inflicts critical injury #15, #31 or #34 (even if the victim is not BROKEN) and the target must make an immediate Panic Roll.";
            case 5: return "The Goreburster wraps itself around the victim's neck and squeezes like boa constrictor. Roll for the attack with 10d6, Damage 1. If the attack hits, the victim is grappled, suffers the effects of drowning and must make an immediate Panic Roll. Breaking loose requires winning a CLOSE COMBAT roll against the Goreburster's 10d6. The Goreburster will make a grapple attack (pg.93) each Round until the victim is BROKEN.";
            case 6: return "The Goreburster squeals a high-pitched shriek and goes for its victim's soft belly. Roll for the attack with 8d6, Damage 1. If the attack causes damage, the Goreburster latches on and immediately inflicts critical injury #46 (even if the victim is not BROKEN), triggering an immediate Panic Roll. If the victim does not remove the Goreburster by the next round, the xeno will automatically inflict critical injury #63, killing them.";
        }
    }
}
