package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphChestBursterBodyAriarcus extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphChestBursterBodyAriarcus(Parcel in) {
        super(in);
    }

    public XenomorphChestBursterBodyAriarcus() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll){
            case 1: return "ENTHRALLING GAZE";
            case 2:
            case 7: return "DISMISSIVE SLAP";
            case 3: return "VENOMOUS FANGS";
            case 4:
            default:return "EVISCERATE";
            case 5: return "SKULL CRUSH";
            case 6: return "HEADBITE";
        }
    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1: return "The Bodyburster leers at a victim in SHORT range, staring them down with its empty eye sockets. The victim must make a WITS roll or be lost in those voids, entranced and immobilized as the Bodyburster slowly bears down on them. If the roll fails, the victim loses their next fast and slow action. In addition, Stress level +1 for the victim and all friendly PC in SHORT range.";
            case 2:
            case 7: return "Judging the victim unworthy of the effort, the Xenomorph whirls and lashes its tail at them. It attacks with 8d6, Damage 1. If the attack hits, he strike throws the victim to the floor in an adjacent zone. The victim is prone, drops all hand-held items and must make an immediate Panic Roll. The Xeno will then ingore the victim for the remainder of the fight unless the victim attacks it again.";
            case 3: return "The Bodyburster sinks its fangs into its victim. The attack is rolled with 8d6, Damage 1. If it causes any damage the victim must make a Sickness Roll against Virulence 8 or suffer Anathema infection.";
            case 4:
            default:return "The Xenomorph's tail blade slices across the victim's abdomen. The attack is rolled with 10d6, Damage 1. If the attack causes damage, it automatically triggers critical injury #45 (even if the victim is not BROKEN).";
            case 5: return "The Xenomorph uses both hands to grab its victim by the head. If successful, it lifts them off their feet and squeezes. The attack is rolled with 10d6, Damage 1. If it causes any damage it automatically inflicts critical injury #64, killing the victim and triggering an immediate Panic Roll for all friendly PCs in SHORT range.";
            case 6: return "The Xenomorph opens its outer jaws wide, and the deadly inner jaws strike like a piston. The attack is rolled with 9d6, Damage 2. if is causes any damage it automatically inflicts critical injury #65, killing the victim in o dreadful blow and triggering an immediate Panic Roll for all friendly PCs in SHORT range.";
        }
    }
}
