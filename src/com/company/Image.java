package com.company;

public class Image implements Element{
    private String name;

    public Image(String name) {
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
