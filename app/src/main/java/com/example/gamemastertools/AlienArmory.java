package com.example.gamemastertools;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gamemastertools.alien.AlienWeapon;
import com.example.gamemastertools.alien.AlienWeaponAdapterList;
import com.example.gamemastertools.alien.AlienWeaponOrganizer;
import com.example.gamemastertools.databinding.FragmentAlienArmoryBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlienArmory extends Fragment{

    private FragmentAlienArmoryBinding binding;
    private RecyclerView recyclerView;
    private AlienWeaponAdapterList alienWeaponAdapterList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienArmoryBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setSwitchesVisible(false);
        List<AlienWeapon> list = new ArrayList<>();
        AlienWeaponOrganizer alienWeaponOrganizer = new AlienWeaponOrganizer();

        binding.btnArmoryRandomWeapon.setEnabled(false);


        binding.radioBtnArmoryOriginal.setOnClickListener(v -> {
            switchesOff();
            setSwitchesVisible(false);
            binding.btnArmoryRandomWeapon.setEnabled(true);
            list.clear();
            List<AlienWeapon> originalList = alienWeaponOrganizer.createOriginalList();
            list.addAll(originalList);
            list.sort(AlienWeapon::compareTo);

            alienWeaponAdapterList = new AlienWeaponAdapterList(list);
            recyclerView = view.findViewById(R.id.AlienArmoryRecyclerView);
            recyclerView.setLayoutManager(new GridLayoutManager(binding.getRoot().getContext(),1));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(alienWeaponAdapterList);

        });

        binding.radioBtnArmoryExpanded.setOnClickListener(v -> {
            setSwitchesVisible(true);
            binding.btnArmoryRandomWeapon.setEnabled(true);
            list.clear();
            List<AlienWeapon> list1 = alienWeaponOrganizer.createOriginalPlusList();
            List<AlienWeapon> list2 = alienWeaponOrganizer.createAdditionalPlusList();
            list.addAll(list1);
            list.addAll(list2);
            list.sort(AlienWeapon::compareTo);


            alienWeaponAdapterList = new AlienWeaponAdapterList(list);
            recyclerView = view.findViewById(R.id.AlienArmoryRecyclerView);
            recyclerView.setLayoutManager(new GridLayoutManager(binding.getRoot().getContext(),1));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(alienWeaponAdapterList);


        });

        binding.switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            List<AlienWeapon> listA = alienWeaponOrganizer.createPandoraPlusList();
            if(isChecked){
                list.addAll(listA);
            } else {
                list.removeIf(a -> a.getListType() == 4);
            }
            recyclerView.setAdapter(alienWeaponAdapterList);
            list.sort(AlienWeapon::compareTo);
        });
        binding.switch2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            List<AlienWeapon> listA = alienWeaponOrganizer.createElysiumPlusList();
            if(isChecked){
                list.addAll(listA);
            } else {
                list.removeIf(a -> a.getListType() == 5);
            }
            recyclerView.setAdapter(alienWeaponAdapterList);
            list.sort(AlienWeapon::compareTo);
        });
        binding.switch3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            List<AlienWeapon> listA = alienWeaponOrganizer.createKovacPlusList();
            if(isChecked){
                list.addAll(listA);
            } else {
                list.removeIf(a -> a.getListType() == 6);
            }
            recyclerView.setAdapter(alienWeaponAdapterList);
            list.sort(AlienWeapon::compareTo);
        });
        binding.switch4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            List<AlienWeapon> listA = alienWeaponOrganizer.createAuraxisPlusList();
            if(isChecked){
                list.addAll(listA);
            } else {
                list.removeIf(a -> a.getListType() == 7);
            }
            recyclerView.setAdapter(alienWeaponAdapterList);
            list.sort(AlienWeapon::compareTo);
        });
        binding.switch5.setOnCheckedChangeListener((buttonView, isChecked) -> {
            List<AlienWeapon> listA = alienWeaponOrganizer.createSecurityPlusList();
            if(isChecked){
                list.addAll(listA);
            } else {
                list.removeIf(a -> a.getListType() == 8);
            }
            recyclerView.setAdapter(alienWeaponAdapterList);
            list.sort(AlienWeapon::compareTo);
        });

        binding.btnArmoryRandomWeapon.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(list.size());
                AlienWeapon alienWeapon = list.get(i);

                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.weapon_dialog, null);
                TextView weaponNameDialog;
                TextView weaponManufacturerDialog;
                TextView weaponBonusDialog;
                TextView weaponDamageDialog;
                TextView weaponAmmoDialog;
                TextView weaponRangeDialog;
                TextView weaponWeightDialog;
                TextView weaponCostDialog;
                TextView weaponSpecialsDialog;
                TextView weaponTypeDialog;

                weaponNameDialog= dialogView.findViewById(R.id.textViewAlienWeaponDialogWeaponName);
                weaponManufacturerDialog= dialogView.findViewById(R.id.textViewAlienWeaponManufacturer);
                weaponBonusDialog=dialogView.findViewById(R.id.textViewAlienWeaponBonus);
                weaponDamageDialog=dialogView.findViewById(R.id.textViewAlienWeaponDamage);
                weaponAmmoDialog=dialogView.findViewById(R.id.textViewAlienWeaponAmmo);
                weaponRangeDialog=dialogView.findViewById(R.id.textViewAlienWeaponRange);
                weaponWeightDialog=dialogView.findViewById(R.id.textViewAlienWeaponWeight);
                weaponCostDialog=dialogView.findViewById(R.id.textViewAlienWeaponCost);
                weaponSpecialsDialog=dialogView.findViewById(R.id.textViewAlienWeaponSpecials);
                weaponTypeDialog=dialogView.findViewById(R.id.textViewAlienWeaponType);

                weaponNameDialog.setText(alienWeapon.getName());
                weaponManufacturerDialog.setText(alienWeapon.getManufacturer());
                weaponBonusDialog.setText("+"+(alienWeapon.getBonus()));
                weaponDamageDialog.setText(String.valueOf(alienWeapon.getDamage()));
                weaponAmmoDialog.setText(alienWeapon.getAmmo());
                weaponRangeDialog.setText(alienWeapon.getRange());
                weaponWeightDialog.setText(alienWeapon.getWeight());
                weaponCostDialog.setText("$"+(alienWeapon.getCost()));
                weaponSpecialsDialog.setText(alienWeapon.getSpecials());
                weaponTypeDialog.setText("["+alienWeapon.getType()+"]");

                TextView weaponManufacturerDialogStatic;
                TextView weaponBonusDialogStatic;
                TextView weaponDamageDialogStatic;
                TextView weaponAmmoDialogStatic;
                TextView weaponRangeDialogStatic;
                TextView weaponWeightDialogStatic;
                TextView weaponCostDialogStatic;
                TextView weaponSpecialsDialogStatic;

                weaponManufacturerDialogStatic= dialogView.findViewById(R.id.textViewAlienWeaponManufacturerStatic);
                weaponBonusDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponBonusStatic);
                weaponDamageDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponDamageStatic);
                weaponAmmoDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponAmmoStatic);
                weaponRangeDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponRangeStatic);
                weaponWeightDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponWeightStatic);
                weaponCostDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponCostStatic);
                weaponSpecialsDialogStatic=dialogView.findViewById(R.id.textViewAlienWeaponSpecialsStatic);

                alienWeaponAdapterList.colorMyTextRandomPick(weaponNameDialog,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponManufacturerDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponBonusDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponDamageDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponAmmoDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponRangeDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponWeightDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponCostDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponSpecialsDialogStatic,view,alienWeapon.getListType());
                alienWeaponAdapterList.colorMyTextRandomPick(weaponTypeDialog,view,alienWeapon.getListType());

                builder.setView(dialogView);
                builder.show();
            }
        });
    }

    public void setSwitchesVisible(Boolean visible){
        if(visible){
            binding.switch1.setVisibility(View.VISIBLE);
            binding.switch2.setVisibility(View.VISIBLE);
            binding.switch3.setVisibility(View.VISIBLE);
            binding.switch4.setVisibility(View.VISIBLE);
            binding.switch5.setVisibility(View.VISIBLE);
        } else {
            binding.switch1.setVisibility(View.INVISIBLE);
            binding.switch2.setVisibility(View.INVISIBLE);
            binding.switch3.setVisibility(View.INVISIBLE);
            binding.switch4.setVisibility(View.INVISIBLE);
            binding.switch5.setVisibility(View.INVISIBLE);
        }
    }

    public void switchesOff(){
        binding.switch1.setChecked(false);
        binding.switch2.setChecked(false);
        binding.switch3.setChecked(false);
        binding.switch4.setChecked(false);
        binding.switch5.setChecked(false);
    }

}