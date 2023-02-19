package com.example.gamemastertools.alien;

import com.example.gamemastertools.dices.EightDice;
import com.example.gamemastertools.dices.SixDice;
import com.example.gamemastertools.dices.TenDice;

public class AlienXenoAttackRoller {

    public AlienXenoAttackRoller() {
    }

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


    public static String criticalInjuryTitleAlien(int roll) {

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

    public static String criticalInjuryTextAlien(String string) {

        switch (string) {
            case "Rise Again":
                return "The Xeno fails to the ground, seemingly dead, but it's a ruse. If it's attacked again, or on tis next initiative, it regains One point of Health and rises - fueled by instinctive hatred.";
            case "Wounded":
                return "The Xeno staggers, bleeding severely. It gets Speed -1 (minimum One), but regains One point of Health. Roll d6 at the start of each Round. On 1-3 it tries to escape.";
            case "Desperate Action":
                return "The Xeno is severely wounded and cries out in alien fury. It immediately gets to perform a fast and a slow action, outside of the normal turn order. Roll a d6: 1-3 it tries to escape (regain half health). On 4-6 it instantly attacks the closest opponent. If i fails to inflict any damage, the creature dies. If succeeds, it regains One point of Health.";
            case "Last Breath":
                return "The Xeno is mortally wounded and contorts wildly. On ts next initiative, it will try to kill the nearest victim, then the beast dies. If it's wounded again before then, it dies instantly.";
            default:
                return "Instant death. The Xeno is torn apart or crushed amidst shrieks of rage. Severely mutilated, it can only by Analyzed with Observation -2.";
        }
    }

}
