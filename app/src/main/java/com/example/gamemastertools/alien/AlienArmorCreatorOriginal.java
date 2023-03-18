package com.example.gamemastertools.alien;

public class AlienArmorCreatorOriginal {

    public static AlienArmor createLifeVestOriginal(){
        return new AlienArmor.Builder()
                .name("Life Vest")
                .armorValue("0")
                .weight("1")
                .communication(false)
                .cost(65)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Prevent drowning")
                .negatives("")
                .type("Item")
                .build();
    }

    public static AlienArmor createColdWeatherParkaOriginal(){
        return new AlienArmor.Builder()
                .name("Cold Weather Parka")
                .armorValue("0")
                .weight("1/4")
                .communication(false)
                .cost(100)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Stamina +2 vs cold")
                .negatives("")
                .type("Item")
                .build();
    }

    public static AlienArmor createGSuitOriginal(){
        return new AlienArmor.Builder()
                .name("G-Suit")
                .armorValue("1")
                .weight("1")
                .communication(true)
                .cost(120)
                .air(1)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Item")
                .build();
    }

    public static AlienArmor createFullFaceRebreatherMaskOriginal(){
        return new AlienArmor.Builder()
                .name("Full Face Rebreather Mask")
                .armorValue("0")
                .weight("1/2")
                .communication(true)
                .cost(100)
                .air(1)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Item")
                .build();
    }

    public static AlienArmor createGhilieSuitOriginal(){
        return new AlienArmor.Builder()
                .name("Ghilie Suit")
                .armorValue("0")
                .weight("1")
                .communication(false)
                .cost(1000)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Mobility +2 vs detection")
                .negatives("")
                .type("Item")
                .build();
    }

    public static AlienArmor createKevlarRiotVestOriginal(){
        return new AlienArmor.Builder()
                .name("Kevlar Riot Vest")
                .armorValue("4")
                .weight("1")
                .communication(false)
                .cost(600)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Personal Armor")
                .build();
    }

    public static AlienArmor createM3PersonalArmorOriginal(){
        return new AlienArmor.Builder()
                .name("M3 Personal Armor")
                .armorValue("6")
                .weight("1")
                .communication(true)
                .cost(1200)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Personal Armor")
                .build();
    }

    public static AlienArmor create6B90CombatArmorOriginal(){
        return new AlienArmor.Builder()
                .name("6B90 Combat Armor")
                .armorValue("6")
                .weight("2")
                .communication(true)
                .cost(1000)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Personal Armor")
                .build();
    }

    public static AlienArmor createIrcM50CompressionSuitOriginal(){
        return new AlienArmor.Builder()
                .name("IRC Mk.50 Compression Suit")
                .armorValue("2")
                .weight("1")
                .communication(true)
                .cost(15000)
                .air(5)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Space Suit")
                .build();
    }

    public static AlienArmor createIrcM35CompressionSuitOriginal(){
        return new AlienArmor.Builder()
                .name("IRC Mk.35 Compression Suit")
                .armorValue("5")
                .weight("2")
                .communication(true)
                .cost(2000)
                .air(4)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("Agility -1")
                .type("Space Suit")
                .build();
    }

    public static AlienArmor createApeSuitOriginal(){
        return new AlienArmor.Builder()
                .name("Weyland-Yutani APE suit")
                .armorValue("3")
                .weight("1")
                .communication(true)
                .cost(5000)
                .air(4)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(true)
                .additional("Survival +3")
                .negatives("")
                .type("Space Suit")
                .build();
    }

    public static AlienArmor createPowerLoaderOriginal(){
        return new AlienArmor.Builder()
                .name("P-5000 Power Loader")
                .armorValue("3")
                .weight("5")
                .communication(true)
                .cost(50000)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Heavy Machinery +3, Close Combat +3")
                .negatives("Open-topped")
                .type("Power Suit")
                .build();
    }

    public static AlienArmor createCombatCompressionSuitOriginal(){
        return new AlienArmor.Builder()
                .name("CCC5 Combat Compression Suit")
                .armorValue("6")
                .weight("2")
                .communication(true)
                .cost(15500)
                .air(5)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("Hand AK-104 weapon")
                .negatives("Mobility -1")
                .type("Specialized Suit")
                .build();
    }

    public static AlienArmor createAWSurvivalSuitOriginal(){
        return new AlienArmor.Builder()
                .name("ECO AW Survival Suit")
                .armorValue("4")
                .weight("2")
                .communication(true)
                .cost(30000)
                .air(6)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Specialized Suit")
                .build();
    }

    public static AlienArmor createECOSurvivalSuitOriginal(){
        return new AlienArmor.Builder()
                .name("ECO2 Survival Suit")
                .armorValue("8")
                .weight("3")
                .communication(true)
                .cost(20000)
                .air(6)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Specialized Suit")
                .build();
    }

    public static AlienArmor createHazmatSuitOriginal(){
        return new AlienArmor.Builder()
                .name("Hazmat Suit")
                .armorValue("1")
                .weight("2")
                .communication(true)
                .cost(1000)
                .air(3)
                .abc(true)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Specialized Suit")
                .build();
    }

    public static AlienArmor createMilitaryHazmatSuitOriginal(){
        return new AlienArmor.Builder()
                .name("Military Grade Hazmat Suit")
                .armorValue("1")
                .weight("1")
                .communication(true)
                .cost(1000)
                .air(2)
                .abc(true)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Specialized Suit")
                .build();
    }

    public static AlienArmor createRiotShieldOriginal(){
        return new AlienArmor.Builder()
                .name("Armat CM4 Plastisteel Riot Shield")
                .armorValue("5")
                .weight("1")
                .communication(false)
                .cost(300)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Give cover after SLOW action")
                .negatives("")
                .type("Shield")
                .build();
    }
}
