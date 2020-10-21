package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {

    private String name;
    private ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    private ArrayList<Image> images = new ArrayList<Image>();
    private ArrayList<Table> tables = new ArrayList<Table>();

    public Book(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public void print() {
        System.out.print(this);
        System.out.print(paragraphs);
        System.out.print(images);
        System.out.print(tables);
    }

    public void createNewParagraph(String paragraphName) {
        Paragraph tempP = new Paragraph(paragraphName);
        paragraphs.add(tempP);
    }

    public void createNewImage(String imageName) {
        Image tempI = new Image(imageName);
        images.add(tempI);
    }

    public void createNewTable(String tableName) {
        Table tempT = new Table(tableName);
        tables.add(tempT);
    }

}
