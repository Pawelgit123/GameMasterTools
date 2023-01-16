package com.example.gamemastertools.blood;


import java.util.List;

public class Battle implements Adversary{

    private List<Adversary> adversaryList;

    public List<Adversary> getAdversaryList() {
        return adversaryList;
    }

    public void setAdversaryList(List<Adversary> adversaryList) {
        this.adversaryList = adversaryList;
    }

    public Battle(List<Adversary> adversaryList){
        this.adversaryList = adversaryList;

    }
    public Battle(){
    }

    @Override
    public void rollForInitiative() {

        for (Adversary adv:adversaryList) {
            adv.rollForInitiative();
        }

    }
}
