package com.example.gamemastertools.alien;

import com.example.gamemastertools.dices.EightDice;
import com.example.gamemastertools.dices.SixDice;
import com.example.gamemastertools.dices.TenDice;

public class AlienXenoAttackRoller {

    public static int attackRollSix() {

        SixDice sixDice = new SixDice();
        sixDice.rollADie();

        return sixDice.getDiceValue();
    }

    public static int attackRollEight() {

        EightDice eightDice = new EightDice();
        eightDice.rollADie();

        return eightDice.getDiceValue();
    }

    public static int attackRollTen() {

        TenDice tenDice = new TenDice();
        tenDice.rollADie();

        return tenDice.getDiceValue();
    }


    public static String criticalInjuryTitleXenomorph(int roll) {

        switch (roll) {
            case 1:
                return "Rise Again";
            case 2:
                return "Wounded";
            case 3:
                return "Desperate Action";
            case 4:
                return "Last Breath";
            default:
                return "Torn Apart";
        }
    }

    public static String criticalInjuryTextXenomorph(String string) {

        switch (string) {
            case "Rise Again":
                return "The Xenomorph fails to the ground, seemingly dead, but it's a ruse. If it's attacked again, or on tis next initiative, it regains One point of Health and rises - fueled by instinctive hatred.";
            case "Wounded":
                return "The Xenomorph staggers, bleeding severely. It gets Speed -1 (minimum One), but regains One point of Health. Roll d6 at the start of each Round. On 1-3 it tries to escape.";
            case "Desperate Action":
                return "The Xenomorph is severely wounded and cries out in alien fury. It immediately gets to perform a fast and a slow action, outside of the normal turn order. Roll a d6: 1-3 it tries to escape (regain half health). On 4-6 it instantly attacks the closest opponent. If i fails to inflict any damage, the creature dies. If succeeds, it regains One point of Health.";
            case "Last Breath":
                return "The Xenomorph is mortally wounded and contorts wildly. On ts next initiative, it will try to kill the nearest victim, then the beast dies. If it's wounded again before then, it dies instantly.";
            default:
                return "Instant death. The Xenomorph is torn apart or crushed amidst shrieks of rage. Severely mutilated, it can only by Analyzed with Observation -2.";
        }
    }

//    public static String attackTitleBloodburster(int roll) {
//
//        switch (roll) {
//            case 1:
//            case 2:
//            case 3:
//                return "Terrifying Hiss - ";
//            default:
//                return "ESCAPE - ";
//        }
//    }

    public static String attackTitleAnathema(int roll) {

        switch (roll) {
            case 1:
            default:
                return "HORRIFIC HOWL";
            case 2:
            case 7:
                return "FIST STRIKE";
            case 3:
                return "EYE GOUGE";
            case 4:
                return "BEAT DOWN";
            case 5:
                return "BEARHUG";
            case 6:
                return "BLACK VOMIT";
        }
    }

    public static String attackTextAnathema(int roll) {

        switch (roll) {
            case 1:
            default:
                return "The Freak throws its head back and roars, asserting its dominance. All PCs in SHORT range must make an immediate Panic Roll.";
            case 2:
            case 7:
                return "The Freak strikes its victim with a powerful punch. Roll for the attack with 10d6, Damage 1.";
            case 3:
                return "The Freak grabs the victim's head and tries to jab its thumbs into their eyes. Roll for the attack using 7d6, Damage 1. If the attack causes damage, it automatically triggers critical injury #34 (even if the victim is not Broken), triggering an immediate Panic Roll.";
            case 4:
                return "The Freak leaps onto its victim like a gorilla. Roll for the attack using 8d6, Damage 1. If the attack hits, the victim is knocked to the ground, drops and hand-held items, and must make an immediate Panic Roll. The Freak then starts pummeling the victim's head and chest with its powerful fists. This is resolved as an immediate bonus attack with 10d6, Damage 2.";
            case 5:
                return "The Freak pulls the victim to its chest and begins to squeeze. Roll for the attack using 8d6, Damage 1. If the attack causes damage, it automatically inflicts critical injury #56, triggering an immediate Panic Roll.";
            case 6:
                return "The Freak holds the victim down and vomits black goo all over their face. The victim must make a Sickness Roll against Virulence 10. Failure means they become an Anathema. If the victim wears a HAZMAT suit, the Freak first tries to pull the visor off - the victim must make an immediate CLOSE COMBAT roll (no action) to stop this. ";
        }
    }

    public static String attackTitleAnathemaTerminal(){
        return "AGONY";
    }

    public static String attackTextAnathemaTerminal(){
        return "The Terminal is moving around in agony.";
    }

    public static String attackTitleFacehugger(int roll){

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

    public static String attackTextFacehugger(int roll){

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

    public static String attackTextRoyalFacehugger(int roll){

        switch (roll){
            case 1:
            case 2:
            default:
                return "The Facehugger has chosen its host and they know it is coming for them! It skitters forward, single-minded and horrifyingly spider-like. The victim suffers +1 Stress level and must make an immediate Panic Roll.";
            case 3:
            case 7: return "The little monster comes for its target, lashing out with its wicked tail. It attacks with 6d6, Damage 2. Aside from any damage the victim gets +1 Stress level.";
            case 4: return "The Facehugger leaps and catches its victim from behind, its tail whipping violently. Roll a d6 (1-2) The Target's legs are caught and the fall prone - make a Panic Roll (3-4) The victim's arms get hopelessly tangled in the beast's tail - they cannot use any held items and must make a Panic Roll (5-6) The Facehuggers wraps its tail around the target's neck, chocking them - they suffer the effects of DROWNING and must make a Panic Roll.";
            case 5: return "The Facehugger leaps at its victim. Make an opposed roll with 6d6 against the target's CLOSE COMBAT skill (no action): If the Facehugger wins, the target will suffer THE FINAL EMBRACE on the Facehugger's next initiative. If the victim wins they throw the beast to the floor, but its not finished with them yet and attacks the same target again on its next initiative";
            case 6: return "The Facehugger gets to its victim, its acid making short work of any helmet or respirator in the way. Roll for the attack with 6d6. If it gets any success, the poor victim is facehugged and immediately BROKEN. Their last sensations are horrible, yet strangely loving: a firm but gentle caress around their head; a smothering sensation followed by a warm burst of oxygen-rich air filling their lungs; a deep sensation of slow-motion falling; it's okay to fall asleep..";
        }
    }

    public static String attackTitleChestburster(int roll){

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

    public static String attackTextChestburster(int roll){

        switch (roll){
            case 1:
            case 2:
            case 3:
            default:return "With a snarl the Chestburster flees, moving two zones away in one action, into the nearest vent, sewer or duct if possible. As soon as the PCs lose line of sight the Chestburster has escaped. Stealth mode ensues as the Chestburster tries to hide and grow.";
            case 4: return "The Chestburster jumps towards a target, flashing its razor-sharp teeth and hissing malevolently. The target must make an immediate Panic Roll.";
            case 5:
            case 7: return "With a snarl the Chestburster slashes its target's leg metallic teeth flashing in the light. Roll for the attack using 6d6, Damage 2. If the attack causes damage, it automatically inflicts critical injury #53 (even if the victim is not BROKEN), triggering an immediate Panic Roll.";
            case 6: return "The Chestburster squeals a high-pitched shriek and goes for the throat. Roll for the attack with 8d6, Damage 1. If the attack causes damage, it immediately inflicts critical injury #61 (even if the victim is not BROKEN), triggering an immediate Panic Roll.";
        }
    }

    public static String attackTitleDrone(int roll){

        switch (roll){
            case 1:
            default:return "HYPNOTIZING GAZE";
            case 2: return "PLAYING WITH ITS PREY";
            case 3:
            case 7: return "DEADLY GRAB";
            case 4: return "READY TO KILL";
            case 5: return "CAPTURE FOR THE HIVE";
            case 6: return "HEADBITE";
        }
    }

    public static String attackTextDrone(int roll){

        switch (roll){
            case 1:
            default:return "The Xenomorph, eyeless as it may seem, stares deeply into the soul of its victim. The victim is mesmerized by the dread beauty of such a beast. They stand in awe of what nature, or god, or the devil has created, get +1 Stress level and must make an immediate Panic Roll.";
            case 2: return "The Xeno attacks, but not to kill. The target is knocked to the ground and drops all hand-held items, but otherwise takes no damage. The Xenomorph stands over them, taunting its prey to run so the game can go on. The victim gets +1 Stress level and must make an immediate Panic Roll.";
            case 3:
            case 7: return "The beast launches through the air, grabbing its victim. It attacks with 10d6, Damage 1. If it hits it immediately drags them into a neighboring zone, dumping them on the floor. The victim is prone, drops all hand-held items and must make an immediate Panic Roll.";
            case 4: return "The Xenomorph grabs its victim, its inner jaws poised to strike. Roll the attack with 10d6. If it hits, the victim counts as grabbed (pg.93) and needs to make an opposed CLOSE COMBAT roll against 10d6 to break lose. The victim and all friendly characters in the same zone must make Panic Rolls. Unless the victim breaks free, the Xenomorph will use a HEADBITE attack against them on its next initiative.";
            case 5: return "The Xenomorph attack with its venom-spiked tail with 10d6, Damage 1. If the attack causes any damage, the Xeno pulls its punch so only 1 point of damage is inflicted, and the paralyzing venom takes effect. The victim must make a STAMINA roll - the number of successes rolled it the number of Rounds they can stay up, then they fall unconscious for 1 shift. The paralysis can removed with a shot of adrenaline (a MEDICAL AID roll using a Medkit).";
            case 6: return "The Xenomorph opens its outer jaws wide, and the deadly inner jaws lean out, gnashing in anticipation before snapping forwards. The attack has a strength of 9d6, Damage 2. If it causes any damage it automatically inflicts critical injury #64, killing the victim in one dreadful blow. However, should the GM wish it, the victim remains just alive enough for the Xenomorph to initiate the ovomorping process.";
        }
    }

    public static String attackTitleSoldier(int roll){

        switch (roll){
            case 1: return "ASSESSING THE THREAT";
            case 2:
            default:return "ONE FOR ALL";
            case 3:
            case 7: return "ALL-OUT ATTACK";
            case 4: return "CAPTURE FOR THE HIVE";
            case 5: return "DIE FOR THE QUEEN";
            case 6: return "HEADBITE";
        }
    }

    public static String attackTextSoldier(int roll){

        switch (roll){
            case 1: return "The Xenomorph pauses, hissing quietly but all the more threatening for that. It looks like it's thinking, or maybe giving silent orders to unseen companions. Everyone within MEDIUM range gets +1 Stress level";
            case 2:
            default:return "The Xeno leaps at the largest group of enemies and roars a challenge, sweeping its arms, legs and tail through their ranks. All targets within SHORT range must succeed at a MOBILITY roll or be knocked off their feet, taking 1 point of damage. All the targets must make an immediate Panic Roll.";
            case 3:
            case 7: return "The Xenomorph launches into a wild attack, throwing every claw, fang and its pointed tail at its victim. It attacks with 12d6, Damage 2. The attack is armor piercing (AP)";
            case 4: return "The Xenomorph attack with its venom-spiked tail with 10d6, Damage 1. If the attack causes any damage, the Xeno pulls its punch so only 1 point of damage is inflicted, and the paralyzing venom takes effect. The victim must make a STAMINA roll - the number of successes rolled it the number of Rounds they can stay up, then they fall unconscious for 1 shift. The paralysis can removed with a shot of adrenaline (a MEDICAL AID roll using a Medkit).";
            case 5: return "The Xenomorph, desperate to protect its hive and Queen, leaps towards an enemy, eviscerating itself as it does so. Its acid blood showers everywhere: all targets within SHORT range of the Xeno suffer an immediate acid splash attack of 12d6. The Xeno dies, squealing.";
            case 6: return "The Xenomorph opens its outer jaws wide, and the deadly inner jaws lean out, gnashing in anticipation before snapping forwards. The attack has a strength of 9d6, Damage 2. If it causes any damage it automatically inflicts critical injury #64, killing the victim in one dreadful blow.";
        }
    }

    public static String attackTitleCharger(int roll){

        switch (roll){
            case 1: return "CALL THE GUARD";
            case 2:
            default:return "CHARGE";
            case 3:
            case 7: return "BEASTLY BITE";
            case 4: return "CRUSHING BLOW";
            case 5: return "TAIL SPIKE";
            case 6: return "HEADBITE";
        }
    }

    public static String attackTextCharger(int roll){

        switch (roll){
            case 1: return "The enormous Xenomorph lets out a shrill cry to help, calling d6 Soldiers to its defense. They reach the zone the following Round, then draw initiative and can act.";
            case 2:
            default:return "The target must make a MOBILITY roll (no action) or be crushed, being immediately BROKEN and suffering a random critical injury. Even if the victim makes the roll, they fall down and gain +1 Stress level.";
            case 3:
            case 7: return "The Xenomorph takes a huge bite from its victim. The attack is rolled with 10d6, Damage 1. If the attack causes any damage, it inflicts critical injury #61 even if the victim isn't BROKEN, triggering a Panic Roll.";
            case 4: return "The Xenomorph brings its entire weight down on the poor victim, who must make a MOBILITY roll at -2 (no action) or be crushed, immediately suffering 3 critical injuries (roll 3 times regardless of whether or not the victim is BROKEN). The victim is knocked to the ground and must make an immediate Panic Roll.";
            case 5: return "The tail impales the victim with terrible force. Roll for the attack using 10d6, Damage 1. The attack is armor piercing (AP). If the attack causes any damage it automatically triggers critical injury #66, killing them outright.";
            case 6: return "The Xenomorph opens its mouth wide an the inner jaws lash out. The attack uses 10d6, Damage 2. If it causes any damage the victim immediately suffers critical injury #64, killing them in one dreadful blow.";
        }
    }

    public static String attackTitleQueen(int roll){

        switch (roll){
            case 1: return "CALL THE GUARD";
            case 2:
            case 3: return "BEASTLY BITE";
            case 4:
            default:return "CRUSHING BLOW";
            case 5:
            case 7: return "TAIL SPIKE";
            case 6: return "HEADBITE";
        }
    }

    public static String attackTextQueen(int roll){

        switch (roll){
            case 1: return "The enormous Xenomorph lets out a shrill cry to help, calling d6 Soldiers to its defense. They reach the zone the following Round, then draw initiative and can act.";
            case 2:
            case 3: return "The Queen takes a huge bite from its victim. The attack is rolled with 10d6, Damage 1. If the attack causes any damage, it inflicts critical injury #61 even if the victim isn't BROKEN, triggering a Panic Roll.";
            case 4:
            default:return "The Queen brings its entire weight down on the poor victim, who must make a MOBILITY roll at -2 (no action) or be crushed, immediately suffering 3 critical injuries (roll 3 times regardless of whether or not the victim is BROKEN). The victim is knocked to the ground and must make an immediate Panic Roll.";
            case 5:
            case 7: return "The tail impales the victim with terrible force. Roll for the attack using 14d6, Damage 1. The attack is armor piercing (AP). If the attack causes any damage it automatically triggers critical injury #66, killing them outright.";
            case 6: return "The Xenomorph opens its mouth wide an the inner jaws lash out. The attack uses 10d6, Damage 2. If it causes any damage the victim immediately suffers critical injury #64, killing them in one dreadful blow.";
        }
    }

    public static String attackTitleBodyBurster(int roll){

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

    public static String attackTextBodyBurster(int roll){

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
