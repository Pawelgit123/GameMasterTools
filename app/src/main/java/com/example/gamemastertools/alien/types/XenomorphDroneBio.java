package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphDroneBio extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphDroneBio(Parcel in) {
        super(in);
    }

    public XenomorphDroneBio() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
