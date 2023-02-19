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
import com.example.gamemastertools.alien.AlienXenoCreature;
import com.example.gamemastertools.blood.Battle;
import com.example.gamemastertools.databinding.FragmentAlienXenoRollsBinding;

public class AlienXenoRolls extends Fragment {

    private FragmentAlienXenoRollsBinding binding;
    private RecyclerView recyclerView;
    private AlienXenoAdapter alienXenoAdapter;
    private String attackTitle;
    private String attackText;
    private int attackRoll;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienXenoRollsBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.textViewXenoAttackText).setVisibility(View.INVISIBLE);
        view.findViewById(R.id.textViewXenoAttackTitle).setVisibility(View.INVISIBLE);

        Bundle bundle = getArguments();
        assert bundle != null;
        AlienXenoCreature alienXenoCreature = bundle.getParcelable("alien");

        alienXenoAdapter = new AlienXenoAdapter(alienXenoCreature);
        recyclerView = view.findViewById(R.id.alien_xeno_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(alienXenoAdapter);

        binding.btnXenoRollAttack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });


    }

    public void attackResolve(String name, int roll){

        switch (name){
            default:


        }



    }
}