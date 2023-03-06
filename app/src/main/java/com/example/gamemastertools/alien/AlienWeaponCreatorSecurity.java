package com.example.gamemastertools.alien;

public class AlienWeaponCreatorSecurity {

    public static AlienWeapon createRhinoRevolver() {
        return new AlienWeapon.Builder()
                .name("Rhino 50DS")
                .type("Revolver")
                .manufacturer("CW Arms")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(300)
                .specials("")
                .ammo("misc.")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createPdwSmg() {
        return new AlienWeapon.Builder()
                .name("P90-CF PDW")
                .type("SMG")
                .manufacturer("CW Arms")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(770)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createGmRiotGun() {
        return new AlienWeapon.Builder()
                .name("GM-94")
                .type("Rifle")
                .manufacturer("Atlas Security")
                .bonus(1)
                .damage(3)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("BR")
                .weight("1")
                .build();
    }

    public static AlienWeapon createBrARifle() {
        return new AlienWeapon.Builder()
                .name("BR18")
                .type("A-Rifle")
                .manufacturer("Atlas Security")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(470)
                .specials("Auto:1")
                .ammo("BR")
                .weight("1")
                .build();
    }

    public static AlienWeapon createNoxPistol() {
        return new AlienWeapon.Builder()
                .name("Nox PW")
                .type("Pistol")
                .manufacturer("Atlas Security")
                .bonus(0)
                .damage(1)
                .range("Long")
                .cost(225)
                .specials("")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createPdpPistol() {
        return new AlienWeapon.Builder()
                .name("PDP Tactical Pistol")
                .type("Pistol")
                .manufacturer("CW Arms")
                .bonus(2)
                .damage(1)
                .range("Long")
                .cost(340)
                .specials("")
                .ammo("Std / FMJ")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createWmShotgun() {
        return new AlienWeapon.Builder()
                .name("Riot Shotgun")
                .type("Rifle")
                .manufacturer("Atlas Security")
                .bonus(2)
                .damage(3)
                .range("Short")
                .cost(720)
                .specials("")
                .ammo("BR")
                .weight("1")
                .build();
    }

    public static AlienWeapon createWmARifle() {
        return new AlienWeapon.Builder()
                .name("Assault Rifle Model 34")
                .type("A-Rifle")
                .manufacturer("Atlas Security")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(940)
                .specials("Auto:3")
                .ammo("Std / HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon create15Compact() {
        return new AlienWeapon.Builder()
                .name("15th Compact")
                .type("A-Rifle")
                .manufacturer("H.E.R.A. Industries")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(500)
                .specials("Auto:1")
                .ammo("Std / HP / FMJ")
                .weight("1")
                .build();
    }
    public static AlienWeapon createTheNine() {
        return new AlienWeapon.Builder()
                .name("The-9ers")
                .type("A-Rifle")
                .manufacturer("H.E.R.A. Industries")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(650)
                .specials("Auto:1")
                .ammo("Std / HP / FMJ")
                .weight("1")
                .build();
    }


    public static AlienWeapon create7SixRifle() {
        return new AlienWeapon.Builder()
                .name("7SIX2 AR10 Rifle")
                .type("A-Rifle")
                .manufacturer("H.E.R.A. Industries")
                .bonus(2)
                .damage(2)
                .range("Extreme")
                .cost(2200)
                .specials("Auto:1")
                .ammo("Std / HP / FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createScarRifle() {
        return new AlienWeapon.Builder()
                .name("Scar Gun")
                .type("A-Rifle")
                .manufacturer("Goliath Holdings")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(670)
                .specials("Auto:3")
                .ammo("Std")
                .weight("1")
                .build();
    }
}
