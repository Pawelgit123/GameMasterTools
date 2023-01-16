package com.example.gamemastertools.blood;

import java.util.Random;

public class WeaponRandomByRank implements HumanWeapon {

    void setWeaponForRankOne(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);


        switch (toss) {
            case 0:
            case 1:
                WeaponUnarmed weaponUnarmed = new WeaponUnarmed();
                weaponUnarmed.setWeaponForHuman(human);
                break;
            case 2:
            case 3:
                WeaponDagger weaponDagger = new WeaponDagger();
                weaponDagger.setWeaponForHuman(human);
                break;
            case 4:
                WeaponAxe weaponAxe = new WeaponAxe();
                weaponAxe.setWeaponForHuman(human);
            case 5:
            case 6:
                WeaponMace weaponMace = new WeaponMace();
                weaponMace.setWeaponForHuman(human);
                break;
            case 7:
            case 8:
            case 9:
                WeaponSpear weaponSpear = new WeaponSpear();
                weaponSpear.setWeaponForHuman(human);
                break;
        }
    }

    void setWeaponForRankTwo(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                WeaponDagger weaponDagger = new WeaponDagger();
                weaponDagger.setWeaponForHuman(human);
                break;
            case 1:
                WeaponAxe weaponAxe = new WeaponAxe();
                weaponAxe.setWeaponForHuman(human);
                break;
            case 2:
                WeaponAxeHeavy weaponAxeHeavy = new WeaponAxeHeavy();
                weaponAxeHeavy.setWeaponForHuman(human);
                break;
            case 3:
            case 4:
                WeaponMace weaponMace = new WeaponMace();
                weaponMace.setWeaponForHuman(human);
                break;
            case 5:
                WeaponMaceHeavy weaponMaceHeavy = new WeaponMaceHeavy();
                weaponMaceHeavy.setWeaponForHuman(human);
                break;
            case 6:
            case 7:
                WeaponSpear weaponSpear = new WeaponSpear();
                weaponSpear.setWeaponForHuman(human);
                break;
            case 8:
            case 9:
                WeaponSword weaponSword = new WeaponSword();
                weaponSword.setWeaponForHuman(human);
                break;
        }
    }

    void setWeaponForRankThree(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                WeaponMace weaponMace = new WeaponMace();
                weaponMace.setWeaponForHuman(human);
                break;
            case 1:
                WeaponMaceHeavy weaponMaceHeavy = new WeaponMaceHeavy();
                weaponMaceHeavy.setWeaponForHuman(human);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                WeaponSpear weaponSpear = new WeaponSpear();
                weaponSpear.setWeaponForHuman(human);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                WeaponSword weaponSword = new WeaponSword();
                weaponSword.setWeaponForHuman(human);
                break;
        }
    }

    void setWeaponForRankFour(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
                WeaponAxeHeavy weaponAxeHeavy = new WeaponAxeHeavy();
                weaponAxeHeavy.setWeaponForHuman(human);
                break;
            case 1:
                WeaponMaceHeavy weaponMaceHeavy = new WeaponMaceHeavy();
                weaponMaceHeavy.setWeaponForHuman(human);
                break;
            case 2:
            case 3:
            case 4:
                WeaponSpear weaponSpear = new WeaponSpear();
                weaponSpear.setWeaponForHuman(human);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                WeaponSword weaponSword = new WeaponSword();
                weaponSword.setWeaponForHuman(human);
                break;
            case 9:
                WeaponSwordHeavy weaponSwordHeavy = new WeaponSwordHeavy();
                weaponSwordHeavy.setWeaponForHuman(human);
                break;
        }
    }

    void setWeaponForRankFive(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
            case 1:
                WeaponAxeHeavy weaponAxeHeavy = new WeaponAxeHeavy();
                weaponAxeHeavy.setWeaponForHuman(human);
                break;
            case 2:
            case 3:
                WeaponMaceHeavy weaponMaceHeavy = new WeaponMaceHeavy();
                weaponMaceHeavy.setWeaponForHuman(human);
                break;
            case 4:
                WeaponSpear weaponSpear = new WeaponSpear();
                weaponSpear.setWeaponForHuman(human);
                break;
            case 5:
            case 6:
            case 7:
                WeaponSword weaponSword = new WeaponSword();
                weaponSword.setWeaponForHuman(human);
                break;
            case 8:
            case 9:
                WeaponSwordHeavy weaponSwordHeavy = new WeaponSwordHeavy();
                weaponSwordHeavy.setWeaponForHuman(human);
                break;
        }
    }

    void setWeaponForRankSix(Human human) {
        Random coin = new Random();
        int toss = coin.nextInt(9);
        switch (toss) {
            case 0:
            case 1:
                WeaponMaceHeavy weaponMaceHeavy = new WeaponMaceHeavy();
                weaponMaceHeavy.setWeaponForHuman(human);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                WeaponSword weaponSword = new WeaponSword();
                weaponSword.setWeaponForHuman(human);
                break;
            case 7:
            case 8:
            case 9:
                WeaponSwordHeavy weaponSwordHeavy = new WeaponSwordHeavy();
                weaponSwordHeavy.setWeaponForHuman(human);
                break;
        }
    }


    @Override
    public void setWeaponForHuman(Human human) {

        switch (human.getRank()) {
            case 1:
                setWeaponForRankOne(human);
                break;
            case 2:
                setWeaponForRankTwo(human);
                break;
            case 3:
                setWeaponForRankThree(human);
                break;
            case 4:
                setWeaponForRankFour(human);
                break;
            case 5:
                setWeaponForRankFive(human);
                break;
            case 6:
                setWeaponForRankSix(human);
                break;

        }
    }
}
