package com.example.gamemastertools.blood;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class HealingModificationPack implements Parcelable {

    List<HealingModification> listInfectionMod;
    List<HealingModification> listFirstAidMod;
    List<HealingModification> listMedicalHelpMod;
    List<HealingModification> listHealingMod;

    public HealingModificationPack() {
    }

    protected HealingModificationPack(Parcel in) {
    }

    public static final Creator<HealingModificationPack> CREATOR = new Creator<HealingModificationPack>() {
        @Override
        public HealingModificationPack createFromParcel(Parcel in) {
            return new HealingModificationPack(in);
        }

        @Override
        public HealingModificationPack[] newArray(int size) {
            return new HealingModificationPack[size];
        }
    };

    public List<HealingModification> getListInfectionMod() {
        return listInfectionMod;
    }
    public void setListInfectionMod(List<HealingModification> listInfectionMod) {
        this.listInfectionMod = listInfectionMod;
    }
    public List<HealingModification> getListFirstAidMod() {
        return listFirstAidMod;
    }
    public void setListFirstAidMod(List<HealingModification> listFirstAidMod) {
        this.listFirstAidMod = listFirstAidMod;
    }
    public List<HealingModification> getListMedicalHelpMod() {
        return listMedicalHelpMod;
    }
    public void setListMedicalHelpMod(List<HealingModification> listMedicalHelpMod) {
        this.listMedicalHelpMod = listMedicalHelpMod;
    }
    public List<HealingModification> getListHealingMod() {
        return listHealingMod;
    }
    public void setListHealingMod(List<HealingModification> listHealingMod) {
        this.listHealingMod = listHealingMod;
    }

    public void initialiseMods(HealingModificationPack healingModificationPack){
        List<HealingModification> listInfectionMod = new ArrayList<>();

        HealingModification poison = new HealingModification("Poison", "auto infect", 0);
        HealingModification disease = new HealingModification("Disease", "auto infect", 0);
        listInfectionMod.add(poison);
        listInfectionMod.add(disease);

        List<HealingModification> listFirstAidMod = new ArrayList<>();
        HealingModification cut = new HealingModification("Cut","perk mod",1);
        HealingModification time = new HealingModification("Time", "perk mod", 1);

        HealingModification bandage = new HealingModification("Bandage","bonus mod", 1);
        listFirstAidMod.add(cut);
        listFirstAidMod.add(time);
        listFirstAidMod.add(bandage);

        List<HealingModification> listMedicalHelpMod = new ArrayList<>();
        HealingModification firstAid = new HealingModification("First Aid", "bonus mod", 1);
        HealingModification scalding = new HealingModification("Scalding","dices req",2);
        HealingModification frost = new HealingModification("Frost", "dices req", 3);

        listMedicalHelpMod.add(firstAid);
        listMedicalHelpMod.add(scalding);
        listMedicalHelpMod.add(frost);

        List<HealingModification> listHealingMod = new ArrayList<>();

        healingModificationPack.setListInfectionMod(listInfectionMod);
        healingModificationPack.setListFirstAidMod(listFirstAidMod);
        healingModificationPack.setListMedicalHelpMod(listMedicalHelpMod);
        healingModificationPack.setListHealingMod(listHealingMod);



    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    }
}
