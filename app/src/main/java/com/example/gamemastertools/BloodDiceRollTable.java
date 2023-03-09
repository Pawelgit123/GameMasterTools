package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.databinding.FragmentBloodDiceRollTableBinding;

public class BloodDiceRollTable extends Fragment {

    private FragmentBloodDiceRollTableBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBloodDiceRollTableBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBloodDiceRollTablePrevious.setOnClickListener(v ->
                NavHostFragment.findNavController(BloodDiceRollTable.this)
                .navigate(R.id.action_blood_dice_roll_to_blood));
    }
}