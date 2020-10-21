package com.company;

public class Table implements Element{
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

}
