package com.example.gamemastertools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.gamemastertools.databinding.FragmentAlienArmoryBinding;

public class AlienArmory extends Fragment {

    private FragmentAlienArmoryBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentAlienArmoryBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnAlienArmoryFirearms.setOnClickListener(v ->
                NavHostFragment.findNavController(AlienArmory.this)
                .navigate(R.id.action_armory_go_to_armory_weapons));

        binding.btnAlienArmoryProtection.setOnClickListener(v ->
                NavHostFragment.findNavController(AlienArmory.this)
                .navigate(R.id.action_armory_go_to_armory_protection));
    }

}
