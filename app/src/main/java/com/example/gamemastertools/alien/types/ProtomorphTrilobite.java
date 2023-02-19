package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class ProtomorphTrilobite extends AlienXenoCreature implements AlienXenoAttack {
    public ProtomorphTrilobite(Parcel in) {
        super(in);
    }

    public ProtomorphTrilobite() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
