package com.example.gamemastertools.blood;

import com.example.gamemastertools.dices.SixDice;

public class Human implements Adversary {

    int virtueBeauty;
    int virtueCourage;
    int virtueCunning;
    int virtueProwess;
    int virtueStrength;
    int virtueWisdom;

    int bonusInitiative;
    int bonusCombatDices;
    int initiativeDices;
    int combatDices;

    int rank;
    int initiative;

    public void setVirtueBeauty(int virtueBeauty) {
        this.virtueBeauty=virtueBeauty;
    }
    public void setVirtueCourage(int virtueCourage) {
        this.virtueCourage=virtueCourage;
    }
    public void setVirtueCunning(int virtueCunning) {
        this.virtueCunning=virtueCunning;
    }
    public void setVirtueProwess(int virtueProwess) {
        this.virtueProwess=virtueProwess;
    }
    public void setVirtueStrength(int virtueStrength) {
        this.virtueStrength=virtueStrength;
    }
    public void setVirtueWisdom(int virtueWisdom) {
        this.virtueWisdom=virtueWisdom;
    }

    public void setBonusCombatDices(int bonusCombatDices) {
        this.bonusCombatDices = bonusCombatDices;
    }
    public void setBonusInitiative(int bonusInitiative) {
        this.bonusInitiative = bonusInitiative;
    }
    public void setCombatDices(int combatDices) {
        this.combatDices = combatDices;
    }
    public void setInitiativeDices(int initiativeDices) {
        this.initiativeDices = initiativeDices;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getVirtueBeauty() {
        return this.virtueBeauty;
    }
    public int getVirtueCourage() {
        return this.virtueCourage;
    }
    public int getVirtueCunning() {
        return this.virtueCunning;
    }
    public int getVirtueProwess() {
        return this.virtueProwess;
    }
    public int getVirtueStrength() {
        return this.virtueStrength;
    }
    public int getVirtueWisdom() {
        return this.virtueWisdom;
    }

    public int getBonusCombatDices() {
        return bonusCombatDices;
    }
    public int getBonusInitiative() {
        return bonusInitiative;
    }
    public int getCombatDices() {
        return combatDices;
    }
    public int getInitiativeDices() {
        return initiativeDices;
    }

    public int getRank() {
        return rank;
    }
    public int getInitiative() {
        return initiative;
    }

    @Override
    public void rollForInitiative() {
        int result = 0;
        int dices = getInitiativeDices();
        SixDice sixDice = new SixDice();

        for (int i = 0; i < dices; i++) {
            sixDice.rollADie();
            result += sixDice.getDiceValue();
        }

        setInitiative(result+getBonusInitiative());
    }

}
