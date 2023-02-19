package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class NeomorphAdult extends AlienXenoCreature implements AlienXenoAttack {
    public NeomorphAdult(Parcel in) {
        super(in);
    }

    public NeomorphAdult() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
