/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classmodeling;

/**
 *
 * @author angeladrees
 */
public class bookLibrary {
    //title
    //author
    //genre
    //ISBN
    //DDClassification
    
    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private String deweyDClassification;
    
    public bookLibrary(String titleIn, String authorIn, String genreIn, String ISBNIn){
        this.title = titleIn;
        this.author = authorIn;
        this.genre = genreIn;
        this.ISBN = ISBNIn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDeweyDClassification() {
        return deweyDClassification;
    }

    public void setDeweyDClassification(String deweyDClassification) {
        this.deweyDClassification = deweyDClassification;
    }
    
}
