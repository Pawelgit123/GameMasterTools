package com.example.gamemastertools.alien.types;

import android.os.Parcel;

import com.example.gamemastertools.alien.AlienXenoAttack;
import com.example.gamemastertools.alien.AlienXenoCreature;

public class NeomorphMote extends AlienXenoCreature implements AlienXenoAttack {

    public NeomorphMote(Parcel in) {
        super(in);
    }

    public NeomorphMote() {
    }

    @Override
    public String makeAttackTitle(int roll) {
        return "";

    }

    @Override
    public String makeAttackText(int roll) {
        return "";

    }
}
