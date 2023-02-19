package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class NeomorphEgg extends AlienXenoCreature implements AlienXenoAttack {

    public NeomorphEgg(Parcel in) {
        super(in);
    }

    public NeomorphEgg() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
