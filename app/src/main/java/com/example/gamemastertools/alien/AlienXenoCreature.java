package com.example.gamemastertools.alien;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class AlienXenoCreature implements Parcelable {

    String health;
    int armor;
    int armorFire;
    int speed;
    String mobility;
    String observation;
    String special;
    String name;
    String acid;
    String type;



    protected AlienXenoCreature(Parcel in) {
        health = in.readString();
        armor = in.readInt();
        armorFire = in.readInt();
        speed = in.readInt();
        mobility = in.readString();
        observation = in.readString();
        special = in.readString();
        name = in.readString();
        acid = in.readString();
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

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getAcid() {
        return acid;
    }

    public void setAcid(String acid) {
        this.acid = acid;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(health);
        dest.writeInt(armor);
        dest.writeInt(armorFire);
        dest.writeInt(speed);
        dest.writeString(mobility);
        dest.writeString(observation);
        dest.writeString(special);
        dest.writeString(name);
        dest.writeString(acid);
        dest.writeString(type);
    }
}
