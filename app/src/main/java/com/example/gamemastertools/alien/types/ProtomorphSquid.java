package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class ProtomorphSquid extends AlienXenoCreature implements AlienXenoAttack {
    public ProtomorphSquid(Parcel in) {
        super(in);
    }

    public ProtomorphSquid() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
