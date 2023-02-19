package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AnathemaFebrile extends AlienXenoCreature implements AlienXenoAttack {

    public AnathemaFebrile(Parcel in) {
        super(in);
    }

    public AnathemaFebrile() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
