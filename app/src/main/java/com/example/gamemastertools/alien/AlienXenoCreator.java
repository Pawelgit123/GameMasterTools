package com.example.gamemastertools.alien;

public class AlienXenoCreator {

    public AlienXenoCreator() {
    }

    public static AlienXenoCreature createAbominationInfected(AlienXenoCreature alienXeno){

        alienXeno.setName("Infected");
        alienXeno.setType("Abomination");
        alienXeno.setAcid("6");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setObservation("H");
        alienXeno.setMobility("H");
        alienXeno.setHealth("H");
        alienXeno.setSpecial("Stress level +1 within a shift, Fail roll start stage II");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationMutant(AlienXenoCreature alienXeno){

        alienXeno.setName("Mutant");
        alienXeno.setType("Abomination");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setObservation("H");
        alienXeno.setMobility("H");
        alienXeno.setHealth("H+3");
        alienXeno.setSpecial("Strength +3, Agility +2, Empathy -1, Immune to Manipulation, Stage III within a shift");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationRevenant(AlienXenoCreature alienXeno){

        alienXeno.setName("Revenant");
        alienXeno.setType("Abomination");
        alienXeno.setSpeed(2);
        alienXeno.setHealth("H+2(8)");
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("5");
        alienXeno.setObservation("3");
        alienXeno.setSpecial("Strength +2, Agility +1, Empathy -5, Immune to Manipulation, Stage IV within 4 shifts");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationBelugaHead(AlienXenoCreature alienXeno){

        alienXeno.setName("Beluga Head");
        alienXeno.setType("Abomination");
        alienXeno.setHealth("H+2(10)");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility("5");
        alienXeno.setObservation("3");
        alienXeno.setSpecial("Strength +2");

        return  alienXeno;
    }

    public static AlienXenoCreature createNeomorphEgg(AlienXenoCreature alienXeno){

        alienXeno.setName("Egg");
        alienXeno.setType("Neomorph");
        alienXeno.setSpecial("Stationary, Grow in clutches of 2d6");
        alienXeno.setHealth("");
        alienXeno.setAcid("Mote");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(0);

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphMote(AlienXenoCreature alienXeno){

        alienXeno.setName("Mote");
        alienXeno.setType("Neomorph");
        alienXeno.setAcid("9");
        alienXeno.setSpeed(0);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("VIRUS, next stage after a shift");

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphBloodburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Bloodburster");
        alienXeno.setType("Neomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("9");
        alienXeno.setObservation("6");
        alienXeno.setSpecial("SPRINT, next stage after d6 turns");

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphNeophyte(AlienXenoCreature alienXeno){

        alienXeno.setName("Neophyte");
        alienXeno.setType("Neomorph");
        alienXeno.setHealth("4");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(4);
        alienXeno.setAcid("");
        alienXeno.setArmorFire(2);
        alienXeno.setMobility("10");
        alienXeno.setObservation("6");
        alienXeno.setSpecial("SPRINT, next stage after a shift");

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphAdult(AlienXenoCreature alienXeno){

        alienXeno.setName("Adult");
        alienXeno.setType("Neomorph");
        alienXeno.setHealth("6");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setAcid("");
        alienXeno.setMobility("9");
        alienXeno.setObservation("8");
        alienXeno.setSpecial("SPRINT, dies after 24h");

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaBlackGoo(AlienXenoCreature alienXeno){

        alienXeno.setName("Black Goo");
        alienXeno.setType("Anathema");
        alienXeno.setSpecial("VIRUS, sickness roll every shift");
        alienXeno.setAcid("8");

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaAfflicted(AlienXenoCreature alienXeno){

        alienXeno.setName("Afflicted");
        alienXeno.setType("Anathema");
        alienXeno.setAcid("4");
        alienXeno.setSpecial("Stress level +1 within a shift");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setMobility("H");
        alienXeno.setObservation("H");
        alienXeno.setHealth("H");

        return  alienXeno;
    }

    public static AlienXenoCreature createAnathemaFebrile(AlienXenoCreature alienXeno){

        alienXeno.setName("Febrile");
        alienXeno.setType("Anathema");
        alienXeno.setAcid("6");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setSpecial("Host: Stress level +1, Strength +3, Wits -2, ENTHRALLING GAZE");
        alienXeno.setMobility("H");
        alienXeno.setObservation("H");
        alienXeno.setHealth("H+3");

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaFreak(AlienXenoCreature alienXeno){

        alienXeno.setName("Freak");
        alienXeno.setType("Anathema");
        alienXeno.setHealth("8");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("5");
        alienXeno.setObservation("3");
        alienXeno.setAcid("7");

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaTerminal(AlienXenoCreature alienXeno){

        alienXeno.setName("Terminal");
        alienXeno.setType("Anathema");
        alienXeno.setSpecial("INFECTION: 8/8/4, Terminal Health -1 per ROUND");
        alienXeno.setAcid("8");
        alienXeno.setHealth("8");
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("5");
        alienXeno.setObservation("3");
        alienXeno.setSpeed(2);

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationTainted(AlienXenoCreature alienXeno){

        alienXeno.setName("Tainted");
        alienXeno.setType("Abomination E");
        alienXeno.setAcid("6");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setSpecial("Stress level +1 within a shift, Fail roll start stage II");
        alienXeno.setHealth("H");
        alienXeno.setObservation("H");
        alienXeno.setMobility("H");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationMutated(AlienXenoCreature alienXeno){

        alienXeno.setName("Mutated");
        alienXeno.setType("Abomination E");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("Host: Strength +3, Agility +1, Empathy -1, Immune to Manipulation");
        alienXeno.setHealth("H+3");
        alienXeno.setObservation("H");
        alienXeno.setMobility("H");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationPerfected(AlienXenoCreature alienXeno){

        alienXeno.setName("Perfected");
        alienXeno.setType("Abomination E");
        alienXeno.setHealth("12");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(12);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility("9");
        alienXeno.setObservation("12");
        alienXeno.setSpecial("HYPERBLIND");

        return  alienXeno;
    }

    public static AlienXenoCreature createProtomorphUteroPod(AlienXenoCreature alienXeno){

        alienXeno.setName("Utero Pod");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(0);
        alienXeno.setArmor(1);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("Mobility check: FAIl roll release a squid");

        return alienXeno;
    }

    public static AlienXenoCreature createProtomorphSquid(AlienXenoCreature alienXeno){

        alienXeno.setName("Squid");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(1);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("9");
        alienXeno.setObservation("4");
        alienXeno.setSpecial("Next stage after a shift");

        return alienXeno;
    }

    public static AlienXenoCreature createProtomorphTrilobite(AlienXenoCreature alienXeno){

        alienXeno.setName("Trilobite");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth("9");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(5);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility("4");
        alienXeno.setObservation("9");
        alienXeno.setSpecial("Next stage within a shift after embryo implantation");

        return alienXeno;
    }

    public static AlienXenoCreature createProtomorphDeacon(AlienXenoCreature alienXeno){

        alienXeno.setName("Deacon");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth("5");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility("7");
        alienXeno.setObservation("6");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphEgg(AlienXenoCreature alienXeno){

        alienXeno.setName("Ovomorph");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(0);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("Stationary");
        alienXeno.setAcid("4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphQueenEgg(AlienXenoCreature alienXeno){

        alienXeno.setName("Queen's Egg");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(0);
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(1);
        alienXeno.setSpecial("Stationary");
        alienXeno.setAcid("5");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphFacehugger(AlienXenoCreature alienXeno){

        alienXeno.setName("Facehugger");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("8");
        alienXeno.setObservation("8");
        alienXeno.setSpecial("1 shift to change");
        alienXeno.setAcid("4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphPraetoFacehugger(AlienXenoCreature alienXeno){

        alienXeno.setName("P-Facehugger");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("6");
        alienXeno.setObservation("8");
        alienXeno.setSpecial("Ancient, 1 shift to change");
        alienXeno.setAcid("4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphRoyalFacehugger(AlienXenoCreature alienXeno){

        alienXeno.setName("Royal Facehugger");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("3");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(4);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility("8");
        alienXeno.setObservation("10");
        alienXeno.setSpecial("1 shift to change");
        alienXeno.setAcid("5");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphChestburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Chestburster");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("8");
        alienXeno.setObservation("6");
        alienXeno.setAcid("4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphBambiburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Bambiburster");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility("10");
        alienXeno.setObservation("6");
        alienXeno.setSpecial("Animal");
        alienXeno.setAcid("4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphGoreburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Goreburster");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("6");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility("8");
        alienXeno.setObservation("6");
        alienXeno.setSpecial("VIRUS: 6 each turn after attack");
        alienXeno.setAcid("6");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphImp(AlienXenoCreature alienXeno){

        alienXeno.setName("Imp");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility("8");
        alienXeno.setObservation("8");
        alienXeno.setSpecial("Ancient");
        alienXeno.setAcid("4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphQueenburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Queenburster");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("3");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(4);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility("8");
        alienXeno.setObservation("6");
        alienXeno.setAcid("5");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphStalker(AlienXenoCreature alienXeno){

        alienXeno.setName("Stalker");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("6");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(10);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility("8");
        alienXeno.setObservation("6");
        alienXeno.setSpecial("Ancient, HUNGER");
        alienXeno.setAcid("8");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphScout(AlienXenoCreature alienXeno){

        alienXeno.setName("Scout");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("5");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(8);
        alienXeno.setArmorFire(4);
        alienXeno.setMobility("8");
        alienXeno.setObservation("10");
        alienXeno.setSpecial("Animal");
        alienXeno.setAcid("8");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphDrone(AlienXenoCreature alienXeno){

        alienXeno.setName("Drone");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("7");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(8);
        alienXeno.setArmorFire(4);
        alienXeno.setMobility("10");
        alienXeno.setObservation("8");
        alienXeno.setSpecial("STEALTH");
        alienXeno.setAcid("8");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphBioDrone(AlienXenoCreature alienXeno){

        alienXeno.setName("Bio-Drone");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("6");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(8);
        alienXeno.setArmorFire(4);
        alienXeno.setMobility("8");
        alienXeno.setObservation("10");
        alienXeno.setSpecial("Can't evolve any further, dies after six days");
        alienXeno.setAcid("8");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphSoldier(AlienXenoCreature alienXeno){

        alienXeno.setName("Soldier");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("8");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(10);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility("8");
        alienXeno.setObservation("8");
        alienXeno.setAcid("10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphWorker(AlienXenoCreature alienXeno){

        alienXeno.setName("Worker");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("4");
        alienXeno.setSpeed(1);
        alienXeno.setArmor(5);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility("4");
        alienXeno.setObservation("4");
        alienXeno.setAcid("6");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphSentry(AlienXenoCreature alienXeno){

        alienXeno.setName("Sentry");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("8");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(12);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility("12");
        alienXeno.setObservation("10");
        alienXeno.setSpecial("Animal");
        alienXeno.setAcid("10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphPreatorian(AlienXenoCreature alienXeno){

        alienXeno.setName("Preatorian");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("10");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(12);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility("5");
        alienXeno.setObservation("8");
        alienXeno.setAcid("10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphCrusher(AlienXenoCreature alienXeno){

        alienXeno.setName("Crusher");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("16");
        alienXeno.setSpeed(1);
        alienXeno.setArmor(18);
        alienXeno.setArmorFire(6);
        alienXeno.setMobility("4");
        alienXeno.setObservation("5");
        alienXeno.setSpecial("Animal");
        alienXeno.setAcid("10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphQueen(AlienXenoCreature alienXeno){

        alienXeno.setName("Queen");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("14");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(14);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility("8");
        alienXeno.setObservation("12");
        alienXeno.setAcid("10");

        return alienXeno;
    }
}
