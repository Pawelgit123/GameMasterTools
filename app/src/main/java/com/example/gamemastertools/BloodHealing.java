package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.blood.HealingModificationAdapter;
import com.example.gamemastertools.blood.HealingModificationPack;
import com.example.gamemastertools.databinding.FragmentBloodHealingBinding;

public class BloodHealing extends Fragment {

    private FragmentBloodHealingBinding binding;
    private RecyclerView recyclerView;
    private HealingModificationAdapter healingModificationAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBloodHealingBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();
        assert bundle != null;
        HealingModificationPack healingModificationPack = bundle.getParcelable("healingPack");

        healingModificationAdapter = new HealingModificationAdapter(healingModificationPack.getListInfectionMod());
        recyclerView = view.findViewById(R.id.recyclerViewInfectionMod);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(healingModificationAdapter);

        healingModificationAdapter = new HealingModificationAdapter(healingModificationPack.getListFirstAidMod());
        recyclerView = view.findViewById(R.id.recyclerViewFirstAidMod);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(healingModificationAdapter);

        healingModificationAdapter = new HealingModificationAdapter(healingModificationPack.getListMedicalHelpMod());
        recyclerView = view.findViewById(R.id.recyclerViewMedicalHelpMod);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(healingModificationAdapter);

        healingModificationAdapter = new HealingModificationAdapter(healingModificationPack.getListHealingMod());
        recyclerView = view.findViewById(R.id.recyclerViewHealingMod);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(healingModificationAdapter);


        binding.btbBloodHealingTablePrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BloodHealing.this)
                        .navigate(R.id.action_blood_healing_table_to_blood);
            }
        });
    }
}