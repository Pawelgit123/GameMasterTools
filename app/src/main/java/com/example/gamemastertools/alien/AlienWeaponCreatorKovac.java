package com.example.gamemastertools.alien;

public class AlienWeaponCreatorKovac {

    public static AlienWeapon createS49Pistol(){
        return new AlienWeapon.Builder()
                .name("S49 Pistol")
                .type("Pistol")
                .manufacturer("Shelling Industries")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(230)
                .specials("Auto:1")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createAridPistol(){
        return new AlienWeapon.Builder()
                .name("Arid 5 High Caliber Pistol")
                .type("Pistol")
                .manufacturer("Shelling Industries")
                .bonus(1)
                .damage(2)
                .range("Medium")
                .cost(400)
                .specials("")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createSteigro(){
        return new AlienWeapon.Builder()
                .name("Steigro Autopistol")
                .type("Pistol")
                .manufacturer("Raptus LLC.")
                .bonus(0)
                .damage(1)
                .range("Medium")
                .cost(460)
                .specials("Auto:3")
                .ammo("Std")
                .weight("1/2")
                .build();
    }

    public static AlienWeapon createTreffen(){
        return new AlienWeapon.Builder()
                .name("Treffen 2 Machine Pistol")
                .type("Pistol")
                .manufacturer("Raptus LLC.")
                .bonus(0)
                .damage(1)
                .range("Medium")
                .cost(660)
                .specials("Auto:5 / H-Capacity")
                .ammo("Std")
                .weight("1/2")
                .build();
    }
    public static AlienWeapon createHelRevolver(){
        return new AlienWeapon.Builder()
                .name("Model 8 HEL Revolver")
                .type("Revolver")
                .manufacturer("Bataldo Technologies")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(1050)
                .specials("Push:1")
                .ammo("AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createR66(){
        return new AlienWeapon.Builder()
                .name("Mastaba R66 Revolver")
                .type("Revolver")
                .manufacturer("Mateba and Zastava Inc.")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(720)
                .specials("CriticalHit")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createStbSmg(){
        return new AlienWeapon.Builder()
                .name("STB PDW")
                .type("SMG")
                .manufacturer("Accrat Security")
                .bonus(2)
                .damage(1)
                .range("Short")
                .cost(720)
                .specials("Auto:3 / H-Capacity")
                .ammo("Hybrid(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createLtcSmg(){
        return new AlienWeapon.Builder()
                .name("LTC 5 SMG")
                .type("SMG")
                .manufacturer("Van Auken & Co.")
                .bonus(1)
                .damage(1)
                .range("Medium")
                .cost(980)
                .specials("Auto:4 / H-Capacity")
                .ammo("FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createNd6Smg(){
        return new AlienWeapon.Builder()
                .name("ND6 Heavy SMG")
                .type("SMG")
                .manufacturer("Accrat Security")
                .bonus(0)
                .damage(2)
                .range("Medium")
                .cost(1350)
                .specials("Auto:3 / H-Capacity")
                .ammo("FMJ")
                .weight("1")
                .build();
    }

    public static AlienWeapon createHelShotgun(){
        return new AlienWeapon.Builder()
                .name("J 300 Hel Shotgun")
                .type("Rifle")
                .manufacturer("Bataldo Technologies")
                .bonus(1)
                .damage(4)
                .range("Short")
                .cost(2250)
                .specials("Push:2")
                .ammo("AP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createS870Shotgun(){
        return new AlienWeapon.Builder()
                .name("Buckland S870 Shotgun")
                .type("Rifle")
                .manufacturer("RW Buckland")
                .bonus(2)
                .damage(3)
                .range("Medium")
                .cost(600)
                .specials("Push:1")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createAF6Shotgun(){
        return new AlienWeapon.Builder()
                .name("Buckland AF6 Combat Shotgun")
                .type("Rifle")
                .manufacturer("RW Buckland")
                .bonus(3)
                .damage(3)
                .range("Medium")
                .cost(1100)
                .specials("Auto:1 / Push:1")
                .ammo("Gauge(da)")
                .weight("1")
                .build();
    }

    public static AlienWeapon createF4Carbine(){
        return new AlienWeapon.Builder()
                .name("CAB F4 Carbine")
                .type("A-Rifle")
                .manufacturer("Accrat Security")
                .bonus(0)
                .damage(3)
                .range("Long")
                .cost(1250)
                .specials("Auto:2")
                .ammo("Std")
                .weight("1")
                .build();
    }

    public static AlienWeapon createGolok(){
        return new AlienWeapon.Builder()
                .name("Golok DA Bullpup Rifle")
                .type("A-Rifle")
                .manufacturer("Accrat Security")
                .bonus(1)
                .damage(3)
                .range("Long")
                .cost(1400)
                .specials("Auto:1")
                .ammo("HP")
                .weight("1")
                .build();
    }

    public static AlienWeapon createDmr(){
        return new AlienWeapon.Builder()
                .name("TR22 Hanaway DMR")
                .type("A-Rifle")
                .manufacturer("Hanaway Corp")
                .bonus(0)
                .damage(3)
                .range("Extreme")
                .cost(3360)
                .specials("Armor -1")
                .ammo("AP")
                .weight("2")
                .build();
    }

    public static AlienWeapon createLx(){
        return new AlienWeapon.Builder()
                .name("Malatack LX Assault Rifle")
                .type("A-Rifle")
                .manufacturer("Malatack Project")
                .bonus(1)
                .damage(2)
                .range("Long")
                .cost(1400)
                .specials("Auto:2")
                .ammo("Std / FMJ")
                .weight("2")
                .build();
    }

    public static AlienWeapon createArbalist(){
        return new AlienWeapon.Builder()
                .name("Arbalist V Machine Gun")
                .type("A-Rifle")
                .manufacturer("Techman Investments")
                .bonus(2)
                .damage(2)
                .range("Extreme")
                .cost(1400)
                .specials("Auto:2")
                .ammo("Std / FMJ")
                .weight("2")
                .build();
    }

    public static AlienWeapon createVeruta(){
        return new AlienWeapon.Builder()
                .name("Veruta XII Machine Gun")
                .type("A-Rifle")
                .manufacturer("Techman Investments")
                .bonus(3)
                .damage(2)
                .range("Extreme")
                .cost(1900)
                .specials("Auto:1")
                .ammo("Std / FMJ")
                .weight("2")
                .build();
    }

    public static AlienWeapon createVM556Rifle(){
        return new AlienWeapon.Builder()
                .name("Pres MOD 556 Rifle")
                .type("A-Rifle")
                .manufacturer("Drekker Funds")
                .bonus(3)
                .damage(2)
                .range("Extreme")
                .cost(2700)
                .specials("Auto:2 / Armor -1")
                .ammo("Std / FMJ")
                .weight("2")
                .build();
    }

    public static AlienWeapon createHXC(){
        return new AlienWeapon.Builder()
                .name("Malatack HXC Heavy Assault Rifle")
                .type("LMG")
                .manufacturer("Malatack Project")
                .bonus(1)
                .damage(4)
                .range("Long")
                .cost(3250)
                .specials("Auto:2")
                .ammo("Std / FMJ")
                .weight("3")
                .build();
    }

    public static AlienWeapon createPrecisionRifle(){
        return new AlienWeapon.Builder()
                .name("DEL P1 Precision Rifle")
                .type("S-Rifle")
                .manufacturer("Drekker Funds")
                .bonus(2)
                .damage(5)
                .range("Extreme")
                .cost(12250)
                .specials("Auto:1 / Armor -1 / Scope / CriticalHit")
                .ammo("Std / FMJ")
                .weight("2")
                .build();
    }

    public static AlienWeapon createPr11(){
        return new AlienWeapon.Builder()
                .name("Köning PR 11 Sniper")
                .type("S-Rifle")
                .manufacturer("Köning Company")
                .bonus(2)
                .damage(6)
                .range("Extreme")
                .cost(14500)
                .specials("Scope / CriticalHit")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createLrgRifle(){
        return new AlienWeapon.Builder()
                .name("Omneco LRG HEL Rifle")
                .type("A-Rifle")
                .manufacturer("Omneco Solutions")
                .bonus(1)
                .damage(3)
                .range("Long")
                .cost(2100)
                .specials("H-Capacity")
                .ammo("AP")
                .weight("3")
                .build();
    }

    public static AlienWeapon createExp1(){
        return new AlienWeapon.Builder()
                .name("Omneco EXP1 HEL Gun")
                .type("LMG")
                .manufacturer("Omneco Solutions")
                .bonus(1)
                .damage(5)
                .range("Long")
                .cost(7000)
                .specials("H-Capacity")
                .ammo("AP")
                .weight("4")
                .build();
    }


}
