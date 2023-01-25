package com.example.gamemastertools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.gamemastertools.blood.HealingModificationPack;
import com.example.gamemastertools.databinding.FragmentBloodBinding;

public class BloodFragment extends Fragment {

    private FragmentBloodBinding binding;


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentBloodBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonGoMenuBlood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(BloodFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });

        binding.btnBloodSourceBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BloodFragment.this)
                        .navigate(R.id.action_blood_to_blood_source_books);
            }
        });

        binding.btnBloodBattleCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BloodFragment.this)
                        .navigate(R.id.action_blood_to_blood_battle_creator);
            }
        });

        binding.btnBloodHealing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HealingModificationPack healingModificationPack = new HealingModificationPack();
                healingModificationPack.initialiseMods(healingModificationPack);

                Bundle bundle = new Bundle();
                bundle.putParcelable("healingPack", healingModificationPack);

                NavHostFragment.findNavController(BloodFragment.this)
                        .navigate(R.id.action_blood_to_blood_healing, bundle);
            }
        });

        binding.btnBloodDiceTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BloodFragment.this)
                        .navigate(R.id.action_blood_to_blood_dice_roll);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}