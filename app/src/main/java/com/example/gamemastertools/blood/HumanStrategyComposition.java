package com.example.gamemastertools.blood;

import java.util.Random;

public class HumanStrategyComposition {

    Integer checkAndRollForStrategy(Integer dicePool) {

        Random coin = new Random();
        int toss = coin.nextInt(2);
        int tossTwo = coin.nextInt(2);
        int tossThree = coin.nextInt(2);
        int result;

        switch (dicePool) {
            case 0:
            case 1:
            case 2:
                result=0;
                break;
            case 3:
                result=2;
                break;
            case 4:
                result=3-toss;
                break;
            case 5:
                result=4-toss;
                break;
            case 6:
                result=5-toss-tossTwo;
                break;
            case 7:
                result=6-toss-tossTwo-tossThree;
                break;
            case 8:
                result=7-toss-tossTwo-tossThree;
                break;
            default:
                return 5;

        }
        return result;
    }
}
