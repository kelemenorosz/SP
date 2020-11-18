package com.company.models;

public interface Visitor<T> {

    public T visitBook(Book book);
    public T visitSection(Section section);
    public T visitParagraph(Paragraph paragraph);
    public T visitImageProxy(ImageProxy imageProxy);
    public T visitImage(Image image);
    public T visitTable(Table table);

}
