package com.example.gamemastertools.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienWeaponOrganizer {

    public AlienWeaponOrganizer() {
    }

    public static void createWeaponAndAddToList(AlienWeapon alienWeapon, List<AlienWeapon> list) {
        list.add(alienWeapon);
    }

    public static void setListType(List<AlienWeapon> list, int listType) {
        for (AlienWeapon a : list) {
            a.setListType(listType);
        }
    }

    public List<AlienWeapon> createOriginalList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalServicePistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalReximPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalInjectionPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalVpPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalElectrostaticPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalQszPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalMagnumRevolver(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalShotgunRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalCrowdControlRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalHarpoon(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalSuperNovaRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalPulseARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalHeavyPulseARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalAkPulseARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalRmcARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalNsgARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalScopeARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalSmartGunLmg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalPlasmaRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalSharpRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalDischargerRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalZvezdaRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalSuitGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalGrenadeLauncher(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalGrenadeLauncherR(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalRpgLauncher(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalRpgLauncherTwo(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalEnergyGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalPlasmaGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalPhalanxGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalFlamer(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalFlamerUnderBarrel(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalFlamerHeavy(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalSentryGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginal.createOriginalBoltGun(), list);

        setListType(list, 1);

        return list;
    }

    public List<AlienWeapon> createOriginalPlusList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createServicePistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createReximPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createInjectionPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createVpPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createElectrostaticPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createQszPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createMagnumRevolver(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createShotgunRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createCrowdControlRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createHarpoon(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createSuperNovaRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createPulseARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createHeavyPulseARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createAkPulseARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createRmcARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createNsgARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createScopeARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createSmartGunLmg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createPlasmaRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createSharpRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createDischargerRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createZvezdaRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createSuitGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createGrenadeLauncher(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createGrenadeLauncherR(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createRpgLauncher(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createRpgLauncherTwo(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createEnergyGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createPlasmaGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createPhalanxGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createFlamer(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createFlamerUnderBarrel(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createFlamerHeavy(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createSentryGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorOriginalPlus.createBoltGun(), list);

        setListType(list, 2);

        return list;
    }

    public List<AlienWeapon> createAdditionalPlusList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createEvaLaser(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createTwinHammer(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createType95Pistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createType78Pistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createCqbPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createM10Pistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createDambullaPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createFrontierRevolver(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createKramerMagnum(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createBarrage(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createM39SubmachineGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createStormsurge(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createJaipur(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createType76Shotgun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createTacticalShotgun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createScattergun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createIthaca(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createMedved(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createMisha(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createKramerShort(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createRapidResponder(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createLacrima(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createType88Rifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createKramerAssault(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createAstra(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createDirtySmartgun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createSmartgunL(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createThunderbolt(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createHeavyPulseRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createMinigun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createBombard(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createStormRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createGruppa(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createTwilight(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createScoutRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createBallista(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createSokol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createSniperR(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createPike(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createMicroBurst(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createVajra(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createM95GrenadeLauncher(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createImpactGrenade(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createRocketLauncher(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createRpgLauncher(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createHel(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createType99(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createFireball(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createVolcan(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAdditional.createFlamethrower(), list);

        setListType(list, 3);

        return list;
    }

    public List<AlienWeapon> createPandoraPlusList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createZPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createWaspRevolver(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createSentinelSmg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createRangerRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createBullpupRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createCarbine(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createBasicUnit(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createSolarisRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createEurysRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createGS(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createGau(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createMachineGunSix(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createMachineGunNine(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createHydra(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createFlamethrower(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createSentryGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorPandora.createSoundCannon(), list);

        setListType(list, 4);

        return list;

    }

    public List<AlienWeapon> createElysiumPlusList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorElysium.createTaserPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorElysium.createTaserCarbine(), list);
        createWeaponAndAddToList(AlienWeaponCreatorElysium.createVectorSmg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorElysium.createCousarRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorElysium.createChemRail(), list);
        createWeaponAndAddToList(AlienWeaponCreatorElysium.createSkySweeper(), list);
        createWeaponAndAddToList(AlienWeaponCreatorElysium.createForSureLauncher(), list);

        setListType(list, 5);

        return list;

    }

    public List<AlienWeapon> createKovacPlusList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createS49Pistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createAridPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createSteigro(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createTreffen(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createHelRevolver(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createR66(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createStbSmg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createLtcSmg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createNd6Smg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createHelShotgun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createS870Shotgun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createAF6Shotgun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createF4Carbine(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createGolok(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createDmr(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createLx(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createArbalist(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createVeruta(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createVM556Rifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createHXC(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createPrecisionRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createPr11(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createLrgRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorKovac.createExp1(), list);

        setListType(list, 6);

        return list;
    }

    public List<AlienWeapon> createAuraxisPlusList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createGuardian(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createBlitz(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createCyclone(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createClaw(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createCharger(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createPromise(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createGrinder(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createPiston(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createRutherford(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createAmp(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createJackal(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createMastiff(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.create100(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createWatchmen(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createMutilator(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createNS7(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createHSG(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createXMG(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createBeamer(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createManticore(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createCerberus(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createEridani(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createPandora(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createEquinox(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createPolaris(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createSlicer(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createSpectre(), list);
        createWeaponAndAddToList(AlienWeaponCreatorAuraxis.createQuasar(), list);

        setListType(list, 7);

        return list;

    }

    public List<AlienWeapon> createSecurityPlusList() {
        List<AlienWeapon> list = new ArrayList<>();
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createRhinoRevolver(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createPdwSmg(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createGmRiotGun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createBrARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createNoxPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createPdpPistol(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createWmShotgun(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createWmARifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.create15Compact(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createTheNine(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.create7SixRifle(), list);
        createWeaponAndAddToList(AlienWeaponCreatorSecurity.createScarRifle(), list);

        setListType(list, 8);

        return list;

    }
}
