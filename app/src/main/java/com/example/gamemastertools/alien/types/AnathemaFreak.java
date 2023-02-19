package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AnathemaFreak extends AlienXenoCreature implements AlienXenoAttack {

    public AnathemaFreak(Parcel in) {
        super(in);
    }

    public AnathemaFreak() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
