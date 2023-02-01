package com.example.gamemastertools.alien;

import com.example.gamemastertools.dices.SixDice;

public class AlienPanicRoller {

    public static int panicRoll(int panicLevel){

        SixDice sixDice = new SixDice();
        sixDice.rollADie();

        return sixDice.getDiceValue()+panicLevel;
    }

    public static String panicTitle (int number){
        String title ="";
        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: title = "KEEPING IT TOGETHER";
            break;
            case 7: title = "NERVOUS TWITCH";
            break;
            case 8: title = "TREMBLE";
            break;
            case 9: title = "DROP ITEM";
            break;
            case 10: title = "FREEZE";
            break;
            case 11: title = "SEEK COVER";
            break;
            case 12: title = "SCREAM";
            break;
            case 13: title = "FLEE";
            break;
            case 14: title = "BERSERK";
            break;
            default: title = "CATATONIC";
        }

        return title;
    }

    public static String panicDescription(String title){

        String description = "";

        switch (title){
            case "KEEPING IT TOGETHER": description = "You manage to keep together your nerves in check. Barely.";
            break;
            case "NERVOUS TWITCH": description = "Your stress level and the stress level of all friendly Player Character in SHORT range of you is increased by 1.";
            break;
            case "TREMBLE": description = "You start to tremble uncontrollably. All skill rolls using AGILITY suffer a -2 modification until your panic stop.";
            break;
            case "DROP ITEM": description = "Whether by stress, confusion or the realization that you're all going to die anyway, you drop a weapon or other important item - the Game Master (Mother) decides which one. Your STRESS LEVEL is increased by 1.";
            break;
            case "FREEZE": description = "You're frozen by fear and stress for ONE ROUND, losing your NEXT SLOW ACTION. Your stress level and the stress level of all friendly Player Characters in short range of you is increased by 1.";
            break;
            case "SEEK COVER": description = "You must use your next action to move away from danger and find a safe spot if possible. You are allowed to make a Retreat Roll (p.93) if you have an enemy at ENGAGED range. Your stress level is decreased by 1, but the stress level of all friendly Player Character in SHORT range is increased by 1. After One Round, you can act normally.";
            break;
            case "SCREAM": description = "You scream your lungs out for ONE ROUND, losing your NEXT SLOW ACTION. Your stress level is decreased by 1, but every friendly character who hears your scream must make an immediate Panic Roll.";
            break;
            case "FLEE": description = "You just can't take it anymore. You must flee to a safe place and refuse to leave it. You won't attack anyone and won't attempt to anything dangerous. You are NOT allowed to make a retreat roll (p.93) if you have enemy at ENGAGED range when you flee. Your stress level is decreased by 1, but every friendly character who sees you run must make an immediate Panic Roll.";
            break;
            case "BERSERK": description = "You must immediately attack the nearest person or creature, friendly or not. You won't stop until you or the target is BROKEN. Every friendly character who witnesses your rampage must make an immediate Panic Roll.";
            break;
            case "CATATONIC": description = "You collapse to the floor and can't talk or move, staring blankly into oblivion.";
            break;
        }

        return description;
    }


}
