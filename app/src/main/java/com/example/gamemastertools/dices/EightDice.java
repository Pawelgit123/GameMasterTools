package com.example.gamemastertools.dices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EightDice implements Dice{

    int diceValue;
    final static List<Integer> dieNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    public EightDice() {
    }

    public EightDice(int diceValue) {
        this.diceValue = diceValue;
    }

    public int getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }

    @Override
    public void rollADie() {

        Collections.shuffle(dieNumbers);
        setDiceValue(dieNumbers.get(0));
    }
}
