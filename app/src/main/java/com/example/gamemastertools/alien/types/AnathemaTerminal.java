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
    public String makeAttackTitle(int roll) {

        return "AGONY";

    }

    @Override
    public String makeAttackText(int roll) {

        return "The Terminal is moving around in agony.";

    }
}
