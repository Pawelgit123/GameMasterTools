package com.example.gamemastertools.blood;

public class WeaponSwordHeavy implements HumanWeapon{

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices() + 2);
        human.setBonusInitiative(human.getBonusInitiative() + 1);
        human.setWeapon("H-Sword");

    }
}
