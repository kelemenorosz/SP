package com.company.models;

import com.company.models.Element;

import java.util.ArrayList;

public class Section implements Element {

    private String name;
    private ArrayList<Element> elements = new ArrayList<Element>();

    public Section(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Section: "+this.name);
        for(Element i : elements){
            i.print();
        }
    }

    public String toString() {
        return name + "" + elements;
    }

    public int add(Element element) {
        this.elements.add(element);
        return this.elements.size() - 1;
    }

    public void remove(Element element) {
        this.elements.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public ArrayList<Element> getElements() {
        return elements;
    }
}
