package com.mock.librarysecond.dtos;

import java.util.ArrayList;
import java.util.List;

public class BookApiDTO {
    private String isbn;
    private String bookTitle;
    private String publishDate;
    private int pages;
    private List<String> authors = new ArrayList<String>();
    private List<String> publishers = new ArrayList<>();
    private float price;
    private String libraryName = "Seconds Library";
    private String address = "Rodriguez 168, Lanus Este, Prov.De Bs.As";
    private String phoneNumber = "1115557896";
    private String email = "secondsLibrary@gmail.com";

    public BookApiDTO(){}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String author) {
        if (!this.authors.contains(author)) {
            this.authors.add(author);
        }
    }
    public void addPublisher(String publisher) {
        if (!this.publishers.contains(publisher)) {
            this.publishers.add(publisher);
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
