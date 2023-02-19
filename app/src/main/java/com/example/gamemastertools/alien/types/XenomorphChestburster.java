package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphChestburster extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphChestburster(Parcel in) {
        super(in);
    }

    public XenomorphChestburster() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
