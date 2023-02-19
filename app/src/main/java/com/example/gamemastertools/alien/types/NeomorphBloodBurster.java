package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class NeomorphBloodBurster extends AlienXenoCreature implements AlienXenoAttack {
    public NeomorphBloodBurster(Parcel in) {
        super(in);
    }

    public NeomorphBloodBurster() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
