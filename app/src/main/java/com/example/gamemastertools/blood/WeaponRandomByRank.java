package com.example.gamemastertools.blood;

import java.util.Random;

public class WeaponRandomByRank implements HumanWeapon {

    WeaponAxe weaponAxe;
    WeaponAxeHeavy weaponAxeHeavy;
    WeaponDagger weaponDagger;
    WeaponMace weaponMace;
    WeaponMaceHeavy weaponMaceHeavy;
    WeaponSpear weaponSpear;
    WeaponSword weaponSword;
    WeaponSwordHeavy weaponSwordHeavy;
    WeaponUnarmed weaponUnarmed;

    void setWeaponForRankOne(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                weaponUnarmed.setWeaponForHuman(human);
            case 1:
                weaponUnarmed.setWeaponForHuman(human);
            case 2:
                weaponDagger.setWeaponForHuman(human);
            case 3:
                weaponDagger.setWeaponForHuman(human);
            case 4:
                weaponAxe.setWeaponForHuman(human);
            case 5:
                weaponMace.setWeaponForHuman(human);
            case 6:
                weaponMace.setWeaponForHuman(human);
            case 7:
                weaponSpear.setWeaponForHuman(human);
            case 8:
                weaponSpear.setWeaponForHuman(human);
            case 9:
                weaponSpear.setWeaponForHuman(human);
        }
    }

    void setWeaponForRankTwo(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                weaponDagger.setWeaponForHuman(human);
            case 1:
                weaponAxe.setWeaponForHuman(human);
            case 2:
                weaponAxeHeavy.setWeaponForHuman(human);
            case 3:
                weaponMace.setWeaponForHuman(human);
            case 4:
                weaponMace.setWeaponForHuman(human);
            case 5:
                weaponMaceHeavy.setWeaponForHuman(human);
            case 6:
                weaponSpear.setWeaponForHuman(human);
            case 7:
                weaponSpear.setWeaponForHuman(human);
            case 8:
                weaponSword.setWeaponForHuman(human);
            case 9:
                weaponSword.setWeaponForHuman(human);
        }
    }

    void setWeaponForRankThree(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                weaponMace.setWeaponForHuman(human);
            case 1:
                weaponMaceHeavy.setWeaponForHuman(human);
            case 2:
                weaponSpear.setWeaponForHuman(human);
            case 3:
                weaponSpear.setWeaponForHuman(human);
            case 4:
                weaponSpear.setWeaponForHuman(human);
            case 5:
                weaponSpear.setWeaponForHuman(human);
            case 6:
                weaponSword.setWeaponForHuman(human);
            case 7:
                weaponSword.setWeaponForHuman(human);
            case 8:
                weaponSword.setWeaponForHuman(human);
            case 9:
                weaponSword.setWeaponForHuman(human);
        }


    }

    void setWeaponForRankFour(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                weaponAxeHeavy.setWeaponForHuman(human);
            case 1:
                weaponMaceHeavy.setWeaponForHuman(human);
            case 2:
                weaponSpear.setWeaponForHuman(human);
            case 3:
                weaponSpear.setWeaponForHuman(human);
            case 4:
                weaponSpear.setWeaponForHuman(human);
            case 5:
                weaponSword.setWeaponForHuman(human);
            case 6:
                weaponSword.setWeaponForHuman(human);
            case 7:
                weaponSword.setWeaponForHuman(human);
            case 8:
                weaponSword.setWeaponForHuman(human);
            case 9:
                weaponSwordHeavy.setWeaponForHuman(human);
        }
    }

    void setWeaponForRankFive(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                weaponAxeHeavy.setWeaponForHuman(human);
            case 1:
                weaponAxeHeavy.setWeaponForHuman(human);
            case 2:
                weaponMaceHeavy.setWeaponForHuman(human);
            case 3:
                weaponMaceHeavy.setWeaponForHuman(human);
            case 4:
                weaponSpear.setWeaponForHuman(human);
            case 5:
                weaponSword.setWeaponForHuman(human);
            case 6:
                weaponSword.setWeaponForHuman(human);
            case 7:
                weaponSword.setWeaponForHuman(human);
            case 8:
                weaponSwordHeavy.setWeaponForHuman(human);
            case 9:
                weaponSwordHeavy.setWeaponForHuman(human);
        }
    }

    void setWeaponForRankSix(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                weaponMaceHeavy.setWeaponForHuman(human);
            case 1:
                weaponMaceHeavy.setWeaponForHuman(human);
            case 2:
                weaponSword.setWeaponForHuman(human);
            case 3:
                weaponSword.setWeaponForHuman(human);
            case 4:
                weaponSword.setWeaponForHuman(human);
            case 5:
                weaponSword.setWeaponForHuman(human);
            case 6:
                weaponSword.setWeaponForHuman(human);
            case 7:
                weaponSwordHeavy.setWeaponForHuman(human);
            case 8:
                weaponSwordHeavy.setWeaponForHuman(human);
            case 9:
                weaponSwordHeavy.setWeaponForHuman(human);
        }
    }


    @Override
    public void setWeaponForHuman(Human human) {
        int humanRank = human.getRank();

        switch (humanRank) {
            case 1:
                setWeaponForRankOne(human);
            case 2:
                setWeaponForRankTwo(human);
            case 3:
                setWeaponForRankThree(human);
            case 4:
                setWeaponForRankFour(human);
            case 5:
                setWeaponForRankFive(human);
            case 6:
                setWeaponForRankSix(human);

        }
    }
}
