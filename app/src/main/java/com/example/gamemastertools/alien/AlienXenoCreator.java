package com.example.gamemastertools.alien;

public class AlienXenoCreator {

    public AlienXenoCreator() {
    }

    public static AlienXenoCreature createAbominationBlackGoo(AlienXenoCreature alienXeno){

        alienXeno.setName("Black Goo");
        alienXeno.setType("Anathema");
        alienXeno.setSpecial("VIRUS");
        alienXeno.setVirus(8);
        alienXeno.setVirusTime("1 shift");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationInfected(AlienXenoCreature alienXeno){

        alienXeno.setName("Infected");
        alienXeno.setType("Abomination");
        alienXeno.setVirus(6);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setSpecial("Stats like Host");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationMutant(AlienXenoCreature alienXeno){

        alienXeno.setName("Mutant");
        alienXeno.setType("Abomination");
        alienXeno.setSpeed(2);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setSpecial("Host: Strength +3, Agility +2, Empathy -1");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationRevenant(AlienXenoCreature alienXeno){

        alienXeno.setName("Mutant");
        alienXeno.setType("Abomination");
        alienXeno.setSpeed(2);
        alienXeno.setHealth(8);
        alienXeno.setVirusTime("3 shifts");
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(5);
        alienXeno.setObservation(3);
        alienXeno.setSpecial("Host: Strength +2, Agility +1, Empathy -5");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationBelugaHead(AlienXenoCreature alienXeno){

        alienXeno.setName("Beluga Head");
        alienXeno.setType("Abomination");
        alienXeno.setHealth(10);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility(5);
        alienXeno.setObservation(3);
        alienXeno.setSpecial("Host: Strength +2");

        return  alienXeno;
    }

    public static AlienXenoCreature createNeomorphEgg(AlienXenoCreature alienXeno){

        alienXeno.setName("Egg");
        alienXeno.setType("Neomorph");
        alienXeno.setSpecial("Grow in clutches of 2d6");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(0);

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphMote(AlienXenoCreature alienXeno){

        alienXeno.setName("Mote");
        alienXeno.setType("Neomorph");
        alienXeno.setVirus(9);
        alienXeno.setSpeed(0);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("VIRUS");

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphBloodburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Bloodburster");
        alienXeno.setType("Neomorph");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(3);
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(9);
        alienXeno.setObservation(6);
        alienXeno.setVirusTime("1d6 turns");

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphNeophyte(AlienXenoCreature alienXeno){

        alienXeno.setName("Neophyte");
        alienXeno.setType("Neomorph");
        alienXeno.setHealth(4);
        alienXeno.setSpeed(3);
        alienXeno.setArmor(4);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility(10);
        alienXeno.setObservation(6);
        alienXeno.setVirusTime("1 shift");

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphAdult(AlienXenoCreature alienXeno){

        alienXeno.setName("Adult");
        alienXeno.setType("Neomorph");
        alienXeno.setHealth(6);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility(9);
        alienXeno.setObservation(8);

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaAfflicted(AlienXenoCreature alienXeno){

        alienXeno.setName("Afflicted");
        alienXeno.setType("Anathema");
        alienXeno.setVirus(8);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpecial("Host: Stress level +1, spread VIRUS:4");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);

        return  alienXeno;
    }

    public static AlienXenoCreature createAnathemaFebrile(AlienXenoCreature alienXeno){

        alienXeno.setName("Febrile");
        alienXeno.setType("Anathema");
        alienXeno.setVirus(8);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setSpecial("Host: Stress level +1, Strength +3, Wits -2, Enthralling Gaze, spread VIRUS:6");

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaFreak(AlienXenoCreature alienXeno){

        alienXeno.setName("Freak");
        alienXeno.setType("Anathema");
        alienXeno.setHealth(8);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(5);
        alienXeno.setObservation(3);
        alienXeno.setSpecial("Stats like Host, spread VIRUS:7");

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaTerminal(AlienXenoCreature alienXeno){

        alienXeno.setName("Terminal");
        alienXeno.setType("Anathema");
        alienXeno.setSpecial("Host: Health -1 per turn, Virus at ENGAGED range is doubled");
        alienXeno.setVirus(4);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationTained(AlienXenoCreature alienXeno){

        alienXeno.setName("Tained");
        alienXeno.setType("Abomination E");
        alienXeno.setVirus(6);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpeed(1);
        alienXeno.setSpecial("Stats like Host");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationMutated(AlienXenoCreature alienXeno){

        alienXeno.setName("Mutated");
        alienXeno.setType("Abomination E");
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("Host: Strength +3, Agility +1, Empathy -1");

        return alienXeno;
    }

    public static AlienXenoCreature createAbominationPerfected(AlienXenoCreature alienXeno){

        alienXeno.setName("Perfected");
        alienXeno.setType("Abomination E");
        alienXeno.setHealth(12);
        alienXeno.setSpeed(3);
        alienXeno.setArmor(12);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility(9);
        alienXeno.setObservation(12);

        return  alienXeno;
    }

    public static AlienXenoCreature createProtomorphUteroPod(AlienXenoCreature alienXeno){

        alienXeno.setName("Utero Pod");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(0);
        alienXeno.setArmor(1);
        alienXeno.setArmorFire(0);

        return alienXeno;
    }

    public static AlienXenoCreature createProtomorphSquid(AlienXenoCreature alienXeno){

        alienXeno.setName("Squid");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(1);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(9);
        alienXeno.setObservation(4);

        return alienXeno;
    }

    public static AlienXenoCreature createProtomorphTrilobite(AlienXenoCreature alienXeno){

        alienXeno.setName("Trilobite");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth(9);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(5);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility(4);
        alienXeno.setObservation(9);

        return alienXeno;
    }

    public static AlienXenoCreature createProtomorphDeacon(AlienXenoCreature alienXeno){

        alienXeno.setName("Deacon");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth(5);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility(7);
        alienXeno.setObservation(6);

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphEgg(AlienXenoCreature alienXeno){

        alienXeno.setName("Ovomorph");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(0);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("Acid 4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphQueenEgg(AlienXenoCreature alienXeno){

        alienXeno.setName("Queen's Egg");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(0);
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(1);
        alienXeno.setSpecial("Acid 5");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphFacehugger(AlienXenoCreature alienXeno){

        alienXeno.setName("Facehugger");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(8);
        alienXeno.setObservation(8);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpecial("Acid 4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphPraetoFacehugger(AlienXenoCreature alienXeno){

        alienXeno.setName("Praeto-Facehugger");
        alienXeno.setType("Xenomorph P");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(6);
        alienXeno.setObservation(8);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpecial("Acid 4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphRoyalFacehugger(AlienXenoCreature alienXeno){

        alienXeno.setName("Royal Facehugger");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth(3);
        alienXeno.setSpeed(3);
        alienXeno.setArmor(4);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility(8);
        alienXeno.setObservation(10);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpecial("Acid 5");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphChestburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Chestburster");
        alienXeno.setType("Xenomorph H");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(8);
        alienXeno.setObservation(6);
        alienXeno.setSpecial("Acid 4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphBambiburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Bambiburster");
        alienXeno.setType("Xenomorph A");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(2);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(10);
        alienXeno.setObservation(6);
        alienXeno.setSpecial("Acid 4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphImp(AlienXenoCreature alienXeno){

        alienXeno.setName("Imp");
        alienXeno.setType("Xenomorph F");
        alienXeno.setHealth(2);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility(8);
        alienXeno.setObservation(8);
        alienXeno.setSpecial("Acid 4");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphQueenburster(AlienXenoCreature alienXeno){

        alienXeno.setName("Queenburster");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth(3);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(4);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility(8);
        alienXeno.setObservation(6);
        alienXeno.setSpecial("Acid 5");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphStalker(AlienXenoCreature alienXeno){

        alienXeno.setName("Stalker");
        alienXeno.setType("Xenomorph F");
        alienXeno.setHealth(6);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(10);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility(8);
        alienXeno.setObservation(6);
        alienXeno.setSpecial("Acid 8, HUNGER");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphScout(AlienXenoCreature alienXeno){

        alienXeno.setName("Scout");
        alienXeno.setType("Xenomorph A");
        alienXeno.setHealth(5);
        alienXeno.setSpeed(3);
        alienXeno.setArmor(8);
        alienXeno.setArmorFire(4);
        alienXeno.setMobility(8);
        alienXeno.setObservation(10);
        alienXeno.setSpecial("Acid 8");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphDrone(AlienXenoCreature alienXeno){

        alienXeno.setName("Scout");
        alienXeno.setType("Xenomorph H");
        alienXeno.setHealth(7);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(8);
        alienXeno.setArmorFire(4);
        alienXeno.setMobility(10);
        alienXeno.setObservation(8);
        alienXeno.setSpecial("Acid 8, STEALTH");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphSoldier(AlienXenoCreature alienXeno){

        alienXeno.setName("Soldier");
        alienXeno.setType("Xenomorph H");
        alienXeno.setHealth(8);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(10);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility(8);
        alienXeno.setObservation(8);
        alienXeno.setSpecial("Acid 10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphWorker(AlienXenoCreature alienXeno){

        alienXeno.setName("Worker");
        alienXeno.setType("Xenomorph H");
        alienXeno.setHealth(4);
        alienXeno.setSpeed(1);
        alienXeno.setArmor(5);
        alienXeno.setArmorFire(2);
        alienXeno.setMobility(4);
        alienXeno.setObservation(4);
        alienXeno.setSpecial("Acid 6");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphSentry(AlienXenoCreature alienXeno){

        alienXeno.setName("Sentru");
        alienXeno.setType("Xenomorph A");
        alienXeno.setHealth(8);
        alienXeno.setSpeed(3);
        alienXeno.setArmor(12);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility(12);
        alienXeno.setObservation(10);
        alienXeno.setSpecial("Acid 10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphPreatorian(AlienXenoCreature alienXeno){

        alienXeno.setName("Preatorian");
        alienXeno.setType("Xenomorph H");
        alienXeno.setHealth(10);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(12);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility(5);
        alienXeno.setObservation(8);
        alienXeno.setSpecial("Acid 10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphCrusher(AlienXenoCreature alienXeno){

        alienXeno.setName("Crusher");
        alienXeno.setType("Xenomorph A");
        alienXeno.setHealth(16);
        alienXeno.setSpeed(1);
        alienXeno.setArmor(18);
        alienXeno.setArmorFire(6);
        alienXeno.setMobility(4);
        alienXeno.setObservation(5);
        alienXeno.setSpecial("Acid 10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphQueen(AlienXenoCreature alienXeno){

        alienXeno.setName("Queen");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth(14);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(14);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility(8);
        alienXeno.setObservation(12);
        alienXeno.setSpecial("Acid 10");

        return alienXeno;
    }
}
