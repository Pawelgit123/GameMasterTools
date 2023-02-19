package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphSentry extends AlienXenoCreature implements AlienXenoAttack {

    public XenomorphSentry(Parcel in) {
        super(in);
    }

    public XenomorphSentry() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
