package com.example.gamemastertools.blood;

public class WeaponSpearHeavy implements HumanWeapon{

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusCombatDices(human.getBonusCombatDices() + 1);
        human.setBonusInitiative(human.getBonusInitiative() + human.getVirtueProwess());
        human.setWeapon("H-Spear");
    }
}
