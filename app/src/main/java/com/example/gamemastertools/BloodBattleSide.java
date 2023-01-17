package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.blood.Adversary;
import com.example.gamemastertools.blood.Battle;
import com.example.gamemastertools.blood.BattleAdapter;
import com.example.gamemastertools.books.Book;
import com.example.gamemastertools.books.BookAdapter;
import com.example.gamemastertools.databinding.FragmentBloodBattleSideBinding;
import com.example.gamemastertools.databinding.FragmentBloodSourceBookBinding;

import java.util.ArrayList;


public class BloodBattleSide extends Fragment {

    private FragmentBloodBattleSideBinding binding;
    private RecyclerView recyclerView;
    private BattleAdapter battleAdapter;
    private Battle battle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBloodBattleSideBinding.inflate(inflater,container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        battleAdapter = new BattleAdapter(battle);
        recyclerView = view.findViewById(R.id.blood_battle_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(battleAdapter);

    }
}