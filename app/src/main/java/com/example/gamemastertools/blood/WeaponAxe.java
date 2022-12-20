package com.example.gamemastertools.blood;

public class WeaponAxe implements HumanWeapon{

    @Override
    public void setWeaponForHuman(Human human) {
        human.setBonusInitiative(human.getBonusInitiative() + 1);

    }
}
