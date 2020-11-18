package com.company.models;

import com.company.models.Element;

public class Table implements Element {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.print(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

}
