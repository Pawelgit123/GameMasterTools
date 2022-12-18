package com.example.gamemastertools.blood;

public class HumanStrategyBalanced implements HumanStrategy{

    @Override
    public void setStrategyForHuman(Human human, Integer strategy) {

        int dices = human.getVirtueProwess()+human.getBonusCombatDices();

        human.setInitiativeDices(strategy);
        human.setCombatDices(dices-strategy);

    }
}
