package com.example.gamemastertools.alien;

public class AlienArmorCreatorExpanded {

    public static AlienArmor createLifeVestExpanded(){
        return new AlienArmor.Builder()
                .name("Life Vest")
                .armorValue("d0+0")
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

    public static AlienArmor createColdWeatherParkaExpanded(){
        return new AlienArmor.Builder()
                .name("Cold Weather Parka")
                .armorValue("d0+0")
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

    public static AlienArmor createGSuitExpanded(){
        return new AlienArmor.Builder()
                .name("G-Suit")
                .armorValue("d1+1")
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

    public static AlienArmor createFullFaceRebreatherMaskExpanded(){
        return new AlienArmor.Builder()
                .name("Full Face Rebreather Mask")
                .armorValue("d0+0")
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

    public static AlienArmor createLeatherCloakExpanded(){
        return new AlienArmor.Builder()
                .name("Leather Cloak")
                .armorValue("d1+0")
                .weight("1/2")
                .communication(false)
                .cost(40)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Item")
                .build();
    }

    public static AlienArmor createKaraulTacticalCloakExpanded(){
        return new AlienArmor.Builder()
                .name("Karaul Tactical Cloak")
                .armorValue("d2+0")
                .weight("1/2")
                .communication(false)
                .cost(70)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("")
                .negatives("")
                .type("Item")
                .build();
    }

    public static AlienArmor createGhilieSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Ghilie Suit")
                .armorValue("d0+0")
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

    public static AlienArmor createTacticalVestExpanded(){
        return new AlienArmor.Builder()
                .name("Tactical Vest")
                .armorValue("d2+0")
                .weight("1")
                .communication(false)
                .cost(130)
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

    public static AlienArmor createJupiterVestExpanded(){
        return new AlienArmor.Builder()
                .name("Jupiter Vest")
                .armorValue("d3+0")
                .weight("1")
                .communication(false)
                .cost(250)
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

    public static AlienArmor createKevlarRiotVestExpanded(){
        return new AlienArmor.Builder()
                .name("Kevlar Riot Vest")
                .armorValue("d4+0")
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

    public static AlienArmor createBerillArmoredVestExpanded(){
        return new AlienArmor.Builder()
                .name("Berill-5M Armored Vest")
                .armorValue("d5+0")
                .weight("1")
                .communication(true)
                .cost(700)
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

    public static AlienArmor createM3PersonalArmorExpanded(){
        return new AlienArmor.Builder()
                .name("M3 Personal Armor")
                .armorValue("d6+0")
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

    public static AlienArmor create6B90CombatArmorExpanded(){
        return new AlienArmor.Builder()
                .name("6B90 Combat Armor")
                .armorValue("d6+0")
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

    public static AlienArmor createAjaxExpanded(){
        return new AlienArmor.Builder()
                .name("Ajax Tactical Armor")
                .armorValue("d3+1")
                .weight("2")
                .communication(true)
                .cost(1800)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("Mobility -1")
                .type("Personal Armor+")
                .build();
    }

    public static AlienArmor createOrionExpanded(){
        return new AlienArmor.Builder()
                .name("Orion Combat Armor")
                .armorValue("d4+1")
                .weight("2")
                .communication(true)
                .cost(2200)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("Mobility -1")
                .type("Personal Armor+")
                .build();
    }

    public static AlienArmor createTaurusExpanded(){
        return new AlienArmor.Builder()
                .name("Taurus Armored Suit")
                .armorValue("d5+1")
                .weight("2")
                .communication(true)
                .cost(3500)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("Mobility -1")
                .type("Personal Armor+")
                .build();
    }

    public static AlienArmor createM4PersonalArmorExpanded(){
        return new AlienArmor.Builder()
                .name("M4X Personal Armor")
                .armorValue("d6+1")
                .weight("2")
                .communication(true)
                .cost(5000)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(true)
                .additional("")
                .negatives("Mobility -1")
                .type("Personal Armor+")
                .build();
    }

    public static AlienArmor createSpiderExpanded(){
        return new AlienArmor.Builder()
                .name("Class VII Spidersilk Armor")
                .armorValue("d6+1")
                .weight("2")
                .communication(true)
                .cost(4200)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(false)
                .additional("")
                .negatives("Mobility -1")
                .type("Personal Armor+")
                .build();
    }

    public static AlienArmor createIrcM50CompressionSuitExpanded(){
        return new AlienArmor.Builder()
                .name("IRC Mk.50 Compression Suit")
                .armorValue("d2+0")
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

    public static AlienArmor createIrcM35CompressionSuitExpanded(){
        return new AlienArmor.Builder()
                .name("IRC Mk.35 Compression Suit")
                .armorValue("d5+1")
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

    public static AlienArmor createApeSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Weyland-Yutani APE suit")
                .armorValue("d3+0")
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

    public static AlienArmor createHalitelSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Halitel CM-2200 Compression Suit")
                .armorValue("d2+0")
                .weight("1")
                .communication(true)
                .cost(4500)
                .air(3)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("Survival +1")
                .negatives("")
                .type("Space Suit")
                .build();
    }

    public static AlienArmor createBasicPowerSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Basic Power Suit")
                .armorValue("d3+0")
                .weight("3")
                .communication(false)
                .cost(15000)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Heavy Machinery +1, Close Combat +1, Weapon Slot")
                .negatives("Open-topped")
                .type("Power Suit")
                .build();
    }

    public static AlienArmor createTacticalPowerSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Tactical Power Suit")
                .armorValue("d4+0")
                .weight("4")
                .communication(true)
                .cost(33000)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Heavy Machinery +2, Close Combat +2, Weapon Slot")
                .negatives("Open-topped")
                .type("Power Suit")
                .build();
    }

    public static AlienArmor createPowerLoaderExpanded(){
        return new AlienArmor.Builder()
                .name("P-5000 Power Loader")
                .armorValue("d3+0")
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

    public static AlienArmor createCMCPowerArmorExpanded(){
        return new AlienArmor.Builder()
                .name("CMC Power Armor")
                .armorValue("d9+2")
                .weight("3")
                .communication(true)
                .cost(60000)
                .air(5)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("Close Combat +2, Weapon Slot")
                .negatives("Agility -1")
                .type("Power Armor")
                .build();
    }

    public static AlienArmor createGoliathPowerArmorExpanded(){
        return new AlienArmor.Builder()
                .name("Goliath Power Armor")
                .armorValue("d11+2")
                .weight("3")
                .communication(true)
                .cost(75000)
                .air(6)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("Close Combat +2, Two Weapon Slots")
                .negatives("Agility -1")
                .type("Power Armor")
                .build();
    }

    public static AlienArmor createReaverPowerArmorExpanded(){
        return new AlienArmor.Builder()
                .name("Reaver Power Armor")
                .armorValue("d12+2")
                .weight("3")
                .communication(true)
                .cost(82000)
                .air(5)
                .abc(true)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("Close Combat +2, Two Weapon Slots")
                .negatives("Agility -1")
                .type("Power Armor")
                .build();
    }

    public static AlienArmor createMaxSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Auraxis Max Suit")
                .armorValue("d15+3")
                .weight("4")
                .communication(true)
                .cost(82000)
                .air(4)
                .abc(false)
                .vacuum(true)
                .fire(true)
                .acid(false)
                .additional("Two Weapon Slots")
                .negatives("Mobility -2, Training required")
                .type("Power Armor")
                .build();
    }

    public static AlienArmor createEMPSuitExpanded(){
        return new AlienArmor.Builder()
                .name("EMP Suit")
                .armorValue("d10+4")
                .weight("5")
                .communication(true)
                .cost(110000)
                .air(5)
                .abc(true)
                .vacuum(true)
                .fire(false)
                .acid(false)
                .additional("Two Weapon Slots")
                .negatives("Mobility -1, Training required")
                .type("Power Armor")
                .build();
    }

    public static AlienArmor createAPUSuitExpanded(){
        return new AlienArmor.Builder()
                .name("APU Suit")
                .armorValue("d6+1")
                .weight("5")
                .communication(true)
                .cost(60000)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Two Weapon Slots")
                .negatives("Mobility -2, Open-topped")
                .type("Power Armor")
                .build();
    }

    public static AlienArmor createCombatCompressionSuitExpanded(){
        return new AlienArmor.Builder()
                .name("CCC5 Combat Compression Suit")
                .armorValue("d6+1")
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

    public static AlienArmor createAWSurvivalSuitExpanded(){
        return new AlienArmor.Builder()
                .name("ECO AW Survival Suit")
                .armorValue("d4+1")
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

    public static AlienArmor createECOSurvivalSuitExpanded(){
        return new AlienArmor.Builder()
                .name("ECO2 Survival Suit")
                .armorValue("d8+2")
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

    public static AlienArmor createHazmatSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Hazmat Suit")
                .armorValue("d1+0")
                .weight("2")
                .communication(true)
                .cost(1000)
                .air(3)
                .abc(true)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Advanced ABC")
                .negatives("")
                .type("Specialized Suit")
                .build();
    }

    public static AlienArmor createMilitaryHazmatSuitExpanded(){
        return new AlienArmor.Builder()
                .name("Military Grade Hazmat Suit")
                .armorValue("d1+0")
                .weight("1")
                .communication(true)
                .cost(1000)
                .air(2)
                .abc(true)
                .vacuum(false)
                .fire(false)
                .acid(false)
                .additional("Advanced ABC")
                .negatives("")
                .type("Specialized Suit")
                .build();
    }

    public static AlienArmor createRiotShieldExpanded(){
        return new AlienArmor.Builder()
                .name("Armat CM4 Plastisteel Riot Shield")
                .armorValue("d5+0")
                .weight("1")
                .communication(false)
                .cost(300)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(false)
                .additional("Give cover after SLOW action")
                .negatives("")
                .type("Shield")
                .build();
    }

    public static AlienArmor createBallisticShieldExpanded(){
        return new AlienArmor.Builder()
                .name("Kramer Ballistic Shield")
                .armorValue("d6+1")
                .weight("1")
                .communication(false)
                .cost(1300)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(true)
                .additional("Give cover after SLOW action")
                .negatives("")
                .type("Shield")
                .build();
    }

    public static AlienArmor createCombatShieldExpanded(){
        return new AlienArmor.Builder()
                .name("Kestrel Combat Shield")
                .armorValue("d8+1")
                .weight("2")
                .communication(false)
                .cost(3200)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(true)
                .additional("Give cover after SLOW action")
                .negatives("")
                .type("Shield")
                .build();
    }

    public static AlienArmor createLadderShieldExpanded(){
        return new AlienArmor.Builder()
                .name("Ladder Shield")
                .armorValue("d6+2")
                .weight("2")
                .communication(false)
                .cost(4400)
                .air(0)
                .abc(false)
                .vacuum(false)
                .fire(true)
                .acid(false)
                .additional("Give cover after SLOW action")
                .negatives("Stationary")
                .type("Shield")
                .build();
    }

}
