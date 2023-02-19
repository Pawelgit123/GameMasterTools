package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class XenomorphFacehuggerPraeto extends AlienXenoCreature implements AlienXenoAttack {
    public XenomorphFacehuggerPraeto(Parcel in) {
        super(in);
    }

    public XenomorphFacehuggerPraeto() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
