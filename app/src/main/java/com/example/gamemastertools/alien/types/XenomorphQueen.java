package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphQueen extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphQueen(Parcel in) {
        super(in);
    }

    public XenomorphQueen() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
