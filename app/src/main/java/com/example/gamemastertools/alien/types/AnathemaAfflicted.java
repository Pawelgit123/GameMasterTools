package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AnathemaAfflicted extends AlienXenoCreature implements AlienXenoAttack {

    public AnathemaAfflicted(Parcel in) {
        super(in);
    }

    public AnathemaAfflicted() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
