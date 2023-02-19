package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphEgg extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphEgg(Parcel in) {
        super(in);
    }

    public XenomorphEgg() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        return "";

    }

    @Override
    public String  makeAttackText(int roll) {

        return "";

    }
}
