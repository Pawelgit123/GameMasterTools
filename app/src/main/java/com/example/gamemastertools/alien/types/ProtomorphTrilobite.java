package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class ProtomorphTrilobite extends AlienXenoCreature implements AlienXenoAttack {
    public ProtomorphTrilobite(Parcel in) {
        super(in);
    }

    public ProtomorphTrilobite() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        switch (roll){
            case 1:
            default:return "INTIMIDATE";
            case 2: return "SIZING UP FOR HOST";
            case 3:
            case 7: return "GRABBING TENTACLE";
            case 4: return "TOPPLING LASH";
            case 5: return "CRUSHING GRAPPLE";
            case 6: return "VIOLATION";
        }
    }

    @Override
    public String  makeAttackText(int roll) {

        switch (roll){
            case 1:
            default:return "The Trilobite rises to its full three-meter height, exposing its underbelly maw and sizing up its victim. Panic Roll.";
            case 2: return "The beast silently undulates and shakes its tentacles as it surveys the available targets. It seems to be smelling or tasting the air in its search for the best host. Everyone withing SHORT range gains +1 Stress level and must make an immediate Panic Roll.";
            case 3:
            case 7: return "The Trilobite whips out a tentacle, snaring the victim. It attacks with 8d6, Damage 1. If the tentacle hits, the Trilobite immediately drags the victim to a neighboring zone. The victim goes prone. Stress level increase by +1 for the victim and everyone must make an immediate Panic Roll.";
            case 4: return "The Trilobite lashes out with a tentacle, sweeping the victim's legs. It attacks with 10d6, Damage 1. If the attack hits, the victim is knocked prone, dropping any hand-held items. The victim gains Stress level +1 and must make an immediate Panic Roll.";
            case 5: return "The Trilobite wraps its tentacles around the victim, grabbing it. It attacks with 8d6, Damage 2. If it hits it automatically inflicts critical injury #33 (even if the victim is not BROKEN) and the victim makes an immediate Panic Roll.";
            case 6: return "The Trilobite entangles the victim with its tentacles, grabbing it. Make an opposed roll with 10d6 against target's CLOSE COMBAT skill: If the victim wins, they fend off the proboscis for this attack, but they must still make an immediate Panic Roll. If the Trilobite wins, the victim is grappled and tendrils force their head into position. Immediately roll for a new attack with 10d6. If it gets any success the poor victim is immediately BROKEN and suffers critical injury #46. Their last sensations are horrifying as the Trilobite thrusts its proboscis into the victim's mouth, implanting its embryo before they pass out. The Trilobite goes catatonic, covering the victim with its own body to protect the host during embryo implantation.";
        }

    }
}
