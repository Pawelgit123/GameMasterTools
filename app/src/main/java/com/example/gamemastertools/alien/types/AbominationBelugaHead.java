package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationBelugaHead extends AlienXenoCreature implements AlienXenoAttack {

    public AbominationBelugaHead(Parcel in) {
        super(in);
    }

    public AbominationBelugaHead() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
