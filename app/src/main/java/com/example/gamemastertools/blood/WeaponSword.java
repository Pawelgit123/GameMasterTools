package com.example.gamemastertools.blood;

public class WeaponSword implements HumanWeapon {

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices() + 2);
        human.setWeapon("Sword");

    }
}
