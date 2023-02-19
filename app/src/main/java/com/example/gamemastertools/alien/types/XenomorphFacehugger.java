package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphFacehugger extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphFacehugger(Parcel in) {
        super(in);
    }

    public XenomorphFacehugger() {
    }

    @Override
    public String makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            case 2:
            default:
                return "SKITTERING MENACE";
            case 3:
            case 7: return "TAIL LASH";
            case 4: return "TAIL GRAPPLE";
            case 5: return "FACE GRAPPLE";
            case 6: return "THE FINAL EMBRACE";
        }
    }

    @Override
    public String makeAttackText(int roll) {

        switch (roll){
            case 1:
            case 2:
            default:
                return "The Facehugger has chosen its host and they know it is coming for them! It skitters forward, single-minded and horrifyingly spider-like. The victim suffers +1 Stress level and must make an immediate Panic Roll.";
            case 3:
            case 7: return "The little monster comes for its target, lashing out with its wicked tail. It attacks with 5d6, Damage 1. Aside from any damage the victim gets +1 Stress level.";
            case 4: return "The Facehugger leaps and catches its victim from behind, its tail whipping violently. Roll a d6 (1-2) The Target's legs are caught and the fall prone - make a Panic Roll (3-4) The victim's arms get hopelessly tangled in the beast's tail - they cannot use any held items and must make a Panic Roll (5-6) The Facehuggers wraps its tail around the target's neck, chocking them - they suffer the effects of DROWNING and must make a Panic Roll.";
            case 5: return "The Facehugger leaps at its victim. Make an opposed roll with 6d6 against the target's CLOSE COMBAT skill (no action): If the Facehugger wins, the target will suffer THE FINAL EMBRACE on the Facehugger's next initiative. If the victim wins they throw the beast to the floor, but its not finished with them yet and attacks the same target again on its next initiative";
            case 6: return "The Facehugger gets to its victim, its acid making short work of any helmet or respirator in the way. Roll for the attack with 6d6. If it gets any success, the poor victim is facehugged and immediately BROKEN. Their last sensations are horrible, yet strangely loving: a firm but gentle caress around their head; a smothering sensation followed by a warm burst of oxygen-rich air filling their lungs; a deep sensation of slow-motion falling; it's okay to fall asleep..";
        }
    }
}
