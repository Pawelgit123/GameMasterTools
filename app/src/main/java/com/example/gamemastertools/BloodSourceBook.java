package com.example.gamemastertools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gamemastertools.books.Book;
import com.example.gamemastertools.books.BookAdapter;
import com.example.gamemastertools.databinding.FragmentBloodSourceBookBinding;

import java.util.ArrayList;

public class BloodSourceBook extends Fragment {

    private FragmentBloodSourceBookBinding binding;
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;

    private ArrayList<Book> bookArraylist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBloodSourceBookBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bookInitialize();
        bookAdapter = new BookAdapter(this, bookArraylist);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(bookAdapter);

    }

    private void bookInitialize() {

        bookArraylist = new ArrayList<>();
        Book bookBloodAndHonor = new Book(R.drawable.blood_and_honor,getString(R.string.book_img_blood_and_honor));
        Book bookWorldOfDew = new Book(R.drawable.blood_world_of_dew,getString(R.string.book_img_world_of_dew));
        bookArraylist.add(bookBloodAndHonor);
        bookArraylist.add(bookWorldOfDew);

    }
}