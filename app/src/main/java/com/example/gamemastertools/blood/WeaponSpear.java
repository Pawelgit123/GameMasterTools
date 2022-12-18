package com.example.gamemastertools.blood;

public class WeaponSpear implements HumanWeapon {

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusInitiative(human.getBonusInitiative() + human.getVirtueProwess());

    }
}
