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

import com.example.gamemastertools.books.Book;
import com.example.gamemastertools.books.BookAdapter;
import com.example.gamemastertools.databinding.FragmentAlienSourceBookBinding;

import java.util.ArrayList;

public class AlienSourceBook extends Fragment {

    private FragmentAlienSourceBookBinding binding;
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private ArrayList<Book> bookArraylist;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlienSourceBookBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bookInitialize();

        bookAdapter = new BookAdapter(bookArraylist);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(bookAdapter);

    }

    private void bookInitialize() {

        bookArraylist = new ArrayList<>();

        Book alienRpg = new Book(R.drawable.alien_rpg,getString(R.string.book_title_alien_rpg));
        Book alienColonialMarines = new Book(R.drawable.alien_colonial_marines,getString(R.string.book_title_alien_colonial_marines));
        Book alienChariotOfTheGods = new Book(R.drawable.alien_chariot_of_the_gods,getString(R.string.book_title_alien_chariot_of_the_gods));
        Book alienDestroyerOfTheWorlds = new Book(R.drawable.alien_destroyer_of_the_worlds,getString(R.string.book_title_alien_destroyer_of_the_worlds));
        Book bookColonyWars = new Book (R.drawable.alien_book_colony_wars,getString(R.string.book_title_alien_colony_wars));
        Book bookInfernosFall = new Book(R.drawable.alien_book_infernos_fall,getString(R.string.book_title_alien_infernos_fall));

        bookArraylist.add(alienRpg);
        bookArraylist.add(alienColonialMarines);
        bookArraylist.add(alienChariotOfTheGods);
        bookArraylist.add(alienDestroyerOfTheWorlds);
        bookArraylist.add(bookColonyWars);
        bookArraylist.add(bookInfernosFall);

    }
}