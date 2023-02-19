package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphStalker extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphStalker(Parcel in) {
        super(in);
    }

    public XenomorphStalker() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
