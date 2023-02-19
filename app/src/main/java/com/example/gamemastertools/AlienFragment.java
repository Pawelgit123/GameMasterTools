package com.example.gamemastertools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.gamemastertools.databinding.FragmentAlienBinding;

public class AlienFragment extends Fragment {

    private FragmentAlienBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentAlienBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonGoMenuAlien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(AlienFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_FirstFragment);
            }
        });

        binding.btnAlienSourceBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(AlienFragment.this)
                        .navigate(R.id.action_alien_go_to_source_books);
            }
        });

        binding.btnAlienArmory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(AlienFragment.this)
                        .navigate(R.id.action_alien_go_to_alien_armory);
            }
        });

        binding.btnAlienRandomItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(AlienFragment.this)
                        .navigate(R.id.action_alien_go_to_alien_random_item);
            }
        });

        binding.btnAlienPanicRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(AlienFragment.this)
                        .navigate(R.id.action_alien_go_to_alien_panic_roll);
            }
        });

        binding.btnAlienWoundRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(AlienFragment.this)
                        .navigate(R.id.action_alien_go_to_alien_wound_roll);
            }
        });

        binding.btnAlienXenoGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(AlienFragment.this)
                        .navigate(R.id.action_alien_go_to_alien_xeno);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}