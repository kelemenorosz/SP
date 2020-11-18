package com.company.models;

import java.util.ArrayList;

public class SubChapter {

    private String name;
    private ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    private ArrayList<Image> images = new ArrayList<Image>();
    private ArrayList<Table> tables = new ArrayList<Table>();

    private ArrayList<Element> elements = new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(this);
        System.out.print(elements);

    }

    public String toString() {
        return this.name;
    }

    public void createNewParagraph(String paragraphName) {
        Paragraph tempP = new Paragraph(paragraphName);
        elements.add(tempP);
    }

    public void createNewImage(String imageName) {
        Image tempI = new Image(imageName);
        elements.add(tempI);
    }

    public void createNewTable(String tableName) {
        Table tempT = new Table(tableName);
        elements.add(tempT);
    }

}
