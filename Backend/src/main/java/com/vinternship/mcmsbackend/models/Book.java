package com.vinternship.mcmsbackend.models;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;
import java.util.Date;
import java.util.List;
public class Book {

@Id
    private String id;
    private String title;
    private double price;
    private Author[] author;
    private Genre[] genre;
    private String publisher;
    private Year year_of_publishing;
    @CreatedDate
    private Date date;
    public Book() {}

    public Book(String id, String title, double price, Author[] author, Genre[] genre,String publisher, Year year_of_publishing,Date date) {
        this.id = id;
        this.title = title;
        this.price= price;
        this.author = author;
        this.genre= genre;
        this.publisher= publisher;
        this.year_of_publishing= year_of_publishing;
        this.date= date;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Genre[] getGenre() {
        return genre ;
    }

    public void setGenre(Genre[] genre) {
        this.genre = genre;
    }

    public Year getYear_of_publishing() {
        return year_of_publishing;
    }

    public void setYear_of_publishing(Year year_of_publishing) {
        this.year_of_publishing = year_of_publishing;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }
}


