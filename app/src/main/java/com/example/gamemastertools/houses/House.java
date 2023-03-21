package com.example.gamemastertools.houses;

public class House {

    String name;
    String virtue;
    String description;
    String additional;
    private final int houseLogo;

    public House(String name, String virtue, String description, int houseLogo) {
        this.name = name;
        this.virtue = virtue;
        this.description = description;
        this.houseLogo = houseLogo;
    }

    public House(int houseLogo) {
        this.houseLogo = houseLogo;
    }

    public int getHouseLogo() {
        return houseLogo;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVirtue() {
        return virtue;
    }

    public void setVirtue(String virtue) {
        this.virtue = virtue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
