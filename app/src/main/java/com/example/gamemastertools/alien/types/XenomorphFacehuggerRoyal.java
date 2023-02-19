package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphFacehuggerRoyal extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphFacehuggerRoyal(Parcel in) {
        super(in);
    }

    public XenomorphFacehuggerRoyal() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
