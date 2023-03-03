package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.gamemastertools.alien.AlienWeapon;
import com.example.gamemastertools.alien.AlienWeaponAdapterList;
import com.example.gamemastertools.alien.AlienWeaponOrganizer;
import com.example.gamemastertools.blood.BattleAdapter;
import com.example.gamemastertools.databinding.FragmentAlienArmoryBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        binding.radioBtnArmoryOriginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSwitchesVisible(false);
                list.clear();
                List<AlienWeapon> originalList = alienWeaponOrganizer.createOriginalList();
                list.addAll(originalList);
                list.sort(AlienWeapon::compareTo);

                alienWeaponAdapterList = new AlienWeaponAdapterList(list);
                recyclerView = view.findViewById(R.id.AlienArmoryRecyclerView);
                recyclerView.setLayoutManager(new GridLayoutManager(binding.getRoot().getContext(),1));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(alienWeaponAdapterList);

            }
        });

        binding.radioBtnArmoryExpanded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSwitchesVisible(true);
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


}