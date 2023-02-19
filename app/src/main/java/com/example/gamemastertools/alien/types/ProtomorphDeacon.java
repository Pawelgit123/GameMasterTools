package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class ProtomorphDeacon extends AlienXenoCreature implements AlienXenoAttack {
    public ProtomorphDeacon(Parcel in) {
        super(in);
    }

    public ProtomorphDeacon() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
