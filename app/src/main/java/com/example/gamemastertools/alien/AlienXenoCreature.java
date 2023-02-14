package com.example.gamemastertools.alien;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class AlienXenoCreature implements Parcelable {

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



    protected AlienXenoCreature(Parcel in) {
        health = in.readInt();
        armor = in.readInt();
        armorFire = in.readInt();
        speed = in.readInt();
        mobility = in.readInt();
        observation = in.readInt();
        special = in.readString();
        name = in.readString();
        virus = in.readInt();
        virusTime = in.readString();
        type = in.readString();
    }

    public static final Creator<AlienXenoCreature> CREATOR = new Creator<AlienXenoCreature>() {
        @Override
        public AlienXenoCreature createFromParcel(Parcel in) {
            return new AlienXenoCreature(in);
        }

        @Override
        public AlienXenoCreature[] newArray(int size) {
            return new AlienXenoCreature[size];
        }
    };

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlienXenoCreature() {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(health);
        dest.writeInt(armor);
        dest.writeInt(armorFire);
        dest.writeInt(speed);
        dest.writeInt(mobility);
        dest.writeInt(observation);
        dest.writeString(special);
        dest.writeString(name);
        dest.writeInt(virus);
        dest.writeString(virusTime);
        dest.writeString(type);
    }
}
