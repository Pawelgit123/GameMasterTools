package com.example.gamemastertools.blood;

public class WeaponUnarmed implements HumanWeapon {

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices());

    }
}
