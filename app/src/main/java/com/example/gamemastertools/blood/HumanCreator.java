package com.example.gamemastertools.blood;

import java.util.Collections;
import java.util.List;

public class HumanCreator{

    HumanVirtuesComposition humanVirtuesComposition;
    HumanStrategyComposition humanStrategyComposition;

    Human createNewHumanAdversary (Integer rank,
                                   HumanWeapon humanWeapon,
                                   HumanStrategy humanStrategy,
                                   boolean onlyFighters) {

        Human human = new Human();
        setVirtuesByRank(human,rank);
        human.setRank(rank);
        human.setBonusInitiative(human.getVirtueCunning());

        if(onlyFighters&&human.getVirtueProwess()==0){
            human.setVirtueProwess(human.getVirtueBeauty());
            human.setVirtueBeauty(0);
        }

        if(human.getVirtueStrength()>=3){
            human.setBonusCombatDices(1);
        }
        humanWeapon.setWeaponForHuman(human);
        humanStrategy.setStrategyForHuman(human,humanStrategyComposition.checkAndRollForStrategy(
                human.getVirtueProwess()+human.getBonusCombatDices()));

        return human;
    }


    void setVirtuesByRank(Human human, Integer rank) {
        switch (rank) {
            case 1:
                List<Integer> rankOneStats = humanVirtuesComposition.getRankOneStats();
                Collections.shuffle(rankOneStats);
                human.setVirtueBeauty(rankOneStats.get(0));
                human.setVirtueCourage(rankOneStats.get(1));
                human.setVirtueCunning(rankOneStats.get(2));
                human.setVirtueProwess(rankOneStats.get(3));
                human.setVirtueStrength(rankOneStats.get(4));
                human.setVirtueWisdom(rankOneStats.get(5));
                break;
            case 2:
                List<Integer> rankTwoStats = humanVirtuesComposition.getRankTwoStats();
                Collections.shuffle(rankTwoStats);
                human.setVirtueBeauty(rankTwoStats.get(0));
                human.setVirtueCourage(rankTwoStats.get(1));
                human.setVirtueCunning(rankTwoStats.get(2));
                human.setVirtueProwess(rankTwoStats.get(3));
                human.setVirtueStrength(rankTwoStats.get(4));
                human.setVirtueWisdom(rankTwoStats.get(5));
                break;
            case 3:
                List<Integer> rankThreeStats = humanVirtuesComposition.getRankThreeStats();
                Collections.shuffle(rankThreeStats);
                human.setVirtueBeauty(rankThreeStats.get(0));
                human.setVirtueCourage(rankThreeStats.get(1));
                human.setVirtueCunning(rankThreeStats.get(2));
                human.setVirtueProwess(rankThreeStats.get(3));
                human.setVirtueStrength(rankThreeStats.get(4));
                human.setVirtueWisdom(rankThreeStats.get(5));
                break;
            case 4:
                List<Integer> rankFourStats = humanVirtuesComposition.getRankFourStats();
                Collections.shuffle(rankFourStats);
                human.setVirtueBeauty(rankFourStats.get(0));
                human.setVirtueCourage(rankFourStats.get(1));
                human.setVirtueCunning(rankFourStats.get(2));
                human.setVirtueProwess(rankFourStats.get(3));
                human.setVirtueStrength(rankFourStats.get(4));
                human.setVirtueWisdom(rankFourStats.get(5));
                break;
            case 5:
                List<Integer> rankFiveStats = humanVirtuesComposition.getRankFiveStats();
                Collections.shuffle(rankFiveStats);
                human.setVirtueBeauty(rankFiveStats.get(0));
                human.setVirtueCourage(rankFiveStats.get(1));
                human.setVirtueCunning(rankFiveStats.get(2));
                human.setVirtueProwess(rankFiveStats.get(3));
                human.setVirtueStrength(rankFiveStats.get(4));
                human.setVirtueWisdom(rankFiveStats.get(5));
                break;
            case 6:
                List<Integer> rankSixStats = humanVirtuesComposition.getRankSixStats();
                Collections.shuffle(rankSixStats);
                human.setVirtueBeauty(rankSixStats.get(0));
                human.setVirtueCourage(rankSixStats.get(1));
                human.setVirtueCunning(rankSixStats.get(2));
                human.setVirtueProwess(rankSixStats.get(3));
                human.setVirtueStrength(rankSixStats.get(4));
                human.setVirtueWisdom(rankSixStats.get(5));
                break;

        }
    }
}
