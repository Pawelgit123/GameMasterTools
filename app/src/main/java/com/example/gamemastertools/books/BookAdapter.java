package com.example.gamemastertools.books;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamemastertools.BloodSourceBook;
import com.example.gamemastertools.R;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{

    private BloodSourceBook context;
    private List<Book> bookList;

    public BookAdapter(BloodSourceBook context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);

        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

        Book book = bookList.get(position);
        holder.textView.setText(book.getTitle());
        holder.imageView.setImageResource(book.getBookImage());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewBook);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
