package com.example.gamemastertools.alien;

public class AlienWeaponCreatorOriginal {

    public static AlienWeapon createOriginalServicePistol() {
        return new AlienWeapon.Builder()
                .name("M4A3 Service Pistol")
                .type("Pistol")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(200)
                .specials("")
                .ammo("Standard")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalReximPistol() {
        return new AlienWeapon.Builder()
                .name("Rexim RXF-M5 Eva Pistol")
                .type("Pistol")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("Standard")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalInjectionPistol() {
        return new AlienWeapon.Builder()
                .name("TX-0 C-B Injection Air Pistol")
                .type("Pistol")
                .manufacturer("Lasalle Bionational")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(300)
                .specials("")
                .ammo("Dart")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalVpPistol() {
        return new AlienWeapon.Builder()
                .name("VP-70MA6 SA Pistol")
                .type("Pistol")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(250)
                .specials("")
                .ammo("Standard")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalElectrostaticPistol() {
        return new AlienWeapon.Builder()
                .name("ES-4 SA Electrostatic Pistol")
                .type("Pistol")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(1000)
                .specials("Stun")
                .ammo("Armor Piercing")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalQszPistol() {
        return new AlienWeapon.Builder()
                .name("QSZ-203 SA Pistol")
                .type("Pistol")
                .manufacturer("Norcomm")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("Armor Piercing")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalMagnumRevolver() {
        return new AlienWeapon.Builder()
                .name(".357 Magnum Revolver")
                .type("Revolver")
                .manufacturer("Spearhead Armoury")
                .bonus(1)
                .damage(2)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("misc.")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalShotgunRifle() {
        return new AlienWeapon.Builder()
                .name("Model 37A2 12 Gauge Pump Action")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(3)
                .range("Short")
                .cost(500)
                .specials("")
                .ammo("Gauge")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalCrowdControlRifle() {
        return new AlienWeapon.Builder()
                .name("U4C Civilian CC Projectile Launcher")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(3)
                .range("Long")
                .cost(1100)
                .specials("")
                .ammo("BR / T3-TG")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalHarpoon() {
        return new AlienWeapon.Builder()
                .name("ASSO-400 Harpoon Grappling Gun")
                .type("Rifle")
                .manufacturer("SpaceSub")
                .bonus(2)
                .damage(2)
                .range("Short")
                .cost(300)
                .specials("One-Shot")
                .ammo("Harpoon")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalSuperNovaRifle() {
        return new AlienWeapon.Builder()
                .name("ES-7 Supernova DA Electrostatic Shockgun")
                .type("Rifle")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(2)
                .damage(2)
                .range("Short")
                .cost(1200)
                .specials("Stun")
                .ammo("Armor Piercing")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalPulseARifle() {
        return new AlienWeapon.Builder()
                .name("M41A Pulse Rifle")
                .type("A-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(1200)
                .specials("Auto:2 / U1-GL")
                .ammo("Armor Piercing")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalHeavyPulseARifle() {
        return new AlienWeapon.Builder()
                .name("M41AE2 Heavy Pulse Rifle")
                .type("A-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(3)
                .range("Extreme")
                .cost(1500)
                .specials("Auto:2")
                .ammo("Armor Piercing")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalAkPulseARifle() {
        return new AlienWeapon.Builder()
                .name("AK-4047 Pulse AR")
                .type("A-Rifle")
                .manufacturer("Norcomm")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(500)
                .specials("Auto:2")
                .ammo("Standard")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalRmcARifle() {
        return new AlienWeapon.Builder()
                .name("RMC F903WE Automatic AR")
                .type("A-Rifle")
                .manufacturer("Weyland-Yutani Corporation")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(500)
                .specials("Auto:2")
                .ammo("Standard")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalNsgARifle() {
        return new AlienWeapon.Builder()
                .name("NSG23 Automatic AR")
                .type("A-Rifle")
                .manufacturer("Weyland-Yutani Corporation")
                .bonus(2)
                .damage(2)
                .range("Long")
                .cost(1500)
                .specials("Auto:2 / ID23-UIU")
                .ammo("Armor Piercing")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalScopeARifle() {
        return new AlienWeapon.Builder()
                .name("M42A Scope Rifle")
                .type("A-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(2)
                .range("Extreme")
                .cost(1000)
                .specials("")
                .ammo("Armor Piercing")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalSmartGunLmg() {
        return new AlienWeapon.Builder()
                .name("M56A2 Smart Gun")
                .type("LMG")
                .manufacturer("Armat Battlefield Systems")
                .bonus(3)
                .damage(3)
                .range("Long")
                .cost(6000)
                .specials("Auto:2")
                .ammo("Armor Piercing")
                .weight("3")
                .build();
    }

    public static AlienWeapon createOriginalPlasmaRifle() {
        return new AlienWeapon.Builder()
                .name("XM99A Phased Plasma Pulse Rifle")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(0)
                .damage(4)
                .range("Extreme")
                .cost(20000)
                .specials("")
                .ammo("Armor Piercing Battery")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalSharpRifle() {
        return new AlienWeapon.Builder()
                .name("P9 SHARP Rifle")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(0)
                .damage(9)
                .range("Long")
                .cost(15000)
                .specials("")
                .ammo("Explosive")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalDischargerRifle() {
        return new AlienWeapon.Builder()
                .name("EDS-93 Zadak Plasma Discharger")
                .type("Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(1)
                .damage(5)
                .range("Short")
                .cost(60000)
                .specials("")
                .ammo("Battery")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalZvezdaRifle() {
        return new AlienWeapon.Builder()
                .name("Ilyasov EVI-86X Zvezda Plasma Rifle")
                .type("Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(2)
                .damage(4)
                .range("Long")
                .cost(50000)
                .specials("Defective (1 PP)")
                .ammo("Battery")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalSuitGun() {
        return new AlienWeapon.Builder()
                .name("Ak-104S Pulse Action Suit Gun")
                .type("Suit")
                .manufacturer("Norcomm")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(0)
                .specials("Auto:2")
                .ammo("Armor Piercing")
                .weight("")
                .build();
    }

    public static AlienWeapon createOriginalGrenadeLauncher() {
        return new AlienWeapon.Builder()
                .name("U1 Grenade Launcher")
                .type("Spec")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(9)
                .range("Long")
                .cost(600)
                .specials("Under Barrel")
                .ammo("Explosive")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalGrenadeLauncherR() {
        return new AlienWeapon.Builder()
                .name("U4A2 Repeating Grenade Launcher")
                .type("Heavy")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(0)
                .range("Long")
                .cost(1100)
                .specials("")
                .ammo("misc.")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalRpgLauncher() {
        return new AlienWeapon.Builder()
                .name("M5A3 RPG Launcher")
                .type("Heavy")
                .manufacturer("Cryoxis Arms LTD")
                .bonus(1)
                .damage(5)
                .range("Extreme")
                .cost(1800)
                .specials("")
                .ammo("Armor Piercing")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalRpgLauncherTwo() {
        return new AlienWeapon.Builder()
                .name("RPG122")
                .type("Heavy")
                .manufacturer("Norcomm")
                .bonus(0)
                .damage(5)
                .range("Extreme")
                .cost(1700)
                .specials("")
                .ammo("Armor Piercing")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalEnergyGun() {
        return new AlienWeapon.Builder()
                .name("72A Light Energy Weapon")
                .type("Heavy")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(6)
                .range("Extreme")
                .cost(10500)
                .specials("")
                .ammo("Armor Piercing Battery")
                .weight("3")
                .build();
    }

    public static AlienWeapon createOriginalPlasmaGun() {
        return new AlienWeapon.Builder()
                .name("M78 PIG Phased-Plasma Infantry Gun")
                .type("Heavy")
                .manufacturer("")
                .bonus(0)
                .damage(6)
                .range("Extreme")
                .cost(9000)
                .specials("")
                .ammo("Battery")
                .weight("3")
                .build();
    }

    public static AlienWeapon createOriginalPhalanxGun() {
        return new AlienWeapon.Builder()
                .name("UA-102-20 ITPB Phalanx")
                .type("Heavy")
                .manufacturer("")
                .bonus(2)
                .damage(4)
                .range("Long")
                .cost(25000)
                .specials("")
                .ammo("")
                .weight("")
                .build();
    }

    public static AlienWeapon createOriginalFlamer() {
        return new AlienWeapon.Builder()
                .name("M240 Incinerator Unit")
                .type("Heavy")
                .manufacturer("")
                .bonus(0)
                .damage(9)
                .range("Medium")
                .cost(500)
                .specials("")
                .ammo("Fire")
                .weight("1")
                .build();
    }

    public static AlienWeapon createOriginalFlamerUnderBarrel() {
        return new AlienWeapon.Builder()
                .name("ID23 Underbarrel Incinerator Unit")
                .type("Spec")
                .manufacturer("")
                .bonus(0)
                .damage(7)
                .range("Medium")
                .cost(700)
                .specials("Under Barrel")
                .ammo("Fire")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createOriginalFlamerHeavy() {
        return new AlienWeapon.Builder()
                .name("Flammenmacher 3 H-Incinerator Unit")
                .type("Heavy")
                .manufacturer("Weyland Corp")
                .bonus(1)
                .damage(12)
                .range("Long")
                .cost(2000)
                .specials("")
                .ammo("Fire")
                .weight("2")
                .build();
    }

    public static AlienWeapon createOriginalSentryGun() {
        return new AlienWeapon.Builder()
                .name("UA 571-C Sentry Gun")
                .type("Heavy")
                .manufacturer("")
                .bonus(2)
                .damage(4)
                .range("Extreme")
                .cost(2000)
                .specials("Auto:2 / RC-8")
                .ammo("Armor Piercing")
                .weight("3")
                .build();
    }

    public static AlienWeapon createOriginalBoltGun() {
        return new AlienWeapon.Builder()
                .name("DV-303 Bolt Gun")
                .type("Heavy")
                .manufacturer("Watatsumi")
                .bonus(0)
                .damage(3)
                .range("Short")
                .cost(3300)
                .specials("One-Shot / +2 Heavy Machinery")
                .ammo("Armor Piercing")
                .weight("1")
                .build();
    }

}
