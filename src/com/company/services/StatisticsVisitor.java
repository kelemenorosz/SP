package com.company.services;

import com.company.models.*;

public class StatisticsVisitor implements Visitor {

    int paragraphs = 0;
    int sections = 0;
    int imageProxies = 0;
    int images = 0;
    int tables = 0;
    int book = 0;

    @Override
    public Object visitBook(Book book) {
        this.book += 1;
        for (Element element : book.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Object visitSection(Section section) {
        this.sections += 1;
        for (Element element : section.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Object visitParagraph(Paragraph paragraph) {
        this.paragraphs += 1;
        return null;
    }

    @Override
    public Object visitImageProxy(ImageProxy imageProxy) {
        return null;
    }

    @Override
    public Object visitImage(Image image) {
        this.images += 1;
        return null;
    }

    @Override
    public Object visitTable(Table table) {
        this.tables += 1;
        return null;
    }

    public void printStatistics() {
        System.out.println("Books: " + book + "\nSections: " + sections + "\nparagraphs: " + paragraphs + "\nimages: " + images + "\nimage proxies: " + imageProxies + "\ntables: " + tables);
    }
}
