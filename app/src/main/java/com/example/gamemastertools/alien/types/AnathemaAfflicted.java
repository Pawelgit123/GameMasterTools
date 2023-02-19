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
    public String makeAttackTitle(int roll) {

        return "HUMAN";

    }

    @Override
    public String makeAttackText(int roll) {

        return "Acts like human (PC or GM)";

    }
}
