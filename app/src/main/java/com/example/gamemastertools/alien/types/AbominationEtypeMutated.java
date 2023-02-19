package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationEtypeMutated extends AlienXenoCreature implements AlienXenoAttack {

    public AbominationEtypeMutated(Parcel in) {
        super(in);
    }

    public AbominationEtypeMutated() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
