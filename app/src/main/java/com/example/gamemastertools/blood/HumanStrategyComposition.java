package com.example.gamemastertools.blood;

import java.util.Random;

public class HumanStrategyComposition {

    Integer checkAndRollForStrategy(Integer dicePool) {

        Random coin = new Random();
        int tossOne = coin.nextInt(2);
        int tossTwo = coin.nextInt(2);
        int tossThree = coin.nextInt(2);
        int strategyResultDicesForInitiative;

        switch (dicePool) {
            case 0:
                strategyResultDicesForInitiative=0;
                break;
            case 1:
                strategyResultDicesForInitiative=1;
                break;
            case 2:
            case 3:
                strategyResultDicesForInitiative=2;
                break;
            case 4:
                strategyResultDicesForInitiative=3-tossOne;
                break;
            case 5:
                strategyResultDicesForInitiative=4-tossOne;
                break;
            case 6:
                strategyResultDicesForInitiative=5-tossOne-tossTwo;
                break;
            case 7:
                strategyResultDicesForInitiative=6-tossOne-tossTwo-tossThree;
                break;
            case 8:
                strategyResultDicesForInitiative=7-tossOne-tossTwo-tossThree;
                break;
            default:
                return 5;

        }
        return strategyResultDicesForInitiative;
    }
}
