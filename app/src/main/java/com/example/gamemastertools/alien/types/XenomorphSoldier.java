package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphSoldier extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphSoldier(Parcel in) {
        super(in);
    }

    public XenomorphSoldier() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
