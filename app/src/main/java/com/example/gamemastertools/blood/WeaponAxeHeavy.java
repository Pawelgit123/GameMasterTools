package com.example.gamemastertools.blood;

public class WeaponAxeHeavy implements HumanWeapon{

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices() + human.getVirtueStrength());
        human.setBonusInitiative(human.getBonusInitiative() + 1);
        human.setWeapon("H-Axe");

    }
}
