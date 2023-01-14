package com.example.gamemastertools.blood;

import java.util.List;

public class BattleCreator {

    HumanCreator humanCreator;
    WeaponRandomByRank weaponRandomByRank;
    HumanStrategy humanStrategy;

    public Battle createNewBattle(int number,
                                  int rank,
                                  boolean onlyFighters,
                                  boolean withLeader){

        Battle battle1 = new Battle();
        List<Adversary> adversaryList = battle1.getAdversaryList();
        int leaderBonus = 1;

        if(withLeader){
            Human newHumanAdversaryLeader = humanCreator.createNewHumanAdversary(rank+leaderBonus,weaponRandomByRank,humanStrategy, onlyFighters);
            adversaryList.add(newHumanAdversaryLeader);
            number--;
        }
        for (int i = 0; i < number; i++) {
            Human newHumanAdversary = humanCreator.createNewHumanAdversary(rank, weaponRandomByRank, humanStrategy, onlyFighters);
            adversaryList.add(newHumanAdversary);
        }

     return battle1;
    }

}
