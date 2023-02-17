package com.example.gamemastertools.alien;

import com.example.gamemastertools.dices.SixDice;

public class AlienXenoAttackRoller {

    public static int attackRoll(){

        SixDice sixDice = new SixDice();
        sixDice.rollADie();

        return sixDice.getDiceValue();
    }


    public static String criticalInjuryOnXenomorphTitle(){
        int roll = attackRoll();

        switch (roll){
            case 1: return "Rise Again";
            case 2: return "Wounded";
            case 3: return "Desperate Action";
            case 4: return "Last Breath";
            default: return "Torn Apart";
        }
    }

    public static String criticalInjuryOnXenomorphText(String string){

        switch (string){
            case "Rise Again": return "The Xenomorph fails to the ground, seemingly dead, but it's a ruse. If it's attacked again, or on tis next initiative, it regains One point of Health and rises - fueled by instinctive hatred.";
            case "Wounded": return "The Xenomorph staggers, bleeding severely. It gets Speed -1 (minimum One), but regains One point of Health. Roll d6 at the start of each Round. On 1-3 it tries to escape.";
            case "Desperate Action": return "The Xenomorph is severely wounded and cries out in alien fury. It immediately gets to perform a fast and a slow action, outside of the normal turn order. Roll a d6: 1-3 it tries to escape (regain half health). On 4-6 it instantly attacks the closest opponent. If i fails to inflict any damage, the creature dies. If succeeds, it regains One point of Health.";
            case "Last Breath": return "The Xenomorph is mortally wounded and contorts wildly. On ts next initiative, it will try to kill the nearest victim, then the beast dies. If it's wounded again before then, it dies instantly.";
            default: return "Instant death. The Xenomorph is torn apart or crushed amidst shrieks of rage. Severely mutilated, it can only by Analyzed with Observation -2.";
        }
    }

    public static String attackBloodburster(){
        int roll = attackRoll();

        switch (roll){
            case 1:
            case 2:
            case 3:  return "Terrifying Hiss - ";
            default: return "ESCAPE - ";
        }
    }

//    public static String attackTitleAnathema(){
//        int roll = attackRoll();
//
//        switch (roll){
//            case 1: return "HORRIF"
//        }


}
