package com.example.gamemastertools.blood;

public class HealingModification {

    String name;
    String description;
    int mod;

    public String getName() {
        return name;
    }

    public int getMod() {
        return mod;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public HealingModification(String name, String description, int mod) {
        this.name = name;
        this.description = description;
        this.mod = mod;
    }
}
