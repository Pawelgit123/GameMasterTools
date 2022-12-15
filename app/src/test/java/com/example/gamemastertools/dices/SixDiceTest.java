package com.example.gamemastertools.dices;

import org.junit.Assert;
import org.junit.Test;

public class SixDiceTest {

    SixDice sixDiceTestOne = new SixDice(6);
    SixDice sixDiceTestTwo = new SixDice();

    @Test
    public void aSixDiceHaveProperRangeOfValue() {
        Assert.assertEquals(sixDiceTestOne.getDiceValue(), 6);

        sixDiceTestTwo.rollADie();
        Assert.assertTrue(sixDiceTestTwo.getDiceValue() <= 6);
        Assert.assertTrue(sixDiceTestTwo.getDiceValue() >= 1);

    }
}