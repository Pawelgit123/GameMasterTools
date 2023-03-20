package com.example.gamemastertools.alien;

public class AlienArmor implements Comparable<AlienArmor>{

    String name;
    String armorValue;
    String weight;
    boolean communication;
    int cost;
    int air;
    boolean abc;
    boolean vacuum;
    boolean fire;
    boolean acid;
    String additional;
    String negatives;
    String type;
    int listType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(String armorValue) {
        this.armorValue = armorValue;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean isCommunication() {
        return communication;
    }

    public void setCommunication(boolean communication) {
        this.communication = communication;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }

    public boolean isAbc() {
        return abc;
    }

    public void setAbc(boolean abc) {
        this.abc = abc;
    }

    public boolean isVacuum() {
        return vacuum;
    }

    public void setVacuum(boolean vacuum) {
        this.vacuum = vacuum;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public boolean isAcid() {
        return acid;
    }

    public void setAcid(boolean acid) {
        this.acid = acid;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getNegatives() {
        return negatives;
    }

    public void setNegatives(String negatives) {
        this.negatives = negatives;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getListType() {
        return listType;
    }

    public void setListType(int listType) {
        this.listType = listType;
    }

    @Override
    public int compareTo(AlienArmor o) {
        return Integer.compare(compareArmorType(), o.compareArmorType());
    }

    public int compareArmorType(){

        switch (getType()){
            default: return 0;
            case "Shield": return 1;
            case "Personal Armor": return 2;
            case "Personal Armor+": return 3;
            case "Space Suit": return 4;
            case "Power Suit": return 5;
            case "Specialized Suit": return 6;
            case "Power Armor": return 7;

        }
    }

    public static final class Builder{

        String name;
        String armorValue;
        String weight;
        boolean communication;
        int cost;
        int air;
        boolean abc;
        boolean vacuum;
        boolean fire;
        boolean acid;
        String additional;
        String negatives;
        String type;

        public AlienArmor.Builder name(String name){
            this.name = name;
            return this;
        }

        public AlienArmor.Builder armorValue(String armorValue){
            this.armorValue = armorValue;
            return this;
        }

        public AlienArmor.Builder weight(String weight){
            this.weight = weight;
            return this;
        }

        public AlienArmor.Builder communication(Boolean communication){
            this.communication = communication;
            return this;
        }

        public AlienArmor.Builder cost(int cost){
            this.cost = cost;
            return this;
        }

        public AlienArmor.Builder air(int air){
            this.air = air;
            return this;
        }

        public AlienArmor.Builder abc(boolean abc){
            this.abc = abc;
            return this;
        }

        public AlienArmor.Builder vacuum(boolean vacuum){
            this.vacuum = vacuum;
            return this;
        }

        public AlienArmor.Builder fire(Boolean fire){
            this.fire = fire;
            return this;
        }

        public AlienArmor.Builder acid(Boolean acid){
            this.acid = acid;
            return this;
        }

        public AlienArmor.Builder additional(String additional){
            this.additional = additional;
            return this;
        }

        public AlienArmor.Builder negatives(String negatives){
            this.negatives = negatives;
            return this;
        }

        public AlienArmor.Builder type(String type){
            this.type = type;
            return this;
        }

        public AlienArmor build(){
            AlienArmor alienArmor = new AlienArmor();
            alienArmor.name = this.name;
            alienArmor.weight = this.weight;
            alienArmor.armorValue = this.armorValue;
            alienArmor.communication = this.communication;
            alienArmor.cost = this.cost;
            alienArmor.air = this.air;
            alienArmor.abc = this.abc;
            alienArmor.vacuum = this.vacuum;
            alienArmor.fire = this.fire;
            alienArmor.acid = this.acid;
            alienArmor.additional = this.additional;
            alienArmor.negatives = this.negatives;
            alienArmor.type = this.type;
            return alienArmor;
        }


    }

}
