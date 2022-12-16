package com.example.gamemastertools.blood;

public class HumanAdversary implements Adversary {

    int virtueBeauty;
    int virtueCourage;
    int virtueCunning;
    int virtueProwess;
    int virtueStrength;
    int virtueWisdom;

    int bonusInitiative;
    int bonusCombatDices;

    @Override
    public void rollForInitiative() {

    }

    @Override
    public void rollForStrategy() {

    }


    public HumanAdversary(int virtueBeauty, int virtueCourage, int virtueCunning, int virtueProwess, int virtueStrength, int virtueWisdom){
        this.virtueBeauty=virtueBeauty;
        this.virtueCourage=virtueCourage;
        this.virtueCunning=virtueCunning;
        this.virtueProwess=virtueProwess;
        this.virtueStrength=virtueStrength;
        this.virtueWisdom=virtueWisdom;
    }

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
}
