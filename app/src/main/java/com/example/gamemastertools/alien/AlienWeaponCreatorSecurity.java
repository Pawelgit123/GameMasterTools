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

    public static AlienWeapon createMaximPistol() {
        return new AlienWeapon.Builder()
                .name("Maxim Pistol")
                .type("Pistol")
                .manufacturer("Whimurn Manufacturing")
                .bonus(3)
                .damage(1)
                .range("Medium")
                .cost(670)
                .specials("")
                .ammo("Hybrid(da)")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createInvictaSmg() {
        return new AlienWeapon.Builder()
                .name("Invicta")
                .type("SMG")
                .manufacturer("Whimurn Manufacturing")
                .bonus(3)
                .damage(1)
                .range("Medium")
                .cost(670)
                .specials("Auto:3")
                .ammo("Hybrid(da)")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createAradRifle() {
        return new AlienWeapon.Builder()
                .name("Arad Assault Rifle")
                .type("A-Rifle")
                .manufacturer("Whimurn Manufacturing")
                .bonus(3)
                .damage(1)
                .range("Long")
                .cost(670)
                .specials("")
                .ammo("Hybrid(da)")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createLP4() {
        return new AlienWeapon.Builder()
                .name("LP4 Security Pistol")
                .type("Pistol")
                .manufacturer("Cousteau & Co")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(630)
                .specials("Auto:2")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createSafin() {
        return new AlienWeapon.Builder()
                .name("Safin PDW")
                .type("SMG")
                .manufacturer("Cousteau & Co")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(880)
                .specials("Auto:3 / H-Capacity / Accelerator:+1")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createCarmel() {
        return new AlienWeapon.Builder()
                .name("Carmel")
                .type("A-Rifle")
                .manufacturer("Cousteau & Co")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(1700)
                .specials("Auto:2 / H-Capacity / Accelerator:+1")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createSpectral() {
        return new AlienWeapon.Builder()
                .name("Spectral")
                .type("LMG")
                .manufacturer("Cousteau & Co")
                .bonus(1)
                .damage(4)
                .range("Long")
                .cost(4500)
                .specials("Auto:1 / Accelerator:+1")
                .ammo("Std / FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createReaperRifle() {
        return new AlienWeapon.Builder()
                .name("Reaper")
                .type("A-Rifle")
                .manufacturer("Morian Custom Rifles, Inc")
                .bonus(0)
                .damage(4)
                .range("Extreme")
                .cost(4000)
                .specials("Scope")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createAlphaOne() {
        return new AlienWeapon.Builder()
                .name("Alpha-1")
                .type("SMG")
                .manufacturer("Terminus Armstech")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(3200)
                .specials("Auto:3")
                .ammo("AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createAlphaTwo() {
        return new AlienWeapon.Builder()
                .name("Alpha-2")
                .type("SMG")
                .manufacturer("Terminus Armstech")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(3700)
                .specials("Auto:3 / H-Capacity")
                .ammo("AP")
                .weight("1")
                .build();
    }
}
