package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphWorker extends AlienXenoCreature implements AlienXenoAttack {

    public XenomorphWorker(Parcel in) {
        super(in);
    }

    public XenomorphWorker() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
