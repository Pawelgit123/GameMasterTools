package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphEggQueen extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphEggQueen(Parcel in) {
        super(in);
    }

    public XenomorphEggQueen() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
