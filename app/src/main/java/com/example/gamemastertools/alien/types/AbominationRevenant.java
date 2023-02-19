package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AbominationRevenant extends AlienXenoCreature implements AlienXenoAttack

{
    public AbominationRevenant(Parcel in) {
        super(in);
    }

    public AbominationRevenant() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
