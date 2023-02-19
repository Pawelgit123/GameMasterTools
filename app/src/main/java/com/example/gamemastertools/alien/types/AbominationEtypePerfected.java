package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationEtypePerfected extends AlienXenoCreature implements AlienXenoAttack {
    public AbominationEtypePerfected(Parcel in) {
        super(in);
    }

    public AbominationEtypePerfected() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
