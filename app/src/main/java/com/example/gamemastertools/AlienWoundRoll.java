package com.example.gamemastertools;

import android.annotation.SuppressLint;
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
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienWoundRollBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.radioButtonWoundOriginal.setActivated(true);
        binding.radioButtonWoundOriginal.setChecked(true);

        binding.textViewWoundRollTitle.setVisibility(View.INVISIBLE);
        binding.textViewWoundRollDescription.setVisibility(View.INVISIBLE);
        binding.textViewWoundFatal.setVisibility(View.INVISIBLE);
        binding.textViewWoundTimeLimit.setVisibility(View.INVISIBLE);
        binding.textViewWoundHealingTime.setVisibility(View.INVISIBLE);

        binding.btnWoundRoll.setOnClickListener(v -> {

            if (binding.radioButtonWoundOriginal.isActivated()){
                String s = AlienWoundRoller.woundRollOriginal();
                binding.textViewWoundRollNumberRolled.setText(s);
                setWoundTextForAll(s);

            } else if (binding.radioButtonWoundLow.isActivated()){
                String s = AlienWoundRoller.woundRollLow();
                binding.textViewWoundRollNumberRolled.setText(s);
                setWoundTextForAll(s);

            } else if (binding.radioButtonWoundHigh.isActivated()){
                String s = AlienWoundRoller.woundRollHigh();
                binding.textViewWoundRollNumberRolled.setText(s);
                setWoundTextForAll(s);
            }
        });

        binding.radioButtonWoundOriginal.setOnClickListener(v -> {
            binding.radioButtonWoundOriginal.setActivated(true);
            binding.radioButtonWoundLow.setActivated(false);
            binding.radioButtonWoundHigh.setActivated(false);
        });

        binding.radioButtonWoundLow.setOnClickListener(v -> {
            binding.radioButtonWoundOriginal.setActivated(false);
            binding.radioButtonWoundLow.setActivated(true);
            binding.radioButtonWoundHigh.setActivated(false);

        });

        binding.radioButtonWoundHigh.setOnClickListener(v -> {
            binding.radioButtonWoundOriginal.setActivated(false);
            binding.radioButtonWoundLow.setActivated(false);
            binding.radioButtonWoundHigh.setActivated(true);
        });
    }

    @SuppressLint("SetTextI18n")
    void setWoundTextForAll(String s){
        int integer = Integer.parseInt(s);
        binding.textViewWoundRollTitle.setVisibility(View.VISIBLE);
        binding.textViewWoundRollTitle.setText(AlienWoundRoller.woundTitle(integer));
        binding.textViewWoundRollDescription.setVisibility(View.VISIBLE);
        binding.textViewWoundRollDescription.setText(AlienWoundRoller.woundEffect(integer));
        binding.textViewWoundFatal.setVisibility(View.VISIBLE);
        binding.textViewWoundFatal.setText(AlienWoundRoller.woundIsFatal(integer));
        binding.textViewWoundTimeLimit.setVisibility(View.VISIBLE);
        binding.textViewWoundTimeLimit.setText("Duration: " +AlienWoundRoller.woundTimeLimit(integer));
        binding.textViewWoundHealingTime.setVisibility(View.VISIBLE);
        binding.textViewWoundHealingTime.setText("Healing time: " +AlienWoundRoller.woundHealingTime(integer));

    }
}