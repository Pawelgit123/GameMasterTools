package com.example.gamemastertools.alien;

public class AlienWeapon implements Comparable<AlienWeapon>{

    String name;
    String type;
    String manufacturer;
    int bonus;
    int damage;
    String range;
    int cost;
    String specials;
    String ammo;
    String weight;
    int listType;

    public int getListType() {
        return listType;
    }

    public void setListType(int listType) {
        this.listType = listType;
    }

    public AlienWeapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSpecials() {
        return specials;
    }

    public void setSpecials(String specials) {
        this.specials = specials;
    }

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(AlienWeapon o) {

        return Integer.compare(compareWeaponType(),o.compareWeaponType());

    }

    public int compareWeaponType(){

        switch (getType()){
            default: return 0;
            case "Revolver": return 1;
            case "SMG": return 2;
            case "Rifle": return 3;
            case "A-Rifle": return 4;
            case "LMG": return 5;
            case "S-Rifle": return 6;
            case "Suit": return 7;
            case "Heavy": return 8;
            case "Spec": return 9;
        }
    }

    public static final class Builder{

        String name;
        String type;
        String manufacturer;
        int bonus;
        int damage;
        String range;
        int cost;
        String specials;
        String ammo;
        String weight;
        int listType;

       public Builder name(String name){
           this.name = name;
           return this;
       }

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder manufacturer(String manufacturer){
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder bonus(int bonus){
            this.bonus = bonus;
            return this;
        }

        public Builder damage(int damage){
            this.damage = damage;
            return this;
        }

        public Builder range(String range){
            this.range = range;
            return this;
        }

        public Builder cost(int cost){
            this.cost = cost;
            return this;
        }

        public Builder specials(String specials){
            this.specials = specials;
            return this;
        }

        public Builder ammo(String ammo){
            this.ammo = ammo;
            return this;
        }

        public Builder weight(String weight){
            this.weight = weight;
            return this;
        }

        public Builder listType(int listType){
           this.listType = listType;
           return this;
        }

        public AlienWeapon build(){
           AlienWeapon alienWeapon = new AlienWeapon();
           alienWeapon.ammo = this.ammo;
           alienWeapon.bonus = this.bonus;
           alienWeapon.cost = this.cost;
           alienWeapon.damage = this.damage;
           alienWeapon.specials = this.specials;
           alienWeapon.manufacturer = this.manufacturer;
           alienWeapon.range = this.range;
           alienWeapon.weight = this.weight;
           alienWeapon.type = this.type;
           alienWeapon.name = this.name;
           alienWeapon.listType = this.listType;
           return alienWeapon;
        }

    }
}


