package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.blood.Adversary;
import com.example.gamemastertools.blood.Battle;
import com.example.gamemastertools.blood.BattleAdapter;
import com.example.gamemastertools.blood.BattleCreator;
import com.example.gamemastertools.blood.Human;
import com.example.gamemastertools.books.Book;
import com.example.gamemastertools.books.BookAdapter;
import com.example.gamemastertools.databinding.FragmentBloodBattleSideBinding;
import com.example.gamemastertools.databinding.FragmentBloodSourceBookBinding;

import java.util.ArrayList;
import java.util.List;


public class BloodBattleSide extends Fragment {

    private FragmentBloodBattleSideBinding binding;
    private RecyclerView recyclerView;
    private BattleAdapter battleAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBloodBattleSideBinding.inflate(inflater,container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();
        assert bundle != null;
        Battle battle = bundle.getParcelable("battle");

        battleAdapter = new BattleAdapter(battle.getAdversaryList());
        recyclerView = view.findViewById(R.id.blood_battle_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(battleAdapter);

        binding.btnBloodBattleSideRollForInitiative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                battle.rollForInitiative();

                Bundle bundle = getArguments();
                assert bundle != null;
                Battle battle = bundle.getParcelable("battle");

                battleAdapter = new BattleAdapter(battle.getAdversaryList());
                recyclerView = view.findViewById(R.id.blood_battle_recycler_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(battleAdapter);


            }
        });

    }
}