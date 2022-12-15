package com.example.gamemastertools.dices;

import java.util.Random;

public class SixDice implements Dice {

    int diceValue;

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

        Random random = new Random();
        int rolledValue = random.nextInt(5);
        rolledValue++;
        setDiceValue(rolledValue);

    }
}
