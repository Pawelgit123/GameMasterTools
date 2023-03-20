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
        createArmorAndAddToList(AlienArmorCreatorOriginal.createLifeVestOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createColdWeatherParkaOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createGSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createFullFaceRebreatherMaskOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createGhilieSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createKevlarRiotVestOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createM3PersonalArmorOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.create6B90CombatArmorOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createIrcM50CompressionSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createIrcM35CompressionSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createApeSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createPowerLoaderOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createCombatCompressionSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createAWSurvivalSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createECOSurvivalSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createHazmatSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createMilitaryHazmatSuitOriginal(),list);
        createArmorAndAddToList(AlienArmorCreatorOriginal.createRiotShieldOriginal(),list);

        setListType(list, 1);

        return list;
    }

    public List<AlienArmor> createExpandedList() {
        List<AlienArmor> list = new ArrayList<>();
        createArmorAndAddToList(AlienArmorCreatorExpanded.createLifeVestExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createColdWeatherParkaExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createGSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createFullFaceRebreatherMaskExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createLeatherCloakExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createKaraulTacticalCloakExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createGhilieSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createTacticalVestExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createJupiterVestExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createKevlarRiotVestExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createBerillArmoredVestExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createM3PersonalArmorExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.create6B90CombatArmorExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createAjaxExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createOrionExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createTaurusExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createM4PersonalArmorExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createSpiderExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createIrcM50CompressionSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createIrcM35CompressionSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createApeSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createHalitelSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createBasicPowerSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createTacticalPowerSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createPowerLoaderExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createCMCPowerArmorExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createGoliathPowerArmorExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createReaverPowerArmorExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createMaxSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createEMPSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createAPUSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createCombatCompressionSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createAWSurvivalSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createECOSurvivalSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createHazmatSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createMilitaryHazmatSuitExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createRiotShieldExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createBallisticShieldExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createCombatShieldExpanded(),list);
        createArmorAndAddToList(AlienArmorCreatorExpanded.createLadderShieldExpanded(),list);

        setListType(list, 2);

        return list;
    }
}
