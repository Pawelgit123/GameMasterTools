package com.example.gamemastertools.alien;

public class AlienWeaponCreatorOriginalPlus {

    public static AlienWeapon createServicePistol() {
        return new AlienWeapon.Builder()
                .name("M4A3 Service Pistol")
                .type("Pistol")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(200)
                .specials("")
                .ammo("Std / FMJ")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createReximPistol() {
        return new AlienWeapon.Builder()
                .name("Rexim RXF-M5 Eva Pistol")
                .type("Pistol")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createInjectionPistol() {
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

    public static AlienWeapon createVpPistol() {
        return new AlienWeapon.Builder()
                .name("VP-70MA6 SA Pistol")
                .type("Pistol")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(250)
                .specials("")
                .ammo("Std / FMJ")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createElectrostaticPistol() {
        return new AlienWeapon.Builder()
                .name("ES-4 SA Electrostatic Pistol")
                .type("Pistol")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(2)
                .damage(1)
                .range("Medium")
                .cost(1000)
                .specials("Stun")
                .ammo("AP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createQszPistol() {
        return new AlienWeapon.Builder()
                .name("QSZ-203 SA Pistol")
                .type("Pistol")
                .manufacturer("Norcomm")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("AP / HP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createMagnumRevolver() {
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

    public static AlienWeapon createShotgunRifle() {
        return new AlienWeapon.Builder()
                .name("Model 37A2 12 Gauge Pump Action")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(3)
                .range("Short")
                .cost(500)
                .specials("Push:1")
                .ammo("Gauge(da) / Slug")
                .weight("1")
                .build();
    }

    public static AlienWeapon createCrowdControlRifle() {
        return new AlienWeapon.Builder()
                .name("U4C Civilian CC Projectile Launcher")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(3)
                .range("Long")
                .cost(1100)
                .specials("Push:1")
                .ammo("BR / T3-TG")
                .weight("1")
                .build();
    }

    public static AlienWeapon createHarpoon() {
        return new AlienWeapon.Builder()
                .name("ASSO-400 Harpoon Grappling Gun")
                .type("Rifle")
                .manufacturer("SpaceSub")
                .bonus(2)
                .damage(2)
                .range("Short")
                .cost(300)
                .specials("One-Shot")
                .ammo("Harpoon (da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createSuperNovaRifle() {
        return new AlienWeapon.Builder()
                .name("ES-7 Supernova DA Electrostatic Shockgun")
                .type("Rifle")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(2)
                .damage(2)
                .range("Short")
                .cost(1200)
                .specials("Stun")
                .ammo("AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createPulseARifle() {
        return new AlienWeapon.Builder()
                .name("M41A Pulse Rifle")
                .type("A-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(1200)
                .specials("Auto:2 / U1-GL / H-Capacity")
                .ammo("AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createHeavyPulseARifle() {
        return new AlienWeapon.Builder()
                .name("M41AE2 Heavy Pulse Rifle")
                .type("A-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(3)
                .range("Extreme")
                .cost(1500)
                .specials("Auto:2")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createAkPulseARifle() {
        return new AlienWeapon.Builder()
                .name("AK-4047 Pulse AR")
                .type("A-Rifle")
                .manufacturer("Norcomm")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(500)
                .specials("Auto:2")
                .ammo("Std / FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createRmcARifle() {
        return new AlienWeapon.Builder()
                .name("RMC F903WE Automatic AR")
                .type("A-Rifle")
                .manufacturer("Weyland-Yutani Corporation")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(500)
                .specials("Auto:2")
                .ammo("Std / HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createNsgARifle() {
        return new AlienWeapon.Builder()
                .name("NSG23 Automatic AR")
                .type("A-Rifle")
                .manufacturer("Weyland-Yutani Corporation")
                .bonus(2)
                .damage(2)
                .range("Long")
                .cost(1500)
                .specials("Auto:2 / ID23-UIU")
                .ammo("AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createScopeARifle() {
        return new AlienWeapon.Builder()
                .name("M42A Scope Rifle")
                .type("A-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(2)
                .range("Extreme")
                .cost(1000)
                .specials("")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createSmartGunLmg() {
        return new AlienWeapon.Builder()
                .name("M56A2 Smart Gun")
                .type("LMG")
                .manufacturer("Armat Battlefield Systems")
                .bonus(3)
                .damage(3)
                .range("Long")
                .cost(6000)
                .specials("Auto:2 / Link")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createPlasmaRifle() {
        return new AlienWeapon.Builder()
                .name("XM99A Phased Plasma Pulse Rifle")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(0)
                .damage(4)
                .range("Extreme")
                .cost(20000)
                .specials("")
                .ammo("Battery-AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createSharpRifle() {
        return new AlienWeapon.Builder()
                .name("P9 SHARP Rifle")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(0)
                .damage(9)
                .range("Long")
                .cost(15000)
                .specials("")
                .ammo("Exp")
                .weight("2")
                .build();
    }

    public static AlienWeapon createDischargerRifle() {
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

    public static AlienWeapon createZvezdaRifle() {
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

    public static AlienWeapon createSuitGun() {
        return new AlienWeapon.Builder()
                .name("Ak-104S Pulse Action Suit Gun")
                .type("Suit")
                .manufacturer("Norcomm")
                .bonus(0)
                .damage(2)
                .range("Long")
                .cost(0)
                .specials("Auto:2")
                .ammo("AP")
                .weight("")
                .build();
    }

    public static AlienWeapon createGrenadeLauncher() {
        return new AlienWeapon.Builder()
                .name("U1 Grenade Launcher")
                .type("Spec")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(9)
                .range("Long")
                .cost(600)
                .specials("Under Barrel")
                .ammo("Exp")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createGrenadeLauncherR() {
        return new AlienWeapon.Builder()
                .name("U4A2 Repeating Grenade Launcher")
                .type("Heavy")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(0)
                .range("Long")
                .cost(1100)
                .specials("")
                .ammo("Inc / Exp / EMP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createRpgLauncher() {
        return new AlienWeapon.Builder()
                .name("M5A3 RPG Launcher")
                .type("Heavy")
                .manufacturer("Cryoxis Arms LTD")
                .bonus(1)
                .damage(5)
                .range("Extreme")
                .cost(1800)
                .specials("")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createRpgLauncherTwo() {
        return new AlienWeapon.Builder()
                .name("RPG122")
                .type("Heavy")
                .manufacturer("Norcomm")
                .bonus(0)
                .damage(5)
                .range("Extreme")
                .cost(1700)
                .specials("")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createEnergyGun() {
        return new AlienWeapon.Builder()
                .name("72A Light Energy Weapon")
                .type("Heavy")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(6)
                .range("Extreme")
                .cost(10500)
                .specials("")
                .ammo("Battery-AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createPlasmaGun() {
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

    public static AlienWeapon createPhalanxGun() {
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

    public static AlienWeapon createFlamer() {
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

    public static AlienWeapon createFlamerUnderBarrel() {
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

    public static AlienWeapon createFlamerHeavy() {
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

    public static AlienWeapon createSentryGun() {
        return new AlienWeapon.Builder()
                .name("UA 571-C Sentry Gun")
                .type("Heavy")
                .manufacturer("")
                .bonus(2)
                .damage(4)
                .range("Extreme")
                .cost(2000)
                .specials("Auto:2 / RC-8")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createBoltGun() {
        return new AlienWeapon.Builder()
                .name("DV-303 Bolt Gun")
                .type("Heavy")
                .manufacturer("Watatsumi")
                .bonus(0)
                .damage(3)
                .range("Short")
                .cost(3300)
                .specials("One-Shot / +2 Heavy Machinery")
                .ammo("AP")
                .weight("1")
                .build();
    }
}
