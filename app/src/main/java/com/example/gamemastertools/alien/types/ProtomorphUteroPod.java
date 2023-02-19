package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class ProtomorphUteroPod extends AlienXenoCreature implements AlienXenoAttack {

    public ProtomorphUteroPod(Parcel in) {
        super(in);
    }

    public ProtomorphUteroPod() {
    }

    @Override
    public String  makeAttackTitle(int roll) {

        return "";

    }

    @Override
    public String  makeAttackText(int roll) {

        return "";

    }
}
