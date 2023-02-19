package com.example.gamemastertools.alien.types;


import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationInfected extends AlienXenoCreature implements AlienXenoAttack {

    public AbominationInfected(Parcel in) {
        super(in);
    }

    public AbominationInfected() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }

}
