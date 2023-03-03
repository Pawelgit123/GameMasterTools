package com.example.gamemastertools.alien;

public class AlienWeaponCreatorAuraxis {

    public static AlienWeapon createGuardian(){
        return new AlienWeapon.Builder()
                .name("Guardian G-Revolver")
                .type("Revolver")
                .manufacturer("Vanguard Security")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(800)
                .specials("Damage +1")
                .ammo("misc.")
                .weight("1")
                .build();
    }

    public static AlienWeapon createBlitz(){
        return new AlienWeapon.Builder()
                .name("Blitz GD-10")
                .type("SMG")
                .manufacturer("Vanguard Security")
                .bonus(0)
                .damage(1)
                .range("Short")
                .cost(1180)
                .specials("Auto:5 / H-Capacity")
                .ammo("HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createCyclone(){
        return new AlienWeapon.Builder()
                .name("Blitz GD-10")
                .type("SMG")
                .manufacturer("Vanguard Security")
                .bonus(1)
                .damage(2)
                .range("Medium")
                .cost(1600)
                .specials("Auto:3 / H-Capacity / Damage +1")
                .ammo("HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createClaw(){
        return new AlienWeapon.Builder()
                .name("GD-66 Claw")
                .type("Rifle")
                .manufacturer("Vanguard Security")
                .bonus(2)
                .damage(3)
                .range("Medium")
                .cost(2300)
                .specials("Damage +1")
                .ammo("Slug")
                .weight("1")
                .build();
    }

    public static AlienWeapon createCharger(){
        return new AlienWeapon.Builder()
                .name("MGR-C1 Charger")
                .type("A-Rifle")
                .manufacturer("Vanguard Security")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(1550)
                .specials("Auto:2 / Damage +1")
                .ammo("Std / FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createPromise(){
        return new AlienWeapon.Builder()
                .name("MGR-L1 Promise")
                .type("LMG")
                .manufacturer("Vanguard Security")
                .bonus(1)
                .damage(4)
                .range("Long")
                .cost(1550)
                .specials("Auto:2 / H-Capacity / Damage +1")
                .ammo("Std / FMJ")
                .weight("3")
                .build();
    }

    public static AlienWeapon createGrinder(){
        return new AlienWeapon.Builder()
                .name("AF-23 Grinder")
                .type("Heavy")
                .manufacturer("Vanguard Security")
                .bonus(2)
                .damage(8)
                .range("Extreme")
                .cost(9050)
                .specials("Auto:2 / H-Capacity / Damage +1")
                .ammo("FMJ")
                .weight("5")
                .build();
    }

    public static AlienWeapon createPiston(){
        return new AlienWeapon.Builder()
                .name("Piston")
                .type("S-Rifle")
                .manufacturer("Vanguard Security")
                .bonus(0)
                .damage(7)
                .range("Extreme")
                .cost(11500)
                .specials("Scope / CriticalHit / Stability")
                .ammo("AP")
                .weight("3")
                .build();
    }


    public static AlienWeapon createRutherford(){
        return new AlienWeapon.Builder()
                .name("SG-ARX Rutherford")
                .type("Rifle")
                .manufacturer("Auraxis Expedition")
                .bonus(2)
                .damage(3)
                .range("Short")
                .cost(890)
                .specials("Damage +1")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createAmp(){
        return new AlienWeapon.Builder()
                .name("T4 AMP")
                .type("Pistol")
                .manufacturer("Proxima Corp")
                .bonus(0)
                .damage(1)
                .range("Medium")
                .cost(99)
                .specials("Auto:1")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createJackal(){
        return new AlienWeapon.Builder()
                .name("SMG-46 Jackal")
                .type("SMG")
                .manufacturer("Proxima Corp")
                .bonus(0)
                .damage(1)
                .range("Short")
                .cost(999)
                .specials("Auto:6 / H-Capacity")
                .ammo("HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createMastiff(){
        return new AlienWeapon.Builder()
                .name("Mastiff")
                .type("Rifle")
                .manufacturer("Proxima Corp")
                .bonus(0)
                .damage(4)
                .range("Short")
                .cost(999)
                .specials("Push:2")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon create100(){
        return new AlienWeapon.Builder()
                .name("AR-100")
                .type("A-Rifle")
                .manufacturer("Proxima Corp")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(999)
                .specials("Auto:3")
                .ammo("HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createWatchmen(){
        return new AlienWeapon.Builder()
                .name("MG-H1 Watchman")
                .type("LMG")
                .manufacturer("Proxima Corp")
                .bonus(1)
                .damage(3)
                .range("Long")
                .cost(999)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std")
                .weight("2")
                .build();
    }

    public static AlienWeapon createMutilator(){
        return new AlienWeapon.Builder()
                .name("M2 Mutilator")
                .type("LMG")
                .manufacturer("Proxima Corp")
                .bonus(1)
                .damage(7)
                .range("Long")
                .cost(9999)
                .specials("Auto:3 / H-Capacity")
                .ammo("HP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createNS7(){
        return new AlienWeapon.Builder()
                .name("NS-7 PDW")
                .type("SMG")
                .manufacturer("Nanites Systems")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(1750)
                .specials("Auto:4 / H-Capacity")
                .ammo("AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createHSG(){
        return new AlienWeapon.Builder()
                .name("Nanites HSG-400")
                .type("Rifle")
                .manufacturer("Nanites Systems")
                .bonus(2)
                .damage(2)
                .range("Short")
                .cost(640)
                .specials("")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createXMG(){
        return new AlienWeapon.Builder()
                .name("Nanites XMG-100")
                .type("LMG")
                .manufacturer("Nanites Systems")
                .bonus(2)
                .damage(3)
                .range("Long")
                .cost(6800)
                .specials("Auto:3")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createBeamer(){
        return new AlienWeapon.Builder()
                .name("Beamer VS3")
                .type("Pistol")
                .manufacturer("V-Core")
                .bonus(0)
                .damage(1)
                .range("Medium")
                .cost(950)
                .specials("")
                .ammo("Battery")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createManticore(){
        return new AlienWeapon.Builder()
                .name("Manticore SX40")
                .type("Pistol")
                .manufacturer("V-Core")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(1210)
                .specials("")
                .ammo("Battery")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createCerberus(){
        return new AlienWeapon.Builder()
                .name("Cerberus")
                .type("Revolver")
                .manufacturer("V-Core")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(1410)
                .specials("Armor -1")
                .ammo("Battery-AP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createEridani(){
        return new AlienWeapon.Builder()
                .name("Eridani SX5")
                .type("SMG")
                .manufacturer("V-Core")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(3590)
                .specials("Auto:4 / Armor -1 / H-Capacity")
                .ammo("Battery-AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createPandora(){
        return new AlienWeapon.Builder()
                .name("Pandora VX25")
                .type("Rifle")
                .manufacturer("V-Core")
                .bonus(1)
                .damage(3)
                .range("Short")
                .cost(2690)
                .specials("Armor -1")
                .ammo("Battery-AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createEquinox(){
        return new AlienWeapon.Builder()
                .name("Equinox")
                .type("A-Rifle")
                .manufacturer("V-Core")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(4330)
                .specials("Auto:2 / Armor -1")
                .ammo("Battery-AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createPolaris(){
        return new AlienWeapon.Builder()
                .name("VX29 Polaris")
                .type("LMG")
                .manufacturer("V-Core")
                .bonus(3)
                .damage(3)
                .range("Long")
                .cost(6770)
                .specials("Auto:1 / Armor -2")
                .ammo("Battery-AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createSlicer(){
        return new AlienWeapon.Builder()
                .name("VX4-3 Slicer")
                .type("S-Rifle")
                .manufacturer("V-Core")
                .bonus(2)
                .damage(6)
                .range("Extreme")
                .cost(15530)
                .specials("Scope / CriticalHit")
                .ammo("Battery-AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createSpectre(){
        return new AlienWeapon.Builder()
                .name("VA39 Spectre")
                .type("S-Rifle")
                .manufacturer("V-Core")
                .bonus(3)
                .damage(4)
                .range("Extreme")
                .cost(15530)
                .specials("Scope / CriticalHit / H-Capacity")
                .ammo("Battery-AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createQuasar(){
        return new AlienWeapon.Builder()
                .name("Quasar VM1")
                .type("Heavy")
                .manufacturer("V-Core")
                .bonus(2)
                .damage(5)
                .range("Extreme")
                .cost(22750)
                .specials("Auto:1 / H-Capacity")
                .ammo("Battery-AP")
                .weight("3")
                .build();
    }

}
