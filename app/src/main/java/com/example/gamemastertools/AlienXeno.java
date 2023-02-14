package com.example.gamemastertools;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.alien.AlienXenoCreator;
import com.example.gamemastertools.alien.AlienXenoCreature;
import com.example.gamemastertools.databinding.FragmentAlienXenoBinding;

public class AlienXeno extends Fragment {

    private FragmentAlienXenoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienXenoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void packAlienAndGo(AlienXenoCreature alienXeno, Dialog dialog, Bundle bundle){
        bundle.putParcelable("alien", alienXeno);
        NavHostFragment.findNavController(AlienXeno.this)
                .navigate(R.id.action_alien_xeno_go_to_xeno_rolls, bundle);
        dialog.dismiss();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = new Bundle();

        Dialog dialogNeomorph = new Dialog(getContext());
        Dialog dialogAnathema = new Dialog(getContext());
        Dialog dialogProtomorph = new Dialog(getContext());
        Dialog dialogAbomination = new Dialog(getContext());
        Dialog dialogAbominantionE = new Dialog(getContext());
        Dialog dialogXenomorph = new Dialog(getContext());
        dialogNeomorph.setContentView(R.layout.dialog_xeno_neomorph);
        dialogAnathema.setContentView(R.layout.dialog_xeno_anathema);
        dialogProtomorph.setContentView(R.layout.dialog_xeno_protomorph);
        dialogAbomination.setContentView(R.layout.dialog_xeno_abomination);
        dialogAbominantionE.setContentView(R.layout.dialog_xeno_abomination_e);
        dialogXenomorph.setContentView(R.layout.dialog_xeno_xenomorph);

        Dialog dialogOne = new Dialog(getContext());
        Dialog dialogTwo = new Dialog(getContext());
        Dialog dialogThree = new Dialog(getContext());
        Dialog dialogFour = new Dialog(getContext());
        Dialog dialogFive = new Dialog(getContext());
        Dialog dialogSix = new Dialog(getContext());
        dialogOne.setContentView(R.layout.dialog_xeno_xenomorph_stage_one);
        dialogTwo.setContentView(R.layout.dialog_xeno_xenomorph_stage_two);
        dialogThree.setContentView(R.layout.dialog_xeno_xenomorph_stage_three);
        dialogFour.setContentView(R.layout.dialog_xeno_xenomorph_stage_four);
        dialogFive.setContentView(R.layout.dialog_xeno_xenomorph_stage_five);
        dialogSix.setContentView(R.layout.dialog_xeno_xenomorph_stage_six);

        view.findViewById(R.id.btnXenoNeomorph).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogNeomorph.show();

                dialogNeomorph.findViewById(R.id.btnXenoDialogNeomoprhMote).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlienXenoCreature alienXeno = new AlienXenoCreature();
                        AlienXenoCreator.createNeomorphMote(alienXeno);
                        bundle.putParcelable("alien", alienXeno);
                        NavHostFragment.findNavController(AlienXeno.this)
                                .navigate(R.id.action_alien_xeno_go_to_xeno_rolls, bundle);
                        dialogNeomorph.dismiss();
                    }
                });

            }
        });

        view.findViewById(R.id.btnXenoAbomination).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAbomination.show();
            }
        });

        view.findViewById(R.id.btnXenoAnathema).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAnathema.show();
            }
        });

        view.findViewById(R.id.btnXenoAbominationTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAbominantionE.show();
            }
        });

        view.findViewById(R.id.btnXenoProtomorph).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogProtomorph.show();
            }
        });

        view.findViewById(R.id.btnXenoXenomorph).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogXenomorph.show();

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageOne).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogOne.show();
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageTwo).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogTwo.show();
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageThree).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogThree.show();
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageFour).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogFour.show();
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageFive).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogFive.show();
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageSix).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogSix.show();
                    }
                });
            }

        });
    }
}