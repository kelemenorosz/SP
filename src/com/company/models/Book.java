package com.company.models;

import java.util.ArrayList;

public class Book {

    private String name;
    private Author author;

    private ArrayList<Element> elements = new ArrayList<Element>();

    public Book(String name) {
        this.name = name;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public String toString() {
        return name + " " + author;
    }

    public void print() {
        System.out.print(this);
        System.out.print(elements);
    }

    public ArrayList<Element> getElements() {return this.elements;}

    public void addContent(Element content) {
        this.elements.add(content);
    }

}
