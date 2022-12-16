package com.example.gamemastertools.blood;

public class HumanBonuses {

    public void setBonusesForAdversary(HumanAdversary human, HumanWeapons weapons){

        switch (weapons){
            case SPEAR: human.setBonusInitiative(human.getVirtueProwess());
            case HAMMER: human.setBonusCombatDices(human.getBonusCombatDices()+1);
            case SWORD: human.setBonusCombatDices(human.getBonusCombatDices()+2);
            case NO_WEAPON: human.setBonusCombatDices(human.getBonusCombatDices());
        }
    }
}
