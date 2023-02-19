package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphFacehugger extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphFacehugger(Parcel in) {
        super(in);
    }

    public XenomorphFacehugger() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
