package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.alien.AlienWoundRoller;
import com.example.gamemastertools.databinding.FragmentAlienWoundRollBinding;

public class AlienWoundRoll extends Fragment {

    private FragmentAlienWoundRollBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienWoundRollBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.radioButtonWoundOriginal.setActivated(true);
        binding.radioButtonWoundOriginal.setChecked(true);

        binding.btnWoundRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.radioButtonWoundOriginal.isActivated()){
                    String s = AlienWoundRoller.woundRollOriginal();
                    binding.textViewWoundRollNumberRolled.setText(s);
                } else if (binding.radioButtonWoundLow.isActivated()){
                    String s = AlienWoundRoller.woundRollLow();
                    binding.textViewWoundRollNumberRolled.setText(s);
                } else if (binding.radioButtonWoundHigh.isActivated()){
                    String s = AlienWoundRoller.woundRollHigh();
                    binding.textViewWoundRollNumberRolled.setText(s);
                }
            }
        });

        binding.radioButtonWoundOriginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.radioButtonWoundOriginal.setActivated(true);
                binding.radioButtonWoundLow.setActivated(false);
                binding.radioButtonWoundHigh.setActivated(false);
            }
        });

        binding.radioButtonWoundLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.radioButtonWoundOriginal.setActivated(false);
                binding.radioButtonWoundLow.setActivated(true);
                binding.radioButtonWoundHigh.setActivated(false);

            }
        });

        binding.radioButtonWoundHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.radioButtonWoundOriginal.setActivated(false);
                binding.radioButtonWoundLow.setActivated(false);
                binding.radioButtonWoundHigh.setActivated(true);
            }
        });
    }
}