package com.company;

public class Paragraph implements Element{
    private String name;
    AlignStrategy strategy;

    public Paragraph(String name) {
        this.name = name;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }

    public String toString() {
        return this.name;
    }

    public String getText() {
        return name;
    }

    @Override
    public void print() {
        if (strategy != null) {
            strategy.render(this, new Context());
            return;
        }
        System.out.println(this.toString());
    }

}
