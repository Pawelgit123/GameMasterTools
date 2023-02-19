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
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
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
                        packAlienAndGo(AlienXenoCreator.createNeomorphMote(),dialogNeomorph,bundle);
                    }
                });
                dialogNeomorph.findViewById(R.id.btnXenoDialogNeomorphBloodburster).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createNeomorphBloodburster(),dialogNeomorph, bundle);
                    }
                });
                dialogNeomorph.findViewById(R.id.btnXenoDialogNeomorphEgg).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createNeomorphEgg(), dialogNeomorph, bundle);
                    }
                });
                dialogNeomorph.findViewById(R.id.btnXenoDialogNeomoprhNeophyte).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createNeomorphNeophyte(), dialogNeomorph,bundle);
                    }
                });
                dialogNeomorph.findViewById(R.id.btnXenoDialogNeomorphAdult).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createNeomorphAdult(), dialogNeomorph, bundle);
                    }
                });

            }
        });

        view.findViewById(R.id.btnXenoAbomination).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAbomination.show();

                dialogAbomination.findViewById(R.id.btnXenoDialogAbominationMutant).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAbominationMutant(), dialogAbomination, bundle);
                    }
                });
                dialogAbomination.findViewById(R.id.btnXenoDialogAbominationBelugaHead).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAbominationBelugaHead(), dialogAbomination, bundle);
                    }
                });
                dialogAbomination.findViewById(R.id.btnXenoDialogAbominationInfected).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAbominationInfected(), dialogAbomination,bundle);
                    }
                });
                dialogAbomination.findViewById(R.id.btnXenoDialogAbominationRevenant).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAbominationRevenant(), dialogAbomination, bundle);
                    }
                });
            }
        });

        view.findViewById(R.id.btnXenoAnathema).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAnathema.show();

                dialogAnathema.findViewById(R.id.btnXenoDialogAnathemaAfflicted).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAnathemaAfflicted(), dialogAnathema,bundle);
                    }
                });
                dialogAnathema.findViewById(R.id.btnXenoDialogAnathemaFebrile).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAnathemaFebrile(), dialogAnathema, bundle);
                    }
                });
                dialogAnathema.findViewById(R.id.btnXenoDialogAnathemaFreak).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAnathemaFreak(), dialogAnathema, bundle);
                    }
                });
                dialogAnathema.findViewById(R.id.btnXenoDialogAnathemaTerminal).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAnathemaTerminal(), dialogAnathema, bundle);
                    }
                });
                dialogAnathema.findViewById(R.id.btnXenoDialogAnathemBlackGoo).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAnathemaBlackGoo(), dialogAnathema, bundle);
                    }
                });
            }
        });

        view.findViewById(R.id.btnXenoAbominationTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAbominantionE.show();

                dialogAbominantionE.findViewById(R.id.btnXenoDialobAbominatioEeTained).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAbominationTainted(), dialogAbominantionE, bundle);
                    }
                });
                dialogAbominantionE.findViewById(R.id.btnXenoDialogAbominationEeMutated).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAbominationMutated(), dialogAbominantionE, bundle);
                    }
                });
                dialogAbominantionE.findViewById(R.id.btnXenoDialogAbominationEePerfected).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createAbominationPerfected(), dialogAbominantionE, bundle);
                    }
                });
            }
        });

        view.findViewById(R.id.btnXenoProtomorph).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogProtomorph.show();

                dialogProtomorph.findViewById(R.id.btnXenoDialogProtomorphUteroPod).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createProtomorphUteroPod(),dialogProtomorph, bundle);
                    }
                });
                dialogProtomorph.findViewById(R.id.btnXenoDialogProtomorphSquid).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createProtomorphSquid(),dialogProtomorph, bundle);
                    }
                });
                dialogProtomorph.findViewById(R.id.btnXenoDialogProtomorphTrilobite).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createProtomorphTrilobite(), dialogProtomorph, bundle);
                    }
                });
                dialogProtomorph.findViewById(R.id.btnXenoDialogProtomorphDaecon).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        packAlienAndGo(AlienXenoCreator.createProtomorphDeacon(), dialogProtomorph, bundle);
                    }
                });
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

                        dialogOne.findViewById(R.id.btnDialogXenoStageOneEgg).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphEgg(), dialogOne, bundle);
                            }
                        });
                        dialogOne.findViewById(R.id.btnDialogXenoStageOneQueenEgg).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphQueenEgg(), dialogOne, bundle);
                            }
                        });
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageTwo).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogTwo.show();

                        dialogTwo.findViewById(R.id.btnXenoDialogStageTwoFacehugger).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphFacehugger(),dialogTwo, bundle);
                            }
                        });
                        dialogTwo.findViewById(R.id.btnXenoDialogStageTwoRoyalFacehugger).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphRoyalFacehugger(), dialogTwo, bundle);
                            }
                        });
                        dialogTwo.findViewById(R.id.btnXenoDialogStageTwoPraetoFacehugger).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphPraetoFacehugger(), dialogTwo, bundle);
                            }
                        });
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageThree).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogThree.show();

                        dialogThree.findViewById(R.id.btnXenoDialogStageThreeChestburster).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphChestburster(), dialogThree, bundle);
                            }
                        });
                        dialogThree.findViewById(R.id.btnXenoDialogStageThreeGoreburster).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphGoreburster(),dialogThree,bundle);
                            }
                        });
                        dialogThree.findViewById(R.id.btnXenoDialogStageThreeBodyBurster).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphAriarcusBodyburster(),dialogThree, bundle);
                            }
                        });
                        dialogThree.findViewById(R.id.btnXenoDialogStageThreeBambiburster).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphBambiburster(), dialogThree, bundle);
                            }
                        });
                        dialogThree.findViewById(R.id.btnXenoDialogStageThreeImp).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphImp(), dialogThree, bundle);
                            }
                        });
                        dialogThree.findViewById(R.id.btnXenoDialogStageThreeQueenburster).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphQueenburster(), dialogThree, bundle);
                            }
                        });
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageFour).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogFour.show();

                        dialogFour.findViewById(R.id.btnXenoDialogStageFourDrone).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphDrone(), dialogFour, bundle);
                            }
                        });
                        dialogFour.findViewById(R.id.bbtnXenoDialogStageFourBioDrone).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphBioDrone(), dialogFour, bundle);
                            }
                        });
                        dialogFour.findViewById(R.id.btnXenoDialogStageFourScout).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphScout(), dialogFour, bundle);
                            }
                        });
                        dialogFour.findViewById(R.id.btnXenoDialogStageFourStalker).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphStalker(), dialogFour, bundle);
                            }
                        });
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageFive).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogFive.show();

                        dialogFive.findViewById(R.id.btnXenoDialogStageFiveSentry).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphSentry(), dialogFive, bundle);
                            }
                        });
                        dialogFive.findViewById(R.id.btnXenoDialogStageFiveSoldier).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphSoldier(), dialogFive, bundle);
                            }
                        });
                        dialogFive.findViewById(R.id.btnXenoDialogStageFiveWorker).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphWorker(), dialogFive, bundle);
                            }
                        });
                    }
                });

                dialogXenomorph.findViewById(R.id.btnXenoDialogXenomorphStageSix).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogXenomorph.dismiss();
                        dialogSix.show();

                        dialogSix.findViewById(R.id.btnXenoDialogStageSixCrusher).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphCrusher(), dialogSix, bundle);
                            }
                        });
                        dialogSix.findViewById(R.id.btnXenoDialogStageSixPreatorian).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphPreatorian(), dialogSix, bundle);
                            }
                        });
                        dialogSix.findViewById(R.id.btnXenoDialogStageSixQueen).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                packAlienAndGo(AlienXenoCreator.createXenomorphQueen(), dialogSix, bundle);
                            }
                        });
                    }
                });
            }

        });
    }
}