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

import com.example.gamemastertools.alien.AlienXenoAdapter;
import com.example.gamemastertools.alien.AlienXenoAttackRoller;
import com.example.gamemastertools.alien.AlienXenoCreature;
import com.example.gamemastertools.databinding.FragmentAlienXenoRollsBinding;

public class AlienXenoRolls extends Fragment {

    private FragmentAlienXenoRollsBinding binding;
    private RecyclerView recyclerView;
    private AlienXenoAdapter alienXenoAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienXenoRollsBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.textViewXenoAttackTitle.setVisibility(View.INVISIBLE);
        binding.textViewXenoAttackText.setVisibility(View.INVISIBLE);

        Bundle bundle = getArguments();
        assert bundle != null;
        AlienXenoCreature alienXenoCreature = bundle.getParcelable("alien");

        alienXenoAdapter = new AlienXenoAdapter(alienXenoCreature);
        recyclerView = view.findViewById(R.id.alien_xeno_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(alienXenoAdapter);

        binding.btnXenoRollAttack.setOnClickListener(v -> makeAlienAttack(AlienXenoAttackRoller.attackRollSix(), alienXenoCreature));
        binding.btnXenoAttackRollEight.setOnClickListener(v -> makeAlienAttack(AlienXenoAttackRoller.attackRollEight(), alienXenoCreature));
        binding.btnXenoAttackRollTen.setOnClickListener(v -> makeAlienAttack(AlienXenoAttackRoller.attackRollTen(), alienXenoCreature));
    }

    public void makeAlienAttack(int roll, AlienXenoCreature alienXenoCreature){
        binding.textViewXenoAttackTitle.setText(alienXenoCreature.makeAttackTitle(roll));
        binding.textViewXenoAttackText.setText(alienXenoCreature.makeAttackText(roll));

        binding.textViewXenoAttackTitle.setVisibility(View.VISIBLE);
        binding.textViewXenoAttackText.setVisibility(View.VISIBLE);
    }


}