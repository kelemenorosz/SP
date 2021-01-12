package ro.euvt.springtest.services;

import ro.euvt.springtest.models.*;

public class RenderContentVisitor implements Visitor {


    @Override
    public Object visitBook(Book book) {
        System.out.println(book.toString());
        for (Element element : book.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Object visitSection(Section section) {
        System.out.println(section.toString());
        for (Element element : section.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Object visitParagraph(Paragraph paragraph) {
        System.out.println(paragraph.toString());
        return null;
    }

    @Override
    public Object visitImageProxy(ImageProxy imageProxy) {
        return null;
    }

    @Override
    public Object visitImage(Image image) {
        System.out.println(image.toString());
        return null;
    }

    @Override
    public Object visitTable(Table table) {
        System.out.println(table.toString());
        return null;
    }

}
