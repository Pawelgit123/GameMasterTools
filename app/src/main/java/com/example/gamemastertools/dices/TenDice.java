package com.example.gamemastertools.dices;

import java.util.Random;

public class TenDice implements Dice {

    int diceValue;

    public TenDice() {
    }

    public TenDice(int diceValue) {
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
        int rolledValue = random.nextInt(9);
        rolledValue++;
        setDiceValue(rolledValue);

    }
}
