package com.example.gamemastertools.blood;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Battle implements Adversary, Parcelable {

    private List<Human> adversaryList;

    protected Battle(Parcel in) {
    }

    public static final Creator<Battle> CREATOR = new Creator<Battle>() {
        @Override
        public Battle createFromParcel(Parcel in) {
            return new Battle(in);
        }

        @Override
        public Battle[] newArray(int size) {
            return new Battle[size];
        }
    };

    public List<Human> getAdversaryList() {
        return adversaryList;
    }

    public void setAdversaryList(List<Human> adversaryList) {
        this.adversaryList = adversaryList;
    }

    public Battle(List<Human> adversaryList){
        this.adversaryList = adversaryList;

    }
    public Battle(){
    }

    @Override
    public void rollForInitiative() {

        for (Human adv:adversaryList) {
            adv.rollForInitiative();
        }
        Collections.sort(adversaryList);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    }
}
