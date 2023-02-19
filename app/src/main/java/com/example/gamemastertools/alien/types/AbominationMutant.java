package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationMutant extends AlienXenoCreature implements AlienXenoAttack {

    public AbominationMutant() {
    }

    public AbominationMutant(Parcel in) {
        super(in);
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
