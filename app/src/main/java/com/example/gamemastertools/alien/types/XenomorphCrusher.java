package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphCrusher extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphCrusher(Parcel in) {
        super(in);
    }

    public XenomorphCrusher() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
