package com.example.gamemastertools;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.alien.AlienArmor;
import com.example.gamemastertools.alien.AlienArmorAdapterList;
import com.example.gamemastertools.alien.AlienArmorOrganizer;
import com.example.gamemastertools.databinding.FragmentAlienArmoryProtectionBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlienArmoryProtection extends Fragment {

    private FragmentAlienArmoryProtectionBinding binding;
    private RecyclerView recyclerView;
    private AlienArmorAdapterList alienArmorAdapterList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentAlienArmoryProtectionBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<AlienArmor> list = new ArrayList<>();
        AlienArmorOrganizer alienArmorOrganizer = new AlienArmorOrganizer();

        binding.btnArmoryRandomArmor.setEnabled(false);

        binding.radioBtnArmoryOriginalArmor.setOnClickListener(v -> {
            binding.btnArmoryRandomArmor.setEnabled(true);
            list.clear();
            List<AlienArmor> originalList = alienArmorOrganizer.createOriginalList();
            list.addAll(originalList);
//                list.sort(AlienArmor::compareTo);

            alienArmorAdapterList = new AlienArmorAdapterList(list);
            recyclerView = view.findViewById(R.id.AlienArmoryRecyclerView);
            //TODO: is ok?
            recyclerView.setLayoutManager(new GridLayoutManager(binding.getRoot().getContext(),1));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(alienArmorAdapterList);
        });

        binding.radioBtnArmoryExpandedArmor.setOnClickListener(v -> {
            binding.btnArmoryRandomArmor.setEnabled(true);
            list.clear();
            List<AlienArmor> expandedList = alienArmorOrganizer.createExpandedList();
            list.addAll(expandedList);
//                list.sort(AlienArmor::compareTo);

            alienArmorAdapterList = new AlienArmorAdapterList(list);
            recyclerView = view.findViewById(R.id.AlienArmoryRecyclerView);
            //TODO: is ok?
            recyclerView.setLayoutManager(new GridLayoutManager(binding.getRoot().getContext(),1));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(alienArmorAdapterList);

        });

        binding.btnArmoryRandomArmor.setOnClickListener(v -> {
            Random random = new Random();
            int i = random.nextInt(list.size());
            AlienArmor alienArmor = list.get(i);

            AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
            View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.armor_dialog, null);

            TextView armorName;
            TextView armorRating;
            TextView armorWeight;
            TextView armorComms;
            TextView armorCost;
            TextView armorAir;
            TextView armorABC;
            TextView armorVacuum;
            TextView armorFire;
            TextView armorAdditional;
            TextView armorNegatives;
            TextView armorType;

            armorName = dialogView.findViewById(R.id.textViewAlienArmorDialogArmorName);
            armorRating = dialogView.findViewById(R.id.textViewAlienArmorBonus);
            armorWeight = dialogView.findViewById(R.id.textViewAlienArmorWeight);
            armorComms = dialogView.findViewById(R.id.textViewAlienArmorComms);
            armorCost = dialogView.findViewById(R.id.textViewAlienArmorCost);
            armorAir = dialogView.findViewById(R.id.textViewAlienArmorAir);
            armorABC = dialogView.findViewById(R.id.textViewAlienArmorABC);
            armorVacuum = dialogView.findViewById(R.id.textViewAlienArmorVacuum);
            armorFire = dialogView.findViewById(R.id.textViewAlienArmorFireResistant);
            armorAdditional = dialogView.findViewById(R.id.textViewAlienArmorSpecials);
            armorNegatives = dialogView.findViewById(R.id.textViewAlienArmorNegatives);
            armorType = dialogView.findViewById(R.id.textViewAlienArmorType);

            armorName.setText(alienArmor.getName());
            armorRating.setText(alienArmor.getArmorValue());
            armorWeight.setText(alienArmor.getWeight());
            armorCost.setText(String.valueOf(alienArmor.getCost()));
            armorAir.setText(String.valueOf(alienArmor.getAir()));
            armorAdditional.setText(alienArmor.getAdditional());
            armorNegatives.setText(alienArmor.getNegatives());
            armorType.setText(alienArmor.getType());

            armorFire.setVisibility(View.INVISIBLE);
            armorABC.setVisibility(View.INVISIBLE);
            armorComms.setVisibility(View.INVISIBLE);
            armorVacuum.setVisibility(View.INVISIBLE);

            if(alienArmor.isFire()){
                armorFire.setVisibility(View.VISIBLE);
            }
            if(alienArmor.isAbc()){
                armorABC.setVisibility(View.VISIBLE);
            }
            if(alienArmor.isCommunication()){
                armorComms.setVisibility(View.VISIBLE);
            }
            if(alienArmor.isVacuum()){
                armorVacuum.setVisibility(View.VISIBLE);
            }

            builder.setView(dialogView);
            builder.show();

        });

    }
}
