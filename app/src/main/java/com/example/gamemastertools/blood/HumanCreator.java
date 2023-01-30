package com.example.gamemastertools.blood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanCreator {

    public static Human createNewHumanAdversary(Integer rank,
                                                boolean onlyFighters,
                                                HumanNameGiver humanNameGiver) {

        int humanQualityUpgrade = 1;

        Human human = new Human();
        setVirtuesByRank(human, rank);
        human.setRank(rank);
        human.setBonusInitiative(human.getRank() - humanQualityUpgrade);

        ArrayList<Integer> integerList = new ArrayList<>();
        human.setWounds(integerList);

        if (onlyFighters && human.getVirtueProwess() == 0) {
            human.setVirtueProwess(human.getVirtueBeauty());
            human.setVirtueBeauty(0);
        }

        if (human.getVirtueCourage() >= 3) {
            human.setBonusInitiative(human.getBonusInitiative() + humanQualityUpgrade);
        }
        if (human.getVirtueWisdom() >= 4) {
            human.setBonusCombatDices(human.getBonusCombatDices() + humanQualityUpgrade);
        }
        if (human.getVirtueCunning() >= 4) {
            human.setBonusCombatDices(human.getBonusCombatDices() + humanQualityUpgrade);
        }

        WeaponRandomByRank weaponRandomByRank = new WeaponRandomByRank();
        weaponRandomByRank.setWeaponForHuman(human);

        HumanStrategyComposition humanStrategyComposition = new HumanStrategyComposition();
        HumanStrategyBalanced humanStrategyBalanced = new HumanStrategyBalanced();
        humanStrategyBalanced.setStrategyForHuman(human, humanStrategyComposition.checkAndRollForStrategy(
                human.getVirtueProwess() + human.getBonusCombatDices()));

        if (human.getVirtueStrength() >= 3) {
            human.setCombatDices(human.getCombatDices() + humanQualityUpgrade);
        }
        if (human.getRank() >= 4) {
            human.setCombatDices(human.getCombatDices() + humanQualityUpgrade);
        }

        humanNameGiver.giveMeName(human);
        humanNameGiver.giveMeRankDescription(human);

        return human;
    }

    static void setVirtuesByRank(Human human, Integer rank) {
        switch (rank) {
            case 1:
                List<Integer> rankOneStats = HumanVirtuesComposition.rankOneStats;
                Collections.shuffle(rankOneStats);
                human.setVirtueBeauty(rankOneStats.get(0));
                human.setVirtueCourage(rankOneStats.get(1));
                human.setVirtueCunning(rankOneStats.get(2));
                human.setVirtueProwess(rankOneStats.get(3));
                human.setVirtueStrength(rankOneStats.get(4));
                human.setVirtueWisdom(rankOneStats.get(5));
                break;
            case 2:
                List<Integer> rankTwoStats = HumanVirtuesComposition.rankTwoStats;
                Collections.shuffle(rankTwoStats);
                human.setVirtueBeauty(rankTwoStats.get(0));
                human.setVirtueCourage(rankTwoStats.get(1));
                human.setVirtueCunning(rankTwoStats.get(2));
                human.setVirtueProwess(rankTwoStats.get(3));
                human.setVirtueStrength(rankTwoStats.get(4));
                human.setVirtueWisdom(rankTwoStats.get(5));
                break;
            case 3:
                List<Integer> rankThreeStats = HumanVirtuesComposition.rankThreeStats;
                Collections.shuffle(rankThreeStats);
                human.setVirtueBeauty(rankThreeStats.get(0));
                human.setVirtueCourage(rankThreeStats.get(1));
                human.setVirtueCunning(rankThreeStats.get(2));
                human.setVirtueProwess(rankThreeStats.get(3));
                human.setVirtueStrength(rankThreeStats.get(4));
                human.setVirtueWisdom(rankThreeStats.get(5));
                break;
            case 4:
                List<Integer> rankFourStats = HumanVirtuesComposition.rankFourStats;
                Collections.shuffle(rankFourStats);
                human.setVirtueBeauty(rankFourStats.get(0));
                human.setVirtueCourage(rankFourStats.get(1));
                human.setVirtueCunning(rankFourStats.get(2));
                human.setVirtueProwess(rankFourStats.get(3));
                human.setVirtueStrength(rankFourStats.get(4));
                human.setVirtueWisdom(rankFourStats.get(5));
                break;
            case 5:
                List<Integer> rankFiveStats = HumanVirtuesComposition.rankFiveStats;
                Collections.shuffle(rankFiveStats);
                human.setVirtueBeauty(rankFiveStats.get(0));
                human.setVirtueCourage(rankFiveStats.get(1));
                human.setVirtueCunning(rankFiveStats.get(2));
                human.setVirtueProwess(rankFiveStats.get(3));
                human.setVirtueStrength(rankFiveStats.get(4));
                human.setVirtueWisdom(rankFiveStats.get(5));
                break;
            case 6:
                List<Integer> rankSixStats = HumanVirtuesComposition.rankSixStats;
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
