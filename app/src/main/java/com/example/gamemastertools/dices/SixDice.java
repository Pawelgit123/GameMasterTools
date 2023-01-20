package com.example.gamemastertools.dices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SixDice implements Dice {

    int diceValue;
    final static  List<Integer> dieNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public SixDice() {
    }

    public SixDice(int diceValue) {
        this.diceValue = diceValue;
    }

    void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }

    public int getDiceValue() {
        return this.diceValue;
    }

    @Override
    public void rollADie() {

        Collections.shuffle(dieNumbers);
        setDiceValue(dieNumbers.get(0));

    }
}
