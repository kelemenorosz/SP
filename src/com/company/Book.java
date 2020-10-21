package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {

    private String name;
    private Author author;

    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

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
        System.out.print(chapters);
    }

    public int createChapter(String chapterName) {
        Chapter tempC = new Chapter(chapterName);
        chapters.add(tempC);
        return chapters.size() - 1;
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }
}
