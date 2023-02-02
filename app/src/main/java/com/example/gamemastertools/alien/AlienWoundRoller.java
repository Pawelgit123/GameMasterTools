package com.example.gamemastertools.alien;

import com.example.gamemastertools.dices.SixDice;

public class AlienWoundRoller {

    public static String woundRollOriginal() {

        SixDice sixDiceOne = new SixDice();
        sixDiceOne.rollADie();

        SixDice sixDiceTwo = new SixDice();
        sixDiceTwo.rollADie();

        return String.valueOf(sixDiceOne.getDiceValue()) + sixDiceTwo.getDiceValue();
    }

    public static String woundRollLow() {

        SixDice sixDiceOne = new SixDice();
        sixDiceOne.rollADie();

        SixDice sixDiceTwo = new SixDice();
        sixDiceTwo.rollADie();

        if (sixDiceOne.getDiceValue() >= sixDiceTwo.getDiceValue()) {
            return String.valueOf(sixDiceTwo.getDiceValue()) + sixDiceOne.getDiceValue();
        } else {
            return String.valueOf(sixDiceOne.getDiceValue()) + sixDiceTwo.getDiceValue();
        }
    }

    public static String woundRollHigh() {

        SixDice sixDiceOne = new SixDice();
        sixDiceOne.rollADie();

        SixDice sixDiceTwo = new SixDice();
        sixDiceTwo.rollADie();

        if (sixDiceOne.getDiceValue() <= sixDiceTwo.getDiceValue()) {
            return String.valueOf(sixDiceTwo.getDiceValue()) + sixDiceOne.getDiceValue();
        } else {
            return String.valueOf(sixDiceOne.getDiceValue()) + sixDiceTwo.getDiceValue();
        }
    }

    public static String woundTitle(int number){

        switch (number){
            case 11: return "WINDED";
            case 12: return "STUNNED";
            case 13: return "CRIPPLING PAIN";
            case 14: return "SPRAINED ANKLE";
            case 15: return "BLOOD IN EYES";
            case 16: return "CONCUSSION";
            case 21: return "SEVERED EAR";
            case 22: return "BROKEN TOES";
            case 23: return "BROKEN HAND";
            case 24: return "KNOCKED OUT TEETH";
            case 25: return "IMPALED THIGH";
            case 26: return "SLASHED SHOULDER";
            case 31: return "BROKEN NOSE";
            case 32: return "CROTCH HIT";
            case 33: return "BROKEN RIBS";
            case 34: return "GOUGED EYE";
            case 35: return "BUSTED KNEECAP";
            case 36: return "BROKEN ARM";
            case 41: return "BROKEN LEG";
            case 42: return "CRUSHED FOOT";
            case 43: return "CRUSHED ELBOW";
            case 44: return "PUNCTURED LUNG";
            case 45: return "BLEEDING GUT";
            case 46: return "RUPTURED INTESTINES";
            case 51: return "BUSTED KIDNEY";
            case 52: return "ARM ARTERY CUT [1]";
            case 53: return "LEG ARTERY CUT [1]";
            case 54: return "SEVERED ARM [1]";
            case 55: return "SEVERED LEG [1]";
            case 56: return "CRACKED SPINE";
            case 61: return "RUPTURED JUGULAR [1]";
            case 62: return "RUPTURED AORTA [2]";
            case 63: return "DISEMBOWELED";
            case 64: return "CRUSHED SKULL";
            case 65: return "PIERCED HEAD";
            default: return "IMPALED HEART";
        }
    }

    public static boolean woundIsFatal(int number){

        switch (number){
            case 44:
            case 45:
            case 46:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66: return true;
            default: return false;
        }
    }

    public static String woundTimLimit(int number){

        switch (number){
            case 52:
            case 53: return "One Turn";
            case 61:
            case 62: return "One Round";
            case 44:
            case 51: return "One Day";
            case 45:
            case 46:
            case 54:
            case 55: return "One Shift";
            default: return "-";
        }
    }

    public static String woundHealingTime (int number){

        switch (number){
            case 16:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 31:
            case 32:
            case 44:
            case 45:
            case 52:
            case 53: return "d6 Days";
            case 25:
            case 33:
            case 34:
            case 35:
            case 36:
            case 41:
            case 46:
            case 51:
            case 61: return "2d6 Days";
            case 42:
            case 43:
            case 56:
            case 62: return "3d6 Days";
            case 54:
            case 55: return "Permanent";
            default: return "-";
        }
    }

    public static String woundEffect (int number){

        switch (number){
            case 11:
            case 12: return "No effect";
            case 13: return "Stress level +1";
            case 14: return "Mobility -2, can't run, MEDICAL AID required";
            case 15: return "Observation and Range Combat -2, MEDICAL AID required";
            case 16: return "Mobility -2";
            case 21: return "Observation -2";
            case 23: return "Can't use hand";
            case 24: return "Manipulation -2";
            case 22:
            case 25: return "Run is a SLOW ACTION";
            case 36:
            case 43:
            case 52:
            case 54:
            case 26: return "Can't use arm";
            case 31: return "Manipulation and Observation -1";
            case 45:
            case 32: return "1 point of damage for every Mobility and Close Combat roll";
            case 33: return "Mobility and Close Combat -2";
            case 34: return "Observation and Range Combat -2";
            case 41:
            case 42:
            case 53:
            case 55:
            case 35: return "Can't run, only crawl";
            case 44: return "Mobility and Stamina -2";
            case 46: return "Disease: virulence 6";
            case 51: return "Can't run, only crawl, Mobility -2";
            case 56: return "Paralyzed from the neck down - permanently if not given MEDICAL AID in time";
            case 61: return "Stamina -1";
            case 62: return "Stamina -2";
            case 63: return "Instant death";
            case 64: return "Your story ends here";
            case 65: return "You die immediately";
            default: return "Your heart beats for the last time";

        }
    }
}
