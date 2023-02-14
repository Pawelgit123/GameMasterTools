package com.example.gamemastertools.alien;

public class AlienXeno {

    int health;
    int armor;
    int armorFire;
    int speed;
    int mobility;
    int observation;
    String special;
    String name;
    int virus;
    String virusTime;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlienXeno() {
    }

    public int getVirus() {
        return virus;
    }

    public void setVirus(int virus) {
        this.virus = virus;
    }

    public String getVirusTime() {
        return virusTime;
    }

    public void setVirusTime(String virusTime) {
        this.virusTime = virusTime;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMobility() {
        return mobility;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility;
    }

    public int getObservation() {
        return observation;
    }

    public void setObservation(int observation) {
        this.observation = observation;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorFire() {
        return armorFire;
    }

    public void setArmorFire(int armorFire) {
        this.armorFire = armorFire;
    }
}
