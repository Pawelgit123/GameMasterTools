package com.example.gamemastertools.blood;

public class WeaponDagger implements HumanWeapon{

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices());
        human.setWeapon("Dagger");

    }
}
