package com.example.gamemastertools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.gamemastertools.databinding.FragmentHousesBinding;

public class HousesFragment extends Fragment {

    private FragmentHousesBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentHousesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonGoMenuHouses.setOnClickListener(v ->
                NavHostFragment.findNavController(HousesFragment.this)
                .navigate(R.id.action_Houses_to_FirstFragment));

    }
}
