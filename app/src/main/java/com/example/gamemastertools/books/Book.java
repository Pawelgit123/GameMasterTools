package com.example.gamemastertools.books;

public class Book {

    private int bookImage;
    private String title;

    public Book(int bookImage, String title) {
        this.bookImage = bookImage;
        this.title = title;
    }



    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookImage() {
        return bookImage;
    }

    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
    }
}
