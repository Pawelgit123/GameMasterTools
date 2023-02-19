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
    public String  makeAttackTitle(int roll) {

        return "FLEE";

    }

    @Override
    public String  makeAttackText(int roll) {

        return "The Worker flee leaving their protection to other Xenos.";

    }
}
