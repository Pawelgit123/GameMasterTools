package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class NeomorphNeophyte extends AlienXenoCreature implements AlienXenoAttack {
    public NeomorphNeophyte(Parcel in) {
        super(in);
    }

    public NeomorphNeophyte() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
