package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.books.BookAdapter;
import com.example.gamemastertools.databinding.FragmentHousesListOfHousesBinding;
import com.example.gamemastertools.houses.House;
import com.example.gamemastertools.houses.HouseAdapter;
import com.example.gamemastertools.houses.HouseCreator;

import java.util.ArrayList;

public class HousesListOfHouses extends Fragment {

    private FragmentHousesListOfHousesBinding binding;
    private RecyclerView recyclerView;
    private HouseAdapter houseAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHousesListOfHousesBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        houseAdapter = new HouseAdapter(HouseCreator.createHouseList());
        recyclerView = view.findViewById(R.id.recyclerViewHouses);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(houseAdapter);
    }
}