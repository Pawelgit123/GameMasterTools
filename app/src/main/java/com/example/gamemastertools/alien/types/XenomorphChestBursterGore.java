package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphChestBursterGore extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphChestBursterGore(Parcel in) {
        super(in);
    }

    public XenomorphChestBursterGore() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
