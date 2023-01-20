package com.example.gamemastertools.blood;

import java.util.ArrayList;
import java.util.List;

public class BattleCreator {

    public static Battle createNewBattle(int number,
                                  int rank,
                                  boolean onlyFighters,
                                  boolean withLeader){

        Battle battle1 = new Battle();
        List<Human> adversaryList = new ArrayList<>();
        battle1.setAdversaryList(adversaryList);

        HumanNameGiver humanNameGiver = new HumanNameGiver();

        int leaderBonus = 1;

        if(withLeader){
            Human newHumanAdversaryLeader = HumanCreator.createNewHumanAdversary(rank+leaderBonus, onlyFighters, humanNameGiver);
            newHumanAdversaryLeader.setIsLeader("LEADER");
            newHumanAdversaryLeader.setIsLeaderNumCompare(1);
            adversaryList.add(newHumanAdversaryLeader);
            number--;
        }
        for (int i = 0; i < number; i++) {
            Human newHumanAdversary = HumanCreator.createNewHumanAdversary(rank, onlyFighters, humanNameGiver);
            adversaryList.add(newHumanAdversary);
        }

     return battle1;
    }

}
