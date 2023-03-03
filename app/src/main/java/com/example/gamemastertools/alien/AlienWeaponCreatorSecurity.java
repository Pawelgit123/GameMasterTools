package com.example.gamemastertools.alien;

public class AlienWeaponCreatorSecurity {

    public static AlienWeapon createRhinoRevolver(){
        return new AlienWeapon.Builder()
                .name("Rhino 50DS")
                .type("Revolver")
                .manufacturer("")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(300)
                .specials("")
                .ammo("misc.")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createPdwSmg(){
        return new AlienWeapon.Builder()
                .name("PDW")
                .type("SMG")
                .manufacturer("")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(270)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createGmRiotGun(){
        return new AlienWeapon.Builder()
                .name("GM-94")
                .type("Rifle")
                .manufacturer("")
                .bonus(1)
                .damage(3)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("BR")
                .weight("1")
                .build();
    }

    public static AlienWeapon createBrARifle(){
        return new AlienWeapon.Builder()
                .name("BR18")
                .type("A-Rifle")
                .manufacturer("")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(470)
                .specials("Auto:1")
                .ammo("BR")
                .weight("1")
                .build();
    }

    public static AlienWeapon createNoxPistol(){
        return new AlienWeapon.Builder()
                .name("Nox")
                .type("Pistol")
                .manufacturer("")
                .bonus(0)
                .damage(1)
                .range("Long")
                .cost(225)
                .specials("")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createPdpPistol(){
        return new AlienWeapon.Builder()
                .name("PDP Tactical Pistol")
                .type("Pistol")
                .manufacturer("")
                .bonus(2)
                .damage(1)
                .range("Long")
                .cost(340)
                .specials("")
                .ammo("Std / FMJ")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createWmShotgun(){
        return new AlienWeapon.Builder()
                .name("WM Riot Shotgun")
                .type("Rifle")
                .manufacturer("")
                .bonus(2)
                .damage(3)
                .range("Short")
                .cost(700)
                .specials("")
                .ammo("BR")
                .weight("1")
                .build();
    }

    public static AlienWeapon createWmARifle(){
        return new AlienWeapon.Builder()
                .name("WM Assault Rifle Model 34")
                .type("A-Rifle")
                .manufacturer("")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(900)
                .specials("Auto:3")
                .ammo("Std / HP")
                .weight("1")
                .build();
    }

}
