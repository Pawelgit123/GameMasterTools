package com.example.gamemastertools.alien;

public class AlienWeaponCreatorPandora {

    public static AlienWeapon createZPistol(){
        return new AlienWeapon.Builder()
                .name("Z-33 Pistol")
                .type("Pistol")
                .manufacturer("RDA")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(700)
                .specials("Auto:1")
                .ammo("FMJ")
                .weight("1/2")
                .build();
    }

    public  static AlienWeapon createWaspRevolver(){
        return new AlienWeapon.Builder()
                .name("SN-9 Wasp Revolver")
                .type("Revolver")
                .manufacturer("Matanza Arms Corporation")
                .bonus(1)
                .damage(2)
                .range("Medium")
                .cost(840)
                .specials("Auto:1 / Armor -1")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public  static AlienWeapon createSentinelSmg(){
        return new AlienWeapon.Builder()
                .name("CARB Sentinel")
                .type("SMG")
                .manufacturer("Matanza Arms Corporation")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(0)
                .specials("Auto:1/3 / H-Capacity")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public  static AlienWeapon createRangerRifle(){
        return new AlienWeapon.Builder()
                .name("CARB Ranger")
                .type("Rifle")
                .manufacturer("Matanza Arms Corporation")
                .bonus(0)
                .damage(4)
                .range("Short")
                .cost(0)
                .specials("")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public  static AlienWeapon createBullpupRifle(){
        return new AlienWeapon.Builder()
                .name("Y70 Bullpup Rifle")
                .type("Rifle")
                .manufacturer("RDA")
                .bonus(2)
                .damage(4)
                .range("Short")
                .cost(0)
                .specials("Grenade Launcher")
                .ammo("Gauge(da)")
                .weight("2")
                .build();
    }

    public  static AlienWeapon createCarbine(){
        return new AlienWeapon.Builder()
                .name("CARB Carbine")
                .type("A-Rifle")
                .manufacturer("Matanza Arms Corporation")
                .bonus(1)
                .damage(3)
                .range("Long")
                .cost(0)
                .specials("Auto:1/3")
                .ammo("Std / Exp")
                .weight("1")
                .build();
    }

    public  static AlienWeapon createBasicUnit(){
        return new AlienWeapon.Builder()
                .name("CARB Basic Unit")
                .type("A-Rifle")
                .manufacturer("Matanza Arms Corporation")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(0)
                .specials("Auto:1/2")
                .ammo("Std / Exp")
                .weight("1")
                .build();
    }

    public  static AlienWeapon createSolarisRifle(){
        return new AlienWeapon.Builder()
                .name("Solaris")
                .type("A-Rifle")
                .manufacturer("RDA")
                .bonus(2)
                .damage(2)
                .range("Extreme")
                .cost(0)
                .specials("")
                .ammo("Exp")
                .weight("1")
                .build();
    }

    public  static AlienWeapon createEurysRifle(){
        return new AlienWeapon.Builder()
                .name("Eurys")
                .type("A-Rifle")
                .manufacturer("RDA")
                .bonus(1)
                .damage(3)
                .range("Extreme")
                .cost(0)
                .specials("Auto:1")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public  static AlienWeapon createGS(){
        return new AlienWeapon.Builder()
                .name("GS-221")
                .type("LMG")
                .manufacturer("IBSF Protection Solutions")
                .bonus(2)
                .damage(3)
                .range("Long")
                .cost(0)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std / Exp")
                .weight("2")
                .build();
    }

    public  static AlienWeapon createGau(){
        return new AlienWeapon.Builder()
                .name("Gau 45s")
                .type("LMG")
                .manufacturer("IBSF Protection Solutions")
                .bonus(1)
                .damage(5)
                .range("Long")
                .cost(0)
                .specials("Auto:1")
                .ammo("Std / Exp")
                .weight("4")
                .build();
    }

    public static  AlienWeapon createMachineGunSix(){
        return new AlienWeapon.Builder()
                .name("M60 Machine Gun")
                .type("LMG")
                .manufacturer("IBSF Protection Solutions")
                .bonus(2)
                .damage(3)
                .range("Long")
                .cost(0)
                .specials("Auto:3 / H-Capacity")
                .ammo("FMJ")
                .weight("3")
                .build();
    }

    public static  AlienWeapon createMachineGunNine(){
        return new AlienWeapon.Builder()
                .name("Gau 90")
                .type("Suit")
                .manufacturer("IBSF Protection Solutions")
                .bonus(2)
                .damage(9)
                .range("Extreme")
                .cost(0)
                .specials("Auto:1 / H-Capacity")
                .ammo("Std / FMJ / Exp")
                .weight("5")
                .build();
    }

    public  static AlienWeapon createHydra(){
        return new AlienWeapon.Builder()
                .name("MBS-9M Hydra")
                .type("Heavy")
                .manufacturer("Massa-Cirre Ltd")
                .bonus(2)
                .damage(5)
                .range("Extreme")
                .cost(0)
                .specials("Auto:3 / H-Capacity")
                .ammo("AP")
                .weight("4")
                .build();
    }

    public  static AlienWeapon createFlamethrower(){
        return new AlienWeapon.Builder()
                .name("FD-3 Flamethrower")
                .type("Heavy")
                .manufacturer("Matanza Arms Corporation")
                .bonus(1)
                .damage(8)
                .range("Long")
                .cost(0)
                .specials("Damage +2")
                .ammo("Fire")
                .weight("1")
                .build();
    }

    public  static AlienWeapon createSentryGun(){
        return new AlienWeapon.Builder()
                .name("MBS-22A Sentry Gun")
                .type("Sentry")
                .manufacturer("Massa-Cirre Ltd")
                .bonus(1)
                .damage(4)
                .range("Extreme")
                .cost(0)
                .specials("Auto:2 / RC-9")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public  static AlienWeapon createSoundCannon(){
        return new AlienWeapon.Builder()
                .name("AHD-9 Sound Cannon")
                .type("Heavy")
                .manufacturer("RDA")
                .bonus(5)
                .damage(1)
                .range("Extreme")
                .cost(0)
                .specials("Stun")
                .ammo("Battery-DA")
                .weight("4")
                .build();
    }
}
