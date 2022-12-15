package com.example.gamemastertools.dices;

import org.junit.Assert;
import org.junit.Test;

public class TenDiceTest {

    SixDice sixDiceTestOne = new SixDice(10);
    SixDice sixDiceTestTwo = new SixDice();

    @Test
    public void aSixDiceHaveProperRangeOfValue() {
        Assert.assertEquals(sixDiceTestOne.getDiceValue(), 10);

        sixDiceTestTwo.rollADie();
        Assert.assertTrue(sixDiceTestTwo.getDiceValue() <= 10);
        Assert.assertTrue(sixDiceTestTwo.getDiceValue() >= 1);

    }
}