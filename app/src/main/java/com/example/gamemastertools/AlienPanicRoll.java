package com.example.gamemastertools;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gamemastertools.alien.AlienPanicRoller;
import com.example.gamemastertools.databinding.FragmentAlienPanicRollBinding;

public class AlienPanicRoll extends Fragment {

    private FragmentAlienPanicRollBinding binding;
    private int panicLevel = 1;
    private int panicLevelRolled = 0;
    private String panicTitle = "";

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienPanicRollBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.txtCurrentPanicLevel.setText(String.valueOf(panicLevel));
        binding.textPanicRollNumberRolled.setText(String.valueOf(panicLevelRolled));
        binding.textViewPanicTitle.setVisibility(View.INVISIBLE);
        binding.textPanicRollDescription.setVisibility(View.INVISIBLE);

        binding.btnPlusPanicLevel.setOnClickListener(v -> {
            if(panicLevel<15){
                panicLevel++;
            }
            binding.txtCurrentPanicLevel.setText(String.valueOf(panicLevel));
        });
        binding.btnMinusPanicLevel.setOnClickListener(v -> {
            if(panicLevel > 1){
                panicLevel--;
            }
            binding.txtCurrentPanicLevel.setText(String.valueOf(panicLevel));
        });

        binding.btnPanicRoll.setOnClickListener(v -> {

            panicLevelRolled = AlienPanicRoller.panicRoll(panicLevel);
            binding.textPanicRollNumberRolled.setText(String.valueOf(panicLevelRolled));
            panicTitle = AlienPanicRoller.panicTitle(panicLevelRolled);

            binding.textViewPanicTitle.setText(panicTitle);
            binding.textViewPanicTitle.setVisibility(View.VISIBLE);
            binding.textPanicRollDescription.setText(AlienPanicRoller.panicDescription(panicTitle));
            binding.textPanicRollDescription.setVisibility(View.VISIBLE);
        });
    }

}