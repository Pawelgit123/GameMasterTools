package com.example.gamemastertools.blood;

import com.example.gamemastertools.dices.SixDice;

import java.util.ArrayList;
import java.util.List;

public class Human implements Adversary, Comparable<Human> {

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
    String name;
    String isLeader;
    int isLeaderNumCompare;
    String weapon;
    ArrayList<Integer> wounds;

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
    public void setName(String name) {
        this.name = name;
    }
    public void setIsLeader(String isLeader) {
        this.isLeader = isLeader;
    }
    public void setIsLeaderNumCompare(int isLeaderNumCompare) {
        this.isLeaderNumCompare = isLeaderNumCompare;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public void setWounds(ArrayList<Integer> wounds) {
        this.wounds = wounds;
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
    public String getName() {
        return name;
    }
    public String getIsLeader() {
        return isLeader;
    }
    public int getIsLeaderNumCompare() {
        return isLeaderNumCompare;
    }
    public String getWeapon() {
        return weapon;
    }
    public ArrayList<Integer> getWounds() {
        return wounds;
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

    @Override
    public int compareTo(Human o) {

       /* if(o.getIsLeaderNumCompare()==1){
            return Integer.compare(o.getIsLeaderNumCompare(),getIsLeaderNumCompare());
        } else {
        }*/

        return Integer.compare(o.getInitiative(),getInitiative());


    }
}
