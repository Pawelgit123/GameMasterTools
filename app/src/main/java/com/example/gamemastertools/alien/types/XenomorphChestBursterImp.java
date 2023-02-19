package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphChestBursterImp extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphChestBursterImp(Parcel in) {
        super(in);
    }

    public XenomorphChestBursterImp() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
