package com.example.gamemastertools.blood;

public class WeaponMaceHeavy implements HumanWeapon{

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices() + human.getVirtueStrength());

    }
}
