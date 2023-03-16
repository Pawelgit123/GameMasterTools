package com.example.gamemastertools.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienArmorOrganizer {

    public static void createArmorAndAddToList(AlienArmor alienArmor, List<AlienArmor> list) {
        list.add(alienArmor);
    }

    public static void setListType(List<AlienArmor> list, int listType) {
        for (AlienArmor a : list) {
            a.setListType(listType);
        }
    }

    public List<AlienArmor> createOriginalList() {
        List<AlienArmor> list = new ArrayList<>();

        setListType(list, 1);

        return list;
    }

    public List<AlienArmor> createExpandedList() {
        List<AlienArmor> list = new ArrayList<>();

        setListType(list, 2);

        return list;
    }
}
