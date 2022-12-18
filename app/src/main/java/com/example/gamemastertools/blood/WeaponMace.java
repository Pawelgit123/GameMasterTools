package com.example.gamemastertools.blood;

public class WeaponMace implements HumanWeapon {

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices() + 1);

    }
}
