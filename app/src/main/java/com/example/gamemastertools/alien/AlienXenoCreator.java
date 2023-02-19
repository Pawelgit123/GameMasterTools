package com.example.gamemastertools.alien;

import com.example.gamemastertools.alien.types.AbominationBelugaHead;
import com.example.gamemastertools.alien.types.AbominationEtypeMutated;
import com.example.gamemastertools.alien.types.AbominationEtypePerfected;
import com.example.gamemastertools.alien.types.AbominationEtypeTainted;
import com.example.gamemastertools.alien.types.AbominationInfected;
import com.example.gamemastertools.alien.types.AbominationMutant;
import com.example.gamemastertools.alien.types.AbominationRevenant;
import com.example.gamemastertools.alien.types.AnathemaAfflicted;
import com.example.gamemastertools.alien.types.AnathemaBlackGoo;
import com.example.gamemastertools.alien.types.AnathemaFebrile;
import com.example.gamemastertools.alien.types.AnathemaFreak;
import com.example.gamemastertools.alien.types.AnathemaTerminal;
import com.example.gamemastertools.alien.types.NeomorphAdult;
import com.example.gamemastertools.alien.types.NeomorphBloodBurster;
import com.example.gamemastertools.alien.types.NeomorphEgg;
import com.example.gamemastertools.alien.types.NeomorphMote;
import com.example.gamemastertools.alien.types.NeomorphNeophyte;
import com.example.gamemastertools.alien.types.ProtomorphDeacon;
import com.example.gamemastertools.alien.types.ProtomorphSquid;
import com.example.gamemastertools.alien.types.ProtomorphTrilobite;
import com.example.gamemastertools.alien.types.ProtomorphUteroPod;
import com.example.gamemastertools.alien.types.XenomorphChestBursterBambi;
import com.example.gamemastertools.alien.types.XenomorphChestBursterBodyAriarcus;
import com.example.gamemastertools.alien.types.XenomorphChestBursterGore;
import com.example.gamemastertools.alien.types.XenomorphChestBursterImp;
import com.example.gamemastertools.alien.types.XenomorphChestBursterQueen;
import com.example.gamemastertools.alien.types.XenomorphChestburster;
import com.example.gamemastertools.alien.types.XenomorphCrusher;
import com.example.gamemastertools.alien.types.XenomorphDrone;
import com.example.gamemastertools.alien.types.XenomorphDroneBio;
import com.example.gamemastertools.alien.types.XenomorphEgg;
import com.example.gamemastertools.alien.types.XenomorphEggQueen;
import com.example.gamemastertools.alien.types.XenomorphFacehugger;
import com.example.gamemastertools.alien.types.XenomorphFacehuggerPraeto;
import com.example.gamemastertools.alien.types.XenomorphFacehuggerRoyal;
import com.example.gamemastertools.alien.types.XenomorphPreatorian;
import com.example.gamemastertools.alien.types.XenomorphQueen;
import com.example.gamemastertools.alien.types.XenomorphScout;
import com.example.gamemastertools.alien.types.XenomorphSentry;
import com.example.gamemastertools.alien.types.XenomorphSoldier;
import com.example.gamemastertools.alien.types.XenomorphStalker;
import com.example.gamemastertools.alien.types.XenomorphWorker;

public class AlienXenoCreator {

    public AlienXenoCreator() {
    }

    public static AlienXenoCreature createAbominationInfected(){

        AbominationInfected alienXeno = new AbominationInfected();

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

    public static AlienXenoCreature createAbominationMutant(){

        AbominationMutant alienXeno = new AbominationMutant();

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

    public static AlienXenoCreature createAbominationRevenant(){

        AbominationRevenant alienXeno = new AbominationRevenant();

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

    public static AlienXenoCreature createAbominationBelugaHead(){

        AbominationBelugaHead alienXeno = new AbominationBelugaHead();

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

    public static AlienXenoCreature createNeomorphEgg(){

        NeomorphEgg alienXeno = new NeomorphEgg();

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

    public static AlienXenoCreature createNeomorphMote(){

        NeomorphMote alienXeno = new NeomorphMote();

        alienXeno.setName("Mote");
        alienXeno.setType("Neomorph");
        alienXeno.setAcid("9");
        alienXeno.setSpeed(0);
        alienXeno.setArmor(0);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("VIRUS, next stage after a shift");

        return alienXeno;
    }

    public static AlienXenoCreature createNeomorphBloodburster(){

        NeomorphBloodBurster alienXeno = new NeomorphBloodBurster();

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

    public static AlienXenoCreature createNeomorphNeophyte(){

        NeomorphNeophyte alienXeno = new NeomorphNeophyte();

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

    public static AlienXenoCreature createNeomorphAdult(){

        NeomorphAdult alienXeno = new NeomorphAdult();

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

    public static AlienXenoCreature createAnathemaBlackGoo(){

        AnathemaBlackGoo alienXeno = new AnathemaBlackGoo();

        alienXeno.setName("Black Goo");
        alienXeno.setType("Anathema");
        alienXeno.setSpecial("VIRUS, sickness roll every shift");
        alienXeno.setAcid("8");

        return alienXeno;
    }

    public static AlienXenoCreature createAnathemaAfflicted(){

        AnathemaAfflicted alienXeno = new AnathemaAfflicted();

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

    public static AlienXenoCreature createAnathemaFebrile(){

        AnathemaFebrile alienXeno = new AnathemaFebrile();

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

    public static AlienXenoCreature createAnathemaFreak(){

        AnathemaFreak alienXeno = new AnathemaFreak();

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

    public static AlienXenoCreature createAnathemaTerminal(){

        AnathemaTerminal alienXeno = new AnathemaTerminal();

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

    public static AlienXenoCreature createAbominationTainted(){

        AbominationEtypeTainted alienXeno = new AbominationEtypeTainted();

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

    public static AlienXenoCreature createAbominationMutated(){

        AbominationEtypeMutated alienXeno = new AbominationEtypeMutated();

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

    public static AlienXenoCreature createAbominationPerfected(){

        AbominationEtypePerfected alienXeno = new AbominationEtypePerfected();

        alienXeno.setName("Perfected");
        alienXeno.setType("Abomination E");
        alienXeno.setHealth("12");
        alienXeno.setSpeed(3);
        alienXeno.setArmor(12);
        alienXeno.setArmorFire(5);
        alienXeno.setMobility("9");
        alienXeno.setObservation("12");
        alienXeno.setSpecial("HYPERBLIND, FLUIDITY OF MOTION");

        return  alienXeno;
    }

    public static AlienXenoCreature createProtomorphUteroPod(){

        ProtomorphUteroPod alienXeno = new ProtomorphUteroPod();

        alienXeno.setName("Utero Pod");
        alienXeno.setType("Protomorph");
        alienXeno.setHealth("2");
        alienXeno.setSpeed(0);
        alienXeno.setArmor(1);
        alienXeno.setArmorFire(0);
        alienXeno.setSpecial("Mobility check: FAIl roll release a squid");

        return alienXeno;
    }

    public static AlienXenoCreature createProtomorphSquid(){

        ProtomorphSquid alienXeno = new ProtomorphSquid();

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

    public static AlienXenoCreature createProtomorphTrilobite(){

        ProtomorphTrilobite alienXeno = new ProtomorphTrilobite();

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

    public static AlienXenoCreature createProtomorphDeacon(){

        ProtomorphDeacon alienXeno = new ProtomorphDeacon();

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

    public static AlienXenoCreature createXenomorphEgg(){

        XenomorphEgg alienXeno = new XenomorphEgg();

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

    public static AlienXenoCreature createXenomorphQueenEgg(){

        XenomorphEggQueen alienXeno = new XenomorphEggQueen();

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

    public static AlienXenoCreature createXenomorphFacehugger(){

        XenomorphFacehugger alienXeno = new XenomorphFacehugger();

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

    public static AlienXenoCreature createXenomorphPraetoFacehugger(){

        XenomorphFacehuggerPraeto alienXeno = new XenomorphFacehuggerPraeto();

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

    public static AlienXenoCreature createXenomorphRoyalFacehugger(){

        XenomorphFacehuggerRoyal alienXeno = new XenomorphFacehuggerRoyal();

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

    public static AlienXenoCreature createXenomorphChestburster(){

        XenomorphChestburster alienXeno = new XenomorphChestburster();

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

    public static AlienXenoCreature createXenomorphBambiburster(){

        XenomorphChestBursterBambi alienXeno = new XenomorphChestBursterBambi();

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

    public static AlienXenoCreature createXenomorphGoreburster(){

        XenomorphChestBursterGore alienXeno = new XenomorphChestBursterGore();

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

    public static AlienXenoCreature createXenomorphAriarcusBodyburster(){

        XenomorphChestBursterBodyAriarcus alienXeno = new XenomorphChestBursterBodyAriarcus();

        alienXeno.setName("Bodyburster");
        alienXeno.setType("Xenomorph");
        alienXeno.setHealth("9");
        alienXeno.setSpeed(2);
        alienXeno.setArmor(8);
        alienXeno.setArmorFire(4);
        alienXeno.setMobility("6");
        alienXeno.setObservation("10");
        alienXeno.setSpecial("During transformation: all present must make an immediate Panic Roll");
        alienXeno.setAcid("10");

        return alienXeno;
    }

    public static AlienXenoCreature createXenomorphImp(){

        XenomorphChestBursterImp alienXeno = new XenomorphChestBursterImp();

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

    public static AlienXenoCreature createXenomorphQueenburster(){

        XenomorphChestBursterQueen alienXeno = new XenomorphChestBursterQueen();

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

    public static AlienXenoCreature createXenomorphStalker(){

        XenomorphStalker alienXeno = new XenomorphStalker();

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

    public static AlienXenoCreature createXenomorphScout(){

        XenomorphScout alienXeno = new XenomorphScout();

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

    public static AlienXenoCreature createXenomorphDrone(){

        XenomorphDrone alienXeno = new XenomorphDrone();

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

    public static AlienXenoCreature createXenomorphBioDrone(){

        XenomorphDroneBio alienXeno = new XenomorphDroneBio();

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

    public static AlienXenoCreature createXenomorphSoldier(){

        XenomorphSoldier alienXeno = new XenomorphSoldier();

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

    public static AlienXenoCreature createXenomorphWorker(){

        XenomorphWorker alienXeno = new XenomorphWorker();

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

    public static AlienXenoCreature createXenomorphSentry(){

        XenomorphSentry alienXeno = new XenomorphSentry();

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

    public static AlienXenoCreature createXenomorphPreatorian(){

        XenomorphPreatorian alienXeno = new XenomorphPreatorian();

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

    public static AlienXenoCreature createXenomorphCrusher(){

        XenomorphCrusher alienXeno = new XenomorphCrusher();

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

    public static AlienXenoCreature createXenomorphQueen(){

        XenomorphQueen alienXeno = new XenomorphQueen();

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
