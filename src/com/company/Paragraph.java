package com.company;

public class Paragraph implements  Element{
    private String name;

    public Paragraph(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.print(this);
    }

}
