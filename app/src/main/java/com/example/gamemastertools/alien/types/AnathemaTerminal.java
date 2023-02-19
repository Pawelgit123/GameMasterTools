package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class AnathemaTerminal extends AlienXenoCreature implements AlienXenoAttack {

    public AnathemaTerminal(Parcel in) {
        super(in);
    }

    public AnathemaTerminal() {
    }

    @Override
    public void makeAttackTitle(int roll) {

    }

    @Override
    public void makeAttackText(int roll) {

    }
}
