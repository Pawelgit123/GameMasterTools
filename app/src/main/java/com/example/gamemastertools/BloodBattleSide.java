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

import com.example.gamemastertools.blood.Battle;
import com.example.gamemastertools.blood.BattleAdapter;
import com.example.gamemastertools.databinding.FragmentBloodBattleSideBinding;


public class BloodBattleSide extends Fragment {

    private FragmentBloodBattleSideBinding binding;
    private RecyclerView recyclerView;
    private BattleAdapter battleAdapter;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
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

        binding.btnBloodBattleSideRollForInitiative.setOnClickListener(v -> {
            battle.rollForInitiative();

            recyclerView.setAdapter(battleAdapter);

        });



    }
}