package com.example.gamemastertools.alien;

public class AlienXenoCreator {

    public AlienXeno createAbominationInfected(AlienXeno alienXeno){

        alienXeno.setName("Infected");
        alienXeno.setType("Abomination");
        alienXeno.setVirus(6);
        alienXeno.setVirusTime("1 shift");

        return alienXeno;
    }

    public AlienXeno createAbominationMutant(AlienXeno alienXeno){

        alienXeno.setName("Mutant");
        alienXeno.setType("Abomination");
        alienXeno.setSpeed(2);
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpecial("Strength +3, Agility +2, Empathy -1");

        return alienXeno;
    }

    public AlienXeno createAbominationRevenant(AlienXeno alienXeno){

        alienXeno.setName("Mutant");
        alienXeno.setType("Abomination");
        alienXeno.setSpeed(2);
        alienXeno.setHealth(8);
        alienXeno.setVirusTime("3 shifts");
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(5);
        alienXeno.setObservation(3);
        alienXeno.setSpecial("Strength +2, Agility +1, Empathy -5");

        return alienXeno;
    }

    public AlienXeno createAbominationBelugaHead(AlienXeno alienXeno){

        alienXeno.setName("Beluga Head");
        alienXeno.setType("Abomination");
        alienXeno.setHealth(10);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(6);
        alienXeno.setArmorFire(3);
        alienXeno.setMobility(5);
        alienXeno.setObservation(3);
        alienXeno.setSpecial("Strength +2");

        return  alienXeno;
    }

    public AlienXeno createNeomorphEgg(AlienXeno alienXeno){

        alienXeno.setName("Egg");
        alienXeno.setType("Neomorph");
        alienXeno.setSpecial("Grow in clutches of 2d6");

        return alienXeno;
    }

    public AlienXeno createNeomorphMote(AlienXeno alienXeno){

        alienXeno.setName("Mote");
        alienXeno.setName("Neomorph");
        alienXeno.setVirus(9);
        alienXeno.setVirusTime("1 shift");

        return alienXeno;
    }

    public AlienXeno createNeomorphBloodburster(AlienXeno alienXeno){

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

    public AlienXeno createNeomorphNeophyte(AlienXeno alienXeno){

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

    public AlienXeno createNeomorphAdult(AlienXeno alienXeno){

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

    public AlienXeno createAnathemaAfflicted(AlienXeno alienXeno){

        alienXeno.setName("Afflicted");
        alienXeno.setType("Anathema");
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpecial("Stress level +1");

        return  alienXeno;
    }

    public AlienXeno createAnathemaFebrile(AlienXeno alienXeno){

        alienXeno.setName("Febrile");
        alienXeno.setType("Anathema");
        alienXeno.setVirusTime("1 shift");
        alienXeno.setSpecial("Stress level +1, Strength +3, Wits -2, Enthralling Gaze");

        return alienXeno;
    }

    public AlienXeno createAnathemaFreak(AlienXeno alienXeno){

        alienXeno.setName("Freak");
        alienXeno.setType("Anathema");
        alienXeno.setHealth(8);
        alienXeno.setSpeed(2);
        alienXeno.setArmor(3);
        alienXeno.setArmorFire(0);
        alienXeno.setMobility(5);
        alienXeno.setObservation(3);

        return alienXeno;
    }

    public AlienXeno createAnathemaTerminal(AlienXeno alienXeno){

        alienXeno.setName("Terminal");
        alienXeno.setType("Anathema");
        alienXeno.setSpecial("Health -1 per turn, Virus at ENGAGED is doubled");
        alienXeno.setVirus(4);

        return alienXeno;
    }
}
