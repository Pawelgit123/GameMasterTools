package com.example.gamemastertools.blood;

import java.util.List;

public class BattleCreator {

    HumanCreator humanCreator;
    WeaponRandomByRank weaponRandomByRank;
    HumanStrategy humanStrategy;

    Battle createNewBattle(Battle battle,
                           int number,
                           int rank,
                           boolean onlyFighters,
                           boolean additionalTraining,
                           boolean withLeader){

        Battle battle1 = new Battle();
        List<Adversary> adversaryList = battle1.getAdversaryList();

        //Todo additional options (booleans)

        for (int i = 0; i < number; i++) {
            Human newHumanAdversary = humanCreator.createNewHumanAdversary(rank, weaponRandomByRank, humanStrategy);
            adversaryList.add(newHumanAdversary);
        }




     return battle1;
    }
}
