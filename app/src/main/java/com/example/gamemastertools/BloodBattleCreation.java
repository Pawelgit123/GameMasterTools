package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.blood.Battle;
import com.example.gamemastertools.blood.BattleCreator;
import com.example.gamemastertools.blood.HumanCreator;
import com.example.gamemastertools.blood.HumanStrategyBalanced;
import com.example.gamemastertools.blood.WeaponRandomByRank;
import com.example.gamemastertools.databinding.FragmentBloodBattleCreationBinding;
import com.google.android.material.snackbar.Snackbar;

public class BloodBattleCreation extends Fragment {

    private FragmentBloodBattleCreationBinding binding;
    private int numberOfAdversaries = 1;
    private int rankOfAdversaries = 1;
    private boolean withLeader = false;
    private boolean onlyFighters = false;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBloodBattleCreationBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.txtToButtonNumberOfAdversaries.setText(String.valueOf(numberOfAdversaries));
        binding.txtToButtonRankOfAdversaries.setText(String.valueOf(rankOfAdversaries));

        binding.minusNumberOfAdversaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberOfAdversaries>1){
                    numberOfAdversaries--;
                }
                binding.txtToButtonNumberOfAdversaries.setText(String.valueOf(numberOfAdversaries));
            }
        });

        binding.plusNumberOfAdversaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberOfAdversaries<10){
                    numberOfAdversaries++;
                }
                binding.txtToButtonNumberOfAdversaries.setText(String.valueOf(numberOfAdversaries));
            }
        });

        binding.minusRankOfAdversaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rankOfAdversaries>1){
                    rankOfAdversaries--;
                }
                binding.txtToButtonRankOfAdversaries.setText(String.valueOf(rankOfAdversaries));
            }
        });

        binding.plusRankOfAdversaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rankOfAdversaries<5){
                    rankOfAdversaries++;
                }
                binding.txtToButtonRankOfAdversaries.setText(String.valueOf(rankOfAdversaries));
            }
        });

        binding.leaderCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                withLeader= !withLeader;
            }
        });

        binding.fightersCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onlyFighters= !onlyFighters;
            }
        });

        binding.btnCreateNewBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(binding.getRoot(), "Enemies: " +numberOfAdversaries +
                                        " Rank: " + rankOfAdversaries +
                                        " Leader: " +withLeader +
                                        " Fighters: " + onlyFighters
                        , Snackbar.LENGTH_LONG).show();

            }
        });



    }
}