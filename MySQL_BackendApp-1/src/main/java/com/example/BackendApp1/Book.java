package com.example.BackendApp1;

import javax.persistence.*;

@Entity // Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "isbnNo")
    private String isbnNo;

    public Book(){

    }

    public Book(int id, String name, String author, String isbnNo) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbnNo = isbnNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }
}

