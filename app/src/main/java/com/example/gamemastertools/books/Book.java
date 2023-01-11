package com.example.gamemastertools.books;

public class Book {

    private final int bookImage;
    private final String title;

    public Book(int bookImage, String title) {
        this.bookImage = bookImage;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getBookImage() {
        return bookImage;
    }

}
