
package com.mycompany.librarymanagementsystem;

public class Book{
    //attributes
    private String title,author,isbn,genre;
    //constructors

    public Book() {
    }

    public Book(String title, String author, String isbn, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
    }
    //getters

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    //setters

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //methods
    public void library(Library library){
        System.out.println("This Book is available in Library : "+library.getName());
    }
}
