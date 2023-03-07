package com.example.gamemastertools.alien;

public class AlienWeaponCreatorElysium {

    public static AlienWeapon createTaserPistol() {
        return new AlienWeapon.Builder()
                .name("CD Taser Pistol")
                .type("Pistol")
                .manufacturer("Armadyne Corp")
                .bonus(2)
                .damage(1)
                .range("Short")
                .cost(600)
                .specials("Stun")
                .ammo("Battery(da)")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createTaserCarbine() {
        return new AlienWeapon.Builder()
                .name("CD Taser Carbine")
                .type("A-Rifle")
                .manufacturer("Armadyne Corp")
                .bonus(3)
                .damage(2)
                .range("Short")
                .cost(900)
                .specials("Stun")
                .ammo("Battery(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createVectorSmg() {
        return new AlienWeapon.Builder()
                .name("Vector")
                .type("SMG")
                .manufacturer("Armadyne Corp")
                .bonus(3)
                .damage(1)
                .range("Medium")
                .cost(1200)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createCousarRifle() {
        return new AlienWeapon.Builder()
                .name("Cousar Crowe Rifle")
                .type("A-Rifle")
                .manufacturer("Armadyne Corp")
                .bonus(2)
                .damage(2)
                .range("Long")
                .cost(1400)
                .specials("Auto:2 / SkySweeper")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createChemRail() {
        return new AlienWeapon.Builder()
                .name("ChemRail")
                .type("A-Rifle")
                .manufacturer("Armadyne Corp")
                .bonus(2)
                .damage(3)
                .range("Long")
                .cost(1400)
                .specials("Auto:2")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createSkySweeper() {
        return new AlienWeapon.Builder()
                .name("Sky Sweeper")
                .type("Spec")
                .manufacturer("Armadyne Corp")
                .bonus(1)
                .damage(6)
                .range("Long")
                .cost(2200)
                .specials("Under Barrel, Damage +1")
                .ammo("Exp")
                .weight("2")
                .build();
    }

    public static AlienWeapon createForSureLauncher() {
        return new AlienWeapon.Builder()
                .name("4Sure Ballistics Missile Launcher")
                .type("Heavy")
                .manufacturer("Armadyne Corp")
                .bonus(1)
                .damage(6)
                .range("Extreme")
                .cost(2200)
                .specials("Link")
                .ammo("AP")
                .weight("3")
                .build();
    }
}
