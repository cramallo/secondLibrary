package com.mock.librarysecond.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@ApiModel
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @ApiModelProperty(notes = "The book genre: could be horror, comedy, drama, etc.")
    private String genre;

    @Column(nullable = false)
    @ApiModelProperty
    private String author;

    @Column(nullable = false)
    @ApiModelProperty
    private String bookTitle;

    @Column(nullable = false)
    @ApiModelProperty
    private String publisher;

    @Column(nullable = false)
    @ApiModelProperty
    private String publishDate;

    @Column(nullable = false)
    @ApiModelProperty
    private int pages;

    @Column(nullable = false,unique=true)
    @ApiModelProperty
    private String isbn;

    @Column(nullable = false,unique=true)
    @ApiModelProperty
    private float price;


    public Book(String genre, String author, String image, String title, String subtitle,
                String publisher, String year, int pages, String isbn,float price) {
        this.genre = genre;
        this.author = author;
        this.bookTitle = title;
        this.publisher = publisher;
        this.publishDate = year;
        this.pages = pages;
        this.isbn = isbn;
        this.price = price;
    }

    public Book(){}

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
