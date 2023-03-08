package com.example.gamemastertools.alien;

public class AlienWeaponCreatorAdditional {

    public static AlienWeapon createEvaLaser() {
        return new AlienWeapon.Builder()
                .name("N79 EVA Laser")
                .type("Pistol")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(330)
                .specials("")
                .ammo("AP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createTwinHammer() {
        return new AlienWeapon.Builder()
                .name("Twinhammer")
                .type("Pistol")
                .manufacturer("Hyperdyne Systems")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(480)
                .specials("Auto:1")
                .ammo("Std / HP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createType95Pistol() {
        return new AlienWeapon.Builder()
                .name("Type 95 Combat Pistol")
                .type("Pistol")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(540)
                .specials("Auto:1")
                .ammo("AP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createType78Pistol() {
        return new AlienWeapon.Builder()
                .name("Type 78 Burst Pistol")
                .type("Pistol")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(590)
                .specials("Auto:2")
                .ammo("AP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createCqbPistol() {
        return new AlienWeapon.Builder()
                .name("Mark 7 Mod 2 CQB Pistol")
                .type("Pistol")
                .manufacturer("Armat Battlefield Systems")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(360)
                .specials("Auto:2 / H-Capacity")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createM10Pistol() {
        return new AlienWeapon.Builder()
                .name("M10 Auto Pistol")
                .type("Pistol")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(400)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createDambullaPistol() {
        return new AlienWeapon.Builder()
                .name("8A7 Dambulla Machine Pistol")
                .type("Pistol")
                .manufacturer("Alphatech Hardware")
                .bonus(0)
                .damage(1)
                .range("Medium")
                .cost(520)
                .specials("Auto:3")
                .ammo("Std / FMJ / HP")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createFrontierRevolver() {
        return new AlienWeapon.Builder()
                .name("Frontier Revolver")
                .type("Revolver")
                .manufacturer("Hyperdyne Systems")
                .bonus(1)
                .damage(2)
                .range("Medium")
                .cost(520)
                .specials("Auto:1")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createKramerMagnum() {
        return new AlienWeapon.Builder()
                .name("Kramer .50 Magnum")
                .type("Revolver")
                .manufacturer("Kramer Metallarbeiten")
                .bonus(2)
                .damage(2)
                .range("Medium")
                .cost(590)
                .specials("")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createBarrage() {
        return new AlienWeapon.Builder()
                .name("X43 Barrage SMG")
                .type("SMG")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(900)
                .specials("Auto:4 / H-Capacity")
                .ammo("FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createM39SubmachineGun() {
        return new AlienWeapon.Builder()
                .name("M39 Submachine Gun")
                .type("SMG")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(810)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createStormsurge() {
        return new AlienWeapon.Builder()
                .name("LEM MP11 Stormsurge")
                .type("SMG")
                .manufacturer("Lindenthal-Ehrenfeld Mili")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(890)
                .specials("Auto:1/4 / H-Capacity")
                .ammo("Std / AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createJaipur() {
        return new AlienWeapon.Builder()
                .name("6A Jaipur Submachine Gun")
                .type("SMG")
                .manufacturer("Alphatech Hardware")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(810)
                .specials("Auto:4 / H-Capacity")
                .ammo("Std / HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createType76Shotgun() {
        return new AlienWeapon.Builder()
                .name("Type 76 Auto Shotgun")
                .type("Rifle")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(3)
                .range("Short")
                .cost(560)
                .specials("Auto:1 / Push:1")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createTacticalShotgun() {
        return new AlienWeapon.Builder()
                .name("Type 21 Tactical Shotgun")
                .type("Rifle")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(3)
                .damage(3)
                .range("Medium")
                .cost(460)
                .specials("Push:1")
                .ammo("Gauge(da) / Slug")
                .weight("1")
                .build();
    }

    public static AlienWeapon createScattergun() {
        return new AlienWeapon.Builder()
                .name("M51 Breaching Scattergun")
                .type("Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(3)
                .damage(2)
                .range("Short")
                .cost(410)
                .specials("Push:1")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createIthaca() {
        return new AlienWeapon.Builder()
                .name("Ithaca Model 37")
                .type("Rifle")
                .manufacturer("Ithaca Gun Company")
                .bonus(0)
                .damage(3)
                .range("Short")
                .cost(200)
                .specials("Push:1")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createMedved() {
        return new AlienWeapon.Builder()
                .name("DT-57 Medved")
                .type("Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(1)
                .damage(3)
                .range("Medium")
                .cost(480)
                .specials("Push:1")
                .ammo("Gauge(da) / Slug")
                .weight("1")
                .build();
    }

    public static AlienWeapon createMisha() {
        return new AlienWeapon.Builder()
                .name("DKT-59 Misha")
                .type("Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(4)
                .damage(2)
                .range("Short")
                .cost(960)
                .specials("")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createKramerShort() {
        return new AlienWeapon.Builder()
                .name("Kramer Short-Barrel")
                .type("Rifle")
                .manufacturer("Kramer Metallarbeiten")
                .bonus(1)
                .damage(3)
                .range("Short")
                .cost(880)
                .specials("Auto:1 / Push:1")
                .ammo("BA")
                .weight("1")
                .build();
    }

    public static AlienWeapon createRapidResponder() {
        return new AlienWeapon.Builder()
                .name("Rapid Responder")
                .type("Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(0)
                .damage(3)
                .range("Medium")
                .cost(470)
                .specials("Auto:2")
                .ammo("BA")
                .weight("1")
                .build();
    }

    public static AlienWeapon createLacrima() {
        return new AlienWeapon.Builder()
                .name("Lacrima 99 Shockrifle")
                .type("A-Rifle")
                .manufacturer("")
                .bonus(2)
                .damage(2)
                .range("Long")
                .cost(2000)
                .specials("Auto:2 / H-Capacity")
                .ammo("FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createType88Rifle() {
        return new AlienWeapon.Builder()
                .name("Type 88 Heavy Assault Rifle")
                .type("A-Rifle")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(3)
                .range("Extreme")
                .cost(1400)
                .specials("Auto:2")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createKramerAssault() {
        return new AlienWeapon.Builder()
                .name("Kramer Assault Rifle")
                .type("A-Rifle")
                .manufacturer("Kramer Metallarbeiten")
                .bonus(1)
                .damage(3)
                .range("Long")
                .cost(1300)
                .specials("Auto:2")
                .ammo("FMJ")
                .weight("2")
                .build();
    }

    public static AlienWeapon createAstra() {
        return new AlienWeapon.Builder()
                .name("4C2 Astra")
                .type("A-Rifle")
                .manufacturer("Alphatech Hardware")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(1100)
                .specials("Auto:3")
                .ammo("FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createDirtySmartgun() {
        return new AlienWeapon.Builder()
                .name("M57D 'Dirty' Smartgun")
                .type("LMG")
                .manufacturer("Armat Battlefield Systems")
                .bonus(3)
                .damage(3)
                .range("Long")
                .cost(10000)
                .specials("Auto:2 / Link")
                .ammo("U238")
                .weight("3")
                .build();
    }

    public static AlienWeapon createSmartgunL() {
        return new AlienWeapon.Builder()
                .name("L56A3 Smartgun")
                .type("LMG")
                .manufacturer("Weyland-Yutani Corporation")
                .bonus(3)
                .damage(3)
                .range("Long")
                .cost(8000)
                .specials("Auto:2 / Link / H-Capacity")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createThunderbolt() {
        return new AlienWeapon.Builder()
                .name("Thunderbolt Mk.2 Autocannon")
                .type("LMG")
                .manufacturer("Hyperdyne Systems")
                .bonus(1)
                .damage(5)
                .range("Long")
                .cost(4800)
                .specials("Auto:1 / H-Capacity")
                .ammo("Std / FMJ")
                .weight("4")
                .build();
    }

    public static AlienWeapon createHeavyPulseRifle() {
        return new AlienWeapon.Builder()
                .name("M41E4 Heavy Pulse Rifle")
                .type("LMG")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(4)
                .range("Long")
                .cost(5300)
                .specials("Auto:1 / H-Capacity")
                .ammo("Std / AP")
                .weight("4")
                .build();
    }

    public static AlienWeapon createMinigun() {
        return new AlienWeapon.Builder()
                .name("L59 Minigun")
                .type("LMG")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(3)
                .damage(3)
                .range("Long")
                .cost(7800)
                .specials("Auto:4 / H-Capacity")
                .ammo("AP")
                .weight("4")
                .build();
    }

    public static AlienWeapon createBombard() {
        return new AlienWeapon.Builder()
                .name("X45 Bombard")
                .type("S-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(4)
                .damage(2)
                .range("Extreme")
                .cost(8500)
                .specials("Auto:1 / Scope / CriticalHit")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createStormRifle() {
        return new AlienWeapon.Builder()
                .name("LEM StG24 Storm Rifle")
                .type("S-Rifle")
                .manufacturer("Lindenthal-Ehrenfeld Mili")
                .bonus(3)
                .damage(3)
                .range("Extreme")
                .cost(8000)
                .specials("Auto:1 / Scope / CriticalHit")
                .ammo("FMJ / HP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createGruppa() {
        return new AlienWeapon.Builder()
                .name("AM-16 Gruppa")
                .type("S-Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(4)
                .damage(3)
                .range("Extreme")
                .cost(9700)
                .specials("Auto:1 / Scope / CriticalHit")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createTwilight() {
        return new AlienWeapon.Builder()
                .name("Twilight v.4")
                .type("S-Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(2)
                .damage(4)
                .range("Extreme")
                .cost(11000)
                .specials("Scope / CriticalHit")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createScoutRifle() {
        return new AlienWeapon.Builder()
                .name("M42A2 Scout Rifle")
                .type("S-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(7)
                .range("Extreme")
                .cost(13500)
                .specials("Scope / CriticalHit / Stability")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createBallista() {
        return new AlienWeapon.Builder()
                .name("X46 Ballista")
                .type("S-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(8)
                .range("Extreme")
                .cost(14400)
                .specials("Scope / CriticalHit / Stability")
                .ammo("Exp")
                .weight("3")
                .build();
    }

    public static AlienWeapon createSokol() {
        return new AlienWeapon.Builder()
                .name("SVAT-92 Sokol")
                .type("S-Rifle")
                .manufacturer("Hyperdyne Systems")
                .bonus(0)
                .damage(7)
                .range("Extreme")
                .cost(12100)
                .specials("Scope / CriticalHit / Stability")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createSniperR() {
        return new AlienWeapon.Builder()
                .name("M42A3 Sniper Rifle")
                .type("S-Rifle")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(10)
                .range("Extreme")
                .cost(16000)
                .specials("Scope / CriticalHit / Stability")
                .ammo("AP")
                .weight("4")
                .build();
    }

    public static AlienWeapon createPike() {
        return new AlienWeapon.Builder()
                .name("L33 Pike")
                .type("S-Rifle")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(2)
                .damage(11)
                .range("Extreme")
                .cost(18000)
                .specials("Scope / CriticalHit / Stability")
                .ammo("AP")
                .weight("4")
                .build();
    }

    public static AlienWeapon createMicroBurst() {
        return new AlienWeapon.Builder()
                .name("Microburst")
                .type("Heavy")
                .manufacturer("Hyperdyne Systems")
                .bonus(3)
                .damage(7)
                .range("Medium")
                .cost(2400)
                .specials("Auto:2 / Damage +2")
                .ammo("Exp")
                .weight("3")
                .build();
    }

    public static AlienWeapon createVajra() {
        return new AlienWeapon.Builder()
                .name("2B1 Vajra")
                .type("Heavy")
                .manufacturer("Alphatech Hardware")
                .bonus(4)
                .damage(7)
                .range("Medium")
                .cost(1500)
                .specials("Damage +1")
                .ammo("Exp")
                .weight("3")
                .build();
    }

    public static AlienWeapon createM95GrenadeLauncher() {
        return new AlienWeapon.Builder()
                .name("M95 Grenade Launcher")
                .type("Heavy")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(9)
                .range("Medium")
                .cost(2800)
                .specials("Damage +1")
                .ammo("Exp")
                .weight("2")
                .build();
    }

    public static AlienWeapon createImpactGrenade() {
        return new AlienWeapon.Builder()
                .name("M94 Impact Grenade")
                .type("Heavy")
                .manufacturer("Armat Battlefield Systems")
                .bonus(2)
                .damage(9)
                .range("Medium")
                .cost(2800)
                .specials("Damage +2")
                .ammo("Exp, BR")
                .weight("2")
                .build();
    }

    public static AlienWeapon createRocketLauncher() {
        return new AlienWeapon.Builder()
                .name("M12A1 Rocket Launcher")
                .type("Heavy")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(14)
                .range("Long")
                .cost(7500)
                .specials("Stability")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createRpgLauncher() {
        return new AlienWeapon.Builder()
                .name("M12 RPG Launcher")
                .type("Heavy")
                .manufacturer("Armat Battlefield Systems")
                .bonus(1)
                .damage(8)
                .range("Long")
                .cost(5500)
                .specials("")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createHel() {
        return new AlienWeapon.Builder()
                .name("P.649 HEL")
                .type("Heavy")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(3)
                .damage(9)
                .range("Long")
                .cost(8000)
                .specials("")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createType99() {
        return new AlienWeapon.Builder()
                .name("Type 99 Incinerator")
                .type("Heavy")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(0)
                .damage(11)
                .range("Medium")
                .cost(3400)
                .specials("Damage +2")
                .ammo("Fire")
                .weight("2")
                .build();
    }

    public static AlienWeapon createFireball() {
        return new AlienWeapon.Builder()
                .name("X1 Curicaueri Fireball")
                .type("Heavy")
                .manufacturer("Armat Battlefield Systems")
                .bonus(0)
                .damage(9)
                .range("Medium")
                .cost(2400)
                .specials("Damage +3")
                .ammo("Fire")
                .weight("1")
                .build();
    }

    public static AlienWeapon createVolcan() {
        return new AlienWeapon.Builder()
                .name("OCAP-91 Volcan")
                .type("Heavy")
                .manufacturer("Hyperdyne Systems")
                .bonus(0)
                .damage(16)
                .range("Medium")
                .cost(3200)
                .specials("Damage +2")
                .ammo("Fire")
                .weight("2")
                .build();
    }

    public static AlienWeapon createFlamethrower() {
        return new AlienWeapon.Builder()
                .name("M260B Flamethrower")
                .type("Heavy")
                .manufacturer("Weyland-Yutani Corp")
                .bonus(1)
                .damage(14)
                .range("Medium")
                .cost(4400)
                .specials("Damage +1")
                .ammo("Fire")
                .weight("2")
                .build();
    }
}
